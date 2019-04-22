/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labmemoria;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author INTENTODEMUSICO
 */
public class Memoria extends LinkedList<Espacio> {

    int ocupados, espacioDisponible, iteracionLlenado = 0;
    private int[] vectorMemoria;

    public Memoria() {
        reiniciarMemoria();
    }

    private void llenarMemoria() {
        while (espacioDisponible != 0) {
            Espacio bloque = new Espacio(espacioDisponible);
            for (int i = bloque.getInicio(); i < bloque.getInicio() + bloque.getTamaño(); i++) {
                vectorMemoria[i] = bloque.getId(); //hasta vector[ocupados+bloque.getTamaño()-1]
            }
            espacioDisponible -= bloque.getTamaño(); //Resta tamaño de espacioDisponible
            ocupados++; //Hay más espacios ocupados
            //Agregar a la lista enlazada
            this.add(bloque);
        }
        if (ocupados < 4 || ocupados > 32) {
            iteracionLlenado++;
            reiniciarMemoria();
        } else {
            System.out.println("Memoria llenada con éxito en la " + iteracionLlenado + " iteración");
        }
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
        return super.remove(i); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Object o) {
        return super.remove(o); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
