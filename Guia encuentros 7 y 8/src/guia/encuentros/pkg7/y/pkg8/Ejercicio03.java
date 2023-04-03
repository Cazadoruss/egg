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
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
     * Crea una aplicacion que a travez de una funcion nos convierta una 
     * cantidad de euros introducida por teclado a otra moneda, estas pueden 
     * ser a dolares, yenes o libras. La funcion tendra como parametros, 
     * la cantidad de euros y la moneda a convertir que sera una cadena, 
     * este no devolvera ningun valor y mostrara un mensaje indicando el 
     * cambio (void).
     * 
     * El cambio de divisas es:
     * 0.86 libras es un 1 Euro
     * 1.28611 $ es un 1 Euro
     * 129.852 yenes es un 1 Euro

     */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros: ");
        System.out.print("Euros: ");
        double euros = leer.nextDouble();

        System.out.println("");
        System.out.println("A que divisa desea convertir"
                + "\nLibra"
                + "\nDolar"
                + "\nYen");
        leer.nextLine();
        String divisa = leer.nextLine();

        conversionDivisas(euros, divisa);
    }

    public static int conversionDivisas(double euros, String divisa) {
        double valorConvertido = 0;
        String valor = "h";

        if (divisa.equalsIgnoreCase("Libra")) {
            valorConvertido = euros * 0.86;
            valor = "Libras";
        } else if (divisa.equalsIgnoreCase("Dolar")) {
            valorConvertido = euros * 1.28611;
            valor = "Dolares";
        } else if (divisa.equalsIgnoreCase("Yen")) {
            valorConvertido = euros * 129.852;
            valor = "Yenes";
        }

        System.out.println(euros + " euros son igual a: " + valorConvertido
                + " " + valor);
        return 0;
    }

    
    
}
