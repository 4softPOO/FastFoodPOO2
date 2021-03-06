/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood.vista;

import fastfood.controlador.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

//dhfhiyfhc
public class Opciones extends javax.swing.JFrame {

//    private fastfood.controlador.Opciones obj;
//    private credito obj1;
    private opciones Option;

    /**
     * Creates new form Opciones
     */
    public Opciones() throws SQLException, Exception {
        initComponents();
        Option = new opciones();
        Option.obtenerDatosDB();
        opciones mostrar = Option.obtenerDatosDB();
        jtftelefono.setText(mostrar.getDireccion());
        jtfdireccion.setText(mostrar.getTelefono());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfcontraAntigua = new javax.swing.JTextField();
        jtfcontraNueva = new javax.swing.JTextField();
        jtfrepetirContra = new javax.swing.JTextField();
        usuario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bteliminaCredito = new javax.swing.JButton();
        bteliminarCredito = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtftelefono = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtfdireccion = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jltarjeta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel1.setText("Dirección:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 80, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña Nueva:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel3.setText("Repita Contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 20));

        jtfcontraAntigua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfcontraAntiguaActionPerformed(evt);
            }
        });
        getContentPane().add(jtfcontraAntigua, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 120, -1));

        jtfcontraNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfcontraNuevaActionPerformed(evt);
            }
        });
        getContentPane().add(jtfcontraNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 120, -1));

        jtfrepetirContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfrepetirContraActionPerformed(evt);
            }
        });
        getContentPane().add(jtfrepetirContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 120, -1));

        usuario.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        usuario.setText("Carlos Castro");
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel6.setText("Tarjeta De Credito: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        bteliminaCredito.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        bteliminaCredito.setText("Eliminar");
        getContentPane().add(bteliminaCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, -1, -1));

        bteliminarCredito.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        bteliminarCredito.setText("Actualizar");
        bteliminarCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarCreditoActionPerformed(evt);
            }
        });
        getContentPane().add(bteliminarCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fastfood/imagenes/User-50 (1).png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 60));

        jSeparator1.setForeground(new java.awt.Color(0, 255, 153));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 620, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 255, 153));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 620, 10));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel11.setText("Metodos de pago");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 190, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel12.setText("Contraseña Antigua:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 20));

        jtftelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtftelefonoActionPerformed(evt);
            }
        });
        jtftelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtftelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(jtftelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 130, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel13.setText("Telefono:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, 20));

        jtfdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfdireccionActionPerformed(evt);
            }
        });
        getContentPane().add(jtfdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 130, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 255, 153));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 620, 10));

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel14.setText("Informacion personal");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 210, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fastfood/imagenes/Return-50.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 70, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fastfood/imagenes/Save as-48.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 60, 60));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 10, 110));

        jltarjeta.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jltarjeta.setText("0000000000000000");
        getContentPane().add(jltarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fastfood/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        menuPrincipal obj = new menuPrincipal();
        obj.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jLabel8MouseClicked

    private void bteliminarCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarCreditoActionPerformed
        actualizarMetodo obj3 = new actualizarMetodo();
        obj3.setVisible(true);
    }//GEN-LAST:event_bteliminarCreditoActionPerformed

    private void jtfcontraAntiguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfcontraAntiguaActionPerformed
        // contraseña antigua:
    }//GEN-LAST:event_jtfcontraAntiguaActionPerformed

    private void jtfcontraNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfcontraNuevaActionPerformed
        // contraseña nueva:
    }//GEN-LAST:event_jtfcontraNuevaActionPerformed

    private void jtfrepetirContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfrepetirContraActionPerformed
        // repetir contraseña:
    }//GEN-LAST:event_jtfrepetirContraActionPerformed

    private void jtftelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtftelefonoActionPerformed
        // telefono:        
    }//GEN-LAST:event_jtftelefonoActionPerformed

    private void jtfdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfdireccionActionPerformed
        // direccion:
    }//GEN-LAST:event_jtfdireccionActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        try {
            // guardar:
            Option.actualizarDatosDB();

        } catch (Exception ex) {
            Logger.getLogger(Opciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        Option.setContraVista(jtfcontraAntigua.getText());
        Option.setContraNuevaVista1(jtfcontraNueva.getText());
        Option.setContraNuevaVista2(jtfrepetirContra.getText());
        jtfcontraAntigua.setText("");
        jtfcontraNueva.setText("");
        jtfrepetirContra.setText("");

    }//GEN-LAST:event_jLabel9MouseClicked

    private void jtftelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtftelefonoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jtftelefonoKeyTyped

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
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Opciones().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Opciones.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(Opciones.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bteliminaCredito;
    private javax.swing.JButton bteliminarCredito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel jltarjeta;
    private javax.swing.JTextField jtfcontraAntigua;
    private javax.swing.JTextField jtfcontraNueva;
    private javax.swing.JTextField jtfdireccion;
    private javax.swing.JTextField jtfrepetirContra;
    private javax.swing.JTextField jtftelefono;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
