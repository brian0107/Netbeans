
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brian
 */
public class For {
    static Scanner sc= new Scanner(System.in);
    public static void main (String []args){
        
         int respuesta= sc.nextInt();
         for(int i=respuesta; i>=respuesta; i--){
           for(int j=10; j>=1; j--){
               
                System.out.println(i + "X" + j + "=" + i*j);
            }
        }
    }
}
                 //i siempre sera 5 por que al decrementarlo se rompe el bucle ya que debe ser mayor o igual a 5
                 
         
         
        
        
    

