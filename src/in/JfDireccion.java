package in;

import connection.CModelos;
import java.util.Arrays;
import mensajes.cmensajes;

public class JfDireccion extends javax.swing.JFrame {

    public JfDireccion() {
        initComponents();
    }

    private final CModelos mdl = new CModelos();
    public static String[] dUsuario;

    public static void datosUsuario(String[] datosUsuario) {
        dUsuario = datosUsuario;
    }

    public boolean validaDatos() {
        String calle = JtxtCalle.getText();
        String numI = JtxtNumE.getText();
        String numE = JtxtNumI.getText();
        String Barrio = JtxtBC.getText();
        String Municipio = JtxtMunicipio.getText();

        // Validación de campos vacíos
        if (calle.isEmpty() || numE.isEmpty() || numI.isEmpty() || Barrio.isEmpty() || Municipio.isEmpty()) {
            cmensajes.warning("Llene todos los campos por favor!", "Registro Usuario");
            return false;
        }

        // Validación de número interior y exterior (deben ser números válidos)
        if (!numI.matches("\\d+") || !numE.matches("\\d+")) {
            cmensajes.warning("Los números de dirección deben ser válidos!", "Registro Usuario");
            return false;
        }

        // Validación de formato: Calle, Barrio y Municipio solo letras y espacios
        if (!calle.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$") || !Barrio.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$") || !Municipio.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$")) {
            cmensajes.warning("Calle, Barrio y Municipio deben contener solo letras y espacios!", "Registro Usuario");
            return false;
        }

        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpnlLienzo = new javax.swing.JPanel();
        JbtnCancelar = new javax.swing.JButton();
        JbtnRegistrar = new javax.swing.JButton();
        JlblTitulo = new javax.swing.JLabel();
        JlblCalle = new javax.swing.JLabel();
        JtxtCalle = new javax.swing.JTextField();
        JlblNumExt = new javax.swing.JLabel();
        JtxtNumE = new javax.swing.JTextField();
        JlblNumInt = new javax.swing.JLabel();
        JtxtNumI = new javax.swing.JTextField();
        JlblBC = new javax.swing.JLabel();
        JtxtBC = new javax.swing.JTextField();
        JlblMunicipio = new javax.swing.JLabel();
        JtxtMunicipio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JpnlLienzo.setBackground(new java.awt.Color(28, 58, 70));
        JpnlLienzo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JbtnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        JbtnCancelar.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        JbtnCancelar.setText("Cancelar");
        JpnlLienzo.add(JbtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 130, 40));

        JbtnRegistrar.setBackground(new java.awt.Color(204, 204, 204));
        JbtnRegistrar.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        JbtnRegistrar.setText("Registrar Usuario");
        JbtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnRegistrarActionPerformed(evt);
            }
        });
        JpnlLienzo.add(JbtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, 40));

        JlblTitulo.setFont(new java.awt.Font("Dubai", 0, 36)); // NOI18N
        JlblTitulo.setForeground(new java.awt.Color(204, 204, 204));
        JlblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlblTitulo.setText("BANATESChi");
        JpnlLienzo.add(JlblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 210, 40));

        JlblCalle.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        JlblCalle.setForeground(new java.awt.Color(204, 204, 204));
        JlblCalle.setText("Calle");
        JpnlLienzo.add(JlblCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        JpnlLienzo.add(JtxtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 200, -1));

        JlblNumExt.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        JlblNumExt.setForeground(new java.awt.Color(204, 204, 204));
        JlblNumExt.setText("Numero Exterior");
        JpnlLienzo.add(JlblNumExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        JpnlLienzo.add(JtxtNumE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 200, -1));

        JlblNumInt.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        JlblNumInt.setForeground(new java.awt.Color(204, 204, 204));
        JlblNumInt.setText("Numero Interior");
        JpnlLienzo.add(JlblNumInt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        JpnlLienzo.add(JtxtNumI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 200, -1));

        JlblBC.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        JlblBC.setForeground(new java.awt.Color(204, 204, 204));
        JlblBC.setText("Barrio/Colonia");
        JpnlLienzo.add(JlblBC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));
        JpnlLienzo.add(JtxtBC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, -1));

        JlblMunicipio.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        JlblMunicipio.setForeground(new java.awt.Color(204, 204, 204));
        JlblMunicipio.setText("Municipio");
        JpnlLienzo.add(JlblMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));
        JpnlLienzo.add(JtxtMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpnlLienzo, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpnlLienzo, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnRegistrarActionPerformed
        try {
            if (validaDatos()) {
                String calle = JtxtCalle.getText();
                String numI = JtxtNumE.getText();
                String numE = JtxtNumI.getText();
                String Barrio = JtxtBC.getText();
                String Municipio = JtxtMunicipio.getText();

                String idDireccion = mdl.buscaDireccion(calle, numI, numE, Barrio, Municipio);
                if (idDireccion == null) {
                    mdl.insertaDireccion(calle, numI, numE, Barrio, Municipio);
                    String idDirNew = mdl.buscaDireccion(calle, numI, numE, Barrio, Municipio);
                    mdl.insertaCliente(dUsuario, idDirNew);
                    mdl.insertaTelefono(dUsuario, mdl.buscaIdCliente(dUsuario[6]));
                    mdl.insertaUsuario(dUsuario, mdl.buscaIdCliente(dUsuario[6]));
                    cmensajes.message("Se registró al usuario con éxito!", "Registro Usuario");
                    this.dispose();
                } else {
                    cmensajes.warning("La dirección ya está registrada!", "Registro Usuario");
                }
            }
        } catch (Exception e) {
            cmensajes.mistake("Ocurrió un error durante el registro de la dirección", "Error");
            e.printStackTrace();
        }
    }//GEN-LAST:event_JbtnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(JfDireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfDireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfDireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfDireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfDireccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtnCancelar;
    private javax.swing.JButton JbtnRegistrar;
    private javax.swing.JLabel JlblBC;
    private javax.swing.JLabel JlblCalle;
    private javax.swing.JLabel JlblMunicipio;
    private javax.swing.JLabel JlblNumExt;
    private javax.swing.JLabel JlblNumInt;
    private javax.swing.JLabel JlblTitulo;
    private javax.swing.JPanel JpnlLienzo;
    private javax.swing.JTextField JtxtBC;
    private javax.swing.JTextField JtxtCalle;
    private javax.swing.JTextField JtxtMunicipio;
    private javax.swing.JTextField JtxtNumE;
    private javax.swing.JTextField JtxtNumI;
    // End of variables declaration//GEN-END:variables
}
