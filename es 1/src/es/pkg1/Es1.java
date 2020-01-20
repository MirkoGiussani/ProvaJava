/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.pkg1;

/**
 *
 * @author giussani.mirko
 */
import java.util.*;
public class Es1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Inserisci n volte? ");
        int volte = input.nextInt();
        
        for (int i = 0; i < volte; i++) {
            System.out.println("ciao " + (i+1));
        }
        
    }
    
}
