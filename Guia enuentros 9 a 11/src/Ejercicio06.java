
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 * Crear un programa que permita introducir un cuadrado por teclado y determine
 * si este cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.

 * @author fer_c
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int num, diagPrim = 0, diagOp = 0;
        int sumF1 = 0, sumC1 = 0, sumF2 = 0, sumC2 = 0, sumF3 = 0, sumC3 = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese dato para la pocision: " + i + "-" + j);
                num = leer.nextInt();
                while (num < 1 || num > 9) {
                    System.out.println("El dato debe ser un numero entre 1 y 9");
                    num = leer.nextInt();
                }
                matriz[i][j] = num;
            }
        }

        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    sumF1 += matriz[i][0] + matriz[i][1] + matriz[i][2];
                    sumC1 += matriz[i][0] + matriz[i + 1][0] + matriz[i + 2][0];
                    break;
                case 1:
                    sumF2 += matriz[i][0] + matriz[i][1] + matriz[i][2];
                    break;
                case 2:
                    sumF3 += matriz[i][0] + matriz[i][1] + matriz[i][2];
                    break;
            }

            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
                if (i == j) {
                    diagPrim += matriz[i][j];
                }
                if (i + j == 2) {
                    diagOp += matriz[i][j];
                }
                if (i == 0) {
                    if (j == 1) {
                        sumC2 += matriz[i][j] + matriz[i + 1][j] + matriz[i + 2][j];
                    } else if (j == 2) {
                        sumC3 += matriz[i][j] + matriz[i + 1][j] + matriz[i + 2][j];
                    }
                }
            }
            System.out.println("");
        }

        if (sumF1 == sumF2 && sumF1 == sumF3 && sumF1 == sumC1 && sumF1 == sumC2 && sumF1 == sumC3
                && sumF1 == diagPrim && sumF1 == diagOp) {
            System.out.println("la matriz es magica");
        } else {
            System.out.println("la matriz no es magica");
        }

       //System.out.println("diagPrim: " + diagPrim);
       // System.out.println("diagOp: " + diagOp);
       //System.out.println("sumF1: " + sumF1);
       // System.out.println("sumF2: " + sumF2);
       // System.out.println("sumF3: " + sumF3);
       //System.out.println("sumC1: " + sumC1);
       // System.out.println("sumC2: " + sumC2);
       //System.out.println("sumC3: " + sumC3);
    }
}
