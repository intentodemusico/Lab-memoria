/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labmemoria;
import java.util.LinkedList;
/**
 *
 * @author INTENTODEMUSICO
 */
public class Memoria extends LinkedList<Espacio>{
    int ocupados, espacioDisponible,ite=0;
    private int [] vectorMemoria;
    public Memoria(){
        reiniciarMemoria();
    }   
    
    private void llenarMemoria(){
        while (espacioDisponible!=0) {            
           Espacio bloque =new Espacio (espacioDisponible);
           //Agregar a la lista enlazada
           for (int i=bloque.getInicio();i<bloque.getInicio()+bloque.getTamaño();i++){
               vectorMemoria[ocupados] hasta vector[ocupados+bloque.getTamaño()-1]
           }
           espacioDisponible-=bloque.getTamaño(); //Resta tamaño de espacioDisponible
           ocupados++; //Hay más espacios ocupados
          
        }
        if(ocupados<4 || ocupados>32){
            ite++;
            reiniciarMemoria();
        }else{
            System.out.println("Memoria llenada con éxito en la "+ite+" iteración");
        }
    }
    
    private void reiniciarMemoria(){
        reiniciarValores();
        llenarMemoria();
    }
     
    private void reiniciarValores(){
        vectorMemoria=new int[64] ;
        ocupados=0;
        espacioDisponible=64;
    }
}
