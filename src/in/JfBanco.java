package in;
public class JfBanco extends javax.swing.JFrame {
    
    public JfBanco() {
        initComponents();
    }
    
    public boolean validaLetras(){
        String nombreBanco;
        nombreBanco = jTFBancoIngresado1.getText();
        
        
        return true;
    }
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JpnlLienzo.setBackground(new java.awt.Color(28, 58, 70));
        JpnlLienzo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLEtiRegistro.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLEtiRegistro.setForeground(new java.awt.Color(204, 204, 204));
        jLEtiRegistro.setText("Registro de bancos");
        JpnlLienzo.add(jLEtiRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_banco/banca-en-linea2.png"))); // NOI18N
        JpnlLienzo.add(jLImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLIngresarBanco1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLIngresarBanco1.setForeground(new java.awt.Color(255, 255, 255));
        jLIngresarBanco1.setText("Nombre del banco a ingresar:");
        JpnlLienzo.add(jLIngresarBanco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jTFBancoIngresado1.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        JpnlLienzo.add(jTFBancoIngresado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 250, -1));

        jBAgregarBanco.setBackground(new java.awt.Color(204, 204, 204));
        jBAgregarBanco.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jBAgregarBanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_banco/agregar.png"))); // NOI18N
        jBAgregarBanco.setText("Agregar banco");
        JpnlLienzo.add(jBAgregarBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        jBVolverInicioBanco1.setBackground(new java.awt.Color(204, 204, 204));
        jBVolverInicioBanco1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jBVolverInicioBanco1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_banco/volver-a-publicar.png"))); // NOI18N
        jBVolverInicioBanco1.setText("Volver al Inicio");
        JpnlLienzo.add(jBVolverInicioBanco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpnlLienzo, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpnlLienzo, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
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
