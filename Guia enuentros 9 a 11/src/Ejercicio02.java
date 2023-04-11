
import java.util.Scanner;

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
 * y le pida al usuario un número a buscar en el vector. El programa mostrará
 * dónde se encuentra el numero y si se encuentra repetido

 * @author fer_c
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        
        int numero1;
        int aleatorio;
        aleatorio= (int)(Math.random()*20);
        
        int repetido;
        
        repetido = 0;
        
        int[] vector1 = new int[30];
        
        System.out.println("Bienvenido");
        System.out.println("Ingrese un número");
        System.out.println("");
        numero1 = leer.nextInt();
        
        for (int i = 0; i < vector1.length; i++) {            
            vector1[i]= (int)(Math.random()*10);
        }
        
        for (int i = 0; i < vector1.length; i++) {            
            
            if (vector1[i]== numero1) {                
                System.out.println("Numero elegido "+numero1+" aparece en la posición: "+i);
                repetido++;
            }
        }
        
        for (int i = 0; i < vector1.length; i++) {                      
            System.out.print("["+vector1[i]+"] ");            
        }
        
        System.out.println("");
        System.out.println("El numero elegido: "+numero1+" aparece: "+repetido+" veces.");
                
    }
    
}
    
    

