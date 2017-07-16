/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menus;

import control.View.Tela;

/**
 *
 * @author Aline
 */
public class EntradaSaidaMenuView extends javax.swing.JPanel {

    /**
     * Creates new form EntradaSaidaMenuView2
     */
    public EntradaSaidaMenuView(String permissao) {
        initComponents();
        
        if(permissao =="Morador" || permissao == "MoradorMestre"){
            this.CadastroVisitantejButton.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadastroVisitantejButton = new javax.swing.JButton();
        ListaVisitantejButton = new javax.swing.JButton();

        CadastroVisitantejButton.setText("Cadastro Visitante");
        CadastroVisitantejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroVisitantejButtonActionPerformed(evt);
            }
        });

        ListaVisitantejButton.setText("Lista Visitante");
        ListaVisitantejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaVisitantejButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(CadastroVisitantejButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ListaVisitantejButton)
                .addContainerGap(216, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadastroVisitantejButton)
                    .addComponent(ListaVisitantejButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CadastroVisitantejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroVisitantejButtonActionPerformed
        Tela.atualizaTela("CadastroVisitante");
    }//GEN-LAST:event_CadastroVisitantejButtonActionPerformed

    private void ListaVisitantejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaVisitantejButtonActionPerformed
         Tela.atualizaTela("ListarVisitantes");
    }//GEN-LAST:event_ListaVisitantejButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastroVisitantejButton;
    private javax.swing.JButton ListaVisitantejButton;
    // End of variables declaration//GEN-END:variables
}
