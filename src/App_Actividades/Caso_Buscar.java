/** CASO BUSCAR.
 * Su objetivo es buscar la información que desee ver el usuario de la base de datos.
 * Hay 5 casos en los cuales el usuario podra ver la información. 
 */
package App_Actividades;

import App_Actividades_Clases.PanelAlarmas;
import App_Actividades_Clases.PanelFamiliares;
import App_Actividades_Clases.PanelMedicinas;
import App_Actividades_Clases.PanelPasatiempos;
import java.awt.BorderLayout;


/**
 * @author Mendoza Castañeda José Ricardo
 */

public class Caso_Buscar extends javax.swing.JFrame {
    public int id = 1;

    public Caso_Buscar() {
        initComponents();
        
        lblTitle.setText(" Buscar Información de ID: " + id);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneltitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        panelBtns = new javax.swing.JPanel();
        btnFam = new javax.swing.JButton();
        btnPasatiempos = new javax.swing.JButton();
        btnMedicinas = new javax.swing.JButton();
        btnAlarmas = new javax.swing.JButton();
        panelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paneltitle.setBackground(new java.awt.Color(51, 51, 51));

        lblTitle.setFont(new java.awt.Font("Liberation Sans", 0, 26)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Buscar Información");

        javax.swing.GroupLayout paneltitleLayout = new javax.swing.GroupLayout(paneltitle);
        paneltitle.setLayout(paneltitleLayout);
        paneltitleLayout.setHorizontalGroup(
            paneltitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltitleLayout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(lblTitle)
                .addContainerGap(370, Short.MAX_VALUE))
        );
        paneltitleLayout.setVerticalGroup(
            paneltitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltitleLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitle)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        panelBtns.setBackground(new java.awt.Color(153, 0, 0));

        btnFam.setText("Familiares");
        btnFam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFamActionPerformed(evt);
            }
        });

        btnPasatiempos.setText("Pasatiempos");
        btnPasatiempos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasatiemposActionPerformed(evt);
            }
        });

        btnMedicinas.setText("Medicinas");
        btnMedicinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicinasActionPerformed(evt);
            }
        });

        btnAlarmas.setText("Alarmas");
        btnAlarmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlarmasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBtnsLayout = new javax.swing.GroupLayout(panelBtns);
        panelBtns.setLayout(panelBtnsLayout);
        panelBtnsLayout.setHorizontalGroup(
            panelBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnsLayout.createSequentialGroup()
                .addGroup(panelBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBtnsLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnFam))
                    .addGroup(panelBtnsLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(panelBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAlarmas)
                            .addComponent(btnMedicinas)))
                    .addGroup(panelBtnsLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnPasatiempos)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        panelBtnsLayout.setVerticalGroup(
            panelBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnsLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnFam)
                .addGap(26, 26, 26)
                .addComponent(btnPasatiempos)
                .addGap(18, 18, 18)
                .addComponent(btnMedicinas)
                .addGap(18, 18, 18)
                .addComponent(btnAlarmas)
                .addContainerGap(251, Short.MAX_VALUE))
        );

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneltitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBtns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paneltitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBtns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFamActionPerformed
        PanelFamiliares panel = new PanelFamiliares( id );
        panel.setSize(545, 441);
        panel.setLocation( 1, 1 );
        
        panelPrincipal.removeAll();
        panelPrincipal.add( panel, BorderLayout.CENTER );
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_btnFamActionPerformed

    private void btnPasatiemposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasatiemposActionPerformed
        PanelPasatiempos panel = new PanelPasatiempos( id );
        panel.setSize(545, 441);
        panel.setLocation( 1, 1 );
        
        panelPrincipal.removeAll();
        panelPrincipal.add( panel, BorderLayout.CENTER );
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_btnPasatiemposActionPerformed

    private void btnMedicinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicinasActionPerformed
        PanelMedicinas panel = new PanelMedicinas( id );
        panel.setSize(545, 441);
        panel.setLocation( 1, 1 );
        
        panelPrincipal.removeAll();
        panelPrincipal.add( panel, BorderLayout.CENTER );
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_btnMedicinasActionPerformed

    private void btnAlarmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlarmasActionPerformed
        PanelAlarmas panel = new PanelAlarmas( id );
        panel.setSize(545, 441);
        panel.setLocation( 1, 1 );
        
        panelPrincipal.removeAll();
        panelPrincipal.add( panel, BorderLayout.CENTER );
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_btnAlarmasActionPerformed

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
            java.util.logging.Logger.getLogger(Caso_Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caso_Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caso_Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caso_Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caso_Buscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlarmas;
    private javax.swing.JButton btnFam;
    private javax.swing.JButton btnMedicinas;
    private javax.swing.JButton btnPasatiempos;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelBtns;
    public static javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel paneltitle;
    // End of variables declaration//GEN-END:variables
}
