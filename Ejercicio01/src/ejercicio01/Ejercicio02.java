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
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       String nombre;
       System.out.println("Ingrese su nombre:");
       nombre = leer.next();
       System.out.println("El nombre ingresado es: " + (nombre));
    }
    
}
