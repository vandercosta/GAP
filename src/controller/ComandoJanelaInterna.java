
package controller;

import javax.swing.JPanel;
import view.MenuPrincipal;


public interface ComandoJanelaInterna {
    
    JPanel buscarPainel();
    void setMenuPrincipal(MenuPrincipal menuPrincipal);
}
