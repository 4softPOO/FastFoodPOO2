/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood.vista;
import fastfood.controlador.opciones;

//dhfhiyfhc
public class Opciones extends javax.swing.JFrame {
int telefonoint;
    /**
     * Creates new form Opciones
     */
    public Opciones() {
        initComponents();
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
        contraAntigua = new javax.swing.JTextField();
        contraNueva = new javax.swing.JTextField();
        repetirContra = new javax.swing.JTextField();
        usuario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        eliminaCredito = new javax.swing.JButton();
        eliminarDevito = new javax.swing.JButton();
        actualizarDebito = new javax.swing.JButton();
        eliminarCredito = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        telefonoTF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        contraAntigua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraAntiguaActionPerformed(evt);
            }
        });
        getContentPane().add(contraAntigua, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 120, -1));

        contraNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraNuevaActionPerformed(evt);
            }
        });
        getContentPane().add(contraNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 120, -1));

        repetirContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repetirContraActionPerformed(evt);
            }
        });
        getContentPane().add(repetirContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 120, -1));

        usuario.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        usuario.setText("Carlos Castro");
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel6.setText("Tarjeta De Credito: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel7.setText("Tarjeta Debito:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        eliminaCredito.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        eliminaCredito.setText("Eliminar");
        getContentPane().add(eliminaCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, -1, -1));

        eliminarDevito.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        eliminarDevito.setText("Eliminar");
        getContentPane().add(eliminarDevito, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        actualizarDebito.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        actualizarDebito.setText("Actualizar");
        actualizarDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarDebitoActionPerformed(evt);
            }
        });
        getContentPane().add(actualizarDebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        eliminarCredito.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        eliminarCredito.setText("Actualizar");
        eliminarCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCreditoActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

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

        telefonoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoTFActionPerformed(evt);
            }
        });
        getContentPane().add(telefonoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 130, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel13.setText("Telefono:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, 20));

        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });
        getContentPane().add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 130, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 255, 153));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 620, 10));

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
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 70, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fastfood/imagenes/Save as-48.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, 60, 60));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 10, 110));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fastfood/imagenes/orig_83350.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
       menuPrincipal obj = new menuPrincipal();
        obj.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void actualizarDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarDebitoActionPerformed
        actualizarMetodo obj2 = new actualizarMetodo();
        obj2.setVisible(true);
    }//GEN-LAST:event_actualizarDebitoActionPerformed

    private void eliminarCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCreditoActionPerformed
        actualizarMetodo obj3 = new actualizarMetodo();
        obj3.setVisible(true);
    }//GEN-LAST:event_eliminarCreditoActionPerformed

    private void contraAntiguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraAntiguaActionPerformed
        // contraseña antigua:
    }//GEN-LAST:event_contraAntiguaActionPerformed

    private void contraNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraNuevaActionPerformed
        // contraseña nueva:
    }//GEN-LAST:event_contraNuevaActionPerformed

    private void repetirContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repetirContraActionPerformed
        // repetir contraseña:
    }//GEN-LAST:event_repetirContraActionPerformed

    private void telefonoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoTFActionPerformed
        // telefono:
        
    }//GEN-LAST:event_telefonoTFActionPerformed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // direccion:
    }//GEN-LAST:event_direccionActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        opciones obj = new opciones();
         obj.setContraAntigua(contraAntigua.getText());
         obj.setContraNueva(contraNueva.getText());
         obj.setRepetirContra(repetirContra.getText());
         obj.setTelefono(telefonoint=Integer.parseInt(telefonoTF.getText()));
         obj.setDireccion(direccion.getText());
    }//GEN-LAST:event_jLabel9MouseClicked

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
                new Opciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarDebito;
    private javax.swing.JTextField contraAntigua;
    private javax.swing.JTextField contraNueva;
    private javax.swing.JTextField direccion;
    private javax.swing.JButton eliminaCredito;
    private javax.swing.JButton eliminarCredito;
    private javax.swing.JButton eliminarDevito;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField repetirContra;
    private javax.swing.JTextField telefonoTF;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
