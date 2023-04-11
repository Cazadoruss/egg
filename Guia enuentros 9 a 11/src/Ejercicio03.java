
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Recorrer un vector de N enteros contabilizando cuántos números son de 1
 *dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 * @author fer_c
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        int[] vector = new int[10];
        for (int i = 0; i < 10; i++) {
            vector[i] = (int) (Math.random() * 1000);
            System.out.print("[" + vector[i] + "] ");
        }

        //Random random = new Random();
        //vector[i] = random.nextInt(101);
        for (int i = 0; i < 10; i++) {
            if (vector[i] < 10) {
                cont1++;
            } else if (vector[i] >= 10 && vector[i] < 100) {
                cont2++;
            } else if (vector[i] >= 100 && vector[i] < 1000) {
                cont3++;
            } else if (vector[i] >= 1000 && vector[i] < 10000) {
                cont4++;
            } else {
                cont5++;
            }

        }
        System.out.println("");
        System.out.println("Total de los numeros de un digito = " + cont1);
        System.out.println("Total de los numeros de dos digitos = " + cont2);
        System.out.println("Total de los numeros de tres digitos = " + cont3);
        System.out.println("Total de los numeros de cuatro digitos = " + cont4);
        System.out.println("Total de los numeros de cinco digitos = " + cont5);
    }

}
