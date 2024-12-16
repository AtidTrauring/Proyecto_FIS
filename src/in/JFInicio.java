package in;

import connection.CModelos;
import mensajes.cmensajes;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JFInicio extends javax.swing.JFrame {

    public JFInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private final CModelos modelo = new CModelos();

    public void generacionFrame() {
        //Se crea el objeto del frame
        JfP fram = new JfP();
        fram.setTitle("Inicio");
        fram.setVisible(true);
        fram.setLocationRelativeTo(null);
    }

    public void setSaludo(String nombre) {
        jLSaludo.setText("¡Hola, " + nombre + "!");
    }

    public void mostrarSaldo(String nombreUsuario) {
        String saldoBuscado;
        try {
            System.out.println("Nombre de usuario recibido: " + nombreUsuario);
            saldoBuscado = modelo.busca_saldo(nombreUsuario);
            System.out.println("Saldo buscado: " + saldoBuscado);
            if (saldoBuscado != null) {
                jLSaldo.setText("$ " + saldoBuscado);
            } else {
                jLSaldo.setText("Saldo no encontrado");
            }
        } catch (SQLException e) {
            cmensajes.mistake("Error al buscar el saldo", "Saldo_Inicio");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLSaldo = new javax.swing.JLabel();
        jLSaludo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBingEfectivo = new javax.swing.JButton();
        JBTransferir = new javax.swing.JButton();
        jBSacar = new javax.swing.JButton();
        jBBancos = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jBSolcredito = new javax.swing.JButton();
        jBCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Principal");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(28, 58, 70));

        jPanel2.setBackground(new java.awt.Color(134, 195, 195));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Saldo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai", 0, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        jLSaldo.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        jLSaldo.setForeground(new java.awt.Color(0, 51, 51));
        jLSaldo.setText("$");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLSaldo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLSaldo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLSaludo.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLSaludo.setForeground(new java.awt.Color(204, 255, 255));
        jLSaludo.setText("¡HOLA ");

        jPanel3.setBackground(new java.awt.Color(134, 195, 195));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Movimientos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai", 0, 12), new java.awt.Color(0, 51, 51))); // NOI18N

        jBingEfectivo.setBackground(new java.awt.Color(204, 204, 204));
        jBingEfectivo.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jBingEfectivo.setText("Ingresar dinero");
        jBingEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBingEfectivoActionPerformed(evt);
            }
        });

        JBTransferir.setBackground(new java.awt.Color(204, 204, 204));
        JBTransferir.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        JBTransferir.setText("Tranferir dinero");
        JBTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTransferirActionPerformed(evt);
            }
        });

        jBSacar.setBackground(new java.awt.Color(204, 204, 204));
        jBSacar.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jBSacar.setText("Sacar dinero");
        jBSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSacarActionPerformed(evt);
            }
        });

        jBBancos.setBackground(new java.awt.Color(204, 204, 204));
        jBBancos.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jBBancos.setText("Ver bancos");
        jBBancos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBancosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jBingEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(JBTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jBSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jBBancos, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBingEfectivo)
                    .addComponent(JBTransferir))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBSacar)
                    .addComponent(jBBancos)))
        );

        jPanel4.setBackground(new java.awt.Color(134, 195, 195));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Creditos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai", 0, 12), new java.awt.Color(0, 51, 51))); // NOI18N

        jBSolcredito.setBackground(new java.awt.Color(204, 204, 204));
        jBSolcredito.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jBSolcredito.setText("Solicitar credito");
        jBSolcredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSolcreditoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jBSolcredito, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBSolcredito)
        );

        jBCerrarSesion.setBackground(new java.awt.Color(204, 204, 204));
        jBCerrarSesion.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jBCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_banco/cerrar-sesion-de-usuario.png"))); // NOI18N
        jBCerrarSesion.setText("Cerrar Sesion");
        jBCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBCerrarSesion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLSaludo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLSaludo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBCerrarSesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="BOTONES">
    private void jBingEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBingEfectivoActionPerformed
        JFIngresarDinero ingresarDinero = new JFIngresarDinero(); //Se crea un objeto IngresarDinero
        ingresarDinero.setVisible(true);
    }//GEN-LAST:event_jBingEfectivoActionPerformed

    private void JBTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTransferirActionPerformed
        try {
            jFTransferencia trs = new jFTransferencia();
            trs.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(JFInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JBTransferirActionPerformed

    private void jBSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSacarActionPerformed
        JFSacar jfSacarDinero = new JFSacar();
        jfSacarDinero.setVisible(true);
    }//GEN-LAST:event_jBSacarActionPerformed

    private void jBBancosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBancosActionPerformed
        JfBanco jfVerBancos = new JfBanco();
        jfVerBancos.setSize(280, 478);
        jfVerBancos.setVisible(true);
    }//GEN-LAST:event_jBBancosActionPerformed

    private void jBSolcreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSolcreditoActionPerformed
        JfCredito jfCredito = new JfCredito();
        jfCredito.setVisible(true);
    }//GEN-LAST:event_jBSolcreditoActionPerformed

    private void jBCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCerrarSesionActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBCerrarSesionActionPerformed
    // </editor-fold> 

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
            java.util.logging.Logger.getLogger(JFInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFInicio().setVisible(true);
            }
        });
    }

    //<editor-fold defaultstate="collapsed" desc="VARIABLES NO MODIFICABLES">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTransferir;
    private javax.swing.JButton jBBancos;
    private javax.swing.JButton jBCerrarSesion;
    private javax.swing.JButton jBSacar;
    private javax.swing.JButton jBSolcredito;
    private javax.swing.JButton jBingEfectivo;
    private javax.swing.JLabel jLSaldo;
    private javax.swing.JLabel jLSaludo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
