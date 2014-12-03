package view;

import controller.ComandoJanelaInterna;
import controller.Processador;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import model.Funcionario;
import model.dao.FuncionarioDAO;
import view.tabelas.TabelaFuncionario;

public class MenuFuncionario extends javax.swing.JPanel implements ComandoJanelaInterna {

    ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
    FuncionarioDAO funcionarioDao = new FuncionarioDAO();
    MenuPrincipal menuPrincipal;
    TabelaFuncionario tabela = new TabelaFuncionario();

    public MenuFuncionario() {
        initComponents();
        limparTabela();

    }

    public final void limparTabela() {

        //jtFuncionario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
        jtFuncionario.getTableHeader().setReorderingAllowed(false);
        jtFuncionario.setModel(this.tabela);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtFuncionario = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textUsuario = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        jtFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtFuncionario.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtFuncionario);

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Novo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuários");

        jButton4.setText("Pesquisar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String pequisa = textUsuario.getText();
        if (pequisa.equals("")) {
            buscarTodos();
        } else {
            buscarPorNome(pequisa);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Processador.abrirJanela("novoFuncionario");

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        editarFornecedor();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Funcionario funcionarioSelecionado;
        if (jtFuncionario.getSelectedRow() != -1) {

            if (JOptionPane.showConfirmDialog(null, "Deseja Excluir:", "AVISO", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
                String id = String.valueOf(jtFuncionario.getModel().getValueAt(jtFuncionario.getSelectedRow(), 0));
                int idFuncionario = Integer.valueOf(id);
                for (int i = 0; i < this.listaFuncionarios.size(); i++) {
                    if (this.listaFuncionarios.get(i).getIdFuncionario() == idFuncionario) {
                        funcionarioSelecionado = this.listaFuncionarios.get(i);
                        int teste = jtFuncionario.getSelectedRow();
                        this.tabela.removeFuncionarios(teste);
                        funcionarioDao.excluir(funcionarioSelecionado);
                        break;
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecionae uma linha", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtFuncionarioMouseClicked
        if (evt.getClickCount() == 2) {
            editarFornecedor();
        }
    }//GEN-LAST:event_jtFuncionarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtFuncionario;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables

    @Override
    public JPanel buscarPainel() {
        return this;
    }

    @Override
    public void setMenuPrincipal(MenuPrincipal menuPrincipal) {
        this.menuPrincipal = menuPrincipal;
    }

    public void buscarTodos() {
        this.listaFuncionarios = this.funcionarioDao.pequisarTodos();
        this.tabela.setFuncionario(this.listaFuncionarios);
        jtFuncionario.setModel(tabela);
    }

    public void buscarPorNome(String usuario) {
        this.listaFuncionarios = this.funcionarioDao.pesquisarUsuario(usuario);
        this.tabela.setFuncionario(this.listaFuncionarios);
        jtFuncionario.setModel(this.tabela);
    }

    public void editarFornecedor() {
        Funcionario funcionarioSelecionado;

        if (jtFuncionario.getSelectedRow() != -1) {
            String id = String.valueOf(jtFuncionario.getModel().getValueAt(jtFuncionario.getSelectedRow(), 0));
            int idFuncionario = Integer.valueOf(id);
            for (int i = 0; i < this.listaFuncionarios.size(); i++) {
                if (this.listaFuncionarios.get(i).getIdFuncionario() == idFuncionario) {
                    funcionarioSelecionado = this.listaFuncionarios.get(i);
                    Processador.abrirEditar("editarFuncionario", funcionarioSelecionado);
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecionae uma linha", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }
}
