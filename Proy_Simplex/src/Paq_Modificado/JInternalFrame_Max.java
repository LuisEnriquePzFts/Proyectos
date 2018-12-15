
package Paq_Modificado;

import javax.swing.table.DefaultTableModel;

public class JInternalFrame_Max extends javax.swing.JInternalFrame {

    double Matriz[][] = null;
    int restricciones = 0, variables = 0, iter = 0, iteracion = 0;
    Object array[] = null;
    Object EtiquetaX[] = null, EtiquetaY[] = null;

    public JInternalFrame_Max() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtRestriccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtVariable = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSolucion = new javax.swing.JButton();
        btnSolucion1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSolucion = new javax.swing.JTable();
        lbl_Iteraccion = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setAlignmentX(5.0F);
        setAlignmentY(5.0F);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        jLabel1.setText("RESTRICCIONES:");

        btnAceptar.setBackground(new java.awt.Color(204, 0, 0));
        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("CALCULAR");
        btnAceptar.setToolTipText("");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        jLabel2.setText("VARIABLES:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRestriccion, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRestriccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtVariable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(btnAceptar)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "                X1", "                X2", "                X3", "                X4"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(51, 51, 51));
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(jTable1);

        btnSolucion.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnSolucion.setText("SOLUCION");
        btnSolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolucionActionPerformed(evt);
            }
        });

        btnSolucion1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnSolucion1.setText("INTERACCION");
        btnSolucion1.setEnabled(false);
        btnSolucion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolucion1ActionPerformed(evt);
            }
        });

        jTableSolucion.setBackground(new java.awt.Color(204, 204, 204));
        jTableSolucion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        jTableSolucion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "                 S1", "                 S2", "                 S3", "                 S4"
            }
        ));
        jTableSolucion.setGridColor(new java.awt.Color(0, 0, 0));
        jTableSolucion.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jTableSolucion);

        lbl_Iteraccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_Iteraccion.setForeground(new java.awt.Color(204, 255, 255));

        Salir.setBackground(new java.awt.Color(204, 0, 0));
        Salir.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("SALIR");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btnSolucion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSolucion1)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Iteraccion))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, 0, 458, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lbl_Iteraccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSolucion)
                            .addComponent(btnSolucion1))
                        .addGap(22, 22, 22)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 482, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        try {
            restricciones = Integer.parseInt(txtRestriccion.getText());
            variables = Integer.parseInt(txtVariable.getText());

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setRowCount(restricciones + 1);
            modelo.setColumnCount(variables + restricciones + 2);
            array = new Object[variables + restricciones + 2];
            EtiquetaX = new Object[variables + restricciones];
            for (int i = 1; i < array.length - 1; i++) {
                if (i < variables + 1) {
                    array[i] = "X" + i;
                    EtiquetaX[i - 1] = "X" + i;
                } else {
                    array[i] = "S" + (i - variables);
                    EtiquetaX[i - 1] = "S" + (i - variables);
                }
            }
            //---------------------
            EtiquetaY = new Object[restricciones + 1];
            for (int i = 0; i < restricciones; i++) {
                modelo.setValueAt("S" + (i + 1), i, 0);
                EtiquetaY[i] = "S" + (i + 1);
            }
            modelo.setValueAt("Z", restricciones, 0);
            EtiquetaY[restricciones] = "Z";
            //----------------------
            array[array.length - 1] = "soluc";
            modelo.setColumnIdentifiers(array);
            jTable1.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }
}//GEN-LAST:event_btnAceptarActionPerformed

    private void btnSolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolucionActionPerformed
        try {
            DefaultTableModel modeloSolucion = new DefaultTableModel();
            Matriz = new double[restricciones + 1][restricciones + variables + 1];
            for (int i = 0; i < (restricciones + 1); i++) {
                for (int j = 0; j < (restricciones + variables + 1); j++) {
                    Matriz[i][j] = Double.parseDouble(jTable1.getValueAt(i, j + 1).toString());
                }
            }
            while (ComprobarResultado() != true) {
                EtiquetaY[FilaPivote()] = EtiquetaX[ColumnaPivote()];
                NuevaTabla(FilaPivote(), ColumnaPivote());
                modeloSolucion.setColumnCount(restricciones + variables + 2);
                modeloSolucion.setRowCount(restricciones + 1);
                //--------------------------
                modeloSolucion.setColumnIdentifiers(array);
                //---------------------------
                for (int i = 0; i < (restricciones + 1); i++) {
                    modeloSolucion.setValueAt(EtiquetaY[i], i, 0);
                    for (int j = 0; j < (restricciones + variables + 1); j++) {
                        modeloSolucion.setValueAt(Matriz[i][j], i, j + 1);
                    }
                }
                jTableSolucion.setModel(modeloSolucion);
                iteracion++;
            }
            btnSolucion.setEnabled(false);
            btnSolucion1.setEnabled(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }
}//GEN-LAST:event_btnSolucionActionPerformed

    private void btnSolucion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolucion1ActionPerformed
        try {
            DefaultTableModel modeloSolucion = new DefaultTableModel();
            Matriz = new double[restricciones + 1][restricciones + variables + 1];
            for (int i = 0; i < (restricciones + 1); i++) {
                for (int j = 0; j < (restricciones + variables + 1); j++) {
                    Matriz[i][j] = Double.parseDouble(jTable1.getValueAt(i, j + 1).toString());
                }
            }
            int k = 0;
            iter++;
            if (iter <= iteracion) {
                lbl_Iteraccion.setText(": " + iter);
                while (iter > k) {
                    EtiquetaY[FilaPivote()] = EtiquetaX[ColumnaPivote()];
                    NuevaTabla(FilaPivote(), ColumnaPivote());
                    modeloSolucion.setColumnCount(restricciones + variables + 2);
                    modeloSolucion.setRowCount(restricciones + 1);
                    //--------------------------
                    modeloSolucion.setColumnIdentifiers(array);
                    //---------------------------
                    for (int i = 0; i < (restricciones + 1); i++) {
                        modeloSolucion.setValueAt(EtiquetaY[i], i, 0);
                        for (int j = 0; j < (restricciones + variables + 1); j++) {
                            modeloSolucion.setValueAt(Matriz[i][j], i, j + 1);
                        }
                    }
                    jTableSolucion.setModel(modeloSolucion);
                    k++;
                }
            } else {
                iter = 0;
                iteracion = 0;
                lbl_Iteraccion.setText("Final");
                btnSolucion.setEnabled(true);
                btnSolucion1.setEnabled(false);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }
}//GEN-LAST:event_btnSolucion1ActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnSolucion;
    private javax.swing.JButton btnSolucion1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableSolucion;
    private javax.swing.JLabel lbl_Iteraccion;
    private javax.swing.JTextField txtRestriccion;
    private javax.swing.JTextField txtVariable;
    // End of variables declaration//GEN-END:variables

    public int ColumnaPivote() {
        int pos = 0;
        double aux = Matriz[restricciones][0];
        for (int i = 1; i < restricciones + variables; i++) {
            if (aux > Matriz[restricciones][i]) {
                aux = Matriz[restricciones][i];
                pos = i;
            }
        }
        return pos;
    }

    public int FilaPivote() {
        int columna = ColumnaPivote();
        double temp = 0, razon = Matriz[0][variables + restricciones] / Matriz[0][columna];
        int pos = 0;
        for (int i = 1; i < restricciones; i++) {
            if (Matriz[i][columna] != 0) {
                temp = Matriz[i][variables + restricciones] / Matriz[i][columna];
                if (razon > temp && temp >= 0) {
                    razon = temp;
                    pos = i;
                }
            }

        }
        return pos;
    }

    public void NuevaTabla(int Fila, int Columna) {
        double pivote = Matriz[Fila][Columna], temp = 0;//--
        for (int i = 0; i < restricciones + variables + 1; i++) {
            Matriz[Fila][i] = Matriz[Fila][i] / pivote;
        }
        for (int i = 0; i < restricciones + 1; i++) {
            temp = Matriz[i][Columna];
            for (int j = 0; j < variables + restricciones + 1; j++) {
                if (i != Fila) {
                    Matriz[i][j] = Matriz[i][j] - temp * Matriz[Fila][j];
                } else {
                    break;
                }
            }
        }
    }

    public boolean ComprobarResultado() {
        boolean result = true;
        for (int i = 0; i < restricciones + variables; i++) {
            if (Matriz[restricciones][i] < 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
