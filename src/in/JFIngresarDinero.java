package in;

import connection.CModelos;
import java.sql.SQLException;

public class JFIngresarDinero extends javax.swing.JFrame {
    
    public JFIngresarDinero() {
        initComponents();
    }
    
    private final CModelos modelo = new CModelos();
    
    public void asignaUsuario(String nombreUsuario) throws SQLException {
        String nombre;
        nombre = modelo.busca_nombre_usuario(nombreUsuario);
        jLUsuario.setText(nombre);
    }
    
    public void asignaCuenta(String nombreUsuario) throws SQLException {
        String cuenta;
        cuenta = modelo.busca_nombre_cuenta(nombreUsuario);
        jLClabe.setText(cuenta);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLTitClabe = new javax.swing.JLabel();
        jLInstruccion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLTituClabe = new javax.swing.JLabel();
        jLUsuario = new javax.swing.JLabel();
        jLBeneficiario = new javax.swing.JLabel();
        jLClabe = new javax.swing.JLabel();
        jBVolverInicioIngresar = new javax.swing.JButton();
        jLImagenIngresar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingreso de Dinero");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(28, 58, 70));

        jLTitClabe.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLTitClabe.setForeground(new java.awt.Color(204, 204, 204));
        jLTitClabe.setText("Su CLABE");

        jLInstruccion.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLInstruccion.setForeground(new java.awt.Color(204, 204, 204));
        jLInstruccion.setText("Comparta sus datos para ingresar dinero a su cuenta.");

        jPanel2.setBackground(new java.awt.Color(134, 195, 195));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        jLTituClabe.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLTituClabe.setText("BENEFICIARIO:");

        jLUsuario.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLUsuario.setText("jLCLABE");

        jLBeneficiario.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLBeneficiario.setText("CLABE:");

        jLClabe.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLClabe.setText("CLABE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLTituClabe))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLUsuario))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLBeneficiario))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLClabe)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLTituClabe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLBeneficiario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLClabe)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        jBVolverInicioIngresar.setBackground(new java.awt.Color(204, 204, 204));
        jBVolverInicioIngresar.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jBVolverInicioIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_banco/volver-a-publicar.png"))); // NOI18N
        jBVolverInicioIngresar.setText("Volver al Inicio");
        jBVolverInicioIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverInicioIngresarActionPerformed(evt);
            }
        });

        jLImagenIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_banco/compartir-datos.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLTitClabe))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLInstruccion)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBVolverInicioIngresar)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLImagenIngresar)
                        .addGap(78, 78, 78))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLTitClabe)
                .addGap(18, 18, 18)
                .addComponent(jLInstruccion)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLImagenIngresar)
                .addGap(26, 26, 26)
                .addComponent(jBVolverInicioIngresar)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBVolverInicioIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverInicioIngresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBVolverInicioIngresarActionPerformed
    
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
            java.util.logging.Logger.getLogger(JFIngresarDinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFIngresarDinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFIngresarDinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFIngresarDinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFIngresarDinero().setVisible(true);
            }
        });
    }

    //<editor-fold defaultstate="collapsed" desc="VARIABLES NO MODIFICABLES">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBVolverInicioIngresar;
    private javax.swing.JLabel jLBeneficiario;
    private javax.swing.JLabel jLClabe;
    private javax.swing.JLabel jLImagenIngresar;
    private javax.swing.JLabel jLInstruccion;
    private javax.swing.JLabel jLTitClabe;
    private javax.swing.JLabel jLTituClabe;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
