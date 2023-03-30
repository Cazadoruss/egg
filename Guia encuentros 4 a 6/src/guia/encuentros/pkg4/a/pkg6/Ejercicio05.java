/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.encuentros.pkg4.a.pkg6;

import java.util.Scanner;

/**
 *
 * @author fer_c
 */
public class Ejercicio05 {

    /**Escriba un programa en el cual se ingrese un valor límite positivo, y
     * a continuación solicite números al usuario hasta que la suma de los
     * números introducidos supere el límite inicial.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int limite = 80;
       int num = 0;
       int suma = 0;
               
       while (suma<limite){
           System.out.println("Ingrese un numero entero");
           num=leer.nextInt();
           suma += num;
       }
        System.out.println("Usted a llegado al limite");
        
    }
    
}
