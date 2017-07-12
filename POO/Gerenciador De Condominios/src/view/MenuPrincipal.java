/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.BorderFactory;

/**
 *
 * @author aline.lima
 */
public class MenuPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form TesteMenu
     */
    public MenuPrincipal( String t) {
        initComponents();
      
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        if(t=="Porteiro"){
            this.financeiroMenuButton.setVisible(false);
            this.moradoresMenuButton.setVisible(false);
            this.reservasMenuButton.setVisible(false);
            this.funcionarioMenuButton.setVisible(false);
        }else if(t=="Morador"){
            this.moradoresMenuButton.setVisible(false);
            this.financeiroMenuButton.setVisible(false);
            this.entradaSaidaMenuButton.setVisible(false);
            this.encomendasMenuButton.setVisible(false);
            this.funcionarioMenuButton.setVisible(false);
        }else if(t == "MoradorMestre"){
            this.entradaSaidaMenuButton.setVisible(false);
            this.encomendasMenuButton.setVisible(false);
            this.funcionarioMenuButton.setVisible(false);
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

        moradoresMenuButton = new javax.swing.JButton();
        funcionarioMenuButton = new javax.swing.JButton();
        financeiroMenuButton = new javax.swing.JButton();
        entradaSaidaMenuButton = new javax.swing.JButton();
        encomendasMenuButton = new javax.swing.JButton();
        reservasMenuButton = new javax.swing.JButton();
        infoPessoaisMenuButton = new javax.swing.JButton();
        reclamacoesMenuButton = new javax.swing.JButton();
        LogoutMenuButton = new javax.swing.JButton();

        moradoresMenuButton.setText("Moradores");
        
        funcionarioMenuButton.setText("Funcionários");

        financeiroMenuButton.setText("Financeiro");

        entradaSaidaMenuButton.setText("Entrada/Saída");
        
        encomendasMenuButton.setText("Encomendas");

        reservasMenuButton.setText("Reservas");

        infoPessoaisMenuButton.setText("Inf. Pessoais");
        
        reclamacoesMenuButton.setText("Reclamações");

        LogoutMenuButton.setText("Logout");
     

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entradaSaidaMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(encomendasMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(financeiroMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(moradoresMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(funcionarioMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reservasMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(infoPessoaisMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reclamacoesMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LogoutMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(moradoresMenuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(funcionarioMenuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(financeiroMenuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(entradaSaidaMenuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(encomendasMenuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reservasMenuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(infoPessoaisMenuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reclamacoesMenuButton)
                .addGap(18, 18, 18)
                .addComponent(LogoutMenuButton)
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutMenuButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutMenuButtonActionPerformed

    private void entradaSaidaMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaSaidaMenuButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaSaidaMenuButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoutMenuButton;
    private javax.swing.JButton financeiroMenuButton;
    private javax.swing.JButton infoPessoaisMenuButton;
    private javax.swing.JButton moradoresMenuButton;
    private javax.swing.JButton funcionarioMenuButton;
    private javax.swing.JButton entradaSaidaMenuButton;
    private javax.swing.JButton encomendasMenuButton;
    private javax.swing.JButton reservasMenuButton;
    private javax.swing.JButton reclamacoesMenuButton;
    // End of variables declaration//GEN-END:variables
}
