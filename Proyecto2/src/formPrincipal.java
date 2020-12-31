import Clases.Fondoimagen;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class formPrincipal extends JFrame implements ActionListener {
    private final  int Width = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    private final  int Height = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
   
    

    
   
   
    public formPrincipal  () {
        initComponents();
        
        panelInterno.setBorder(new Fondoimagen());
        this.setExtendedState(formPrincipal.MAXIMIZED_BOTH);
        panelIngreso Pingreso = new panelIngreso();
        panelInterno.add(Pingreso);
        Pingreso.setVisible(true);
        //jMenuBar1.setVisible(false);
        Pingreso.setBounds((this.Width/2)-(450/2),(this.Height/2)-(350/2), 450,250);
   
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        panelInterno = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuItemEmpleados = new javax.swing.JMenuItem();
        MenuItemEstudiantes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelInternoLayout = new javax.swing.GroupLayout(panelInterno);
        panelInterno.setLayout(panelInternoLayout);
        panelInternoLayout.setHorizontalGroup(
            panelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        panelInternoLayout.setVerticalGroup(
            panelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("Formularios");

        MenuItemEmpleados.setText("Empleados");
        MenuItemEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemEmpleadosActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItemEmpleados);

        MenuItemEstudiantes.setText("Estudiantes");
        MenuItemEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemEstudiantesActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItemEstudiantes);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem5.setText("Salir");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelInterno)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInterno, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemEmpleadosActionPerformed
         frmEmpleados frmEmp = new frmEmpleados();
         frmEmp.setVisible(true);
    }//GEN-LAST:event_MenuItemEmpleadosActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
      System.exit(0);
       
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void MenuItemEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemEstudiantesActionPerformed
     
        frmEstudiantes frmEst = new frmEstudiantes();
        frmEst.setVisible(true);
    }//GEN-LAST:event_MenuItemEstudiantesActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new formPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItemEmpleados;
    private javax.swing.JMenuItem MenuItemEstudiantes;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JDesktopPane panelInterno;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
       
    }
}
