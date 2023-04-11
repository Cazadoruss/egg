
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales
 * (la comparación deberá detenerse en cuanto se detecte alguna diferencia 
 * entre los elementos).

 * @author fer_c
 */
public class EjeExtra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector1 = new int[3];
        int[] vector2 = new int[3];
        boolean bool = true;

        for (int i = 0; i < 3; i++) {
            vector1[i] = (int) (Math.random() * 10 + 1);
            vector2[i] = (int) (Math.random() * 10 + 1);
        }
        for (int elemento : vector1) {

            System.out.print("[" + elemento + "]");
        }
        System.out.println("");
        for (int elemento : vector2) {
            System.out.print("[" + elemento + "]");
        }
        System.out.println("");

        for (int i = 0; i < 3; i++) {
            if (vector1[i] == vector2[i]) {
                bool = true;
            } else {
                bool = false;
                break;
            }
        }
        
        }
        
    }
    

