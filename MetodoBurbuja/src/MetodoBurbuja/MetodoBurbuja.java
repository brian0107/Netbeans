
package MetodoBurbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MetodoBurbuja {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, aux,n;
        String salida="",salida2="";
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo"));
        
        arreglo = new int[nElementos]; //Le asignamos el numeros de elementos al arreglo 
        
        for(int i=0;i<nElementos;i++){
            n = Integer.parseInt(JOptionPane.showInputDialog((i+1)+" . Digite un número"));
            arreglo[i] = n;
        }
        //Metodo burbuja 
        for(int  i=0;i<(nElementos-1);i++){
            for(int j=0;j<(nElementos-1);j++){
                if(arreglo[j]> arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        for(int i=0; i<arreglo.length;i++){
            salida += arreglo[i]+"\n";
        }
        JOptionPane.showMessageDialog(null,salida,"ORDENAMIENTO EN FORMA CRECIENTE",JOptionPane.INFORMATION_MESSAGE);
        
        for(int i=arreglo.length-1; i>=0;i--){
            salida2 += arreglo[i]+"\n";
        }
        JOptionPane.showMessageDialog(null,salida2,"ORDENAMIENTO EN FORMA DECRECIENTE",JOptionPane.INFORMATION_MESSAGE);
    }
}
