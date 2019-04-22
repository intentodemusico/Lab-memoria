package labmemoria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class Memoria extends LinkedList<Espacio> {
    private Random rd = new Random();
    int ocupados, espacioDisponible, iteracionLlenado = 0;
    private int[] vectorMemoria;
    List<Espacio> listaProcesosAAsignar;
    public Memoria() {
        reiniciarMemoria();
    }

    private void llenarMemoria() {
        while (espacioDisponible != 0) {
            Espacio bloque = new Espacio(espacioDisponible);
            agregarAMemoria(bloque);
            //Agregar a la lista enlazada
            //POner next
            this.add(bloque);
        }
        if (ocupados < 4 || ocupados > 32) {
            iteracionLlenado++;
            reiniciarMemoria();
        } else {
            System.out.println("Memoria llenada con éxito en la " + iteracionLlenado + " iteración");
        }
    }
    
    private void crearListaProcesosAAsignar(){
    listaProcesosAAsignar = new ArrayList<Espacio>();
    int cantidad=rd.nextInt(6)+10;
        for (int i = 0; i < cantidad; i++) {
            Espacio bloque = new Espacio(espacioDisponible);
            listaProcesosAAsignar.add(bloque);
            //agregarAMemoria(bloque);
        }
    }
    
    private void agregarAMemoria(Espacio bloque) {
        for (int i = bloque.getInicio(); i < bloque.getInicio() + bloque.getTamaño(); i++) {
            vectorMemoria[i] = bloque.getId(); //hasta vector[ocupados+bloque.getTamaño()-1]
        }
        espacioDisponible -= bloque.getTamaño(); //Resta tamaño de espacioDisponible
        ocupados++; //Hay más espacios ocupados
    }

    private int cantidadDeProcesosAEliminar(){
        int cantidad=rd.nextInt(4)+2;
        return cantidad;
    }
    private void reiniciarMemoria() {
        reiniciarValores();
        llenarMemoria();
    }

    private void reiniciarValores() {
        vectorMemoria = new int[64];
        ocupados = 0;
        espacioDisponible = 64;
    }

    public String toString() {
        return Arrays.toString(vectorMemoria);
    }

    @Override
    public boolean add(Espacio e) {
        return super.add(e); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Espacio pop() {
        return super.pop(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Espacio get(int i) {
        return super.get(i); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Espacio getFirst() {
        return super.getFirst(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Espacio getLast() {
        return super.getLast(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Espacio remove(int i) {
        for (int thi : vectorMemoria) {
            if(thi==i){
                thi=0;
            }
        }
        return super.remove(i); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean remove(Espacio o) {
        for (int thi : vectorMemoria) {
            if(thi==o.getId()){
                thi=0;
            }
        }
        return super.remove(o); //To change body of generated methods, choose Tools | Templates.
    }
        /*
    public boolean compactarHuecos(){
        for (Espacio thi : listaProcesosAAsignar) {
            if(thi.getId()==0 && thi.getNext().getId()==0){
                Espacio aux= thi.getNext();
                remove(thi.getNext());
                thi.setNext(aux.getNext())
            }
        }
        return true;
    }*/
            
    public boolean setVacio(Espacio o) {
        for (int thi : vectorMemoria) {
            if(thi==o.getId()){
                thi=0;
            }
        }
        return o.setVacio(); //To change body of generated methods, choose Tools | Templates.
    }
        
    @Override
    public int size() {
        return super.size(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
