
package ventana;

import javax.swing.JFrame;

public class Ventana extends JFrame{
    public Ventana(){
        setSize( 500,500);//Establecemos el tamaño de la ventana
        setTitle("EL MEJOR TITULO");//Establecemos el titulo de la ventana
        //setLocation(100,200);//Establecemos la posicion inicial de la ventana
        //setBounds(100,200,500,500);//Establecemos la posicion inicial y el tamaño de la ventana
        setLocationRelativeTo(null);//Establecemos la ventana en el centro
                
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
