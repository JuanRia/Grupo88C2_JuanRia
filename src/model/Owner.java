package model;
// agregamos: extends User en la línea 3 para generar herencia
public class Owner extends User { // en estas lineas 3-8 construimos la relación llamada -wallet (ver diagrama) para asociar las clases Owner y Wallet. 
    private Wallet wallet;

    public Owner(String nombre) { // P(String nombre: para especificar que recibiré por parametro un dato llamado nombre tipo String)
        super();
        wallet = new Wallet();
        setNombre(nombre);
    }
    
    public Wallet getWallet() {
        return wallet;
    }

    public String compararWallet(Wallet otraWallet){// Función para comparar dos billeteras La billetera a comparar es un objeto externo.
        Wallet miWallet = getWallet();
        
        if(miWallet.getSaldo() > otraWallet.getSaldo() ){
            return "Mi Wallet tiene más saldo";
        }
        else if (miWallet.getSaldo() == otraWallet.getSaldo()){
            return "Ambas wallet tienen el mismo saldo";
        }
        else if (miWallet.getSaldo() < otraWallet.getSaldo()){
            return "La otra wallet tiene más saldo";
        }
        else{ return "Hubo un error"; }// Mensaje no necesario, pero JAVA necesita el else para funcionar.
    }
}
