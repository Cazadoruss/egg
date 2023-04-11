/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Crear una función rellene un vector con números aleatorios, pasándole un
 * arreglo por parámetro. Después haremos otra función o procedimiento que 
 * imprima el vector.
 * @author fer_c
 */
public class EjeExtra03 {

    /**
     * @param args the command line arguments
     */
   public static void llenadoAleatorio(int[] v){
        for (int i = 0; i < v.length; i++) {
            v[i]=(int)(Math.random()*10+1);
        }
    }
    
    public static void mostrarVector(int[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.print("["+v[i]+"]");
        }
    }
    
    public static void main(String[] args) {
        int[] vector = new int[10];
        
        llenadoAleatorio(vector);
        mostrarVector(vector);
    }
}
