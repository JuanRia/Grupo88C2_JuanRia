package view;

import model.Owner;

public class UserView {
    
    public static void main(String[] args) { //Creo main
        Owner cliente1 = new Owner("Juan"); //Al agregar Owner importa la clase Owner, creo el objeto cliente1 y es un objeto de la clase Owner. También creo el método Owner()
        Owner cliente2 = new Owner("Juan David");
        System.out.println(cliente1.getNombre());
        System.out.println(cliente2.getNombre());
        String response = cliente1.getWallet().saveMoney(100000); //Con esto solocitamos la Wallet del cliente 1 y con la ayuda del PUNTO llamar otra función
        System.out.println(response); // En vez de escribir entre parentesis response, podría no crear la variable response y escribir entre parentesis todo lo que está después del signo =
        //System.out.println(cliente1.getWallet().getSaldo());
        //System.out.println("Hola "+cliente2.getWallet().getSaldo());
        System.out.println(cliente1.compararWallet(cliente2.getWallet())); //agregado en la clase7 para comparar 2 billeteras
    }
}
