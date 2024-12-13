package in;

import mensajes.cmensajes;

public class registro extends javax.swing.JFrame {

    public registro() {
        initComponents();
    }

    public boolean validaCampos() {
        String nombre, apellidos, email, confEmail, telefono, curp, password, user;
        nombre = jTFNombre.getText();
        apellidos = jTFApellidos.getText();
        email = jTFEmail.getText();
        confEmail = jTFConEmail.getText();
        curp = JtxfCURP.getText();
        telefono = jTFTelefono.getText();
        password = jTFContrasenia.getText();
        user = jTFUsuario.getText();
        if (nombre.isEmpty() || apellidos.isEmpty() || email.isEmpty() || confEmail.isEmpty() || curp.isEmpty() || telefono.isEmpty() || password.isEmpty() || user.isEmpty()) {
            cmensajes.warning("Llene todos los campos por favor!", "Registro Usuario");
            return false;
        } else {
            return true;
        }
    }

    public boolean sonIguales() {
        String email, confEmail;
        email = jTFEmail.getText();
        confEmail = jTFConEmail.getText();
        if (email.equals(confEmail)) {
            return true;
        } else {
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpnlLienzo = new javax.swing.JPanel();
        JlblTitulo = new javax.swing.JLabel();
        JlblLeyenda = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLApellidos = new javax.swing.JLabel();
        jLCorreo = new javax.swing.JLabel();
        jLConCorreo = new javax.swing.JLabel();
        jLTelefono = new javax.swing.JLabel();
        jLPassword = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jTFApellidos = new javax.swing.JTextField();
        jTFEmail = new javax.swing.JTextField();
        jTFConEmail = new javax.swing.JTextField();
        jTFTelefono = new javax.swing.JTextField();
        jTFContrasenia = new javax.swing.JTextField();
        jBRegistrarme = new javax.swing.JButton();
        jLUser = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();
        JtxfCURP = new javax.swing.JTextField();
        JlblCURP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JpnlLienzo.setBackground(new java.awt.Color(28, 58, 70));
        JpnlLienzo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JlblTitulo.setFont(new java.awt.Font("Dubai", 0, 36)); // NOI18N
        JlblTitulo.setForeground(new java.awt.Color(204, 204, 204));
        JlblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlblTitulo.setText("BANATESChi");
        JpnlLienzo.add(JlblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 21, 489, -1));

        JlblLeyenda.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        JlblLeyenda.setForeground(new java.awt.Color(204, 204, 204));
        JlblLeyenda.setText("Ingrese los datos que a continuacion se solicitan:");
        JpnlLienzo.add(JlblLeyenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 89, -1, -1));

        jLNombre.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLNombre.setForeground(new java.awt.Color(204, 204, 204));
        jLNombre.setText("Nombre (s):");
        JpnlLienzo.add(jLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 128, -1, -1));

        jLApellidos.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLApellidos.setForeground(new java.awt.Color(204, 204, 204));
        jLApellidos.setText("Apellidos:");
        JpnlLienzo.add(jLApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 128, -1, -1));

        jLCorreo.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLCorreo.setForeground(new java.awt.Color(204, 204, 204));
        jLCorreo.setText("Email:");
        JpnlLienzo.add(jLCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 203, -1, -1));

        jLConCorreo.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLConCorreo.setForeground(new java.awt.Color(204, 204, 204));
        jLConCorreo.setText("Confirme su email:");
        JpnlLienzo.add(jLConCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 203, -1, -1));

        jLTelefono.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLTelefono.setForeground(new java.awt.Color(204, 204, 204));
        jLTelefono.setText("Telefono:");
        JpnlLienzo.add(jLTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        jLPassword.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLPassword.setForeground(new java.awt.Color(204, 204, 204));
        jLPassword.setText("Cree una contraseña:");
        JpnlLienzo.add(jLPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 350, -1, -1));

        jTFNombre.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        JpnlLienzo.add(jTFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 158, 207, -1));

        jTFApellidos.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        JpnlLienzo.add(jTFApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 158, 207, -1));

        jTFEmail.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        JpnlLienzo.add(jTFEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 230, 207, -1));

        jTFConEmail.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        JpnlLienzo.add(jTFConEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 233, 207, -1));

        jTFTelefono.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        JpnlLienzo.add(jTFTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 207, -1));

        jTFContrasenia.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        JpnlLienzo.add(jTFContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 380, 207, -1));

        jBRegistrarme.setBackground(new java.awt.Color(204, 204, 204));
        jBRegistrarme.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jBRegistrarme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_banco/anadir.png"))); // NOI18N
        jBRegistrarme.setText("Registrarme");
        jBRegistrarme.setToolTipText("");
        jBRegistrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistrarmeActionPerformed(evt);
            }
        });
        JpnlLienzo.add(jBRegistrarme, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 443, -1, -1));

        jLUser.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLUser.setForeground(new java.awt.Color(204, 204, 204));
        jLUser.setText("Ingrese su usuario:");
        JpnlLienzo.add(jLUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 350, -1, -1));

        jTFUsuario.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        JpnlLienzo.add(jTFUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 380, 207, -1));

        JtxfCURP.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        JpnlLienzo.add(JtxfCURP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 207, -1));

        JlblCURP.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        JlblCURP.setForeground(new java.awt.Color(204, 204, 204));
        JlblCURP.setText("CURP");
        JpnlLienzo.add(JlblCURP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpnlLienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpnlLienzo, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBRegistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarmeActionPerformed
        if (validaCampos()) {
            if (!sonIguales()) {
                cmensajes.warning("El correo no coincide \n Intentelo de nuevo", "Registro Usuario");
                jTFEmail.setText("");
                jTFConEmail.setText("");
            } else {
                //Buscar por CURP
                
            }
        } else {

        }

    }//GEN-LAST:event_jBRegistrarmeActionPerformed
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlblCURP;
    private javax.swing.JLabel JlblLeyenda;
    private javax.swing.JLabel JlblTitulo;
    private javax.swing.JPanel JpnlLienzo;
    private javax.swing.JTextField JtxfCURP;
    private javax.swing.JButton jBRegistrarme;
    private javax.swing.JLabel jLApellidos;
    private javax.swing.JLabel jLConCorreo;
    private javax.swing.JLabel jLCorreo;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLPassword;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JLabel jLUser;
    private javax.swing.JTextField jTFApellidos;
    private javax.swing.JTextField jTFConEmail;
    private javax.swing.JTextField jTFContrasenia;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFTelefono;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables
}
