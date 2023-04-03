/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.encuentros.pkg7.y.pkg8;

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
        /**
         * Crea una aplicacion que nos pida un numero por teclado y con una
         * funcion se lo pasamos por parÃ¡metro para que nos indique si es o no
         * un numero primo, debe devolver true si es primo, sino false. Un
         * numero primo es aquel que solo puede dividirse entre 1 y si mismo.
         * Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin
         * embargo, 17 si es primo.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        System.out.print("Numero: ");
        int num = leer.nextInt();
        
        System.out.println("¿El numero es primo?: " + primos(num));
    }
    public static String primos(int num) {
        int contador = 0;
        String respuesta;
        
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                contador++;
            }
        }
        if (contador > 1) {
            respuesta = "No";
        } else {
            respuesta = "Si";
        }
        return respuesta;
    }
    
    
}
