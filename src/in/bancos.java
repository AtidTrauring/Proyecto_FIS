/* HOLA
jola
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package in;

/**
 *
 * @author ADMIN
 */
public class bancos extends javax.swing.JPanel {

    /**
     * Creates new form clabe
     */
    public bancos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLEtiRegistro = new javax.swing.JLabel();
        jLImagen = new javax.swing.JLabel();
        jLIngresarBanco = new javax.swing.JLabel();
        jTFBancoIngresado = new javax.swing.JTextField();
        jBVolverInicioBanco = new javax.swing.JButton();
        jBAgregarBanco = new javax.swing.JButton();

        setBackground(new java.awt.Color(28, 58, 70));

        jLEtiRegistro.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLEtiRegistro.setForeground(new java.awt.Color(204, 204, 204));
        jLEtiRegistro.setText("Registro de bancos");

        jLImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_banco/banca-en-linea2.png"))); // NOI18N

        jLIngresarBanco.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLIngresarBanco.setForeground(new java.awt.Color(255, 255, 255));
        jLIngresarBanco.setText("Nombre del banco a ingresar:");

        jTFBancoIngresado.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        jBVolverInicioBanco.setBackground(new java.awt.Color(204, 204, 204));
        jBVolverInicioBanco.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jBVolverInicioBanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_banco/volver-a-publicar.png"))); // NOI18N
        jBVolverInicioBanco.setText("Volver al Inicio");

        jBAgregarBanco.setBackground(new java.awt.Color(204, 204, 204));
        jBAgregarBanco.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jBAgregarBanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_banco/agregar.png"))); // NOI18N
        jBAgregarBanco.setText("Agregar banco");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLEtiRegistro)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLIngresarBanco)
                                    .addComponent(jLImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTFBancoIngresado))))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBVolverInicioBanco, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBAgregarBanco, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLEtiRegistro)
                .addGap(31, 31, 31)
                .addComponent(jLImagen)
                .addGap(18, 18, 18)
                .addComponent(jLIngresarBanco)
                .addGap(18, 18, 18)
                .addComponent(jTFBancoIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBAgregarBanco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jBVolverInicioBanco)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregarBanco;
    private javax.swing.JButton jBVolverInicioBanco;
    private javax.swing.JLabel jLEtiRegistro;
    private javax.swing.JLabel jLImagen;
    private javax.swing.JLabel jLIngresarBanco;
    private javax.swing.JTextField jTFBancoIngresado;
    // End of variables declaration//GEN-END:variables
}
