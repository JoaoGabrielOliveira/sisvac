package com.telas;


import javax.swing.event.ListSelectionEvent;
import com.sisvac.controller.FilaController;
import com.sisvac.model.Paciente;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joao Conceicao
 */
public class Fila extends javax.swing.JFrame {

    /**
     * Creates new form Fila
     */
    public Fila() {
        this.filaController = new FilaController();
        //this.filaController.pegarPacientes();
        
        initComponents();
        
        this.atualizarTabela();
        this.atualizarPaciente(this.filaController.getPacienteAtual());
    }
    
    private FilaController filaController;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMensagem = new javax.swing.JPanel();
        jButtonVacinar = new javax.swing.JButton();
        jButtonAusentar = new javax.swing.JButton();
        panelPaciente = new javax.swing.JPanel();
        labelPacienteNome = new javax.swing.JLabel();
        labelPacienteIdade = new javax.swing.JLabel();
        jTextPacienteNome = new javax.swing.JTextField();
        jTextPacienteIdade = new javax.swing.JTextField();
        jTextPacienteId = new javax.swing.JTextField();
        labelPacienteId = new javax.swing.JLabel();
        jCheckBoxAreaSaude = new javax.swing.JCheckBox();
        labelTitulo1 = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        panelTabela = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonAtualizar = new javax.swing.JButton();
        labelNivelPrioridade = new javax.swing.JLabel();
        jComboBoxPrioridade = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SisVac - Fila de Vacinação");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButtonVacinar.setText("Confirmar Vacinação");
        jButtonVacinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVacinarActionPerformed(evt);
            }
        });

        jButtonAusentar.setText("Paciente Ausente");
        jButtonAusentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAusentarActionPerformed(evt);
            }
        });

        panelPaciente.setBackground(new java.awt.Color(204, 204, 204));

        labelPacienteNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPacienteNome.setText("Nome:");

        labelPacienteIdade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPacienteIdade.setText("Idade:");

        jTextPacienteNome.setEditable(false);

        jTextPacienteIdade.setEditable(false);

        jTextPacienteId.setEditable(false);

        labelPacienteId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPacienteId.setText("Id:");

        jCheckBoxAreaSaude.setText(" É da área de saúde");
        jCheckBoxAreaSaude.setEnabled(false);

        javax.swing.GroupLayout panelPacienteLayout = new javax.swing.GroupLayout(panelPaciente);
        panelPaciente.setLayout(panelPacienteLayout);
        panelPacienteLayout.setHorizontalGroup(
            panelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBoxAreaSaude, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelPacienteLayout.createSequentialGroup()
                        .addGroup(panelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPacienteNome)
                            .addComponent(labelPacienteIdade)
                            .addComponent(labelPacienteId, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextPacienteId, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(jTextPacienteIdade)
                            .addComponent(jTextPacienteNome))))
                .addContainerGap())
        );
        panelPacienteLayout.setVerticalGroup(
            panelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPacienteLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(panelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPacienteId)
                    .addComponent(jTextPacienteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPacienteNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextPacienteNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPacienteIdade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextPacienteIdade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxAreaSaude)
                .addGap(9, 9, 9))
        );

        labelPacienteNome.getAccessibleContext().setAccessibleName("Fila de Vacinação");

        labelTitulo1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelTitulo1.setText("Paciente a ser vacinado");

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMensagemLayout = new javax.swing.GroupLayout(panelMensagem);
        panelMensagem.setLayout(panelMensagemLayout);
        panelMensagemLayout.setHorizontalGroup(
            panelMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMensagemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMensagemLayout.createSequentialGroup()
                        .addComponent(jButtonSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonVacinar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAusentar))
                    .addGroup(panelMensagemLayout.createSequentialGroup()
                        .addComponent(labelTitulo1)
                        .addGap(0, 125, Short.MAX_VALUE))
                    .addComponent(panelPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelMensagemLayout.setVerticalGroup(
            panelMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMensagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo1)
                .addGap(35, 35, 35)
                .addComponent(panelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(panelMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVacinar)
                    .addComponent(jButtonAusentar)
                    .addComponent(jButtonSair))
                .addContainerGap())
        );

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelTitulo.setText("Fila de Vacinação");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Id", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jButtonAtualizar.setText("Atualizar fila");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        labelNivelPrioridade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNivelPrioridade.setText("Nivel de Prioridade:");

        jComboBoxPrioridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        jComboBoxPrioridade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxPrioridadeFocusLost(evt);
            }
        });
        jComboBoxPrioridade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPrioridadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTabelaLayout = new javax.swing.GroupLayout(panelTabela);
        panelTabela.setLayout(panelTabelaLayout);
        panelTabelaLayout.setHorizontalGroup(
            panelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTabelaLayout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAtualizar))
                    .addGroup(panelTabelaLayout.createSequentialGroup()
                        .addComponent(labelNivelPrioridade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelTabelaLayout.setVerticalGroup(
            panelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabelaLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAtualizar)
                    .addComponent(labelTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNivelPrioridade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxPrioridade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVacinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVacinarActionPerformed
        this.filaController.confirmarVacinacao();
        this.filaController.proximoFila();
        this.atualizarTabela();
        this.atualizarPaciente(this.filaController.getPacienteAtual());
    }//GEN-LAST:event_jButtonVacinarActionPerformed

    private void jButtonAusentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAusentarActionPerformed
        this.filaController.proximoFila();
        this.atualizarTabela();
        this.atualizarPaciente(this.filaController.getPacienteAtual());
    }//GEN-LAST:event_jButtonAusentarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        this.atualizarTabela();
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jComboBoxPrioridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPrioridadeActionPerformed
        int prioriodade = this.jComboBoxPrioridade.getSelectedIndex() + 1;
        this.filaController.mudarPrioridadeSeNecessario(prioriodade);
        JOptionPane.showMessageDialog(null,"Mudando a prioridade da fila para " + this.filaController.getNivel(), "SisVac - Prioridade", JOptionPane.INFORMATION_MESSAGE);
        this.filaController.pegarPacientes();
        this.atualizarTabela();
    }//GEN-LAST:event_jComboBoxPrioridadeActionPerformed

    private void jComboBoxPrioridadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxPrioridadeFocusLost
        
        
    }//GEN-LAST:event_jComboBoxPrioridadeFocusLost

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed
    
    private void atualizarTabela(){
        this.filaController.limparTabela();
        this.filaController.adicionarPacientesATabela();
        this.jTable1.setModel(this.filaController.modeloPadrao);
        this.atualizarPaciente(this.filaController.getPacienteAtual());
    }
    
    private void atualizarPaciente(Paciente paciente){
        this.jTextPacienteId.setText(paciente.getId().toString());
        this.jTextPacienteNome.setText(paciente.getNome());
        this.jTextPacienteIdade.setText(paciente.getDT_NASCIMENTO().toString());
        this.jCheckBoxAreaSaude.setSelected(paciente.getE_SAUDE());
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
            java.util.logging.Logger.getLogger(Fila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fila().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonAusentar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonVacinar;
    private javax.swing.JCheckBox jCheckBoxAreaSaude;
    private javax.swing.JComboBox<String> jComboBoxPrioridade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextPacienteId;
    private javax.swing.JTextField jTextPacienteIdade;
    private javax.swing.JTextField jTextPacienteNome;
    private javax.swing.JLabel labelNivelPrioridade;
    private javax.swing.JLabel labelPacienteId;
    private javax.swing.JLabel labelPacienteIdade;
    private javax.swing.JLabel labelPacienteNome;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTitulo1;
    private javax.swing.JPanel panelMensagem;
    private javax.swing.JPanel panelPaciente;
    private javax.swing.JPanel panelTabela;
    // End of variables declaration//GEN-END:variables
}
