package in;
public class JfCredito extends javax.swing.JPanel {

    public JfCredito() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLPrestamo = new javax.swing.JLabel();
        jLInstruccionCre = new javax.swing.JLabel();
        jLCURP = new javax.swing.JLabel();
        jTFCURP = new javax.swing.JTextField();
        jLTelefonoLoc = new javax.swing.JLabel();
        jTFTelefonoLoc = new javax.swing.JTextField();
        jLCelular = new javax.swing.JLabel();
        jTFCelular = new javax.swing.JTextField();
        jRBsiCredito = new javax.swing.JRadioButton();
        jLCredito = new javax.swing.JLabel();
        jRBnoCredito = new javax.swing.JRadioButton();
        jLDeudas = new javax.swing.JLabel();
        jRBnoDeudas = new javax.swing.JRadioButton();
        jRBsiDeudas = new javax.swing.JRadioButton();
        jLSueldo = new javax.swing.JLabel();
        jTFSueldo = new javax.swing.JTextField();
        jLAprobacion = new javax.swing.JLabel();
        jBVolverInicioCredito = new javax.swing.JButton();
        jBSolicitarCredito = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(28, 58, 70));

        jLPrestamo.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLPrestamo.setForeground(new java.awt.Color(204, 204, 204));
        jLPrestamo.setText("Creditos");

        jLInstruccionCre.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLInstruccionCre.setForeground(new java.awt.Color(255, 255, 255));
        jLInstruccionCre.setText("Ingrese los datos que se le solicitan.");

        jLCURP.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLCURP.setForeground(new java.awt.Color(255, 255, 255));
        jLCURP.setText("CURP:");

        jTFCURP.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        jLTelefonoLoc.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLTelefonoLoc.setForeground(new java.awt.Color(255, 255, 255));
        jLTelefonoLoc.setText("Telefono local:");

        jTFTelefonoLoc.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        jLCelular.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLCelular.setForeground(new java.awt.Color(255, 255, 255));
        jLCelular.setText("Celular:");

        jTFCelular.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        jRBsiCredito.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jRBsiCredito.setText("SI");

        jLCredito.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLCredito.setForeground(new java.awt.Color(255, 255, 255));
        jLCredito.setText("¿Tiene credito?");

        jRBnoCredito.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jRBnoCredito.setText("NO");

        jLDeudas.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLDeudas.setForeground(new java.awt.Color(255, 255, 255));
        jLDeudas.setText("¿Tiene deudas?");

        jRBnoDeudas.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jRBnoDeudas.setText("NO");

        jRBsiDeudas.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jRBsiDeudas.setText("SI");

        jLSueldo.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLSueldo.setForeground(new java.awt.Color(255, 255, 255));
        jLSueldo.setText("Sueldo mensual:");

        jTFSueldo.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        jLAprobacion.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLAprobacion.setForeground(new java.awt.Color(255, 255, 255));
        jLAprobacion.setText("jLAprobacion");

        jBVolverInicioCredito.setBackground(new java.awt.Color(204, 204, 204));
        jBVolverInicioCredito.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jBVolverInicioCredito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_banco/volver-a-publicar.png"))); // NOI18N
        jBVolverInicioCredito.setText("Volver al Inicio");

        jBSolicitarCredito.setBackground(new java.awt.Color(204, 204, 204));
        jBSolicitarCredito.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jBSolicitarCredito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_banco/solicitante.png"))); // NOI18N
        jBSolicitarCredito.setText("Solicitar credito");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLPrestamo)
                            .addComponent(jLInstruccionCre)
                            .addComponent(jLCURP)
                            .addComponent(jLTelefonoLoc)
                            .addComponent(jLCelular)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLCredito)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRBnoDeudas)
                                    .addComponent(jRBsiDeudas)
                                    .addComponent(jLDeudas)))
                            .addComponent(jLSueldo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFTelefonoLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFCURP, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRBnoCredito)
                                            .addComponent(jRBsiCredito)))
                                    .addComponent(jTFSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLAprobacion))))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBSolicitarCredito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBVolverInicioCredito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLPrestamo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLInstruccionCre)
                .addGap(18, 18, 18)
                .addComponent(jLCURP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFCURP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLTelefonoLoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFTelefonoLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLCelular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCredito)
                    .addComponent(jLDeudas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRBsiCredito)
                        .addGap(13, 13, 13)
                        .addComponent(jRBnoCredito))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRBsiDeudas)
                        .addGap(13, 13, 13)
                        .addComponent(jRBnoDeudas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLSueldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLAprobacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jBSolicitarCredito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBVolverInicioCredito)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSolicitarCredito;
    private javax.swing.JButton jBVolverInicioCredito;
    private javax.swing.JLabel jLAprobacion;
    private javax.swing.JLabel jLCURP;
    private javax.swing.JLabel jLCelular;
    private javax.swing.JLabel jLCredito;
    private javax.swing.JLabel jLDeudas;
    private javax.swing.JLabel jLInstruccionCre;
    private javax.swing.JLabel jLPrestamo;
    private javax.swing.JLabel jLSueldo;
    private javax.swing.JLabel jLTelefonoLoc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBnoCredito;
    private javax.swing.JRadioButton jRBnoDeudas;
    private javax.swing.JRadioButton jRBsiCredito;
    private javax.swing.JRadioButton jRBsiDeudas;
    private javax.swing.JTextField jTFCURP;
    private javax.swing.JTextField jTFCelular;
    private javax.swing.JTextField jTFSueldo;
    private javax.swing.JTextField jTFTelefonoLoc;
    // End of variables declaration//GEN-END:variables
}
