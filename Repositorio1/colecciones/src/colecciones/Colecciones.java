/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;

/**
 *
 * @author alber
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Me creo un array list
        
        ArrayList<Integer> lista = new ArrayList<Integer>(); 
        
        
        
        for (int i = 0; i < 10; i++) {
            lista.add(i+1);
        }
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i));
        }
        System.out.println(" ");
        
        System.out.println(lista.get(lista.size()-1));
        
    }
    
    
}
