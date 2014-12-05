package view;

import controller.ComandoJanela;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import model.Compra;
import model.Fornecedor;
import model.Funcionario;
import model.Produto;
import model.dao.CompraDAO;
import model.dao.FornecedorDAO;
import model.dao.FuncionarioDAO;
import view.tabelas.TabelaProduto;

public class NovaCompra extends javax.swing.JFrame implements ComandoJanela {

    SimpleDateFormat formatoData = new SimpleDateFormat("dd-MMM-yy");
    CompraDAO dao = new CompraDAO();
    TabelaProduto tabela = new TabelaProduto();
    ArrayList<Produto> lista = new ArrayList<>();
    
    ArrayList<Integer> quanti = new ArrayList<>();
    Produto selecionado;

    public NovaCompra() {
        initComponents();
        listar();
        jt.setModel(this.tabela);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        textData = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        comboFun = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        comboFornecedor = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        labelValor = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Cadastrar Nova compra");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações"));

        textData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textDataKeyTyped(evt);
            }
        });

        jLabel4.setText("Data");

        jLabel7.setText("Total");

        jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jt);

        jLabel2.setText("Funcionario");

        comboFun.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar..." }));

        jLabel3.setText("Fornecedor");

        comboFornecedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar..." }));

        jButton2.setText("Inserir Produto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        labelValor.setText("0");

        jButton3.setText("remover");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textData, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboFun, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(86, 86, 86)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelValor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(labelValor))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton2)
                                .addComponent(jButton3))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(textData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(comboFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
          
            double valorTotal = Double.valueOf(labelValor.getText());

            String dataCompra = textData.getText();
            Calendar dCompra = Calendar.getInstance();
            dCompra.setTime(this.formatoData.parse(dataCompra));

            int idFuncionario = comboFun.getSelectedIndex();
            String nomeFuncionario = comboFun.getSelectedItem().toString();

            int idFornecedor = comboFornecedor.getSelectedIndex();
            String nomeFornecedor = comboFornecedor.getSelectedItem().toString();

            Funcionario funcionario = new Funcionario(idFuncionario, nomeFuncionario);
            Fornecedor fornecedor = new Fornecedor(idFornecedor, nomeFornecedor);

            Compra obj = new Compra(dCompra, fornecedor, valorTotal, funcionario);

            this.dao.inserir(obj);
            dispose();
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Informações incorretas!" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void textDataKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textDataKeyTyped

        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_textDataKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        InsereProduto novoProd = new InsereProduto(this);
        novoProd.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        removerProduto();
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboFornecedor;
    private javax.swing.JComboBox comboFun;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt;
    private javax.swing.JLabel labelValor;
    private javax.swing.JTextField textData;
    // End of variables declaration//GEN-END:variables

    @Override
    public void abrirJanelas() {
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void abrirJanelas(Object obj) {
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void listar() {
        FuncionarioDAO funDao = new FuncionarioDAO();
        ArrayList<Funcionario> listaFuncionarios;

        listaFuncionarios = funDao.pequisarTodos();

        for (int i = 0; i < listaFuncionarios.size(); i++) {
            comboFun.addItem(listaFuncionarios.get(i).getNomeUsuario());

        }

        FornecedorDAO forDao = new FornecedorDAO();
        ArrayList<Fornecedor> listaFornecedores;

        listaFornecedores = forDao.pequisarTodos();

        for (int i = 0; i < listaFornecedores.size(); i++) {
            comboFornecedor.addItem(listaFornecedores.get(i).getNome());

        }

    }
    
    
    public void removerProduto(){
        if (jt.getSelectedRow() != -1) {

            if (JOptionPane.showConfirmDialog(null, "Deseja Excluir:", "AVISO", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
                String id = String.valueOf(jt.getModel().getValueAt(jt.getSelectedRow(), 0));
                int idSelecionado = Integer.valueOf(id);
                for (int i = 0; i < this.lista.size(); i++) {
                    if (this.lista.get(i).getIdProduto() == idSelecionado) {
                        this.selecionado = this.lista.get(i);
                        int linha = jt.getSelectedRow();
                        this.tabela.removeProdutos(linha);
                        this.dao.excluir(this.selecionado);
                        this.lista.remove(i);
                        atualizaValor();
                        break;
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecionae uma linha", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void alterarTabela(Produto produto, int quantidade){
        this.quanti.add(quantidade);
        this.lista.add(produto);
        this.tabela.inserirProduto(produto);
        jt.setModel(this.tabela);
        atualizaValor();
    }
    
    public void atualizaValor(){
        double valor = 0;
        for(int i=0; i<lista.size();i++){
            valor += lista.get(i).getValor()*this.quanti.get(i);
        }
        labelValor.setText(String.valueOf(valor));
    }
}
