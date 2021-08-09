package model;

public class Wallet { // LA CLASE WALLET Define Comportamientos.

    public static final int CAPACIDAD_MAXIMA = 1000000; // capacidadMaxima es una constante
    
    private int saldo; //saldo es una variable
    private boolean tieneLimite; //tieneLimite es una variable

    public Wallet() { // usamos el método constructor para crear OBJETOS (ctor para autocompletar)
        super();
        saldo = 0; //Definimos los valores de los atributos(variables). Aquí se consideran objetos.
        tieneLimite = true;       
    }

    public String saveMoney(int valor){ //creación de atributo que regrese un dato para verificar si la transacción es exitosa o no.
        //valor es el parametro 
        if (valor < 0){
            return "Debe digitar una cantidad valida";           
        }
        if(tieneLimite && valor+saldo > CAPACIDAD_MAXIMA){
            return "El saldo no puede superar la cantidad máxima";
        }
        saldo += valor; //para guardar/almacenar el dinero
        return "Transacción exitosa!";
    }
    public String takeMoney(int valor){
       // if valor < 0){
        //    return "Debe digitar una cantidad valida"
        //}
        if(saldo < valor){
        return "El monto supera el saldo";
        }
        saldo -= valor; // saldo = saldo - valor;
        return "Transacción exitosa";    
    }

    public int getSaldo(){
        return saldo;
    }

    public String breakLimits(){
        if(!tieneLimite){
            return "Tu cuenta ya estaba configurada sin limites";
        }
        if(saldo >= CAPACIDAD_MAXIMA - 100000){
            tieneLimite = false;
            return "Tu cuenta ya no tiene limites!";
        }    
        return "Te hacen falta"+ ((CAPACIDAD_MAXIMA -100000) - saldo);
    }
    //public String establecerMeta(int value){ //tarea para clase 7

    //}
    //public boolean verificarMeta(){ // tarea para clase 7

    //}


    

    // EJEMPLO de set: para remplazar el valor  de un atributo privado por otro valor que llega por parametro
        //public void setSaldo(int newSaldo){
        //    saldo = newSaldo;
        //}







}
