/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood.vista;

import fastfood.controlador.Registro;

/**
 *
 * @author COlo
 */
public class registro extends javax.swing.JFrame {

    /**
     * Creates new form registro
     */
    public registro() {
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

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tarjeta = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        numeroT = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        fechaC = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        contra = new javax.swing.JTextField();
        contraval = new javax.swing.JTextField();
        codigoS = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(0, 255, 153));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 600, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 3, 48)); // NOI18N
        jLabel1.setText("FastFood");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 220, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel3.setText("Apellido");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel4.setText("Correo Electronico");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel5.setText("Telefono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel6.setText("Direccion");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 120, -1));
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 120, -1));
        getContentPane().add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 140, -1));
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 120, 20));
        getContentPane().add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 120, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel7.setText("Contraseña");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel8.setText("Confirmar contraseña");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setText("Informacion Personal");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 210, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 255, 153));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 600, 10));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel10.setText("Metodo de pago");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 150, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel11.setText("Los campos con * no son obligatorios");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel12.setText("*Tarjeta Credito");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        tarjeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Visa", "MasterCard" }));
        getContentPane().add(tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, 20));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel13.setText("*Numero");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));
        getContentPane().add(numeroT, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 120, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel14.setText("*Fecha de Caducidad");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, 20));
        getContentPane().add(fechaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 120, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel15.setText("*Codigo de seguridad");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 255, 153));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 600, 10));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fastfood/imagenes/Return-50.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 60, 70));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fastfood/imagenes/Save as-48.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 50, 50));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 10, 110));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 10, 110));

        contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraActionPerformed(evt);
            }
        });
        getContentPane().add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 140, -1));

        contraval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contravalActionPerformed(evt);
            }
        });
        getContentPane().add(contraval, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 140, 20));

        codigoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoSActionPerformed(evt);
            }
        });
        getContentPane().add(codigoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 70, 20));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fastfood/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        Login obj = new Login();
        obj.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jLabel16MouseClicked

    private void contraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraActionPerformed

    private void contravalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contravalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contravalActionPerformed

    private void codigoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoSActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
      
        
      Registro reg = new Registro();
      reg.setNombre(nombre.getText());
      reg.setApellido(apellido.getText());
      reg.setCodigoSeguridad(codigoS.getText());
      reg.setContraseña(contra.getText());
      reg.setCorreo(correo.getText());
      reg.setDireccion(direccion.getText());
      reg.setFecha(fechaC.getText());
      reg.setTarjetaCredito(tarjeta.getItemAt(WIDTH));
      reg.setValContraseña(contraval.getText());
      reg.setTelefono(telefono.getText());
      reg.setNumero(numeroT.getText());
      reg.mostrar();
      
     
    }//GEN-LAST:event_jLabel17MouseClicked

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
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField codigoS;
    private javax.swing.JTextField contra;
    private javax.swing.JTextField contraval;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField fechaC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numeroT;
    private javax.swing.JComboBox<String> tarjeta;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
