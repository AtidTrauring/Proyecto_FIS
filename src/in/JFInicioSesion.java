package in;

import connection.CModelos;
import java.sql.SQLException;
import mensajes.cmensajes;

public class JFInicioSesion extends javax.swing.JFrame {

    public JFInicioSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    // Va li mio, a ver que show :v
    CModelos mdl = new CModelos();
    private static String idUsuario; // Atributo estático

    public static void setIdUsuario(String id) {
        idUsuario = id;
    }

    public static String getIdUsuario() {
        return idUsuario;
    }

    public boolean campos_Vacios() {
        String user, psw;
        user = jTFUsuario.getText();
        psw = jTFContrasenia.getText();
        return !(user.isEmpty() || psw.isEmpty());
    }

    public String obtenerUsuario() {
        return jTFUsuario.getText().trim();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLUsuario = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();
        jLPasswordInicio = new javax.swing.JLabel();
        jTFContrasenia = new javax.swing.JTextField();
        jBAcceder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inicio de Sesion");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(28, 58, 70));

        jLabel2.setFont(new java.awt.Font("Dubai", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BANATESChi");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_banco/la-banca-movil.png"))); // NOI18N

        jLUsuario.setBackground(new java.awt.Color(204, 204, 204));
        jLUsuario.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLUsuario.setForeground(new java.awt.Color(204, 204, 204));
        jLUsuario.setText("Usuario:");

        jLPasswordInicio.setBackground(new java.awt.Color(204, 204, 204));
        jLPasswordInicio.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLPasswordInicio.setForeground(new java.awt.Color(204, 204, 204));
        jLPasswordInicio.setText("Contraseña:");

        jBAcceder.setBackground(new java.awt.Color(204, 204, 204));
        jBAcceder.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jBAcceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_banco/acceso.png"))); // NOI18N
        jBAcceder.setText("Acceder");
        jBAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAccederActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLPasswordInicio)
                    .addComponent(jTFContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLUsuario)
                    .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBAcceder)
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(jLUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLPasswordInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBAcceder)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAccederActionPerformed
        String user = jTFUsuario.getText();
        String psw = jTFContrasenia.getText();
        try {
            // Verifica que los campos no estén vacíos
            if (campos_Vacios()) {
                // Valida las credenciales
                String IdUser = mdl.busca_Usuario(user, psw);

                if (IdUser != null) { // Credenciales válidas
                    // Código para avanzar a la siguiente ventana
                    cmensajes.message("Bienvenido, " + user, "Iniciar Sesión");
                    setIdUsuario(IdUser);
                    System.out.println(IdUser);
                    System.out.println(getIdUsuario());
                    // Codigo BRISA
                    String nombre = jTFUsuario.getText(); // Obtiene el usuario
                    JFInicio ventanaInicio = new JFInicio();
                    ventanaInicio.setSaludo(nombre);
                    ventanaInicio.setSize(275, 415);
                    ventanaInicio.mostrarSaldo(nombre);
                    ventanaInicio.setVisible(true);
                    this.dispose(); // Cierra la ventana actual
                } else {
                    // Credenciales inválidas
                    cmensajes.warning("Usuario o contraseña incorrectos. Verifica que tus datos sean correctos", "Iniciar Sesión");
                }
            }
        } catch (SQLException e) {
            cmensajes.mistake("Ocurrió un error inesperado: " + e.getMessage(), "Iniciar Sesión");
        }
    }//GEN-LAST:event_jBAccederActionPerformed

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
            java.util.logging.Logger.getLogger(JFInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFInicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAcceder;
    private javax.swing.JLabel jLPasswordInicio;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFContrasenia;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables
}
