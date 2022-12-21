package view;

import model.bean.Inicio;
import model.dao.QuestaoDAO;

public class IniciaI extends javax.swing.JPanel {

    public IniciaI() {
        initComponents();
        
    }
    Inicio inicio = new Inicio();
    QuestaoDAO dao = new QuestaoDAO();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCBDificuldade = new javax.swing.JComboBox<>();
        jCBTema = new javax.swing.JComboBox<>();
        jCBQuantidade = new javax.swing.JComboBox<>();
        jBCadastar = new javax.swing.JButton();

        setForeground(new java.awt.Color(0, 204, 204));
        setToolTipText("");

        jCBDificuldade.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jCBDificuldade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dificuldade:", "Fácil", "Médio", "Difícil" }));
        jCBDificuldade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBDificuldadeActionPerformed(evt);
            }
        });

        jCBTema.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jCBTema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tema", "Frutas", "Barbie" }));
        jCBTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTemaActionPerformed(evt);
            }
        });

        jCBQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jCBQuantidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quantidade de questões:", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        jCBQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBQuantidadeActionPerformed(evt);
            }
        });

        jBCadastar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jBCadastar.setText("Cadastrar");
        jBCadastar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBDificuldade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(197, 197, 197))
            .addGroup(layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jBCadastar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jCBTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jCBDificuldade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jCBQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jBCadastar)
                .addContainerGap(101, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCBDificuldadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBDificuldadeActionPerformed

    }//GEN-LAST:event_jCBDificuldadeActionPerformed

    private void jCBTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTemaActionPerformed
    }//GEN-LAST:event_jCBTemaActionPerformed

    private void jCBQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBQuantidadeActionPerformed
    }//GEN-LAST:event_jCBQuantidadeActionPerformed

    private void jBCadastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastarActionPerformed
        inicio.setDificuldade(jCBDificuldade.getSelectedIndex());
        inicio.setQuantidade(jCBQuantidade.getSelectedIndex());
        inicio.setTema(jCBTema.getSelectedIndex());

        //vai ser criado so no final de tudo
        dao.create(inicio);
        this.setVisible(false);
    }//GEN-LAST:event_jBCadastarActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastar;
    private javax.swing.JComboBox<String> jCBDificuldade;
    private javax.swing.JComboBox<String> jCBQuantidade;
    private javax.swing.JComboBox<String> jCBTema;
    // End of variables declaration//GEN-END:variables
}
