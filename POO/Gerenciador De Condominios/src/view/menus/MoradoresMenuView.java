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
public class MoradoresMenuView extends javax.swing.JPanel {

    /**
     * Creates new form MoradoreMenuView
     */
    public MoradoresMenuView(String permissao) {
        initComponents();
        
        if(permissao == "Porteiro" || permissao == "Morador"){
            this.CadastrarMoradorjButton.setVisible(false);
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

        CadastrarMoradorjButton = new javax.swing.JButton();
        ListarMoradorjButton = new javax.swing.JButton();

        CadastrarMoradorjButton.setText("Cadastrar Morador");

        ListarMoradorjButton.setText("Consultar Moradores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(CadastrarMoradorjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListarMoradorjButton)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadastrarMoradorjButton)
                    .addComponent(ListarMoradorjButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarMoradorjButton;
    private javax.swing.JButton ListarMoradorjButton;
    // End of variables declaration//GEN-END:variables
}
