/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labmemoria;

import java.util.Random;

/**
 *
 * @author INTENTODEMUSICO
 */
public class Memoria {
    int cantidadDeEspacios=64;

    public Memoria() {
        
    }
    
    private void crearArray(){
    Random rd = new Random(); // creating Random object
      int [] memoria = new int[cantidadDeEspacios];
      for (int i = 0; i < memoria.length; i++) {
         memoria[i] = rd.nextInt(); // storing random integers in an array
        }
    }
    
}
