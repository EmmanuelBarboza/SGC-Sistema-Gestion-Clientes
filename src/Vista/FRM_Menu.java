/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Manejador;
import java.awt.event.ActionListener;

/**
 *
 * @author Estudiante
 */
public class FRM_Menu extends javax.swing.JFrame {
    
    Manejador manejador; 
    public FRM_Menu() {
        
        initComponents();
        manejador= new Manejador(); // se hace la referencia a manejador menu
        escucharMenu(manejador);
                
                
    }//Fin del constructor

    public void escucharMenu(ActionListener manejador) {

        jmi_RegistroC.addActionListener(manejador);
        jmi_Salir.addActionListener(manejador);
        jmi_RegistroProductos.addActionListener(manejador);
        jmi_Venta.addActionListener(manejador);
        jmi_ConsultarFactura.addActionListener(manejador);
        

    }//Fin del metodo

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmiRegistrarProductos = new javax.swing.JMenu();
        jmi_RegistroC = new javax.swing.JMenuItem();
        jmi_RegistroProductos = new javax.swing.JMenuItem();
        jmi_Venta = new javax.swing.JMenuItem();
        jmi_ConsultarFactura = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmi_Salir = new javax.swing.JRadioButtonMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/maxresdefault.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 255));

        jmiRegistrarProductos.setText("File");

        jmi_RegistroC.setText("Registrar Cliente");
        jmi_RegistroC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_RegistroCActionPerformed(evt);
            }
        });
        jmiRegistrarProductos.add(jmi_RegistroC);

        jmi_RegistroProductos.setText("Registrar Productos");
        jmi_RegistroProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_RegistroProductosActionPerformed(evt);
            }
        });
        jmiRegistrarProductos.add(jmi_RegistroProductos);

        jmi_Venta.setText("Modulo de Venta");
        jmi_Venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_VentaActionPerformed(evt);
            }
        });
        jmiRegistrarProductos.add(jmi_Venta);

        jmi_ConsultarFactura.setText("Consultar Factura");
        jmiRegistrarProductos.add(jmi_ConsultarFactura);

        jMenuBar1.add(jmiRegistrarProductos);

        jMenu2.setForeground(new java.awt.Color(0, 0, 0));
        jMenu2.setText("Edit");

        jmi_Salir.setSelected(true);
        jmi_Salir.setText("Salir");
        jMenu2.add(jmi_Salir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_RegistroCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_RegistroCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_RegistroCActionPerformed

    private void jmi_RegistroProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_RegistroProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_RegistroProductosActionPerformed

    private void jmi_VentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_VentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_VentaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRM_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu jmiRegistrarProductos;
    private javax.swing.JMenuItem jmi_ConsultarFactura;
    private javax.swing.JMenuItem jmi_RegistroC;
    private javax.swing.JMenuItem jmi_RegistroProductos;
    private javax.swing.JRadioButtonMenuItem jmi_Salir;
    private javax.swing.JMenuItem jmi_Venta;
    // End of variables declaration//GEN-END:variables
}
