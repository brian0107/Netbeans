/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_joption;

import javax.swing.JOptionPane;
import funciones.add;
import funciones.subtract;
import funciones.Multiply;
import funciones.divide;

public class Calculadora_JOption {

    public static void main(String[] args) {
        String option=(JOptionPane.showInputDialog("Escoje una opcion: \n - = Restar \n += sumar \n *=Multiplicar \n /=Dividir \n"));
 
            if(option.isEmpty()){
                JOptionPane.showMessageDialog(null, "Error", "Aviso de sistema", JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            
            }else{
            
        int F_number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero"));
        int S_number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero"));

        switch(option){
            case "+":
                add Add = new add();
                System.out.println("La suma es:"+ Add.sumar(F_number, S_number));
                break;
            case "-":
                subtract Subtract = new subtract();
                System.out.println("La resta es:" + Subtract.restar(F_number, S_number));
                break;
            case "*":
                Multiply multiply = new Multiply();
                System.out.println("La multiplicacion es:" + multiply.multiplicar(F_number, S_number));
                break;
            case "/":
                divide Divide = new divide();
                System.out.println("La division es:" + Divide.dividir(F_number, S_number));
                break;
                
            default:
                System.out.println("La opcion no existe");
                
        }
    }
}
}
