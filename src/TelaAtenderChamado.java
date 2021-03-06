
import DAO.ClasseDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Gerenciador_OS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Igor Santana
 */
public class TelaAtenderChamado extends javax.swing.JFrame {

    /**
     * Creates new form TelaAtenderChamado1
     */
    public TelaAtenderChamado() throws SQLException {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTableAtenderChamado.getModel();
        jTableAtenderChamado.setRowSorter(new TableRowSorter(modelo));
        
        
        readJTable();
        
    }
    
    public void readJTable() throws SQLException{
    
        DefaultTableModel modelo = (DefaultTableModel) jTableAtenderChamado.getModel();
        modelo.setNumRows(0);
        ClasseDAO cDAO = new ClasseDAO();
        
        for(Gerenciador_OS g: cDAO.readAC()){
            
            modelo.addRow(new Object[]{
        
                g.getId(),
                g.getNumero_os(),
                g.getData_os(),
                g.getResponsavel_os(),
                g.getDescricao_os(),
                g.getSituacao_os()
                    
            });
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

        Logo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAtenderChamado = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Numero_os = new javax.swing.JTextField();
        Situacao_os = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldResponsavel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldData = new javax.swing.JTextField();
        jButtonExcluir = new javax.swing.JButton();
        BotaoMenu = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Atender Chamado - Gestão de OS");

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo ORCGRA.png"))); // NOI18N
        Logo.setText("jLabel3");

        jTableAtenderChamado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Numero", "Data", "Responsavel", "Descricao", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAtenderChamado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAtenderChamadoMouseClicked(evt);
            }
        });
        jTableAtenderChamado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableAtenderChamadoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAtenderChamado);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nº Ordem de Serviço");
        jLabel2.setMaximumSize(new java.awt.Dimension(68, 14));
        jLabel2.setMinimumSize(new java.awt.Dimension(68, 14));
        jLabel2.setName(""); // NOI18N

        Numero_os.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero_osActionPerformed(evt);
            }
        });

        Situacao_os.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Status Atual", "Resolvido", "Pendente" }));
        Situacao_os.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Situacao_osActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Descrição");

        jTextFieldResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldResponsavelActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Data");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Responsavel");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Alterar Status O.S");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Situacao_os, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Numero_os)
                            .addComponent(jTextFieldResponsavel)
                            .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDescricao)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Numero_os, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldData, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Situacao_os, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        BotaoMenu.setText("Menu");
        BotaoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMenuActionPerformed(evt);
            }
        });

        jButton2.setText("Inserir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("Salvar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluir)
                    .addComponent(BotaoMenu)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Situacao_osActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Situacao_osActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Situacao_osActionPerformed

    private void BotaoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMenuActionPerformed
        // TODO add your handling code here:
        
        new TelaAtenderChamado.dispose();
        new TelaPrincipal().setVisible(true);
    }//GEN-LAST:event_BotaoMenuActionPerformed

    private void Numero_osActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero_osActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Numero_osActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed

        //jTableAtenderChamado.getSelectedRow();
        if(jTableAtenderChamado.getSelectedRow() != -1){ // Se o Atendente selecionou uma linha da tabela ele exclui o dado //
            
        Gerenciador_OS g = new Gerenciador_OS();
        
        try {
        ClasseDAO dao = new ClasseDAO();
        
        g.setId((int)jTableAtenderChamado.getValueAt(jTableAtenderChamado.getSelectedRow(), 0));
        dao.delete(g);
        
        Numero_os.setText("");
        jTextFieldData.setText("");
        jTextFieldResponsavel.setText("");
        jTextFieldDescricao.setText("");
        Situacao_os.setSelectedItem("");
        
        readJTable();
        
        JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Erro: BotaoSalvar Tela: AtenderChamado: " +ex.getMessage());
            
        }
        
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para Excluir");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTextFieldResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldResponsavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldResponsavelActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Gerenciador_OS g = new Gerenciador_OS();
        
        try {
        ClasseDAO dao = new ClasseDAO();
        
        g.setNumero_os(Numero_os.getText());
        g.setData_os(jTextFieldData.getText());
        g.setResponsavel_os(jTextFieldResponsavel.getText());
        g.setDescricao_os(jTextFieldDescricao.getText());
        g.setSituacao_os(Situacao_os.getSelectedItem().toString());
        
        dao.inserir(g);
        
        Numero_os.setText("");
        jTextFieldData.setText("");
        jTextFieldResponsavel.setText("");
        jTextFieldDescricao.setText("");
        Situacao_os.setSelectedItem("");
        
        readJTable();
        
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Erro: BotaoSalvar Tela: AtenderChamado: " +ex.getMessage());
            
        }
        /*DefaultTableModel dtmDados = (DefaultTableModel) jTableAtenderChamado.getModel();
        String[] dados = {Numero_os.getText(), jTextFieldData.getText(), jTextFieldResponsavel.getText(), 
        jTextFieldDescricao.getText(), Situacao_os.getSelectedItem().toString()};
        dtmDados.addRow(dados);
        */
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTableAtenderChamadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAtenderChamadoMouseClicked
        
        if(jTableAtenderChamado.getSelectedRow() != -1){ // Se o Atendente selecionou uma linha da tabela ele exclui o dado //
        
        
         Numero_os.setText(jTableAtenderChamado.getValueAt(jTableAtenderChamado.getSelectedRow(), 1).toString());
         jTextFieldData.setText(jTableAtenderChamado.getValueAt(jTableAtenderChamado.getSelectedRow(), 2).toString());
         jTextFieldResponsavel.setText(jTableAtenderChamado.getValueAt(jTableAtenderChamado.getSelectedRow(), 3).toString());
         jTextFieldDescricao.setText(jTableAtenderChamado.getValueAt(jTableAtenderChamado.getSelectedRow(), 4).toString());
         Situacao_os.setSelectedItem(jTableAtenderChamado.getValueAt(jTableAtenderChamado.getSelectedRow(), 5).toString());
        
        }else{
            JOptionPane.showMessageDialog(null, "Erro ");
        }
        
    }//GEN-LAST:event_jTableAtenderChamadoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(jTableAtenderChamado.getSelectedRow() != -1){
        
        Gerenciador_OS g = new Gerenciador_OS();
        
        try {
        ClasseDAO dao = new ClasseDAO();
        
        g.setNumero_os(Numero_os.getText());
        g.setData_os(jTextFieldData.getText());
        g.setResponsavel_os(jTextFieldResponsavel.getText());
        g.setDescricao_os(jTextFieldDescricao.getText());
        g.setSituacao_os(Situacao_os.getSelectedItem().toString());
        g.setId((int)jTableAtenderChamado.getValueAt(jTableAtenderChamado.getSelectedRow(), 0));
        dao.update(g);
        
        Numero_os.setText("");
        jTextFieldData.setText("");
        jTextFieldResponsavel.setText("");
        jTextFieldDescricao.setText("");
        Situacao_os.setSelectedItem("");
        
        readJTable();
        
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Erro: BotaoSalvar Tela: AtenderChamado: " +ex.getMessage());
            
        }
          /*jTableAtenderChamado.setValueAt(Numero_os.getText(), jTableAtenderChamado.getSelectedRow(), 0);
            jTableAtenderChamado.setValueAt(jTextFieldData.getText(), jTableAtenderChamado.getSelectedRow(), 1);
            jTableAtenderChamado.setValueAt(jTextFieldResponsavel.getText(), jTableAtenderChamado.getSelectedRow(), 2);
            jTableAtenderChamado.setValueAt(jTextFieldDescricao.getText(), jTableAtenderChamado.getSelectedRow(), 3);
            jTableAtenderChamado.setValueAt(Situacao_os.getSelectedItem(), jTableAtenderChamado.getSelectedRow(), 4);
          */
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        Gerenciador_OS g = new Gerenciador_OS();
        
        try {
        ClasseDAO dao = new ClasseDAO();
        
        g.setNumero_os(Numero_os.getText());
        g.setData_os(jTextFieldData.getText());
        g.setResponsavel_os(jTextFieldResponsavel.getText());
        g.setDescricao_os(jTextFieldDescricao.getText());
        g.setSituacao_os(Situacao_os.getSelectedItem().toString());
        dao.inserir(g);
        
        Numero_os.setText("");
        jTextFieldData.setText("");
        jTextFieldResponsavel.setText("");
        jTextFieldDescricao.setText("");
        Situacao_os.setSelectedItem("");
        
        readJTable();
        
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Erro: BotaoSalvar Tela: AtenderChamado: " +ex.getMessage());
            
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTableAtenderChamadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableAtenderChamadoKeyReleased
        
        if (jTableAtenderChamado.getSelectedRow() != -1){
        
        Numero_os.setText(jTableAtenderChamado.getValueAt(jTableAtenderChamado.getSelectedRow(), 1).toString());
        jTextFieldData.setText(jTableAtenderChamado.getValueAt(jTableAtenderChamado.getSelectedRow(), 2).toString());
        jTextFieldResponsavel.setText(jTableAtenderChamado.getValueAt(jTableAtenderChamado.getSelectedRow(), 3).toString());
        jTextFieldDescricao.setText(jTableAtenderChamado.getValueAt(jTableAtenderChamado.getSelectedRow(), 4).toString());
        Situacao_os.setSelectedItem(jTableAtenderChamado.getValueAt(jTableAtenderChamado.getSelectedRow(), 5).toString());  
            
        }
        
    }//GEN-LAST:event_jTableAtenderChamadoKeyReleased

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
            java.util.logging.Logger.getLogger(TelaAtenderChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAtenderChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAtenderChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAtenderChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaAtenderChamado().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaAtenderChamado.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoMenu;
    private javax.swing.JLabel Logo;
    private javax.swing.JTextField Numero_os;
    private javax.swing.JComboBox<Object> Situacao_os;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAtenderChamado;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldResponsavel;
    // End of variables declaration//GEN-END:variables

    private static class dispose {

        public dispose() {
        }
    }
}
