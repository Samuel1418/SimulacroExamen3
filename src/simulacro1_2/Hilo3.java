/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacro1_2;

/**
 *
 * @author Samuel
 */
public class Hilo3 extends Thread{
    public String frase;
    public Hilo3(String frase) {
        
        this.frase=frase;
        
    }
    
    public void run(){
    int numeros=0;
    for(int x=0;x<frase.length();x++){
        if(Character.isDigit(frase.charAt(x))){
            numeros++;
            SImulacro1_2.contar++;
    }
    }
        System.out.println("Tiene  "+numeros+" numeros");
    }
    
    
}
