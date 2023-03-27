/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

import javax.swing.JOptionPane;

/**
 *
 * @author fer_c
 */
public class practica01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           String cadena;
           
           cadena= JOptionPane.showInputDialog("Ingrese su nombre: ");
           
           JOptionPane.showMessageDialog(null,"El nombre que usted ingresó es: "+cadena  );        
                   
    }
    
}
