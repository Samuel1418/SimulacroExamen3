/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacro1_2;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Hilo1 extends Thread{
    public String frase;
    public Hilo1(String frase) {
        this.frase=frase;
            }
    public void run(){
    int mayusculas=0;
    for(int x=0;x<frase.length();x++){
        if(Character.isUpperCase(frase.charAt(x))){
            mayusculas++;
            SImulacro1_2.contar++;
    }
    }
        System.out.println("Tiene  "+mayusculas+" mayusculas");
    }
}