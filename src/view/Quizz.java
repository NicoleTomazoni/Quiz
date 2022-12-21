/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

/**
 *
 * @author nicol
 */
public class Quizz extends javax.swing.JPanel {

    public Quizz() {
        initComponents();
        bGAlternativas.add(jRadioButtonA);
        bGAlternativas.add(jRadioButtonB);
        bGAlternativas.add(jRadioButtonC);
        bGAlternativas.add(jRadioButtonD);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGAlternativas = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaEnunciado = new javax.swing.JTextArea();
        jRadioButtonA = new javax.swing.JRadioButton();
        jRadioButtonB = new javax.swing.JRadioButton();
        jRadioButtonC = new javax.swing.JRadioButton();
        jRadioButtonD = new javax.swing.JRadioButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextAreaD = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaC = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaB = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaA = new javax.swing.JTextArea();
        jButtonProxima = new javax.swing.JButton();

        jTextAreaEnunciado.setColumns(20);
        jTextAreaEnunciado.setRows(5);
        jTextAreaEnunciado.setEnabled(false);
        jTextAreaEnunciado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextAreaEnunciadoFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(jTextAreaEnunciado);

        jRadioButtonA.setText("A");
        jRadioButtonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAActionPerformed(evt);
            }
        });

        jRadioButtonB.setText("B");
        jRadioButtonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBActionPerformed(evt);
            }
        });

        jRadioButtonC.setText("C");
        jRadioButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCActionPerformed(evt);
            }
        });

        jRadioButtonD.setText("D");
        jRadioButtonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDActionPerformed(evt);
            }
        });

        jTextAreaD.setColumns(20);
        jTextAreaD.setRows(5);
        jTextAreaD.setEnabled(false);
        jTextAreaD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextAreaDFocusLost(evt);
            }
        });
        jScrollPane6.setViewportView(jTextAreaD);

        jTextAreaC.setColumns(20);
        jTextAreaC.setRows(5);
        jTextAreaC.setEnabled(false);
        jTextAreaC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextAreaCFocusLost(evt);
            }
        });
        jScrollPane3.setViewportView(jTextAreaC);

        jTextAreaB.setColumns(20);
        jTextAreaB.setRows(5);
        jTextAreaB.setEnabled(false);
        jTextAreaB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextAreaBFocusLost(evt);
            }
        });
        jScrollPane4.setViewportView(jTextAreaB);

        jTextAreaA.setColumns(20);
        jTextAreaA.setRows(5);
        jTextAreaA.setEnabled(false);
        jTextAreaA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextAreaAFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(jTextAreaA);

        jButtonProxima.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonProxima.setText("Próxima");
        jButtonProxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jRadioButtonA)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonProxima)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonD)
                                    .addComponent(jRadioButtonB, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRadioButtonC))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane3)
                                    .addComponent(jScrollPane4)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonA))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonB)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonC)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonD)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonProxima)
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextAreaEnunciadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAreaEnunciadoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAreaEnunciadoFocusLost

    private void jRadioButtonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonAActionPerformed

    private void jRadioButtonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonBActionPerformed

    private void jRadioButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonCActionPerformed

    private void jRadioButtonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonDActionPerformed

    private void jTextAreaDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAreaDFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAreaDFocusLost

    private void jTextAreaCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAreaCFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAreaCFocusLost

    private void jTextAreaBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAreaBFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAreaBFocusLost

    private void jTextAreaAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAreaAFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAreaAFocusLost

    private void jButtonProximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximaActionPerformed
        
    }//GEN-LAST:event_jButtonProximaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGAlternativas;
    private javax.swing.JButton jButtonProxima;
    private javax.swing.JRadioButton jRadioButtonA;
    private javax.swing.JRadioButton jRadioButtonB;
    private javax.swing.JRadioButton jRadioButtonC;
    private javax.swing.JRadioButton jRadioButtonD;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextAreaA;
    private javax.swing.JTextArea jTextAreaB;
    private javax.swing.JTextArea jTextAreaC;
    private javax.swing.JTextArea jTextAreaD;
    private javax.swing.JTextArea jTextAreaEnunciado;
    // End of variables declaration//GEN-END:variables

    void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
