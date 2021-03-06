package controller;

import java.util.HashMap;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import view.MenuPrincipal;

public class Processador {

    private static final HashMap comandos = new HashMap();

    static {
        comandos.put("principal", "view.MenuPrincipal");
        comandos.put("usuarios", "view.MenuFuncionario");
        
        comandos.put("[GAP]", "view.MenuInicial");
        
        comandos.put("[GAP, Administrador]", "view.MenuAdministrador");
        comandos.put("[GAP, Administrador, Usuários]", "view.MenuFuncionario");
        comandos.put("[GAP, Administrador, Autorizar Compras]", "view.MenuAutorizaCompra");
        
        comandos.put("[GAP, Vendas]", "view.MenuVenda");
        comandos.put("[GAP, Vendas, Clientes]", "view.MenuCliente");
        comandos.put("[GAP, Vendas, Vender Produto]", "view.MenuVenderProduto");
        
        comandos.put("[GAP, Compras]", "view.MenuCompra");
        comandos.put("[GAP, Compras, Estoque]", "view.MenuEstoque");
        comandos.put("[GAP, Compras, Fornecedores]", "view.MenuFornecedor");
        comandos.put("[GAP, Compras, Comprar Produto]", "view.MenuCompraProduto");
       
        comandos.put("novoFuncionario", "view.NovoFuncionario");
        comandos.put("editarFuncionario", "view.EditorFuncionario");
        
        comandos.put("novoCliente", "view.NovoCliente");
        comandos.put("editarCliente", "view.EditorCliente");
        
        comandos.put("novoFornecedor", "view.NovoFornecedor");
        comandos.put("editarFornecedor", "view.EditorFornecedor");
        
        comandos.put("novoProduto", "view.NovoProduto");
        comandos.put("editarProduto", "view.EditorProduto");
        
        comandos.put("novaCompra", "view.NovaCompra");
        comandos.put("editarCompra", "view.EditorCompra");
        
    }

    public static void alterarJanelaInterna(String cmd, MenuPrincipal menuPrincipal) {
        String actionClass = (String) comandos.get(cmd);
        //Cria a instância da classe utilizando introspecção
        try {
            Class classe = Class.forName(actionClass);
            ComandoJanelaInterna comando = (ComandoJanelaInterna) classe.newInstance();
            comando.setMenuPrincipal(menuPrincipal);
            menuPrincipal.getjDesktopPane1().setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
            menuPrincipal.getjDesktopPane1().removeAll();
            menuPrincipal.repaint();
            comando.buscarPainel().setSize(menuPrincipal.getjDesktopPane1().getSize());
            menuPrincipal.getjDesktopPane1().add(comando.buscarPainel());
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (InstantiationException iex) {
            JOptionPane.showMessageDialog(null, "Erro" + " detalhes: " + iex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalAccessException iaex) {
            JOptionPane.showMessageDialog(null, "Erro" + " detalhes: " + iaex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void abrirJanela(String cmd) {
        String actionClass = (String) comandos.get(cmd);
        //Cria a instância da classe utilizando introspecção
        try {
            Class classe = Class.forName(actionClass);
            ComandoJanela comando = (ComandoJanela) classe.newInstance();
            comando.abrirJanelas();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (InstantiationException iex) {
            JOptionPane.showMessageDialog(null, "Erro" + " detalhes: " + iex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalAccessException iaex) {
            JOptionPane.showMessageDialog(null, "Erro" + " detalhes: " + iaex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public static void abrirEditar(String cmd, Object obj) {
        String actionClass = (String) comandos.get(cmd);
        //Cria a instância da classe utilizando introspecção
        try {
            Class classe = Class.forName(actionClass);
            ComandoJanela comando = (ComandoJanela) classe.newInstance();
            comando.abrirJanelas(obj);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (InstantiationException iex) {
            JOptionPane.showMessageDialog(null, "Erro" + " detalhes: " + iex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalAccessException iaex) {
            JOptionPane.showMessageDialog(null, "Erro" + " detalhes: " + iaex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
