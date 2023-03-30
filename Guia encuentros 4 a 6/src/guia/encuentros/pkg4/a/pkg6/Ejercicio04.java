/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.encuentros.pkg4.a.pkg6;

import java.util.Scanner;

/**
 * Escriba un programa que pida una frase o palabra y valide si la primera letra 
 * de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
 * imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario,
 * se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y 
 * equals() de Java.

 * @author fer_c
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      String cadena;
      System.out.println("Ingrese una frase o palabra");
      cadena=leer.nextLine();
      cadena = cadena.toLowerCase();
      if (cadena.substring(0,1).equals("a")) {
          System.out.println("CORRECTO");
        }else{ 
        System.out.println("INCORRECTO");
        } 
      }
      
    
    
}
