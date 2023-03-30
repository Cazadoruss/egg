/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.encuentros.pkg4.a.pkg6;

import java.util.Scanner;

/**
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
 * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
 * lo siguiente:

 * @author fer_c
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese el tamaño del cuadrado");
        num = leer.nextInt();
        for (int i = 0; i < num; i++) {
            //para auto rellenar for oprimir tab al final de la palabra
            for (int j = 0; j < num; j++) {
                if (i == 0 || i == num - 1 || j == 0 || j == num - 1) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

                       
                
            }
          System.out.println();   
        }
    }
    
}
