
package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Produto;
import model.dao.ProdutoDAO;
import view.tabelas.TabelaProduto;


public class InsereProduto extends javax.swing.JFrame {

    
    ArrayList<Produto> lista = new ArrayList<>();
    ProdutoDAO dao = new ProdutoDAO();
    TabelaProduto tabela = new TabelaProduto();
    Produto selecionado;
    NovaCompra novaCompra;
 
    public InsereProduto(NovaCompra novaCompra) {
        initComponents();
        limparTabela();
        this.novaCompra = novaCompra;
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
        jLabel1 = new javax.swing.JLabel();
        textPesquisa = new javax.swing.JTextField();
        btPesquisa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textQ = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jt.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jt);

        btEditar.setText("Inserir");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        jLabel1.setText("Produto");

        btPesquisa.setText("Pesquisar");
        btPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisaActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantidade");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textQ, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 399, Short.MAX_VALUE)
                .addComponent(btEditar)
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btPesquisa)
                            .addGap(340, 340, 340))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                            .addGap(32, 32, 32)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(346, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(textQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btEditar))
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btPesquisa)
                        .addComponent(jLabel1))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(83, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        editar();
    }//GEN-LAST:event_btEditarActionPerformed

    private void btPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaActionPerformed
        String pequisa = textPesquisa.getText();
        if (pequisa.equals("")) {
            buscarTodos();
        } else {
            buscarPorNome(pequisa);
        }
    }//GEN-LAST:event_btPesquisaActionPerformed


     public void buscarTodos() {
        this.lista = this.dao.pequisarTodos();
        this.tabela.setProduto(this.lista);
        jt.setModel(tabela);
    }

    public void buscarPorNome(String busca) {
        this.lista = this.dao.pesquisar(busca);
        this.tabela.setProduto(this.lista);
        jt.setModel(this.tabela);
    }
    
    
    public void editar() {
        if (jt.getSelectedRow() != -1) {
            String id = String.valueOf(jt.getModel().getValueAt(jt.getSelectedRow(), 0));
            int idSelecionado = Integer.valueOf(id);
            for (int i = 0; i < this.lista.size(); i++) {
                if (this.lista.get(i).getIdProduto()== idSelecionado) {
                    this.selecionado = this.lista.get(i);
                    this.novaCompra.alterarTabela(this.selecionado, Integer.valueOf(textQ.getText()));
                    
                    dispose();
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecionae uma linha", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt;
    private javax.swing.JTextField textPesquisa;
    private javax.swing.JTextField textQ;
    // End of variables declaration//GEN-END:variables
}
