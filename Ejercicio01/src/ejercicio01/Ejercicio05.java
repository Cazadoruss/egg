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
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int num;
        num = leer.nextInt();
        System.out.println("El doble es " + (num * 2) + " , el triple es " + (num * 3) + " y su raiz cuadrada " + (Math.sqrt(num)));
    }
    
}
