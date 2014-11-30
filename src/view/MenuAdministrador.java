
package view;

import controller.ComandoJanelaInterna;
import controller.Processador;
import javax.swing.JPanel;


public class MenuAdministrador extends javax.swing.JPanel implements ComandoJanelaInterna{

    MenuPrincipal menuPrincipal;
    public MenuAdministrador() {
        initComponents();
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btUsuarios = new javax.swing.JButton();
        btAutorizaCompra = new javax.swing.JButton();

        btUsuarios.setText("Usuários");
        btUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUsuariosActionPerformed(evt);
            }
        });

        btAutorizaCompra.setText("Autorizar Compras");
        btAutorizaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAutorizaCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btAutorizaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAutorizaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(252, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUsuariosActionPerformed
        
        Processador.alterarJanelaInterna("[GAP, Administrador, Usuários]",this.menuPrincipal);
        this.menuPrincipal.alteraJtree("Administrador","Usuários");
    }//GEN-LAST:event_btUsuariosActionPerformed

    private void btAutorizaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAutorizaCompraActionPerformed
        Processador.alterarJanelaInterna("[GAP, Administrador, Autorizar Compras]",this.menuPrincipal);
        this.menuPrincipal.alteraJtree("Administrador","Autorizar Compras");
    }//GEN-LAST:event_btAutorizaCompraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAutorizaCompra;
    private javax.swing.JButton btUsuarios;
    // End of variables declaration//GEN-END:variables

    @Override
    public JPanel buscarPainel() {
        return this;
    }

    @Override
    public void setMenuPrincipal(MenuPrincipal menuPrincipal) {
        this.menuPrincipal = menuPrincipal;
    }

 

    
}
