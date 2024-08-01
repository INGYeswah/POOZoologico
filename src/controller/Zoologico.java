/*
 * Desarrollar el tema de Jswing que usted seleccione (parejas)
    Debe subir 6 versiones del codigo en github
    Aproveche y repase para el parcial
    
 */
package controller;

import controller.habitats.Acuario;
import controller.habitats.Aviario;
import controller.habitats.Cocodrilario;

/**
 *
 * @author Lenovo
 */

public class Zoologico {

  
    public static void main(String[] args) {
        
       Zoo zooAndes = new Zoo("Cundinamarca","Zoologico de los andes");    
       
       Habitats acuario = new Acuario();
       Habitats aviario = new Aviario();
       Habitats cocodrilario = new Cocodrilario();
       
    }
    
}