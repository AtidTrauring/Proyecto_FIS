package in;
public class inicioSesion extends javax.swing.JPanel {
    public inicioSesion() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLUsuario = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();
        jLPasswordInicio = new javax.swing.JLabel();
        jTFContrasenia = new javax.swing.JTextField();
        jBAcceder = new javax.swing.JButton();

        setBackground(new java.awt.Color(28, 58, 70));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLPasswordInicio)
                    .addComponent(jTFContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLUsuario)
                    .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBAcceder)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
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
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAcceder;
    private javax.swing.JLabel jLPasswordInicio;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTFContrasenia;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables
}
