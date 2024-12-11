package in;
public class registro extends javax.swing.JFrame {
    public registro() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLApellidos = new javax.swing.JLabel();
        jLCorreo = new javax.swing.JLabel();
        jLConCorreo = new javax.swing.JLabel();
        jLNacimiento = new javax.swing.JLabel();
        jLTelefono = new javax.swing.JLabel();
        jLPassword = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jTFApellidos = new javax.swing.JTextField();
        jTFEmail = new javax.swing.JTextField();
        jTFConEmail = new javax.swing.JTextField();
        jTFTelefono = new javax.swing.JTextField();
        jTFFecha = new javax.swing.JTextField();
        jTFContrasenia = new javax.swing.JTextField();
        jBRegistrarme = new javax.swing.JButton();
        jLUser = new javax.swing.JLabel();
        jTFContrasenia1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(28, 58, 70));

        jLabel2.setFont(new java.awt.Font("Dubai", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BANATESChi");

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Ingrese los datos que a continuacion se solicitan:");

        jLNombre.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLNombre.setForeground(new java.awt.Color(204, 204, 204));
        jLNombre.setText("Nombre (s):");

        jLApellidos.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLApellidos.setForeground(new java.awt.Color(204, 204, 204));
        jLApellidos.setText("Apellidos:");

        jLCorreo.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLCorreo.setForeground(new java.awt.Color(204, 204, 204));
        jLCorreo.setText("Email:");

        jLConCorreo.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLConCorreo.setForeground(new java.awt.Color(204, 204, 204));
        jLConCorreo.setText("Confirme su email:");

        jLNacimiento.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLNacimiento.setForeground(new java.awt.Color(204, 204, 204));
        jLNacimiento.setText("Fecha de nacimiento:");

        jLTelefono.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLTelefono.setForeground(new java.awt.Color(204, 204, 204));
        jLTelefono.setText("Telefono:");

        jLPassword.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLPassword.setForeground(new java.awt.Color(204, 204, 204));
        jLPassword.setText("Cree una contraseña:");

        jTFNombre.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        jTFApellidos.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        jTFEmail.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        jTFConEmail.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        jTFTelefono.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        jTFFecha.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        jTFContrasenia.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        jBRegistrarme.setBackground(new java.awt.Color(204, 204, 204));
        jBRegistrarme.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jBRegistrarme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_banco/anadir.png"))); // NOI18N
        jBRegistrarme.setText("Registrarme");
        jBRegistrarme.setToolTipText("");

        jLUser.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLUser.setForeground(new java.awt.Color(204, 204, 204));
        jLUser.setText("Ingrese su usuario:");

        jTFContrasenia1.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLNombre)
                                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLCorreo)
                                    .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLNacimiento)
                                    .addComponent(jTFFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLPassword)
                                    .addComponent(jTFContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLApellidos)
                                    .addComponent(jTFApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLConCorreo)
                                    .addComponent(jTFConEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLTelefono)
                                    .addComponent(jTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLUser)
                                    .addComponent(jTFContrasenia1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jBRegistrarme)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLApellidos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLCorreo)
                                .addGap(3, 3, 3)
                                .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLConCorreo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFConEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLNacimiento)
                                .addGap(3, 3, 3)
                                .addComponent(jTFFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLTelefono)
                                .addGap(2, 2, 2)
                                .addComponent(jTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFContrasenia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(jBRegistrarme)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
    private javax.swing.JButton jBRegistrarme;
    private javax.swing.JLabel jLApellidos;
    private javax.swing.JLabel jLConCorreo;
    private javax.swing.JLabel jLCorreo;
    private javax.swing.JLabel jLNacimiento;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLPassword;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JLabel jLUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFApellidos;
    private javax.swing.JTextField jTFConEmail;
    private javax.swing.JTextField jTFContrasenia;
    private javax.swing.JTextField jTFContrasenia1;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFFecha;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFTelefono;
    // End of variables declaration//GEN-END:variables
}
