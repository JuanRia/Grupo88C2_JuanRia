package view;

import model.Wallet;

public class Vista { //Va a ser la clase principal. En ésta vamos a utilizar toda la lógica creada en Wallet.java para ver como se comporta.

    public static void main2(String[] args) { // ES NECESARIO CREAR EL MAIN: escribir main y auto completar !!
        Wallet wallet1 = new Wallet();
        System.out.println(wallet1.saveMoney(300000));
        System.out.println(wallet1.getSaldo());


        
    }
}
