/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package in;

import connection.CModelos;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mensajes.cmensajes;

/**
 *
 * @author AMD PC
 */
public class jFTransferencia extends javax.swing.JFrame {

    /**
     * Creates new form jFTransferencia
     * @throws java.sql.SQLException
     */
    public jFTransferencia() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        cargar_Cuentas();
        cargar_otras_Cuentas();
        jBBuscarCuenta.setEnabled(false);
        jTSuCuenta.setEnabled(false);
    }
    
    // Su reputisima mauser la que toca aqui :u
    //Variables globales
    CModelos modelo = new CModelos();
    DefaultTableModel mdl;
    DefaultTableModel mdl1;
    ArrayList<String[]> resultados = new ArrayList<>();
    ArrayList<String[]> resultados1 = new ArrayList<>();
    
    private void limpiar_tabla() {
        mdl = (DefaultTableModel) jTMiCuenta.getModel();
        for (int i = (jTMiCuenta.getRowCount() - 1); i >= 0; i--) {
            mdl.removeRow(i);
        }
    }
    
    private void limpiar_otra_tabla() {
        mdl1 = (DefaultTableModel) jTSuCuenta.getModel();
        for (int i = (jTSuCuenta.getRowCount() - 1); i >= 0; i--) {
            mdl1.removeRow(i);
        }
    }
       
    private void cargar_Cuentas() throws SQLException{
        String id_User = JFInicioSesion.getIdUsuario();
        System.out.println(id_User);
        mdl = (DefaultTableModel) jTMiCuenta.getModel();
        try {
            resultados = modelo.busca_Cuenta(id_User);
            limpiar_tabla();
            for (String[] resultado : resultados) {
                mdl.addRow(new Object[]{resultado[0], resultado[1], resultado[2], resultado[3]});
            }
        } catch (SQLException e) {
            cmensajes.warning("Error al cargar los datos de la cuenta", "Transferencia");
        }
    }
    
    private void cargar_otras_Cuentas() throws SQLException{
        String id_User = JFInicioSesion.getIdUsuario();
        System.out.println(id_User);
        mdl1 = (DefaultTableModel) jTSuCuenta.getModel();
        try {
            resultados1 = modelo.busca_otras_Cuentas(id_User);
            limpiar_otra_tabla();
            for (String[] resultado : resultados1) {
                mdl1.addRow(new Object[]{resultado[0], resultado[1], resultado[2], resultado[3], resultado[4]});
            }
        } catch (SQLException e) {
            cmensajes.warning("Error al cargar los datos de la cuenta", "Transferencia");
        }
    }
    
    private String[] leerDatosFilaSeleccionada() {
        // Verifica que se haya seleccionado una fila
        if (jTMiCuenta.getSelectedRow() != -1) { 
            // Inicializa un arreglo para guardar todos los datos de la fila
            String[] datosFila = new String[jTMiCuenta.getColumnCount()];

            // Itera sobre las columnas para extraer los valores de la fila seleccionada
            for (int i = 0; i < jTMiCuenta.getColumnCount(); i++) {
                datosFila[i] = (String) mdl.getValueAt(jTMiCuenta.getSelectedRow(), i);
            }

            jBBuscarCuenta.setEnabled(true);
            return datosFila; // Devuelve el arreglo con los datos de la fila seleccionada
        } else {
            cmensajes.warning("Selecciona una fila", "Fila no seleccionada");
            return null; // Si no se seleccionó una fila, retorna null
        }
    }
    
    private String[] leerotrosDatosFilaSeleccionada() {
        // Verifica que se haya seleccionado una fila
        if (jTSuCuenta.getSelectedRow() != -1) { 
            // Inicializa un arreglo para guardar todos los datos de la fila
            String[] datosFila = new String[jTSuCuenta.getColumnCount()];

            // Itera sobre las columnas para extraer los valores de la fila seleccionada
            for (int i = 0; i < jTSuCuenta.getColumnCount(); i++) {
                datosFila[i] = (String) mdl1.getValueAt(jTSuCuenta.getSelectedRow(), i);
            }

            jBConfirmarSuCuenta.setEnabled(true);
            return datosFila; // Devuelve el arreglo con los datos de la fila seleccionada
        } else {
            cmensajes.warning("Selecciona una fila", "Fila no seleccionada");
            return null; // Si no se seleccionó una fila, retorna null
        }
    }
    
    private void transferir() {
        String montoTexto = jTFMonto.getText(); // Obtener el texto ingresado en el campo

        // Validación directa dentro del método
        try {
            double monto = Double.parseDouble(montoTexto); // Intentar convertir el texto a double
            if (monto <= 0) {
                cmensajes.warning("Monto no válido", "Por favor ingrese un monto mayor a cero.");
                return;
            }

            // Llamamos a los métodos para obtener los datos de las cuentas
            String[] micuenta = leerDatosFilaSeleccionada();
            String idMicuenta = micuenta[0];
            String[] sucuenta = leerotrosDatosFilaSeleccionada();
            String idSuCuenta = sucuenta[0];
            String numSuCuenta = sucuenta[1]; // Número de cuenta del beneficiario
            String nombreBeneficiario = sucuenta[3]; // Nombre del beneficiario

            // Obtenemos el saldo de la cuenta del loggeado
            double misaldo = Double.parseDouble(micuenta[3]);
            double susaldo = Double.parseDouble(sucuenta[4]);

            // Validar saldo suficiente
            if (monto > misaldo) {
                cmensajes.warning("¡Atención! No cuentas con suficientes fondos para realizar esta operación!", "Fondos insuficientes");
                return;
            }

            // Mostrar mensaje de confirmación
            int confirmacion = JOptionPane.showConfirmDialog(
                null,
                "Estas a punto de transferir $" + monto + " a la cuenta: " + numSuCuenta +
                " cuyo beneficiario es: " + nombreBeneficiario + ".\n¿Deseas continuar?",
                "Confirmación de transferencia",
                JOptionPane.YES_NO_OPTION
            );

            if (confirmacion == JOptionPane.YES_OPTION) {
                // Proceder con la transferencia
                double saldoRestante = misaldo - monto;
                double susaldoRestante = monto + susaldo;

                try {
                    boolean id_Mi_Cuenta = modelo.actualiza_Mi_Saldo(idMicuenta, saldoRestante);
                    boolean id_Su_Cuenta = modelo.actualiza_Su_Saldo(idSuCuenta, susaldoRestante);
                    if (id_Mi_Cuenta && id_Su_Cuenta) {
                        cmensajes.message("La transferencia se realizó con éxito.", "Operación exitosa");
                    } else {
                        cmensajes.mistake("Error al realizar la transferencia", "No se pudo completar la operación.");
                    }
                } catch (SQLException e) {
                    cmensajes.mistake("Hubo un problema al procesar la operación.", "Error al actualizar el saldo");
                }
            } else {
                // El usuario canceló la operación
                cmensajes.message("La operación fue cancelada.", "Transferencia cancelada");
            }
        } catch (NumberFormatException e) {
            // Si el texto no es un número válido, mostramos un mensaje de advertencia
            cmensajes.warning("Monto no válido", "Por favor ingrese un monto válido.");
        }
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTMiCuenta = new javax.swing.JTable();
        jBBuscarCuenta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTSuCuenta = new javax.swing.JTable();
        jBConfirmarSuCuenta = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTFMonto = new javax.swing.JTextField();
        jBContinuar = new javax.swing.JButton();
        jBVolver = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTAInformacion = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTAInformacion1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(28, 58, 70));

        jPanel2.setBackground(new java.awt.Color(28, 63, 122));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Selecciona la cuenta que desea usar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jTMiCuenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id_de_Cuenta", "Numero_de_Cuenta", "Banco_Afiliado", "Saldo_Disponible"
            }
        ));
        jTMiCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTMiCuentaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTMiCuenta);

        jBBuscarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_banco/confirmar.png"))); // NOI18N
        jBBuscarCuenta.setText("Confirmar cuenta");
        jBBuscarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBBuscarCuenta)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBBuscarCuenta)
                .addGap(263, 263, 263))
        );

        jPanel3.setBackground(new java.awt.Color(28, 63, 122));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Selecciona la cuenta a la que desea transferir", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jTSuCuenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id_de_Cuenta", "Num_de_Cuenta", "Banco_Afiliado", "Beneficiario", "Saldo_del_Beneficiario"
            }
        ));
        jTSuCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTSuCuentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTSuCuenta);

        jBConfirmarSuCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_banco/confirmar.png"))); // NOI18N
        jBConfirmarSuCuenta.setText("Confirmar cuenta");
        jBConfirmarSuCuenta.setEnabled(false);
        jBConfirmarSuCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmarSuCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBConfirmarSuCuenta)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBConfirmarSuCuenta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(28, 63, 122));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Introduce el monto a transferir", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jBContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_banco/continuar (1).png"))); // NOI18N
        jBContinuar.setText("Continuar");
        jBContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFMonto)
                    .addComponent(jBContinuar, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBContinuar)
                .addContainerGap())
        );

        jBVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_banco/volver-a-publicar.png"))); // NOI18N
        jBVolver.setText("Regresar al menú");
        jBVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverActionPerformed(evt);
            }
        });

        jTAInformacion.setColumns(20);
        jTAInformacion.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Datos de la cuenta"));
        jScrollPane3.setViewportView(jTAInformacion);

        jTAInformacion1.setColumns(20);
        jTAInformacion1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Datos de la cuenta"));
        jScrollPane4.setViewportView(jTAInformacion1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(jScrollPane4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBVolver)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane3, jScrollPane4});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBVolver)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverActionPerformed
        JFInicio in = new JFInicio();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBVolverActionPerformed

    private void jTMiCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTMiCuentaMouseClicked
        leerDatosFilaSeleccionada();
    }//GEN-LAST:event_jTMiCuentaMouseClicked

    private void jTSuCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTSuCuentaMouseClicked
        // Verifica que se haya seleccionado una fila
        if (jTSuCuenta.getSelectedRow() != -1) { 
            // Extrae el ID de la cuenta de la columna correspondiente 
            String idCuenta = (String) mdl1.getValueAt(jTSuCuenta.getSelectedRow(), 0);

            // Inicializa un arreglo para guardar todos los datos de la fila
            String[] datosFila = new String[jTSuCuenta.getColumnCount()];

            // Itera sobre las columnas para extraer los valores de la fila seleccionada
            for (int i = 0; i < jTSuCuenta.getColumnCount(); i++) {
                datosFila[i] = (String) mdl1.getValueAt(jTSuCuenta.getSelectedRow(), i);
            }

            jBConfirmarSuCuenta.setEnabled(true);
            // Imprime el ID y los datos de la fila seleccionada (solo para verificación)
            System.out.println("ID Cuenta: " + idCuenta);
            System.out.println("Datos de la fila seleccionada: " + Arrays.toString(datosFila));
        } else {
            cmensajes.warning("Selecciona una fila", "Fila no seleccionada");
        }
    }//GEN-LAST:event_jTSuCuentaMouseClicked

    private void jBBuscarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarCuentaActionPerformed
        String[] datosFila = leerDatosFilaSeleccionada();

        if (datosFila != null) {
            // Extrae el ID de la cuenta, que es el primer elemento del arreglo de datos
            String idCuenta = datosFila[0]; // El primer elemento es el ID de la cuenta

            // Habilita el botón de búsqueda
            jBBuscarCuenta.setEnabled(true);

            // Imprime los datos en el JTextArea
            StringBuilder sb = new StringBuilder();
            sb.append("Datos de la fila seleccionada: \n");
            for (String dato : datosFila) {
                sb.append(dato).append("\n");
            }

            // Muestra los datos en el JTextArea
            jTAInformacion.setText(sb.toString());  // Se utiliza setText para mostrar el contenido en el JTextArea

            // También imprime en consola para verificación
            System.out.println("ID Cuenta: " + idCuenta);
            System.out.println("Datos de la fila seleccionada: " + Arrays.toString(datosFila));
        }
        jTSuCuenta.setEnabled(true);
    }//GEN-LAST:event_jBBuscarCuentaActionPerformed

    private void jBConfirmarSuCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmarSuCuentaActionPerformed
        String[] datosFila = leerotrosDatosFilaSeleccionada();

        if (datosFila != null) {
            // Extrae el ID de la cuenta, que es el primer elemento del arreglo de datos
            String idCuenta = datosFila[0]; // El primer elemento es el ID de la cuenta

            // Habilita el botón de búsqueda
            jBConfirmarSuCuenta.setEnabled(true);

            // Imprime los datos en el JTextArea
            StringBuilder sb = new StringBuilder();
            sb.append("Datos de la fila seleccionada: \n");
            for (String dato : datosFila) {
                sb.append(dato).append("\n");
            }

            // Muestra los datos en el JTextArea
            jTAInformacion1.setText(sb.toString());  // Se utiliza setText para mostrar el contenido en el JTextArea

            // También imprime en consola para verificación
            System.out.println("ID Cuenta: " + idCuenta);
            System.out.println("Datos de la fila seleccionada: " + Arrays.toString(datosFila));
            jTFMonto.setEnabled(true);
            jBContinuar.setEnabled(true);
        }
    }//GEN-LAST:event_jBConfirmarSuCuentaActionPerformed

    private void jBContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBContinuarActionPerformed
        transferir();
        try {
            cargar_Cuentas();
        } catch (SQLException ex) {
            Logger.getLogger(jFTransferencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            cargar_otras_Cuentas();
        } catch (SQLException ex) {
            Logger.getLogger(jFTransferencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        jBContinuar.setEnabled(false);
        jBBuscarCuenta.setEnabled(false);
        jBConfirmarSuCuenta.setEnabled(false);
        jTSuCuenta.setEnabled(false);
        jTAInformacion.setText("");
        jTAInformacion1.setText("");
        jTFMonto.setText("");
    }//GEN-LAST:event_jBContinuarActionPerformed

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
            java.util.logging.Logger.getLogger(jFTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new jFTransferencia().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(jFTransferencia.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscarCuenta;
    private javax.swing.JButton jBConfirmarSuCuenta;
    private javax.swing.JButton jBContinuar;
    private javax.swing.JButton jBVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTAInformacion;
    private javax.swing.JTextArea jTAInformacion1;
    private javax.swing.JTextField jTFMonto;
    private javax.swing.JTable jTMiCuenta;
    private javax.swing.JTable jTSuCuenta;
    // End of variables declaration//GEN-END:variables
}
