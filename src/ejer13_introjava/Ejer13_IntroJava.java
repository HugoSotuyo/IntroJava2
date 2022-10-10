/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer13_introjava;

import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class Ejer13_IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int lado;
        
        System.out.println("Ingrese la cantidad de elementos ");
        lado=leer.nextInt();
        for (int f = 0; f < (lado);f++){
            for(int c=0;c<(lado);c++){
                if (f>0 && f<(lado-1) && c>0 && c<(lado-1)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println(""); 
        }
    }
    
}
