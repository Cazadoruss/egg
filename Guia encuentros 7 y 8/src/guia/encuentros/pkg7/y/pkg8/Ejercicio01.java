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
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Crea una aplicaciÃ³n que le pida dos nÃºmeros al usuario y este pueda
         * elegir entre sumar, restar, multiplicar y dividir. La aplicaciÃ³n debe
         * tener una funciÃ³n para cada operaciÃ³n matemÃ¡tica y deben devolver sus
         * resultados para imprimirlos en el main.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1, num2, opcion;
        System.out.print("Numero 1: ");
        num1 = leer.nextInt();
        System.out.print("Numero 2: ");
        num2 = leer.nextInt();
        String tecla;

        do {
            System.out.println("\nAhora elija la opcion a realizar: "
                + "\n1) Sumar"
                + "\n2) Restar"
                + "\n3) Multiplicar"
                + "\n4) Dividir"
                + "\n5) Salir del menu");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("La suma es = " + suma(num1, num2));
                break;
            case 2:
                System.out.println("La resta es = " + resta(num1, num2));
                break;
            case 3:
                System.out.println("La multiplicaciÃ³n es = " + multiplicacion(num1, num2));
                break;
            case 4:
                System.out.println("La division es = " + division(num1, num2));
                break;
            default:
                System.out.println("Usted decidio salir");;
        }
            System.out.println("Presione cualquier tecla para continuar");
            
        tecla = leer.nextLine();
        leer.nextLine();
        } while (opcion != 5);
        
    }
    public static int suma(int num1, int num2) {
        int variableRetorno = num1 + num2;
        return variableRetorno;
    }
    
    public static int resta(int num1, int num2) {
        int variableRetorno = num1 - num2;
        return variableRetorno;
    }
    
    public static int multiplicacion(int num1, int num2) {
        int variableRetorno = num1 * num2;
        return variableRetorno;
    }
    
    public static double division(int num1, int num2) {
        double variableRetorno = num1 / num2;
        return variableRetorno;
    }


    
    
}
