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
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * DiseÃ±e una funciÃ³n que pida el nombre y la edad de N personas e
         * imprima los datos de las personas ingresadas por teclado e indique si
         * son mayores o menores de edad. DespuÃ©s de cada persona, el programa
         * debe preguntarle al usuario si quiere seguir mostrando personas y
         * frenar cuando el usuario ingrese la palabra â€œNoâ€.
         */

        int edad, num;
        String nombre = "a";
        boolean respuesta;

        num = 0;
        edad = 0;
        do {
            respuesta = funcionGeneral(nombre, edad);
            if (respuesta == true) {
            } else if (respuesta == false) {
                num++;
            }

        } while (num == 0);

    }

    public static boolean funcionGeneral(String nombre, int edad) {
        String cadena;
        Scanner leer = new Scanner(System.in);

        System.out.print("Nombre: ");
        nombre = leer.nextLine();
        System.out.println("");

        System.out.print("Edad: ");
        edad = leer.nextInt();
        System.out.println("");

        if (edad >= 18) {
            cadena = "Si";
        } else {
            cadena = "No";
        }
        System.out.println("Nombre: " + nombre
                + "\nEdad: " + edad
                + "\nEs mayor?: " + cadena);

        System.out.println("Desea seguir mostrando personas?");
        leer.nextLine();
        String respuesta = leer.nextLine();

        respuesta = respuesta.toUpperCase();
        boolean confirmacion;
        confirmacion = true;
        if (respuesta.equals("NO")) {
            confirmacion = false;
        }
        return confirmacion;
    }

    
    
}
