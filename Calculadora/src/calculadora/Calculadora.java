/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.*;

public class Calculadora {
   static int numero1,numero2;
   static int opcion;
   static Scanner sc=new Scanner(System.in);
   


  
    public static void main(String[] args) {
        int resultado;
        do{
            System.out.println("ingresa el primer numero");
        numero1=sc.nextInt();
            System.out.println("Ingresa el segundo numero");
        numero2=sc.nextInt();
           System.out.println("¿QUE OPERACION DESEA REALIZAR?");
        System.out.println("1.-SUMAR");
        System.out.println("2.-RESTAR");
        System.out.println("3.-Multiplicar");
        System.out.println("4.-Dividir");
        opcion=sc.nextInt();
            
        switch(opcion){
            case 1:
                resultado=suma(numero1,numero2);
                System.out.println("el resultado es:"+resultado);
                break;
            case 2:
                resultado=resta(numero1,numero2);
                System.out.println("el resultado es:"+resultado);
                break;
            case 3:
                resultado=multiplicar(numero1,numero2);
                System.out.println("el resultado es:"+resultado);
                break;
            case 4:
                resultado=dividir(numero1,numero2);
                System.out.println("el resultado es:"+resultado);
                break;
                case 5:
                    System.out.println("Hasta la proxima");
                    System.exit(0);
                
            default:
                System.out.println("opcion no valida");
                break;
        }
    } while(opcion!=5);
        
    
        
    }
    public static int suma(int numero1, int numero2){
        return numero1+numero2;
        
    }
    public static int resta(int numero1, int numero2){
        return numero1-numero2;
        
    }
    public static int multiplicar(int numero1, int numero2){
        return numero1*numero2;
    }
    public static int dividir(int numero1, int numero2){
        return numero1/numero2;
    
    
    }
}
