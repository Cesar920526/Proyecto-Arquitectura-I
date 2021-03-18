/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto_arqui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS X509L
 */
public class ciclosCaptacion extends javax.swing.JFrame {

    String codigos = "";
    String[] test;
    String[] test1;
    int pc, contador = 0, count = 0, resultado;

    /**
     * Creates new form ciclosCaptacion
     */
    public ciclosCaptacion() {
        initComponents();

        valInstruccion();
        valDatos();
        sacaValores();

    }

    public void valInstruccion() {
        int numInstruccion = (int) (Math.random() * (200 - 399) + 399);
        Object[] model = new Object[2];
        Object[] modelEjecucion = new Object[3];

        for (int i = 0; i < 5; i++) {
            model[0] = String.valueOf(numInstruccion++);
            model[1] = "";
            ((DefaultTableModel) tblMemoriaInstruccion.getModel()).addRow(model);
        }

        String valorInicial = (String) tblMemoriaInstruccion.getValueAt(0, 0);
        pc = Integer.parseInt(valorInicial);

        modelEjecucion[0] = String.valueOf(valorInicial);
        modelEjecucion[1] = "";
        modelEjecucion[2] = "";
        ((DefaultTableModel) tblEjecucion.getModel()).addRow(modelEjecucion);
    }

    public void valDatos() {
        int numDatos = (int) (Math.random() * (400 - 499) + 499);

        Object[] model = new Object[2];

        for (int i = 0; i < 10; i++) {
            int numDatos1 = (int) (Math.random() * (1 - 1000) + 1000);
            model[0] = String.valueOf(numDatos++);
            model[1] = String.valueOf(numDatos1);

            ((DefaultTableModel) tblMemoriaDatos.getModel()).addRow(model);
        }
    }

    public void sacaValores() {

        int fila = tblcodigos.getRowCount();
        int fila1 = tblMemoriaDatos.getRowCount();
        String instrucciones = "", valor = "", codigo = "", datos = "", valorDatos = "";

        for (int i = 0; i < fila; i++) {
            codigo = (String) tblcodigos.getValueAt(i, 0);
            codigos += codigo;
        }

        for (int i = 0; i < fila1; i++) {
            datos = (String) tblMemoriaDatos.getValueAt(i, 0);
            valorDatos = (String) tblMemoriaDatos.getValueAt(i, 1);
            instrucciones += datos + "-";
            valor += valorDatos + "-";
        }

        test = instrucciones.split("-");
        test1 = valor.split("-");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblcodigos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMemoriaInstruccion = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMemoriaDatos = new javax.swing.JTable();
        btnejecutar = new javax.swing.JToggleButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblEjecucion = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblcodigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Cargar AC desde memoria"},
                {"2", "Almacenar AC en memoria"},
                {"3", "Restar a AC dato de memoria"},
                {"4", "Sumar a AC  dato de memoria "},
                {"5", "Multiplicar a AC datos de memoria"},
                {"6", "Dividir a AC datos de memoria"}
            },
            new String [] {
                "CÓDIGO", "OPERACIÓN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblcodigos);

        jLabel1.setText("CODIGOS OPERACIÓN ");

        jLabel2.setText("MEMORIA DE INSTRUCCIÓN");

        tblMemoriaInstruccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DIRECCIÓN", "VALOR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblMemoriaInstruccion);

        jLabel3.setText("MEMORIA DE DATOS ");

        tblMemoriaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblMemoriaDatos);

        btnejecutar.setText("EJECUTAR");
        btnejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnejecutarActionPerformed(evt);
            }
        });

        tblEjecucion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PC", "AC", "IR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblEjecucion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(jLabel2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnejecutar)
                                .addGap(96, 96, 96)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnejecutar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnejecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnejecutarActionPerformed
        pc++;
        int ir = (Integer) tblMemoriaInstruccion.getValueAt(contador, 1);

        Object[] modelEjecucion = new Object[3];

        modelEjecucion[0] = String.valueOf(pc);
        modelEjecucion[1] = String.valueOf(operacionAc(ir));
        modelEjecucion[2] = String.valueOf(ir);
        ((DefaultTableModel) tblEjecucion.getModel()).addRow(modelEjecucion);
        contador++;
    }//GEN-LAST:event_btnejecutarActionPerformed

    public double operacionAc(int a) {
        int numero1 = a / 1000;
        int numero2 = a % 1000;

        switch (numero1) {
            case 1:
                for (int i = 0; i < 10; i++) {
                    if (numero2 == (Integer.parseInt(test[i]))) {
                        resultado = Integer.parseInt(test1[i]);
                        count++;
                        return resultado;
                    }
                }
                break;

            case 2:
                System.out.println(count);
                if (tblEjecucion.getValueAt(count, 1).equals("")) {
                    for (int j = 0; j < 10; j++) {
                        if (numero2 == (Integer.parseInt(test[j]))) {
                            resultado = Integer.parseInt(test1[j]);
                            tblMemoriaDatos.setValueAt(resultado, j, 1);
                            count++;
                            return resultado;
                        }
                    }

                } else {
                    for (int j = 0; j < 10; j++) {
                        if (numero2 == (Integer.parseInt(test[j]))) {
                            tblMemoriaDatos.setValueAt(resultado, j, 1);
                            count++;
                            return resultado;
                        }
                    }
                }
                break;

            case 3:
                for (int i = 0; i < 10; i++) {
                    if (numero2 == (Integer.parseInt(test[i]))) {
                        resultado -= Integer.parseInt(test1[i]);
                        count++;
                        return resultado;
                    }
                }
                break;

            case 4:
                for (int i = 0; i < 10; i++) {
                    if (numero2 == (Integer.parseInt(test[i]))) {
                        resultado += Integer.parseInt(test1[i]);
                        count++;
                        return resultado;
                    }
                }
                break;

            case 5:
                for (int i = 0; i < 10; i++) {
                    if (numero2 == (Integer.parseInt(test[i]))) {
                        resultado *= Integer.parseInt(test1[i]);
                        count++;
                        return resultado;
                    }
                }
                break;

            case 6:
                for (int i = 0; i < 10; i++) {
                    if (numero2 == (Integer.parseInt(test[i]))) {
                        resultado /= Integer.parseInt(test1[i]);
                        count++;
                        return resultado;
                    }
                }
                break;
        }

        return 0;
    }

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
            java.util.logging.Logger.getLogger(ciclosCaptacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ciclosCaptacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ciclosCaptacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ciclosCaptacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ciclosCaptacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnejecutar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tblEjecucion;
    private javax.swing.JTable tblMemoriaDatos;
    private javax.swing.JTable tblMemoriaInstruccion;
    private javax.swing.JTable tblcodigos;
    // End of variables declaration//GEN-END:variables
}
