
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Realizar un algoritmo que calcule la suma de todos los elementos de un vector
 * de tamaño N, con los valores ingresados por el usuario.

 * @author fer_c
 */
public class EjeExtra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector =  new int [3];
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            
             System.out.println("Ingrese un valor");
            vector[i]=leer.nextInt();
            suma+=vector[i];
        }
        
        System.out.println("La suma de los elementos del vector es: "+ suma);
    }
            
        }
    
    

