/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author fer_c
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa dos numeros enteros para sumar:");
        int num1;
        num1 = leer.nextInt();
        int num2;
        num2 = leer.nextInt();
        System.out.println("la suma de esos dos números es igual a " + (num1 + num2));
                
        
    }
    
}
