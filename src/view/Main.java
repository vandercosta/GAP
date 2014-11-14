
package view;



import java.util.ArrayList;
import model.Cliente;
import model.Fornecedor;
import model.Produto;
import model.Venda;

public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        Fornecedor fornecedor1 = new Fornecedor();
        Cliente cliente1 = new Cliente();
        Produto produto1 = new Produto();

        int op = 1;
        switch(op){
            
       
            
            case 1: 
                String nomeFornecedor = javax.swing.JOptionPane.showInputDialog(null, "Digite o Nome do Fornecedor:");
                    String telefoneFornecedor = javax.swing.JOptionPane.showInputDialog(null, "Digite o Telefone:");
                    int codFornecedor = 1;
                  //  Fornecedor fornecedor = new Fornecedor(codFornecedor,nomeFornecedor,telefoneFornecedor);
                    fornecedor1.setNome(nomeFornecedor);
                    fornecedor1.setTelefone(telefoneFornecedor);
                    fornecedor1.setIdFornecedor(codFornecedor);
                    break;
        
            case 2: String nomeCliente = javax.swing.JOptionPane.showInputDialog(null, "Digite o Nome do Cliente:");
                    String telefoneCliente = javax.swing.JOptionPane.showInputDialog(null, "Digite o Telefone:");
                    String cpfCliente = javax.swing.JOptionPane.showInputDialog(null, "Digite o cpf:");
                    int codCliente = 1;
                //    Cliente cliente = new Cliente(codCliente,nomeCliente,telefoneCliente,cpfCliente);
                    cliente1.setNome(nomeCliente);
                    cliente1.setTelefone(telefoneCliente);
                    cliente1.setCpf(cpfCliente);
                    cliente1.setIdCliente(codCliente);
                    break;
        
            case 3: String nomeProduto = javax.swing.JOptionPane.showInputDialog(null, "Nome do Produto:");
                    String tipoProduto = javax.swing.JOptionPane.showInputDialog(null, "Tipo do Produto:");
                    String marcaProduto = javax.swing.JOptionPane.showInputDialog(null, "informe marca:");
                    String valorProduto = javax.swing.JOptionPane.showInputDialog(null, "informe valor:");
                    String qtdProduto = javax.swing.JOptionPane.showInputDialog(null, "informe a quantidade:");
                    double valor = Double.parseDouble(valorProduto);
                    int qtd = Integer.parseInt(qtdProduto);
                    int codProduto =1;
                 //   Produto produto = new Produto(codProduto, nomeProduto, tipoProduto, marcaProduto, valor, fornecedor1, qtd); 
                    produto1.setNome(nomeProduto);
                    produto1.setModelo(tipoProduto);
                    produto1.setNome(marcaProduto);
                    produto1.setValor(valor);
                    produto1.setQuantidade(qtd);
                    produto1.setIdProduto(codProduto);
                    listaProdutos.add(produto1);
                    break;
                
            case 4:
                
                   break;
        }
                Venda venda = new Venda(1, "19-09-2014", cliente1, 400, listaProdutos);
        
        
        
    }
    
}
