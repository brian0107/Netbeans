
package form;
import foto.fondoIma;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class frmPrincipal extends JFrame implements ActionListener {
   private int Width = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
   private int Height = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
   private JMenuBar menuBar = new JMenuBar();
   private JDesktopPane escritorio= new JDesktopPane();
   private JMenu menuFormulario=new JMenu("formulario");
   private JMenu menuExit=new JMenu("salir");
   private JMenuItem ItemEstudiantes = new JMenuItem("ESTUDIANTES");
   private JMenuItem ItemEmpleados = new JMenuItem("EMPLEADOS");
   private JMenuItem ItemSalir = new JMenuItem("SALIR DEL SISTEMA");
   private JInternalFrame internalFrame= new JInternalFrame();
   private JPanel panelInterno= new JPanel();
   private JLabel lblUser= new JLabel("Usuario");
   private JLabel lblPas= new JLabel("Constraseña");
   private JTextField txtUser= new JTextField();
   private JPasswordField txtPas= new JPasswordField(); //oculta los caracteres
   private JButton btnAceptar = new JButton("Aceptar");
   private JButton btnSalir = new JButton("Salir");
   private JLabel lblImagen= new JLabel();
   
    public frmPrincipal(){
        super("prueba 2");//titulo
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//cerrar
        this.setExtendedState(MAXIMIZED_BOTH);//maximizar pantalla
        this.setSize(600, 600);//tamaño
        menuBar.setEnabled(false);
                
            
        initComponents();
      
                
    }
    private void initComponents(){//metodo para ingresar todos los componentes del Frame
      //atributos DesktopPane
      escritorio.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
      
      escritorio.setBorder(new fondoIma("../foto/fond.jpg"));
      this.add(escritorio);
      //-------------------------------------------------------------------------------
      //Creación de los menu al menuBar
      menuBar.add(menuFormulario);
      menuBar.add(menuExit);
      //------------------------------------------
      //Agregamos los items a sus menus
      menuFormulario.add(ItemEmpleados);
      menuFormulario.add(ItemEstudiantes);
      menuExit.add(ItemSalir);
      //agregamos al escritorio y el menubar al JFrame
      this.add(escritorio);
      this.add(menuBar,BorderLayout.NORTH);//posicionar jmenu arriba
      
      //Formulario Interno
      //-------------------------------------------------
      internalFrame.setBounds((this.Width/2)-(400/2),(this.Height/2)-(400/2),400,300);
      internalFrame.setClosable(true);
      internalFrame.setVisible(true);
      panelInterno.setLayout(null);//se adapte al internalFrame
      panelInterno.setBackground(Color.LIGHT_GRAY);
      //asignamos posición a los elementos
        lblUser.setBounds(170, 0, 100, 50);
        txtUser.setBounds(170, 40, 180, 22);
        lblPas.setBounds(170, 60, 100, 50);
        txtPas.setBounds(170, 100, 180, 22);
        lblImagen.setBounds(10, 21, 150,150);
        btnAceptar.setBounds(170, 140, 80, 30);
        btnSalir.setBounds(270, 140, 80, 30);
        //asignamos la imagen a la etiqueta
        ImageIcon dell = new ImageIcon(getClass().getResource("../foto/kkj.png"));
        dell = new ImageIcon(dell.getImage().getScaledInstance(lblImagen.getWidth(),lblImagen.getHeight(), Image.SCALE_DEFAULT));
        lblImagen.setIcon(dell);
        //agregar elementos al panel
        panelInterno.add(lblImagen);
        panelInterno.add(lblUser);
        panelInterno.add(lblPas);
        panelInterno.add(txtUser);
        panelInterno.add(txtPas);
        panelInterno.add(btnAceptar);
        panelInterno.add(btnSalir);
        panelInterno.add(lblImagen);
        //---------------------------------------
        menuFormulario.setEnabled(false);
        menuExit.setEnabled(false);
        btnAceptar.addActionListener(this);
        ItemSalir.addActionListener(this);
        btnSalir.addActionListener(this);
        ItemEmpleados.addActionListener(this);
        ItemEstudiantes.addActionListener(this);
      //lo anteior lo agregamos al escritorio
      menuBar.setEnabled(false);
      escritorio.add(internalFrame);
      internalFrame.add(panelInterno);
      
      
    }
//eventos
    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
      
          if(e.getSource().equals(btnAceptar)){   
            if((txtUser.getText().equals("monse")) && (txtPas.getText().equals("123"))) {
                JOptionPane.showMessageDialog(null, "Bienvenida Monse");
               
        menuFormulario.setEnabled(true);
        menuExit.setEnabled(true);
        menuBar.setEnabled(true);        
                internalFrame.dispose();
               
           
            }else{
                JOptionPane.showMessageDialog(null,"ups.... datos erroneos");
                txtUser.setText("");
                txtPas.setText("");
            } 
        }
          
          if(e.getSource().equals(ItemSalir) || (e.getSource().equals(btnSalir))){
            System.exit(0);
        }if(e.getSource().equals(ItemSalir) || (e.getSource().equals(btnSalir))){
            System.exit(0);
        }
        if(e.getSource().equals(ItemEmpleados) ){
             
             formEmpleados Empleados = new formEmpleados();
       Empleados.setVisible(true);
        }
       
        if(e.getSource().equals(ItemEstudiantes) ){
             frmEstudiantes Estudiantes = new frmEstudiantes();
       Estudiantes.setVisible(true);
        }
    
    }
    
    }

