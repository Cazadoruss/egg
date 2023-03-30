/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.encuentros.pkg4.a.pkg6;

import java.util.Scanner;

/**
 *Realizar un programa que solo permita introducir solo frases o palabras de 8
 * de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá
 * de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
 * se deberá imprimir “INCORRECTO”. 
 * Nota: investigar la funcion Lenght() en Java.

 * @author fer_c
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        System.out.println("Ingrese una frase o palabra de 8 caracteres");
        cadena=leer.nextLine();
        
        if (cadena.length()== 8) {
           System.out.println("CORRECTO");
        }else{ 
        System.out.println("INCORRECTO");
        } 
        
        
    }
    
}
