package com.telas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jButtonCadastroDeUsuario = new javax.swing.JButton();
        jButtonCadastroDePacientes = new javax.swing.JButton();
        jButtonRelatorio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SisVac - Menu");
        setBackground(new java.awt.Color(204, 255, 204));

        jButtonCadastroDeUsuario.setText("Cadastro de Usuarios");
        jButtonCadastroDeUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCadastroDeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroDeUsuarioActionPerformed(evt);
            }
        });

        jButtonCadastroDePacientes.setText("Cadastro de Pacientes");
        jButtonCadastroDePacientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCadastroDePacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroDePacientesActionPerformed(evt);
            }
        });

        jButtonRelatorio.setText("Relatório");
        jButtonRelatorio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRelatorioActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Joao Conceicao\\Documents\\ProjetosParalelos\\SisVac\\src\\main\\java\\img\\icons\\imagem-do-usuario-com-fundo-preto.png")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Joao Conceicao\\Documents\\ProjetosParalelos\\SisVac\\src\\main\\java\\img\\icons\\injecao.png")); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Joao Conceicao\\Documents\\ProjetosParalelos\\SisVac\\src\\main\\java\\img\\icons\\relatorio-medico.png")); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("SisVac");

        jButton6.setText("Sair");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(323, 323, 323))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonCadastroDeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(19, 19, 19))
                            .addComponent(jButtonCadastroDePacientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jButtonRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                .addGap(16, 16, 16))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRelatorio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCadastroDeUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCadastroDePacientes, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(40, 40, 40)
                .addComponent(jButton6)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastroDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroDeUsuarioActionPerformed
        new CadastroDeUsuario().setVisible(true);
        
    }//GEN-LAST:event_jButtonCadastroDeUsuarioActionPerformed

    private void jButtonCadastroDePacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroDePacientesActionPerformed
        new CadastroDePacientes().setVisible(true);
    }//GEN-LAST:event_jButtonCadastroDePacientesActionPerformed

    private void jButtonRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRelatorioActionPerformed
    new RelatorioVacinacao().setVisible(true);
    }//GEN-LAST:event_jButtonRelatorioActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonCadastroDePacientes;
    private javax.swing.JButton jButtonCadastroDeUsuario;
    private javax.swing.JButton jButtonRelatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
