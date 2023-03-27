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
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor en grados centigrados:");
        float grados;
        grados = leer.nextInt();
        System.out.println("El valor equivalente en Fahrenheit es " + (32 + (9 * grados / 5)) );
    }
    
}
