/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Pessoa;
import Controller.PessoaDAO;

public class Cadastro extends javax.swing.JInternalFrame {

    public Cadastro() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) TabelaPessoa.getModel();
        TabelaPessoa.setRowSorter(new TableRowSorter(modelo));
        readJTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSobrenome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNascimento = new javax.swing.JFormattedTextField();
        BtnAdicionar = new javax.swing.JButton();
        BtnAtualizar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaPessoa = new javax.swing.JTable();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("Nome:");

        jLabel2.setText("Sobrenome:");

        jLabel3.setText("Data de Nascimento");

        try {
            txtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        BtnAdicionar.setText("Add");
        BtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdicionarActionPerformed(evt);
            }
        });

        BtnAtualizar.setText("Atualizar");
        BtnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtualizarActionPerformed(evt);
            }
        });

        BtnExcluir.setText("Excluir");
        BtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(txtSobrenome, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(txtNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnAdicionar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnExcluir)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNascimento))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAtualizar)
                    .addComponent(BtnExcluir)
                    .addComponent(BtnAdicionar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        TabelaPessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Sobrenome", "Data Nascimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaPessoaMouseClicked(evt);
            }
        });
        TabelaPessoa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaPessoaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaPessoa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdicionarActionPerformed
        Pessoa p = new Pessoa();
        PessoaDAO dao = new PessoaDAO();
        p.setNome(txtNome.getText());
        p.setSobrenome(txtSobrenome.getText());
        p.setDatanascimento(txtNascimento.getText());
        dao.create(p);
        
        txtNome.setText("");
        txtSobrenome.setText("");
        txtNascimento.setText("");
        txtNome.requestFocus();
        
        readJTable();
    }//GEN-LAST:event_BtnAdicionarActionPerformed

    private void BtnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtualizarActionPerformed
        if (TabelaPessoa.getSelectedRow() != -1) {
            Pessoa p = new Pessoa();
            PessoaDAO dao = new PessoaDAO();
            p.setNome(txtNome.getText());
            p.setSobrenome(txtSobrenome.getText());
            p.setDatanascimento(txtNascimento.getText());
            p.setId((int)TabelaPessoa.getValueAt(TabelaPessoa.getSelectedRow(), 0));
            dao.update(p);

            txtNome.setText("");
            txtSobrenome.setText("");
            txtNascimento.setText("");
            txtNome.requestFocus();

            readJTable();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma Pessoa para Alterar.");
        }

        
    }//GEN-LAST:event_BtnAtualizarActionPerformed

    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed
        if (TabelaPessoa.getSelectedRow() != -1) {
            Pessoa p = new Pessoa();
            PessoaDAO dao = new PessoaDAO();

            p.setId((int)TabelaPessoa.getValueAt(TabelaPessoa.getSelectedRow(), 0));
            dao.delete(p);

            txtNome.setText("");
            txtSobrenome.setText("");
            txtNascimento.setText("");
            txtNome.requestFocus();
            
            readJTable();
            
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma Pessoa para excluir.");
        }
    }//GEN-LAST:event_BtnExcluirActionPerformed

    private void TabelaPessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaPessoaMouseClicked
        if (TabelaPessoa.getSelectedRow() != -1) {
            txtNome.setText(TabelaPessoa.getValueAt(TabelaPessoa.getSelectedRow(), 1).toString());
            txtSobrenome.setText(TabelaPessoa.getValueAt(TabelaPessoa.getSelectedRow(), 2).toString());
            txtNascimento.setText(TabelaPessoa.getValueAt(TabelaPessoa.getSelectedRow(), 3).toString());
        }
    }//GEN-LAST:event_TabelaPessoaMouseClicked

    private void TabelaPessoaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaPessoaKeyReleased
        if (TabelaPessoa.getSelectedRow() != -1) {
            txtNome.setText(TabelaPessoa.getValueAt(TabelaPessoa.getSelectedRow(), 1).toString());
            txtSobrenome.setText(TabelaPessoa.getValueAt(TabelaPessoa.getSelectedRow(), 2).toString());
            txtNascimento.setText(TabelaPessoa.getValueAt(TabelaPessoa.getSelectedRow(), 3).toString());
        }
    }//GEN-LAST:event_TabelaPessoaKeyReleased

    public void readJTable() {
        //função para ler o banco de dados e adicionar os itens na tabela do Programa
        DefaultTableModel modelo = (DefaultTableModel) TabelaPessoa.getModel();
        modelo.setNumRows(0);
        PessoaDAO pdao = new PessoaDAO();
        for (Pessoa p : pdao.read()) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getSobrenome(),
                p.getDatanascimento()
            });
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdicionar;
    private javax.swing.JButton BtnAtualizar;
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JTable TabelaPessoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables
}
