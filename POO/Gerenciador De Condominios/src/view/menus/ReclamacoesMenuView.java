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
public class ReclamacoesMenuView extends javax.swing.JPanel {

    /**
     * Creates new form reclamacoesMenuView
     */
    public ReclamacoesMenuView() {
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

        RegistrarReclamacoesjButton = new javax.swing.JButton();
        VisualizarReclamacoesjButton = new javax.swing.JButton();
        ResponderReclamacoesjButton = new javax.swing.JButton();

        RegistrarReclamacoesjButton.setText("Registar Reclamações");

        VisualizarReclamacoesjButton.setText("Visualizar Reclamações");

        ResponderReclamacoesjButton.setText("Responder Reclamações");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ResponderReclamacoesjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RegistrarReclamacoesjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VisualizarReclamacoesjButton)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegistrarReclamacoesjButton)
                    .addComponent(VisualizarReclamacoesjButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(ResponderReclamacoesjButton))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegistrarReclamacoesjButton;
    private javax.swing.JButton ResponderReclamacoesjButton;
    private javax.swing.JButton VisualizarReclamacoesjButton;
    // End of variables declaration//GEN-END:variables
}
