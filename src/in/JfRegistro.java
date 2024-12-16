package in;

import connection.CModelos;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import mensajes.cmensajes;

public class JfRegistro extends javax.swing.JFrame {

    public JfRegistro() {
        initComponents();
    }
    private final CModelos mdl = new CModelos();

    public void generarFrame() {
        JfP frm = new JfP();
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        frm.setSize(295, 490);
        frm.setResizable(false);
        frm.setTitle("Registro usuario");
        this.dispose();
    }

    public void generarFrameDireccion(String nombre, String apeP, String apeM, String email, String confEmail, String telefono, String curp, String password, String user) {
        JfDireccion frm = new JfDireccion();
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        frm.setSize(380, 370);
        frm.setResizable(false);
        frm.setTitle("Registro usuario");
        frm.datosUsuario(new String[]{nombre, apeP, apeM, email, confEmail, telefono, curp, password, user});
        this.dispose();
    }

    public boolean validaCampos() {
        String nombre, apeP, apeM, email, confEmail, telefono, curp, password, user;
        nombre = jTFNombre.getText();
        apeP = jTFApellidoP.getText();
        apeM = jTFApellidoM.getText();
        email = jTFEmail.getText();
        confEmail = jTFConEmail.getText();
        curp = JtxfCURP.getText();
        telefono = jTFTelefono.getText();
        password = jTFContrasenia.getText();
        user = jTFUsuario.getText();

        // Validación de campos vacíos
        if (nombre.isEmpty() || apeP.isEmpty() || apeM.isEmpty() || email.isEmpty() || confEmail.isEmpty() || curp.isEmpty() || telefono.isEmpty() || password.isEmpty() || user.isEmpty()) {
            cmensajes.warning("Llene todos los campos por favor!", "Registro Usuario");
            return false;
        }

        // Validación de formato de email
        if (!Pattern.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$", email)) {
            cmensajes.warning("El email ingresado no es válido!", "Registro Usuario");
            return false;
        }

        // Validación de CURP (18 caracteres alfanuméricos)
        if (!Pattern.matches("^[A-Z0-9]{18}$", curp)) {
            cmensajes.warning("El CURP debe contener 18 caracteres alfanuméricos!", "Registro Usuario");
            return false;
        }

        // Validación de teléfono (solo números, 10 dígitos)
        if (!Pattern.matches("^[0-9]{10}$", telefono)) {
            cmensajes.warning("El teléfono debe contener exactamente 10 dígitos!", "Registro Usuario");
            return false;
        }

        // Validación de nombre y apellidos (solo letras y espacios)
        if (!nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$") || !apeP.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$") || !apeM.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$")) {
            cmensajes.warning("Nombre y apellidos deben contener solo letras y espacios!", "Registro Usuario");
            return false;
        }

        return true;
    }

    public boolean sonIguales() {
        String email, confEmail;
        email = jTFEmail.getText();
        confEmail = jTFConEmail.getText();
        if (email.equals(confEmail)) {
            return true;
        } else {
            cmensajes.warning("El correo no coincide \n Intentelo de nuevo", "Registro Usuario");
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
        jTFApellidoP = new javax.swing.JTextField();
        jTFEmail = new javax.swing.JTextField();
        jTFConEmail = new javax.swing.JTextField();
        jTFTelefono = new javax.swing.JTextField();
        jTFContrasenia = new javax.swing.JTextField();
        jBRegistrarme = new javax.swing.JButton();
        jLUser = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();
        JtxfCURP = new javax.swing.JTextField();
        JlblCURP = new javax.swing.JLabel();
        jLApellidoM = new javax.swing.JLabel();
        jTFApellidoM = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro Usuario");
        setPreferredSize(new java.awt.Dimension(700, 490));
        setResizable(false);

        JpnlLienzo.setBackground(new java.awt.Color(28, 58, 70));

        JlblTitulo.setFont(new java.awt.Font("Dubai", 0, 36)); // NOI18N
        JlblTitulo.setForeground(new java.awt.Color(204, 204, 204));
        JlblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlblTitulo.setText("BANATESChi");

        JlblLeyenda.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        JlblLeyenda.setForeground(new java.awt.Color(204, 204, 204));
        JlblLeyenda.setText("Ingrese los datos que a continuacion se solicitan:");

        jLNombre.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLNombre.setForeground(new java.awt.Color(204, 204, 204));
        jLNombre.setText("Nombre (s):");

        jLApellidos.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLApellidos.setForeground(new java.awt.Color(204, 204, 204));
        jLApellidos.setText("Apellido Paterno:");

        jLCorreo.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLCorreo.setForeground(new java.awt.Color(204, 204, 204));
        jLCorreo.setText("Email:");

        jLConCorreo.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLConCorreo.setForeground(new java.awt.Color(204, 204, 204));
        jLConCorreo.setText("Confirme su email:");

        jLTelefono.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLTelefono.setForeground(new java.awt.Color(204, 204, 204));
        jLTelefono.setText("Telefono:");

        jLPassword.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLPassword.setForeground(new java.awt.Color(204, 204, 204));
        jLPassword.setText("Cree una contraseña:");

        jTFNombre.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        jTFApellidoP.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        jTFEmail.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        jTFConEmail.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        jTFTelefono.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        jTFContrasenia.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

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

        jLUser.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLUser.setForeground(new java.awt.Color(204, 204, 204));
        jLUser.setText("Ingrese su usuario:");

        jTFUsuario.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        JtxfCURP.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        JlblCURP.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        JlblCURP.setForeground(new java.awt.Color(204, 204, 204));
        JlblCURP.setText("CURP");

        jLApellidoM.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLApellidoM.setForeground(new java.awt.Color(204, 204, 204));
        jLApellidoM.setText("Apellido Materno:");

        jTFApellidoM.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        javax.swing.GroupLayout JpnlLienzoLayout = new javax.swing.GroupLayout(JpnlLienzo);
        JpnlLienzo.setLayout(JpnlLienzoLayout);
        JpnlLienzoLayout.setHorizontalGroup(
            JpnlLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnlLienzoLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(JlblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(JpnlLienzoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(JlblLeyenda))
            .addGroup(JpnlLienzoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLNombre)
                .addGap(154, 154, 154)
                .addComponent(jLApellidos)
                .addGap(130, 130, 130)
                .addComponent(jLApellidoM))
            .addGroup(JpnlLienzoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jTFApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jTFApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(JpnlLienzoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLCorreo)
                .addGap(190, 190, 190)
                .addComponent(jLConCorreo))
            .addGroup(JpnlLienzoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jTFConEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(JpnlLienzoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(JlblCURP)
                .addGap(187, 187, 187)
                .addComponent(jLTelefono))
            .addGroup(JpnlLienzoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(JtxfCURP, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(JpnlLienzoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(JpnlLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLPassword)
                    .addComponent(jTFContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(JpnlLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLUser)
                    .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jBRegistrarme, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JpnlLienzoLayout.setVerticalGroup(
            JpnlLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnlLienzoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(JlblTitulo)
                .addGap(7, 7, 7)
                .addComponent(JlblLeyenda)
                .addGap(18, 18, 18)
                .addGroup(JpnlLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLNombre)
                    .addGroup(JpnlLienzoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(JpnlLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLApellidos)
                            .addComponent(jLApellidoM))))
                .addGap(4, 4, 4)
                .addGroup(JpnlLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JpnlLienzoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(JpnlLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addGroup(JpnlLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpnlLienzoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLCorreo))
                    .addComponent(jLConCorreo))
                .addGap(3, 3, 3)
                .addGroup(JpnlLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFConEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(JpnlLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JlblCURP)
                    .addComponent(jLTelefono))
                .addGap(6, 6, 6)
                .addGroup(JpnlLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JtxfCURP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(JpnlLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpnlLienzoLayout.createSequentialGroup()
                        .addComponent(jLPassword)
                        .addGap(6, 6, 6)
                        .addComponent(jTFContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpnlLienzoLayout.createSequentialGroup()
                        .addComponent(jLUser)
                        .addGap(6, 6, 6)
                        .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpnlLienzoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jBRegistrarme))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpnlLienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpnlLienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBRegistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarmeActionPerformed
        try {
            if (validaCampos() && sonIguales()) {
                String curp = mdl.buscaCliente(JtxfCURP.getText());
                if (curp == null) {
                    cmensajes.mistake("A continuación agregue su dirección \n Por favor", "Registro Usuario");
                    generarFrameDireccion(jTFNombre.getText(), jTFApellidoP.getText(), jTFApellidoM.getText(), jTFEmail.getText(), jTFConEmail.getText(), jTFTelefono.getText(), JtxfCURP.getText(), jTFContrasenia.getText(), jTFUsuario.getText());
                } else {
                    cmensajes.message("El usuario ya se encuentra registrado!", "Registro Usuario");
                    this.dispose();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(JfRegistro.class.getName()).log(Level.SEVERE, "Error al validar el CURP en la base de datos", ex);
            cmensajes.mistake("Ocurrió un error al verificar el CURP", "Error");
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
            java.util.logging.Logger.getLogger(JfRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfRegistro().setVisible(true);
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
    private javax.swing.JLabel jLApellidoM;
    private javax.swing.JLabel jLApellidos;
    private javax.swing.JLabel jLConCorreo;
    private javax.swing.JLabel jLCorreo;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLPassword;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JLabel jLUser;
    private javax.swing.JTextField jTFApellidoM;
    private javax.swing.JTextField jTFApellidoP;
    private javax.swing.JTextField jTFConEmail;
    private javax.swing.JTextField jTFContrasenia;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFTelefono;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables
}
