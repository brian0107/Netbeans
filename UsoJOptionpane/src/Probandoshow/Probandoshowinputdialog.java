/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Probandoshow;

import javax.swing.JOptionPane;



/**
 *
 * @author brian
 */
public class Probandoshowinputdialog {
    public static void main(String[] args) {
        String nombre=JOptionPane.showInputDialog(null, "Escribe tu nombre");
        System.out.println(" Hola tu nombre es" + nombre);
        
        int edad=Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe tu edad"));
        System.out.println(" Hola tu edad es" + edad);
    }
    
}
    
    
