/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App_Interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Caso_Actividades extends javax.swing.JFrame {

    /**
     * Creates new form Caso_Actividades
     */
    public Caso_Actividades() {
        initComponents();
        setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Menu = new javax.swing.JButton();
        jButton_Ayuda = new javax.swing.JButton();
        jButton_Alarmas = new javax.swing.JButton();
        jButton_Buscar = new javax.swing.JButton();
        jButton_AcercaEva = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_Menu.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_Menu.setText("Menú");

        jButton_Ayuda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_Ayuda.setText("Ayuda (muestra contactos de emergencia)");

        jButton_Alarmas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_Alarmas.setText("Alarmas programadas");
        jButton_Alarmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AlarmasActionPerformed(evt);
            }
        });

        jButton_Buscar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_Buscar.setText("Buscar (informacion ingresada en el menú)");
        jButton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarActionPerformed(evt);
            }
        });

        jButton_AcercaEva.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_AcercaEva.setText("Acerca de Eva");
        jButton_AcercaEva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AcercaEvaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Ayuda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Alarmas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_AcercaEva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Ayuda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Alarmas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_AcercaEva)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AlarmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AlarmasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_AlarmasActionPerformed

    private void jButton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_BuscarActionPerformed

    private void jButton_AcercaEvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AcercaEvaActionPerformed
        // Muestra informacion sobre Eva
        Caso_InicioV llamaInicio = new Caso_InicioV();

        dispose();

        JOptionPane.showMessageDialog(null, "Mi nombre es Eva y fui programada para \n ayudar a gente con alzheimer leve o moderado ");
        JOptionPane.showMessageDialog(null, "Mi objetivo es convertirme en una inteligencia artificial \n y así poder ayudar más a las personas");
        JOptionPane.showMessageDialog(null, "Por lo mientras estaré para apoyarte con \n lo que esté dentro de mis posibilidades, un gusto ");

        setVisible(true);
    }//GEN-LAST:event_jButton_AcercaEvaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Caso_Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caso_Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caso_Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caso_Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caso_Actividades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AcercaEva;
    private javax.swing.JButton jButton_Alarmas;
    private javax.swing.JButton jButton_Ayuda;
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JButton jButton_Menu;
    // End of variables declaration//GEN-END:variables
}
