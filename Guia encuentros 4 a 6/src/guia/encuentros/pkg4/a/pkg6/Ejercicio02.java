/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.encuentros.pkg4.a.pkg6;

import java.util.Scanner;

/**
 *Crear un programa que pida una frase y si esa frase es igual a “eureka” 
 * el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de 
 * Incorrecto. Nota: investigar la función equals() en Java.

 * @author fer_c
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena1 = "eureka";
        String cadena2;
        System.out.println("Ingrese la palabra secreta:");
        cadena2=leer.next();
        
        if (cadena1.equals(cadena2)) {
        System.out.println("Usted descubrio la palabra secreta");
        }else{ 
        System.out.println("Usted ingreso una palabra incorrecta"); 
    }   
        
                
        
    }
    
}
