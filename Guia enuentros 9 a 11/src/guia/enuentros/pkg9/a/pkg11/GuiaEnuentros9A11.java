/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.enuentros.pkg9.a.pkg11;

import java.util.Scanner;

/**
 *
 * @author fer_c
 */
public class GuiaEnuentros9A11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector;
        System.out.println("Ingrese el tamaño del vector");
        int n = sc.nextInt();
        vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }

        System.out.println("Ingresa el número que desea buscar en el vector");
        int numeroABuscar = sc.nextInt();
        for (int i = 0; i < vector.length; i++) {
            if (numeroABuscar == vector[i]) {
                System.out.println("Se encontró el número " + numeroABuscar + " en el subíndice " + i);
            }
        }
    }
}
    
       /* int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];

        System.out.println("MATRIZ A");
        System.out.println();
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                matrizA[i][j] = (int) (Math.random() * 10);
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                matrizB[j][i] = matrizA[i][j];
            }
        }
        System.out.println();
        System.out.println("MATRIZ B");
        System.out.println();
        for (int[] ints : matrizB) {
            for (int j = 0; j < matrizB.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
el 4*/ 

