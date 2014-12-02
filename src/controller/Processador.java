package controller;

import java.awt.PopupMenu;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JDesktopPane;
import view.MenuPrincipal;

public class Processador {

    private static final HashMap comandos = new HashMap();

    static {
        comandos.put("principal", "view.MenuPrincipal");
        comandos.put("usuarios", "view.MenuUsuario");
        
        comandos.put("[GAP]", "view.MenuInicial");
        
        comandos.put("[GAP, Administrador]", "view.MenuAdministrador");
        comandos.put("[GAP, Administrador, Usuários]", "view.MenuUsuario");
        comandos.put("[GAP, Administrador, Autorizar Compras]", "view.MenuAutorizaCompra");
        
        comandos.put("[GAP, Vendas]", "view.MenuVenda");
        comandos.put("[GAP, Vendas, Clientes]", "view.MenuCliente");
        comandos.put("[GAP, Vendas, Vender Produto]", "view.MenuVenderProduto");
        
        comandos.put("[GAP, Compras]", "view.MenuCompra");
        comandos.put("[GAP, Compras, Estoque]", "view.MenuEstoque");
        comandos.put("[GAP, Compras, Fornecedores]", "view.MenuFornecedor");
        comandos.put("[GAP, Compras, Comprar Produto]", "view.MenuComprarProduto");
        
        
        comandos.put("novoFuncionario", "view.NovoFuncionario");
        
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
            System.out.println(ex);
        } catch (InstantiationException iex) {
            System.out.println(iex);
        } catch (IllegalAccessException iaex) {
            System.out.println(iaex);
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
            System.out.println(ex);
        } catch (InstantiationException iex) {
            System.out.println(iex);
        } catch (IllegalAccessException iaex) {
            System.out.println(iaex);
        }
    }
    
    
    public static void abrirNovo(String cmd) {
        String actionClass = (String) comandos.get(cmd);
        //Cria a instância da classe utilizando introspecção
        try {
            Class classe = Class.forName(actionClass);
            ComandoNovo comando = (ComandoNovo) classe.newInstance();
            comando.abrirNovo();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (InstantiationException iex) {
            System.out.println(iex);
        } catch (IllegalAccessException iaex) {
            System.out.println(iaex);
        }
    }

}
