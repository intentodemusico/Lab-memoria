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
public class Espacio {
    private Random rd = new Random();
    private int id=0;
    private int tamaño;
    private int inicio;
    
    public Espacio(){
        if(quedaLleno()){
            generarId();
        }
        generarTamaño();
    }
    public Espacio(int espacioDisponible) {
        if(quedaLleno()){
            generarId();
        }
        if(espacioDisponible==1){
            tamaño=1;
        }else{
        generarTamaño(espacioDisponible);
        }
        inicio=64-espacioDisponible;
    }
    
    private boolean quedaLleno(){
        boolean bool=rd.nextBoolean();
        return bool;
    }
    
    public boolean esHueco(){
        return id==0;
    }
    private void generarId(){
     // creating Random object
     while(id==0){
        id = Math.abs(rd.nextInt()); // storing random integers in an array
     }
    }
    
    private int generarTamaño(int espacioDisponible){
        do{
        tamaño=rd.nextInt(7)+2;
        }while(espacioDisponible<=tamaño);
        return tamaño;
    }
    
    private int generarTamaño(){
        tamaño=rd.nextInt(4)+1;
        return tamaño;
    }
    public boolean setVacio(){
        id=0;
        return true;
    }
    public boolean isAsignado() {
        return id==0;
    }

    public int getId() {
        return id;
    }

    public int getTamaño() {
        return tamaño;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }
    
}