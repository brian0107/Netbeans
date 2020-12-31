
package form;


import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.*;
import java.util.*;

import java.awt.*;
public   class formEmpleados extends JFrame implements ActionListener,MouseListener{

    
 private int anioActual, fila;
Object[] filas = new Object[6];
DefaultTableModel modeloTabla = new DefaultTableModel();

 private JPanel cont1= new JPanel();
 private JPanel panel2= new JPanel();
 private JPanel contenedor=new JPanel();
 private JLabel lblNom=new JLabel("nombre:");
 private JLabel lblNacimiento=new JLabel("Nacimiento:");
 private JLabel lblAp=new JLabel("Apellido:");
 private JLabel lblEd=new JLabel("Edad:");
 private JLabel lblGe=new JLabel("Genero:");
 private JLabel lblF=new JLabel("Femenino");
 private JLabel lblM=new JLabel("Masculino");
 private JLabel lblDe=new JLabel("Deporte");
 private JLabel lblOtro=new JLabel("Otro");
 private JLabel lblMa=new JLabel("Manualidades");
 private JLabel lblAr=new JLabel("Areas de interes:");
 private DefaultTableModel modelo=new DefaultTableModel();
 private JTable tblEmpleados=new JTable(modelo);
 private JScrollPane scrollPane = new JScrollPane();
 private JRadioButton rdbMasc =new JRadioButton();//marcar solo una
 private JRadioButton rdbFem =new JRadioButton();
 
 private JCheckBox chbDeporte=new JCheckBox();//marcar varias
 private JCheckBox chbManual=new JCheckBox();
 private JCheckBox chbOtro=new JCheckBox();
 private JTextField txtNombre= new JTextField();
 private JTextField txtApellido= new JTextField();
 private JTextField txtNa= new JTextField();
 private JTextField txtEdad= new JTextField();
 private JTextField txtOtro= new JTextField();
 private ButtonGroup g1=new ButtonGroup();
 private ButtonGroup g2=new ButtonGroup();
 private JComboBox cmbAnios = new JComboBox();
 private JButton btnAgregar=new JButton("Agregar");
 private JButton btnModif=new JButton("Modificar");
 private JButton btnBorrar=new JButton("Eliminar");
 private JButton btnCerrar=new JButton("Cerrar");
 private DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
 public formEmpleados(){
     //constructor
     super("formulario empleados");
        
     this.setSize(600, 600);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
     initComponentes();
     cargarAnios(); //Invocación al método que carga los elementos años al Combo
     configModelo(); // Invocación al método que configura el encabezado de la tabla
     detEdad(); // Invocación al método que calcula la edad del empleado
 }

  void cargarAnios(){
    int i;
    DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
    Calendar fecha = Calendar.getInstance();
    anioActual = fecha.get(Calendar.YEAR); //obtiene año actual
    for(i=1950; i<=anioActual; i++)
    {modeloCombo.addElement(i);}
    cmbAnios.setModel(modeloCombo); //se carga el combobox desde el modelo
}
  void configModelo(){
  modeloTabla.addColumn("Nombre");
  modeloTabla.addColumn("Apellidos");
  modeloTabla.addColumn("Año");
  modeloTabla.addColumn("Edad");
  modeloTabla.addColumn("Sexo");
  modeloTabla.addColumn("Areas");
  tblEmpleados.setModel(modeloTabla);  
}

   void detEdad(){
    int edad = anioActual - Integer.parseInt(cmbAnios.getSelectedItem().toString());
   txtEdad.setText(String.valueOf(edad));
}
 private void detDatos() // Creación al método que calcula la edad del empleado
{
    
String Ainteres="";
//carga los datos
filas[0]=txtNombre.getText();
filas[1]=txtApellido.getText();
filas[2]=cmbAnios.getSelectedItem().toString();
filas[3]=txtEdad.getText();

if(rdbFem.isSelected()){ filas[4]="Femenino"; }
else  if (rdbMasc.isSelected()){ filas[4]="Masculino"; } else{filas[4]="";}

if(chbDeporte.isSelected()) { Ainteres = lblDe.getText() + ","; }

if(chbManual.isSelected()) { Ainteres= lblMa.getText() + ","; }
if(chbOtro.isSelected()) { Ainteres= txtOtro.getText() + ","; }

  filas[5]=  Ainteres;
}

    
 
 
  
    private void initComponentes() {
       cont1.setBackground(Color.LIGHT_GRAY);
      cont1.setLayout(null);
      this.add(cont1);
      panel2.setBackground(Color.LIGHT_GRAY);
      panel2.setLayout(null);
      this.add(cont1);
     contenedor.setBackground(Color.LIGHT_GRAY);
      contenedor.setLayout(null);
      this.add(cont1);
      //_______________________________________________________
      //tabla  creación
      
      setLocationRelativeTo(tblEmpleados);
    
      
      
      tblEmpleados.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
      scrollPane.add(tblEmpleados);
      scrollPane.setViewportView(tblEmpleados);
     //color
      chbDeporte.setBackground(Color.LIGHT_GRAY);
      chbManual.setBackground(Color.LIGHT_GRAY);
      chbOtro.setBackground(Color.LIGHT_GRAY);
      rdbMasc.setBackground(Color.LIGHT_GRAY);
      rdbFem.setBackground(Color.LIGHT_GRAY);
      
      
      //añadir
      cont1.add(rdbMasc);
      cont1.add(scrollPane);
     
      cont1.add(chbDeporte);
      cont1.add(cmbAnios);
      cont1.add(contenedor);
      cont1.add(btnAgregar);
      cont1.add(btnModif);
      cont1.add(btnBorrar);
      cont1.add(btnCerrar);
      cont1.add(panel2);
      cont1.add(panel2);
      cont1.add(lblNom);
      panel2.add(lblNom);
      cont1.add(lblAp);
      panel2.add(lblAp);
      cont1.add(txtNombre);
      panel2.add(txtApellido);
      cont1.add(lblNacimiento);
      panel2.add(lblNacimiento);
      cont1.add(lblEd);
      panel2.add(lblEd);
      cont1.add(txtEdad);
      panel2.add(txtEdad);
      cont1.add(lblGe);
      panel2.add(lblGe);
      cont1.add(rdbFem);
      panel2.add(rdbFem);
      cont1.add(lblM);
      panel2.add(lblM);
      cont1.add(lblF);
      panel2.add(lblF);
      cont1.add(lblAr);
      panel2.add(lblAr);
      
      cont1.add(lblDe);
      panel2.add(lblDe);
      cont1.add(chbManual);
      panel2.add(chbManual);
      cont1.add(lblMa);
      panel2.add(lblMa);
      cont1.add(chbOtro);
      panel2.add(chbOtro);
      cont1.add(lblOtro);
      panel2.add(lblOtro);
      cont1.add(txtOtro);
      panel2.add(txtOtro);
      
      //
      
      
      //ubicación
      cmbAnios.setBounds(140, 160, 100, 20);
      rdbMasc.setBounds(420, 180, 20, 20);
      rdbFem.setBounds(400, 140, 20, 20);
      
      scrollPane.setBounds(50, 370, 500, 100);
      chbDeporte.setBounds(145, 280, 20, 20);
      chbManual.setBounds(200, 260, 20, 20);
      //botones
      btnAgregar.setBounds(30, 500, 80, 20);
      btnModif.setBounds(170, 500, 100, 20);
      btnBorrar.setBounds(330, 500, 80, 20);
      btnCerrar.setBounds(460, 500, 80, 20);
      lblNom.setBounds(30, 30, 100, 40);
      lblAp.setBounds(30, 80, 100, 40);
      txtNombre.setBounds(140, 60, 250, 20);
      txtApellido.setBounds(120, 90, 250, 20);
      lblNacimiento.setBounds(30, 130, 100, 40);
      lblEd.setBounds(240, 140, 100, 20);
      txtEdad.setBounds(290, 140, 40, 20);
      lblGe.setBounds(350, 140, 90, 20);
      lblM.setBounds(430, 160, 100, 20);
      lblF.setBounds(430, 140, 100, 20);
      lblAr.setBounds(30, 260, 100, 20);
      lblDe.setBounds(150, 260, 100, 20);
      
      lblMa.setBounds(230, 260, 100, 20);
      chbOtro.setBounds(310, 260, 20, 20);
      lblOtro.setBounds(340, 260, 50, 20);
      txtOtro.setBounds(390, 260, 50, 20);
//Jpan
      panel2.setBounds(20, 20, 550, 320);
      panel2.setBorder(BorderFactory.createTitledBorder("Datos generales del empleado"));
      panel2.setBackground(Color.LIGHT_GRAY);
      contenedor.setBounds(20, 350, 550, 130);
      contenedor.setBackground(Color.LIGHT_GRAY);
      contenedor.setBorder(BorderFactory.createTitledBorder("Lista de empleados"));
     
//grupo
      g1.add(chbDeporte);
      g1.add(chbManual);
      g1.add(chbOtro);
      g2.add(rdbFem);
      g2.add(rdbMasc);
      txtOtro.setEnabled(false);
      btnAgregar.addActionListener(this);
      btnModif.addActionListener(this);
      cmbAnios.addActionListener(this);
      btnBorrar.addActionListener(this);
      btnCerrar.addActionListener(this);
      tblEmpleados.addMouseListener(this);
      chbOtro.addActionListener(this);
      chbDeporte.addActionListener(this);
      chbManual.addActionListener(this);
      
      
 }
     //eventos
 @Override
 public void actionPerformed(ActionEvent e){
     
     
     if(e.getSource().equals(btnAgregar)){
         detDatos();
        modeloTabla.addRow(filas);
        tblEmpleados.setModel(modeloTabla); 
         Lim();
     }
     
    
     
     //modificar
     if(e.getSource().equals(btnModif)){
     detDatos();
     Lim(); 
for(int i=0; i<6; i++)
{
modeloTabla.setValueAt(filas[i], fila, i);
//cambia el modelo por lo que tiene el vector filas
}
tblEmpleados.setModel(modeloTabla);

}
     //checkbox
  if(e.getSource().equals(cmbAnios)){   
   detEdad();   
  }
  //Borrar
  if(e.getSource().equals(btnBorrar)){ 
      modeloTabla.removeRow(fila);
tblEmpleados.setModel(modeloTabla); //actualiza la tabla con el modelo
  Lim();
  }
  //tabla
 
  
  
  //cerrar
  if(e.getSource().equals(btnCerrar)){
    dispose();  
  }
  
  if(e.getSource().equals(chbOtro)){
    txtOtro.setEnabled(true);
    }
 else{
     txtOtro.setEnabled(false);  
  }
  
 }
 @Override
    public void mouseClicked(MouseEvent me) {
        
        
        
       if(me.getSource().equals(tblEmpleados)){
        txtOtro.setText("");
        
       fila = tblEmpleados.rowAtPoint(me.getPoint());
       txtNombre.setText(tblEmpleados.getValueAt(fila, 0).toString());
       txtApellido.setText(tblEmpleados.getValueAt(fila, 1).toString());
       modeloCombo.setSelectedItem(tblEmpleados.getValueAt(fila, 2).toString());
       txtEdad.setText(tblEmpleados.getValueAt(fila, 3).toString());
       if(tblEmpleados.getValueAt(fila, 4).toString().equalsIgnoreCase("Femenino")){
           rdbFem.setSelected(true);
       } else{rdbMasc.setSelected(true);}
       if(tblEmpleados.getValueAt(fila, 5).toString().equalsIgnoreCase("Deporte")){
           chbDeporte.setSelected(true);
       } else if(tblEmpleados.getValueAt(fila, 5).toString().equalsIgnoreCase("Manualidades")){
           chbManual.setSelected(true);}
       else{
           chbOtro.setSelected(true);
           txtOtro.setText(tblEmpleados.getValueAt(fila, 5).toString());
           txtOtro.setEnabled(true);
           
       }
       }
       
       
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
      
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
   
    }
 private void Lim(){
    txtNombre.setText("");
    txtApellido.setText("");
    txtEdad.setText("");
    g2.clearSelection();
    g1.clearSelection();
    txtOtro.setText("");
    
}
    }
         

  
 