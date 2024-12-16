package in;

import mensajes.cmensajes;
import connection.CModelos;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JfBanco extends javax.swing.JFrame {

    public JfBanco() {
        initComponents();
    }

    public void generarFrame() {
        JfP frm = new JfP();
        //Hacemos visible al nuevo frame
        frm.setVisible(true);
        // Centramos el frame
        frm.setLocationRelativeTo(null);
        // Asignamos las medidas
        frm.setSize(295, 490);
        // No permitimos que cambien las medidas
        frm.setResizable(false);
        // Agregamos un titulo
        frm.setTitle("Formulario Principal");
        this.dispose();
    }
    private final CModelos mdl = new CModelos();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpnlLienzo = new javax.swing.JPanel();
        jLEtiRegistro = new javax.swing.JLabel();
        jLImagen = new javax.swing.JLabel();
        jLIngresarBanco1 = new javax.swing.JLabel();
        jTFBancoIngresado1 = new javax.swing.JTextField();
        jBAgregarBanco = new javax.swing.JButton();
        jBVolverInicioBanco1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro Banco");

        JpnlLienzo.setBackground(new java.awt.Color(28, 58, 70));

        jLEtiRegistro.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLEtiRegistro.setForeground(new java.awt.Color(204, 204, 204));
        jLEtiRegistro.setText("Registro de bancos");

        jLImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_banco/banca-en-linea2.png"))); // NOI18N

        jLIngresarBanco1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLIngresarBanco1.setForeground(new java.awt.Color(255, 255, 255));
        jLIngresarBanco1.setText("Nombre del banco a ingresar:");

        jTFBancoIngresado1.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        jBAgregarBanco.setBackground(new java.awt.Color(204, 204, 204));
        jBAgregarBanco.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jBAgregarBanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_banco/agregar.png"))); // NOI18N
        jBAgregarBanco.setText("Agregar banco");
        jBAgregarBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarBancoActionPerformed(evt);
            }
        });

        jBVolverInicioBanco1.setBackground(new java.awt.Color(204, 204, 204));
        jBVolverInicioBanco1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jBVolverInicioBanco1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_banco/volver-a-publicar.png"))); // NOI18N
        jBVolverInicioBanco1.setText("Volver al Inicio");
        jBVolverInicioBanco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverInicioBanco1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpnlLienzoLayout = new javax.swing.GroupLayout(JpnlLienzo);
        JpnlLienzo.setLayout(JpnlLienzoLayout);
        JpnlLienzoLayout.setHorizontalGroup(
            JpnlLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnlLienzoLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLEtiRegistro))
            .addGroup(JpnlLienzoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLImagen))
            .addGroup(JpnlLienzoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLIngresarBanco1))
            .addGroup(JpnlLienzoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTFBancoIngresado1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(JpnlLienzoLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jBAgregarBanco))
            .addGroup(JpnlLienzoLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jBVolverInicioBanco1))
        );
        JpnlLienzoLayout.setVerticalGroup(
            JpnlLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnlLienzoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLEtiRegistro)
                .addGap(6, 6, 6)
                .addComponent(jLImagen)
                .addGap(0, 0, 0)
                .addComponent(jLIngresarBanco1)
                .addGap(6, 6, 6)
                .addComponent(jTFBancoIngresado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jBAgregarBanco)
                .addGap(9, 9, 9)
                .addComponent(jBVolverInicioBanco1))
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

    private void jBAgregarBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarBancoActionPerformed
        if (jTFBancoIngresado1.getText().isEmpty()) {
            cmensajes.message("Por favor, Ingrese el nombre del banco", "Registro Banco");
        } else {
            if (cmensajes.validarLetras(jTFBancoIngresado1)) {
                // Solicita una busqueda, para los datos
                String bancoBuscado;
                try {
                    bancoBuscado = mdl.busca_nombre(jTFBancoIngresado1.getText());
                    // Si el banco ingresado no se encuentra dentro de la base de datos
                    if (bancoBuscado == null) {
                        //Insertar el banco
                        if (mdl.insertaBanco(jTFBancoIngresado1.getText())) {
                            cmensajes.message("El banco se registro con exito!", "Registro Banco");
                            generarFrame();
                        } else {
                            cmensajes.mistake("Ocurrio un problema al registrar al banco! \n Intentelo mas tarde por favor!", "Registro Banco");
                        }
                    } else {
                        // Si el banco se encuentra, indicar que ya se encuentra el banco
                        cmensajes.message("El banco ingresado, ya se encuentra registrado!", "Registro Banco");
                        generarFrame();
                    }
                } catch (SQLException ex) {
                    cmensajes.warning("Error de SQL: " + ex.getMessage(), "Insertar");
                }
            } else {
            }
        }

    }//GEN-LAST:event_jBAgregarBancoActionPerformed

    private void jBVolverInicioBanco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverInicioBanco1ActionPerformed
        generarFrame();
    }//GEN-LAST:event_jBVolverInicioBanco1ActionPerformed

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
            java.util.logging.Logger.getLogger(JfBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfBanco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpnlLienzo;
    private javax.swing.JButton jBAgregarBanco;
    private javax.swing.JButton jBVolverInicioBanco1;
    private javax.swing.JLabel jLEtiRegistro;
    private javax.swing.JLabel jLImagen;
    private javax.swing.JLabel jLIngresarBanco1;
    private javax.swing.JTextField jTFBancoIngresado1;
    // End of variables declaration//GEN-END:variables
}
