/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.arreglos;

/**
 *
 * @author brian
 */
public class PracticaArreglos {

   static String amigos[]={"Juan","Pedro","Luis"};
    public static void main(String[] args) {
        for (int i=0;i<amigos.length;i++){
            System.out.println("El amigo: "+i+" es:"+ amigos[i]);
            
        }
        System.out.println("Mi mejor amigo es: "+ amigos[1]);//Imprimir un unico amigo segun la posicion
        
    }
    
}
