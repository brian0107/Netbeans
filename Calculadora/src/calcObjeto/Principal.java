/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcObjeto;


import java.util.Scanner;


public class Principal {
    
    static int numero1,numero2;
   static int opcion;
   static Scanner sc=new Scanner(System.in);
   


  
    public static void main(String[] args) {
        do{
            
           System.out.println("¿QUE OPERACION DESEA REALIZAR?");
        System.out.println("1.-SUMAR");
        System.out.println("2.-RESTAR");
        System.out.println("3.-Multiplicar");
        System.out.println("4.-Dividir");
        System.out.println("5.-Salir");
        opcion=sc.nextInt();
        
        System.out.println("ingresa el primer numero");
         numero1=sc.nextInt();
            System.out.println("Ingresa el segundo numero");
         numero2=sc.nextInt();
            
        switch(opcion){
            case 1:
                
                suma su= new suma();
                System.out.println("el resultado es:"+su.sumar(numero1, numero2));
                break;
            case 2:
                resta res= new resta();
                System.out.println("el resultado es:"+res.resta(numero1, numero2));
                
                break;
            case 3:
                multiplicacion mul= new multiplicacion();
                System.out.println("el resultado es:"+mul.multiplicar(numero1, numero2));
                
                break;
            case 4:
               division div= new division();
               System.out.println("el resultado es:"+div.dividir(numero1, numero2));
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
}
