/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacro1_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class SImulacro1_2 {

    /**
     * @param args the command line arguments
     */
    static int contar=0;
    public static void main(String[] args) throws InterruptedException {
        
        String palabra=JOptionPane.showInputDialog("Introduce una palabra");
        Hilo1 h111= new Hilo1(palabra);
        Hilo2 h22= new Hilo2(palabra);
        Hilo3 h3= new Hilo3(palabra);
        System.out.println("la palabra: "+palabra);
        h111.start();
        h111.join();
        h22.start();
        h22.join();
        h3.start();
        h3.join();
        System.out.println("La palabra tiene "+contar+" caracteres");
        System.out.println("Se acabo el programa");
    }
    
}
