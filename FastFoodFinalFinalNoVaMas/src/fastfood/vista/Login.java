/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood.vista;

import fastfood.controlador.login;

/**
 *
 * @author Paua
 */
public class Login extends javax.swing.JFrame {

    
    

    public Login() {
    
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

        jLabel2 = new javax.swing.JLabel();
        usu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        contra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe WP Light", 2, 36)); // NOI18N
        jLabel2.setText("FastFood");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 170, 40));

        usu.setMinimumSize(new java.awt.Dimension(8, 20));
        usu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuMouseClicked(evt);
            }
        });
        usu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuActionPerformed(evt);
            }
        });
        getContentPane().add(usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 180, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fastfood/imagenes/key (1).png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 40, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fastfood/imagenes/checked (5).png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 40, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fastfood/imagenes/user (2).png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 40, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fastfood/imagenes/resume (1).png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel7.setText("¿No te has registrado? Presiona el icono y !Hazlo!");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 255, 153));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 380, 20));

        contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraActionPerformed(evt);
            }
        });
        getContentPane().add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 180, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fastfood/imagenes/fondo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       
       login obj = new login();
       obj.setUsuario(usu.getText());
       obj.setContra(contra.getText());
       obj.validarDatos();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
      
        registro obj = new registro();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void usuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuMouseClicked
       usu.setText("");
    }//GEN-LAST:event_usuMouseClicked

    private void contraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraActionPerformed

    public void cambiarInterfaz(Boolean val1){
        
        menuPrincipal ob4 = new menuPrincipal();
        ob4.setVisible(val1);
        this.dispose();
    
    }
    
    
    /**
     * @param args the command line arguments
     */public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField usu;
    // End of variables declaration//GEN-END:variables
}
