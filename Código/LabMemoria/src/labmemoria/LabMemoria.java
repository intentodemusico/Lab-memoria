/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labmemoria;

/**
 *
 * @author INTENTODEMUSICO
 */
public class LabMemoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Memoria test =new Memoria();
        System.out.println(test.toString());
        System.out.println(test.pop().getId());
        System.out.println(test.toString());
    }
    
}
