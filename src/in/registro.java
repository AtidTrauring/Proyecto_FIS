package in;

import connection.CModelos;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import mensajes.cmensajes;

public class registro extends javax.swing.JFrame {

    public registro() {
        initComponents();
    }

    public void generarFrame() {
        jfprincipal frm = new jfprincipal();
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

    private final CModelos mdl = new CModelos();

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

        JpnlLienzo.setBackground(new java.awt.Color(28, 58, 70));
        JpnlLienzo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JlblTitulo.setFont(new java.awt.Font("Dubai", 0, 36)); // NOI18N
        JlblTitulo.setForeground(new java.awt.Color(204, 204, 204));
        JlblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlblTitulo.setText("BANATESChi");
        JpnlLienzo.add(JlblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 210, -1));

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
        jLApellidos.setText("Apellido Paterno:");
        JpnlLienzo.add(jLApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        jLCorreo.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLCorreo.setForeground(new java.awt.Color(204, 204, 204));
        jLCorreo.setText("Email:");
        JpnlLienzo.add(jLCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 203, -1, -1));

        jLConCorreo.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLConCorreo.setForeground(new java.awt.Color(204, 204, 204));
        jLConCorreo.setText("Confirme su email:");
        JpnlLienzo.add(jLConCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        jLTelefono.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLTelefono.setForeground(new java.awt.Color(204, 204, 204));
        jLTelefono.setText("Telefono:");
        JpnlLienzo.add(jLTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        jLPassword.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLPassword.setForeground(new java.awt.Color(204, 204, 204));
        jLPassword.setText("Cree una contraseña:");
        JpnlLienzo.add(jLPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 350, -1, -1));

        jTFNombre.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        JpnlLienzo.add(jTFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 158, 207, -1));

        jTFApellidoP.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        JpnlLienzo.add(jTFApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 207, -1));

        jTFEmail.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        JpnlLienzo.add(jTFEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 230, 207, -1));

        jTFConEmail.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        JpnlLienzo.add(jTFConEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 207, -1));

        jTFTelefono.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        JpnlLienzo.add(jTFTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 207, -1));

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
        JpnlLienzo.add(jBRegistrarme, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 360, 190, -1));

        jLUser.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLUser.setForeground(new java.awt.Color(204, 204, 204));
        jLUser.setText("Ingrese su usuario:");
        JpnlLienzo.add(jLUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));

        jTFUsuario.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        JpnlLienzo.add(jTFUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 207, -1));

        JtxfCURP.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        JpnlLienzo.add(JtxfCURP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 207, -1));

        JlblCURP.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        JlblCURP.setForeground(new java.awt.Color(204, 204, 204));
        JlblCURP.setText("CURP");
        JpnlLienzo.add(JlblCURP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLApellidoM.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLApellidoM.setForeground(new java.awt.Color(204, 204, 204));
        jLApellidoM.setText("Apellido Materno:");
        JpnlLienzo.add(jLApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

        jTFApellidoM.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        JpnlLienzo.add(jTFApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 207, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpnlLienzo, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpnlLienzo, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
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
            Logger.getLogger(registro.class.getName()).log(Level.SEVERE, "Error al validar el CURP en la base de datos", ex);
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
