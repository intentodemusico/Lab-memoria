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
public class EspacioTest {
    private Random rd = new Random();
    private boolean asignado=false;
    private int id=0;
    private int tamaño;
    public EspacioTest() {
        if(quedaLleno()){
            generarId();
        }
    }
    
    private boolean quedaLleno(){
        boolean bool=rd.nextBoolean();
        return bool;
    }
   
    private void generarId(){
     // creating Random object
     while(id==0){
        id = rd.nextInt(); // storing random integers in an array
     }
    }
    
    private void generarTamaño(){
    tamaño=rd.nextInt(7)+2;
    }

    public boolean isAsignado() {
        return asignado;
    }

    public int getId() {
        return id;
    }

    public int getTamaño() {
        return tamaño;
    }
    
}