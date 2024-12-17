package in;

import java.sql.*;
import java.util.*;
import java.util.logging.*;
import mensajes.cmensajes;
import connection.*;

/**
 *
 * @author micky
 */
public class jfCredito extends javax.swing.JFrame {

    CModelos cm = new CModelos();
    ArrayList<String[]> results;
    /* ---------------------------- Llamar a interfaz de inicio ---------------------------- */
    JFSacar s = new JFSacar();

    /* ---------------------------- Llamar a interfaz de inicio ---------------------------- */

    public jfCredito() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.jlcliente.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg1 = new javax.swing.ButtonGroup();
        jtpcredito = new javax.swing.JTabbedPane();
        jpbusqueda = new javax.swing.JPanel();
        jLInstruccionCre = new javax.swing.JLabel();
        jlcliente = new javax.swing.JLabel();
        jln = new javax.swing.JLabel();
        jlm = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLCURP = new javax.swing.JLabel();
        jtfcurp = new javax.swing.JTextField();
        jbbuscarcurp = new javax.swing.JButton();
        jpcredito = new javax.swing.JPanel();
        jLTelefonoLoc = new javax.swing.JLabel();
        jLCelular = new javax.swing.JLabel();
        jtftelefonolocal = new javax.swing.JTextField();
        jtfcelular = new javax.swing.JTextField();
        jLDeudas = new javax.swing.JLabel();
        jrbdeudasi = new javax.swing.JRadioButton();
        jrbdeudano = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jtfdeuda = new javax.swing.JTextField();
        jLSueldo = new javax.swing.JLabel();
        jtfsueldo = new javax.swing.JTextField();
        jlaprovado = new javax.swing.JLabel();
        jlmonto = new javax.swing.JLabel();
        jbback = new javax.swing.JButton();
        jbsolicitarcredito = new javax.swing.JButton();
        jltexto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpbusqueda.setBackground(new java.awt.Color(28, 58, 70));
        jpbusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLInstruccionCre.setFont(new java.awt.Font("Dubai", 0, 22)); // NOI18N
        jLInstruccionCre.setForeground(new java.awt.Color(255, 255, 255));
        jLInstruccionCre.setText("INGRESA TU CURP PARA BUSCARTE");

        jlcliente.setForeground(new java.awt.Color(255, 255, 255));
        jlcliente.setText("id");

        jln.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jln.setForeground(new java.awt.Color(255, 255, 255));
        jln.setText("NOMBRE :");

        jlm.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jlm.setForeground(new java.awt.Color(255, 255, 255));
        jlm.setText("MONTO :");

        jPanel1.setBackground(new java.awt.Color(28, 58, 70));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLCURP.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLCURP.setForeground(new java.awt.Color(255, 255, 255));
        jLCURP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCURP.setText("Ingresa tu curp :");
        jLCURP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jtfcurp.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N

        jbbuscarcurp.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        jbbuscarcurp.setText("Buscar");
        jbbuscarcurp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbuscarcurpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLCURP)
                        .addGap(18, 18, 18)
                        .addComponent(jtfcurp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jbbuscarcurp)))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCURP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfcurp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbbuscarcurp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpbusquedaLayout = new javax.swing.GroupLayout(jpbusqueda);
        jpbusqueda.setLayout(jpbusquedaLayout);
        jpbusquedaLayout.setHorizontalGroup(
            jpbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpbusquedaLayout.createSequentialGroup()
                .addGroup(jpbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpbusquedaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jpbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlm)
                            .addComponent(jln)))
                    .addGroup(jpbusquedaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpbusquedaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLInstruccionCre))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpbusquedaLayout.setVerticalGroup(
            jpbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpbusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLInstruccionCre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jln)
                .addGap(46, 46, 46)
                .addComponent(jlm)
                .addGap(18, 18, 18)
                .addComponent(jlcliente)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jtpcredito.addTab("Busqueda", jpbusqueda);

        jpcredito.setBackground(new java.awt.Color(28, 58, 70));

        jLTelefonoLoc.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLTelefonoLoc.setForeground(new java.awt.Color(255, 255, 255));
        jLTelefonoLoc.setText("Telefono local:");

        jLCelular.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLCelular.setForeground(new java.awt.Color(255, 255, 255));
        jLCelular.setText("Celular:");

        jtftelefonolocal.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jtftelefonolocal.setEnabled(false);

        jtfcelular.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jtfcelular.setEnabled(false);

        jLDeudas.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLDeudas.setForeground(new java.awt.Color(255, 255, 255));
        jLDeudas.setText("¿Tiene deudas?");

        bg1.add(jrbdeudasi);
        jrbdeudasi.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jrbdeudasi.setForeground(new java.awt.Color(255, 255, 255));
        jrbdeudasi.setText("SI");
        jrbdeudasi.setEnabled(false);
        jrbdeudasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbdeudasiActionPerformed(evt);
            }
        });

        bg1.add(jrbdeudano);
        jrbdeudano.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jrbdeudano.setForeground(new java.awt.Color(255, 255, 255));
        jrbdeudano.setText("NO");
        jrbdeudano.setEnabled(false);
        jrbdeudano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbdeudanoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresa el monto de la deuda:");

        jtfdeuda.setEnabled(false);

        jLSueldo.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLSueldo.setForeground(new java.awt.Color(255, 255, 255));
        jLSueldo.setText("Sueldo mensual:");

        jtfsueldo.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jtfsueldo.setEnabled(false);

        jlaprovado.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jlaprovado.setForeground(new java.awt.Color(255, 255, 255));
        jlaprovado.setText("Su credito ha sido :");

        jlmonto.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jlmonto.setForeground(new java.awt.Color(255, 255, 255));
        jlmonto.setText("Su monto es de:");

        jbback.setBackground(new java.awt.Color(204, 204, 204));
        jbback.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jbback.setText("Volver al Inicio");
        jbback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbackActionPerformed(evt);
            }
        });

        jbsolicitarcredito.setBackground(new java.awt.Color(204, 204, 204));
        jbsolicitarcredito.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jbsolicitarcredito.setText("Solicitar credito");
        jbsolicitarcredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsolicitarcreditoActionPerformed(evt);
            }
        });

        jltexto.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jltexto.setForeground(new java.awt.Color(255, 255, 255));
        jltexto.setText("Para ingresar los datos debes de buscarte primero en la anterior pestaña");

        javax.swing.GroupLayout jpcreditoLayout = new javax.swing.GroupLayout(jpcredito);
        jpcredito.setLayout(jpcreditoLayout);
        jpcreditoLayout.setHorizontalGroup(
            jpcreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpcreditoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpcreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpcreditoLayout.createSequentialGroup()
                        .addComponent(jbsolicitarcredito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbback)
                        .addGap(43, 43, 43))
                    .addGroup(jpcreditoLayout.createSequentialGroup()
                        .addGroup(jpcreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfsueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpcreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jpcreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLDeudas)
                                    .addGroup(jpcreditoLayout.createSequentialGroup()
                                        .addComponent(jrbdeudasi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jrbdeudano)))
                                .addComponent(jLSueldo)))
                        .addGroup(jpcreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpcreditoLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jpcreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlaprovado)
                                    .addComponent(jlmonto))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpcreditoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpcreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jpcreditoLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jtfdeuda, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLCelular)
                                    .addComponent(jtfcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34))))
                    .addGroup(jpcreditoLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jtftelefonolocal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jpcreditoLayout.createSequentialGroup()
                .addGroup(jpcreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpcreditoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLTelefonoLoc))
                    .addGroup(jpcreditoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jltexto)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpcreditoLayout.setVerticalGroup(
            jpcreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpcreditoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jltexto)
                .addGap(18, 18, 18)
                .addGroup(jpcreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefonoLoc)
                    .addComponent(jLCelular))
                .addGap(19, 19, 19)
                .addGroup(jpcreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtftelefonolocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpcreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpcreditoLayout.createSequentialGroup()
                        .addComponent(jLDeudas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpcreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbdeudasi)
                            .addComponent(jrbdeudano)))
                    .addGroup(jpcreditoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfdeuda, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpcreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSueldo)
                    .addComponent(jlaprovado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpcreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfsueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlmonto))
                .addGap(18, 18, 18)
                .addGroup(jpcreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbsolicitarcredito)
                    .addComponent(jbback))
                .addGap(363, 363, 363))
        );

        jtpcredito.addTab("Solicita Crédito", jpcredito);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtpcredito, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtpcredito, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbsolicitarcreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsolicitarcreditoActionPerformed
        String local = jtftelefonolocal.getText();
        String cel = jtfcelular.getText();
        String idus = jlcliente.getText();
        double credito = 0, deuda = 0, sueldomensual = 0;

        // Obtener los valores de los campos
        String deudaText = jtfdeuda.getText();
        String sueldoText = jtfsueldo.getText();

        try {
            // Validar que los campos "local" y "cel" no estén vacíos
            if (local.isEmpty() || cel.isEmpty()) {
                cmensajes.mistake("Por favor, complete los campos de teléfono local y celular.", "Campos vacíos");
                return;
            }
            // Validar formato de los teléfonos
            boolean esCorrecto = cmensajes.validaTelefonos(local, cel);
            if (!esCorrecto) {
                cmensajes.mistake("Teléfonos no válidos. Verifique el formato.", "Formato incorrecto");
                return;
            }

            // Insertar los teléfonos a la base de datos
            cm.insertar_telefonos(local, cel, idus);

            // Validar que sueldo no esté vacío
            if (sueldoText.isEmpty()) {
                cmensajes.mistake("El campo de sueldo mensual no puede estar vacío.", "Campos vacíos");
                return;
            }

            // Convertir sueldo a numérico
            sueldomensual = Double.parseDouble(sueldoText);

            // Si tiene deudas, validar que el campo de deuda no esté vacío
            if (jrbdeudasi.isSelected()) {
                if (deudaText.isEmpty()) {
                    cmensajes.mistake("Debe ingresar el monto de la deuda si selecciona 'Sí tiene deudas'.", "Campos vacíos");
                    return;
                }
                // Convertir deuda a numérico
                deuda = Double.parseDouble(deudaText);
            }

            // Calcular crédito
            if (jrbdeudasi.isSelected()) {
                if (sueldomensual <= 20000) {
                    credito = (sueldomensual * 0.2) - deuda;
                } else if (sueldomensual <= 50000) {
                    credito = (sueldomensual * 0.3) - deuda;
                } else {
                    credito = (sueldomensual * 0.4) - deuda;
                }
            } else if (jrbdeudano.isSelected()) {
                if (sueldomensual <= 20000) {
                    credito = sueldomensual * 0.2;
                } else if (sueldomensual <= 50000) {
                    credito = sueldomensual * 0.3;
                } else {
                    credito = sueldomensual * 0.4;
                }
            }

            // Validar si el crédito es cero o negativo
            if (credito <= 0) {
                jlaprovado.setText("Crédito rechazado");
                jlmonto.setText("$0.00");
                cmensajes.mistake("Crédito rechazado debido a monto insuficiente.", "Crédito rechazado");
                return;
            }

            // Actualizar valores visuales y registrar crédito en la base de datos
            jlaprovado.setText("Crédito aprobado");
            jlmonto.setText("$" + String.format("%.2f", credito));

            if (cm.insertar_credito(idus, credito)) {
                cmensajes.message("Crédito registrado correctamente: $" + String.format("%.2f", credito), "Éxito");
            } else {
                cmensajes.mistake("Error al registrar el crédito en la base de datos.", "Error SQL");
            }

        } catch (NumberFormatException e) {
            cmensajes.mistake("Ingrese valores numéricos válidos para deuda y sueldo.", "Error de formato");
        } catch (SQLException ex) {
            Logger.getLogger(jfCredito.class.getName()).log(Level.SEVERE, null, ex);
            cmensajes.mistake("Error de base de datos: " + ex.getMessage(), "Error SQL");
        }
    }//GEN-LAST:event_jbsolicitarcreditoActionPerformed

    private void jbbuscarcurpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbuscarcurpActionPerformed
        String curp = jtfcurp.getText();
        try {
            if (!curp.isEmpty()) {
                cmensajes.validaCURP(curp);
                results = cm.mostraridusuario(curp);
                if (!results.isEmpty()) {
                    String idusuario = results.get(0)[0];
                    jlcliente.setText(idusuario);
                    String idus = jlcliente.getText();
                    /* ---------------------------- Imprimir el id ---------------------------- */
                    s.setDato(idus);
                    /* ---------------------------- Imprimir el id ---------------------------- */
                    results = cm.buscar_credito(idus); //Busqua si el ususario tiene cuenta
                    if (!results.isEmpty()) {
                        cmensajes.message("Usted ya cuenta con un crédito", "Verifica crédito");
                        results = cm.mostrarusuario(idus); //Muestra sus datos en caso de si encontrar
                        String nombre = results.get(0)[0];
                        jln.setText("Nombre : " + nombre);
                        results = cm.mostrarmonto(idus);
                        String monto = results.get(0)[0];
                        jlm.setText("Monto : " + monto);
                        //this.setVisible(false);
                        jtftelefonolocal.setEnabled(true);
                        jtfcelular.setEnabled(true);
                        jrbdeudasi.setEnabled(true);
                        jrbdeudano.setEnabled(true);
                    } else {
                        cmensajes.message("Continua", "Nuevo crédito");
                    }
                }
            } else {
                cmensajes.mistake("No debe haber campos vacios", "Curp");
            }
        } catch (SQLException ex) {
            Logger.getLogger(jfCredito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbbuscarcurpActionPerformed

    private void jbbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbackActionPerformed
        //this.setVisible(false);
//        JFInicio inicio = new JFInicio();
//        inicio.setVisible(true);
    }//GEN-LAST:event_jbbackActionPerformed

    private void jrbdeudasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbdeudasiActionPerformed
        jtfdeuda.setEnabled(true);
    }//GEN-LAST:event_jrbdeudasiActionPerformed

    private void jrbdeudanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbdeudanoActionPerformed
        jtfdeuda.setEnabled(false);
        jtfsueldo.setEnabled(true);
    }//GEN-LAST:event_jrbdeudanoActionPerformed

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
            java.util.logging.Logger.getLogger(jfCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfCredito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg1;
    private javax.swing.JLabel jLCURP;
    private javax.swing.JLabel jLCelular;
    private javax.swing.JLabel jLDeudas;
    private javax.swing.JLabel jLInstruccionCre;
    private javax.swing.JLabel jLSueldo;
    private javax.swing.JLabel jLTelefonoLoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbback;
    private javax.swing.JButton jbbuscarcurp;
    private javax.swing.JButton jbsolicitarcredito;
    private javax.swing.JLabel jlaprovado;
    private javax.swing.JLabel jlcliente;
    private javax.swing.JLabel jlm;
    private javax.swing.JLabel jlmonto;
    private javax.swing.JLabel jln;
    private javax.swing.JLabel jltexto;
    private javax.swing.JPanel jpbusqueda;
    private javax.swing.JPanel jpcredito;
    private javax.swing.JRadioButton jrbdeudano;
    private javax.swing.JRadioButton jrbdeudasi;
    private javax.swing.JTextField jtfcelular;
    private javax.swing.JTextField jtfcurp;
    private javax.swing.JTextField jtfdeuda;
    private javax.swing.JTextField jtfsueldo;
    private javax.swing.JTextField jtftelefonolocal;
    private javax.swing.JTabbedPane jtpcredito;
    // End of variables declaration//GEN-END:variables
}
