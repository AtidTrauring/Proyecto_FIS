package in;

public class JfP extends javax.swing.JFrame {

    public JfP() {
        initComponents();
    }

    public void generarFrameIS() {
        JFInicioSesion frm = new JFInicioSesion();
        //Hacemos visible al nuevo frame
        frm.setVisible(true);
        // Centramos el frame
        frm.setLocationRelativeTo(null);
        // Asignamos las medidas
        frm.setSize(301, 614);
        // No permitimos que cambien las medidas
        frm.setResizable(false);
        // Agregamos un titulo
        frm.setTitle("Inicio de Sesion");
    }

    public void generarFrameR() {
        JfRegistro frm = new JfRegistro();
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        frm.setSize(700, 490);
        frm.setResizable(false);
        frm.setTitle("Registro Usuario");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpnlLienzo = new javax.swing.JPanel();
        JlblImagen = new javax.swing.JLabel();
        JlblTitulo = new javax.swing.JLabel();
        JbtnIniciar = new javax.swing.JButton();
        JbtnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setResizable(false);

        JpnlLienzo.setBackground(new java.awt.Color(28, 58, 70));
        JpnlLienzo.setForeground(new java.awt.Color(255, 255, 255));

        JlblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_banco/BancaEnLinea.png"))); // NOI18N
        JlblImagen.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        JlblTitulo.setFont(new java.awt.Font("Dubai", 0, 36)); // NOI18N
        JlblTitulo.setForeground(new java.awt.Color(204, 204, 204));
        JlblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlblTitulo.setText("BANATESChi");

        JbtnIniciar.setBackground(new java.awt.Color(204, 204, 204));
        JbtnIniciar.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        JbtnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_banco/iniciar-sesion.png"))); // NOI18N
        JbtnIniciar.setText("Iniciar Sesión");
        JbtnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnIniciarActionPerformed(evt);
            }
        });

        JbtnRegistrar.setBackground(new java.awt.Color(204, 204, 204));
        JbtnRegistrar.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        JbtnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_banco/exito.png"))); // NOI18N
        JbtnRegistrar.setText("  Registrarse");
        JbtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpnlLienzoLayout = new javax.swing.GroupLayout(JpnlLienzo);
        JpnlLienzo.setLayout(JpnlLienzoLayout);
        JpnlLienzoLayout.setHorizontalGroup(
            JpnlLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnlLienzoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpnlLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpnlLienzoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(JlblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(JpnlLienzoLayout.createSequentialGroup()
                        .addComponent(JlblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))))
            .addGroup(JpnlLienzoLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(JpnlLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JbtnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JbtnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JpnlLienzoLayout.setVerticalGroup(
            JpnlLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnlLienzoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JlblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JlblImagen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JbtnIniciar)
                .addGap(18, 18, 18)
                .addComponent(JbtnRegistrar)
                .addContainerGap())
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

    private void JbtnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnIniciarActionPerformed
        generarFrameIS();
    }//GEN-LAST:event_JbtnIniciarActionPerformed

    private void JbtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnRegistrarActionPerformed
        generarFrameR();
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
            java.util.logging.Logger.getLogger(JfP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtnIniciar;
    private javax.swing.JButton JbtnRegistrar;
    private javax.swing.JLabel JlblImagen;
    private javax.swing.JLabel JlblTitulo;
    private javax.swing.JPanel JpnlLienzo;
    // End of variables declaration//GEN-END:variables
}
