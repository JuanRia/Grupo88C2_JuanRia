package test;

import model.Owner;

public class Test {
    
    public void escenarioOwner(){ //Creación de escenario Owner 
        Owner owner1 = new Owner("Sandy"); //especificar que Owner es la clase! Luego creamos el objeto owner que recibe un parametro tipo String
        boolean test1 = assertTrue("Sendy", owner1.getNombre());
        System.out.println((test1)? "paso" : "No paso"); //Arroja no paso porque el nombre está escrito distinto. Sandy, Sendy
    }

    public boolean assertTrue(int esperado, int obtenido){ // en los parentesis de la función se define el tipo y nombre de los datos a comparar: Esperado corresponde al que esperamos que resulte, obtenido corresponde al resultante de la operación
        if(esperado > obtenido){
            return true;
        }
        return false;
    }

    public boolean assertTrue(String esperado, String obtenido){
        if(esperado.equalsIgnoreCase(obtenido)){ //Hay métodos específicos para comparar strings .equalsIgnoreCase().
            return true;
        }
        return false;
    }

}
