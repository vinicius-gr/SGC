/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menus;

/**
 *
 * @author Aline
 */
public class EncomendasMenuView extends javax.swing.JPanel {

    /**
     * Creates new form EncomendaMenuView
     */
    public EncomendasMenuView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadastroEncomendasjButton = new javax.swing.JButton();
        ListarEncomendasjButton = new javax.swing.JButton();

        CadastroEncomendasjButton.setText("Cadastro Encomendas");
        CadastroEncomendasjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroEncomendasjButtonActionPerformed(evt);
            }
        });

        ListarEncomendasjButton.setText("Listar Encomendas");
        ListarEncomendasjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarEncomendasjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(CadastroEncomendasjButton)
                .addGap(18, 18, 18)
                .addComponent(ListarEncomendasjButton)
                .addContainerGap(169, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadastroEncomendasjButton)
                    .addComponent(ListarEncomendasjButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CadastroEncomendasjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroEncomendasjButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CadastroEncomendasjButtonActionPerformed

    private void ListarEncomendasjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarEncomendasjButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListarEncomendasjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastroEncomendasjButton;
    private javax.swing.JButton ListarEncomendasjButton;
    // End of variables declaration//GEN-END:variables
}
