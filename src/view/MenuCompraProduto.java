package view;

import controller.ComandoJanelaInterna;
import controller.Processador;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Compra;
import model.dao.CompraDAO;
import view.tabelas.TabelaCompra;

public class MenuCompraProduto extends javax.swing.JPanel implements ComandoJanelaInterna {

    ArrayList<Compra> lista = new ArrayList<>();
    CompraDAO dao = new CompraDAO();
    MenuPrincipal menuPrincipal;
    TabelaCompra tabela = new TabelaCompra();
    Compra selecionado;

    public MenuCompraProduto() {
        initComponents();
        limparTabela();

    }

    public final void limparTabela() {
        jt.getTableHeader().setReorderingAllowed(false);
        jt.setModel(this.tabela);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textPesquisa = new javax.swing.JTextField();
        btPesquisa = new javax.swing.JButton();

        jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jt.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt);

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btNovo.setText("Nova");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        jLabel1.setText("Compras");

        btPesquisa.setText("Pesquisar");
        btPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisaActionPerformed(evt);
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
                        .addComponent(textPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesquisa)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btExcluir)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisa)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEditar)
                    .addComponent(btExcluir)
                    .addComponent(btNovo))
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

    private void btPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaActionPerformed
        String pequisa = textPesquisa.getText();
        if (pequisa.equals("")) {
            buscarTodos();
        } else {
            buscarPorNome(pequisa);
        }
    }//GEN-LAST:event_btPesquisaActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed

        Processador.abrirJanela("novaCompra");

    }//GEN-LAST:event_btNovoActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        editar();
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed

        ;
        if (jt.getSelectedRow() != -1) {

            if (JOptionPane.showConfirmDialog(null, "Deseja Excluir:", "AVISO", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
                String id = String.valueOf(jt.getModel().getValueAt(jt.getSelectedRow(), 0));
                int idSelecionado = Integer.valueOf(id);
                for (int i = 0; i < this.lista.size(); i++) {
                    if (this.lista.get(i).getIdCompra()== idSelecionado) {
                        this.selecionado = this.lista.get(i);
                        int linha = jt.getSelectedRow();
                        this.tabela.removeCompras(linha);
                        this.dao.excluir(this.selecionado);
                        break;
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecionae uma linha", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void jtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMouseClicked
        if (evt.getClickCount() == 2) {
            editar();
        }
    }//GEN-LAST:event_jtMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt;
    private javax.swing.JTextField textPesquisa;
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
        this.lista = this.dao.pequisarTodos();
        this.tabela.setCompra(this.lista);
        jt.setModel(tabela);
    }

    public void buscarPorNome(String busca) {
        this.lista = this.dao.pesquisar(busca);
        this.tabela.setCompra(this.lista);
        jt.setModel(this.tabela);
    }

    public void editar() {
        

        if (jt.getSelectedRow() != -1) {
            String id = String.valueOf(jt.getModel().getValueAt(jt.getSelectedRow(), 0));
            int idSelecionado = Integer.valueOf(id);
            for (int i = 0; i < this.lista.size(); i++) {
                if (this.lista.get(i).getIdCompra() == idSelecionado) {
                    this.selecionado = this.lista.get(i);
                    Processador.abrirEditar("editarCompra", this.selecionado);
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecionae uma linha", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }
}
