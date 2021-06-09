package com.telas;


import javax.swing.event.ListSelectionEvent;
import javax.swing.JTable;
import com.sisvac.model.Paciente;

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
        initComponents();
    }
    
    private Paciente paciente;

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
        labelPacienteEndereco = new javax.swing.JLabel();
        labelTitulo1 = new javax.swing.JLabel();
        panelTabela = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fila de Vacinação");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

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

        labelPacienteEndereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPacienteEndereco.setText("Endereço:");

        javax.swing.GroupLayout panelPacienteLayout = new javax.swing.GroupLayout(panelPaciente);
        panelPaciente.setLayout(panelPacienteLayout);
        panelPacienteLayout.setHorizontalGroup(
            panelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPacienteNome)
                    .addComponent(labelPacienteIdade)
                    .addComponent(labelPacienteEndereco))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPacienteLayout.setVerticalGroup(
            panelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPacienteLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(labelPacienteNome)
                .addGap(18, 18, 18)
                .addComponent(labelPacienteIdade)
                .addGap(18, 18, 18)
                .addComponent(labelPacienteEndereco)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        labelPacienteNome.getAccessibleContext().setAccessibleName("Fila de Vacinação");

        labelTitulo1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelTitulo1.setText("Paciente a ser vacinado");

        javax.swing.GroupLayout panelMensagemLayout = new javax.swing.GroupLayout(panelMensagem);
        panelMensagem.setLayout(panelMensagemLayout);
        panelMensagemLayout.setHorizontalGroup(
            panelMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMensagemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMensagemLayout.createSequentialGroup()
                        .addGroup(panelMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelMensagemLayout.createSequentialGroup()
                                .addComponent(jButtonVacinar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAusentar)
                                .addGap(5, 5, 5)))
                        .addGap(42, 42, 42))
                    .addGroup(panelMensagemLayout.createSequentialGroup()
                        .addComponent(labelTitulo1)
                        .addContainerGap(142, Short.MAX_VALUE))))
        );
        panelMensagemLayout.setVerticalGroup(
            panelMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMensagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo1)
                .addGap(18, 18, 18)
                .addComponent(panelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(panelMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVacinar)
                    .addComponent(jButtonAusentar))
                .addContainerGap())
        );

        getContentPane().add(panelMensagem);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelTitulo.setText("Fila de Vacinação");
        panelTabela.add(labelTitulo);

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

        panelTabela.add(jScrollPane1);

        getContentPane().add(panelTabela);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVacinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVacinarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVacinarActionPerformed

    private void jButtonAusentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAusentarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAusentarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked
    
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
                Fila fila = new Fila();
                
                fila.loadCustomEvents();
                fila.setVisible(true);
            }
        });
    }
    
    private void loadCustomEvents(){
        
        this.jTable1.getSelectionModel().addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int id = (int)jTable1.getValueAt(jTable1.getSelectedRow(), 0);
                
                
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAusentar;
    private javax.swing.JButton jButtonVacinar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelPacienteEndereco;
    private javax.swing.JLabel labelPacienteIdade;
    private javax.swing.JLabel labelPacienteNome;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTitulo1;
    private javax.swing.JPanel panelMensagem;
    private javax.swing.JPanel panelPaciente;
    private javax.swing.JPanel panelTabela;
    // End of variables declaration//GEN-END:variables
}