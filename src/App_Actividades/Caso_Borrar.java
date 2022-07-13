/** CASO_BORRAR.
 * Mostrara la información de todos los casos y podra eliminarlos cuando se requiera
 */
package App_Actividades;

import App_Actividades_Clases.AccionesAlarmas;
import App_Actividades_Clases.AccionesAyuda;
import App_Actividades_Clases.AccionesFamiliares;
import App_Actividades_Clases.AccionesMedicina;
import App_Actividades_Clases.AccionesPasatiempos;
import App_Actividades_Clases.Familiar;
import App_Actividades_Clases.PanelBorrar;
import java.awt.BorderLayout;
import java.util.Vector;

/**
 * @author Mendoza Castañeda José Ricardo
 * 
 * En el 0 - ID,
 * En el 1 - Valor1
 * En el 2 - VAlor2
 */

public class Caso_Borrar extends javax.swing.JFrame {
    
    private AccionesAlarmas metodos_alarmas = new AccionesAlarmas();
    private AccionesAyuda metodos_ayuda = new AccionesAyuda();
    private AccionesFamiliares metodos_familiar = new AccionesFamiliares();
    private AccionesMedicina metodos_medicina = new AccionesMedicina();
    private AccionesPasatiempos metodos_pasatiempos = new AccionesPasatiempos();
    
    private int id = 1;
    private String caso;
    
    public Caso_Borrar() {
        initComponents();
    }

    public void mostrarData( Vector<Object[]> vector, String key1, String key2 ) {
        int posY = 0;
        
        panel_principal.removeAll();
        
        for( int i = 0; i < vector.size(); i++ ) {
            Object[] data = vector.elementAt( i );
            PanelBorrar panel = new PanelBorrar( key1, data[1].toString(), key2, data[2].toString(), Integer.parseInt( data[0].toString() ), this.caso );
            
            panel.setSize(520, 70);
            panel.setLocation( 0, posY);
            
            posY += 126;
            panel_principal.add( panel, BorderLayout.CENTER );
        }
        panel_principal.revalidate();
        panel_principal.repaint();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_titulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_actions = new javax.swing.JPanel();
        btnNumeros = new javax.swing.JButton();
        btnFam = new javax.swing.JButton();
        btnPasatiempos = new javax.swing.JButton();
        btnMedicinas = new javax.swing.JButton();
        btnAlarmas = new javax.swing.JButton();
        panel_info = new javax.swing.JPanel();
        lbl_tipo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel_principal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_titulo.setBackground(new java.awt.Color(102, 0, 0));

        jLabel1.setText("BORRAR ");

        javax.swing.GroupLayout panel_tituloLayout = new javax.swing.GroupLayout(panel_titulo);
        panel_titulo.setLayout(panel_tituloLayout);
        panel_tituloLayout.setHorizontalGroup(
            panel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tituloLayout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jLabel1)
                .addContainerGap(359, Short.MAX_VALUE))
        );
        panel_tituloLayout.setVerticalGroup(
            panel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tituloLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(panel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        panel_actions.setBackground(new java.awt.Color(204, 0, 0));

        btnNumeros.setText("Numeros de Ayuda");

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

        javax.swing.GroupLayout panel_actionsLayout = new javax.swing.GroupLayout(panel_actions);
        panel_actions.setLayout(panel_actionsLayout);
        panel_actionsLayout.setHorizontalGroup(
            panel_actionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_actionsLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(panel_actionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNumeros, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_actionsLayout.createSequentialGroup()
                        .addGroup(panel_actionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAlarmas)
                            .addComponent(btnMedicinas))
                        .addGap(40, 40, 40)))
                .addGap(21, 21, 21))
            .addGroup(panel_actionsLayout.createSequentialGroup()
                .addGroup(panel_actionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_actionsLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnPasatiempos))
                    .addGroup(panel_actionsLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnFam)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_actionsLayout.setVerticalGroup(
            panel_actionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_actionsLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(btnFam)
                .addGap(18, 18, 18)
                .addComponent(btnPasatiempos)
                .addGap(26, 26, 26)
                .addComponent(btnMedicinas)
                .addGap(24, 24, 24)
                .addComponent(btnAlarmas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNumeros)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        getContentPane().add(panel_actions, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 210, 400));

        panel_info.setBackground(new java.awt.Color(255, 51, 51));

        lbl_tipo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tipo.setText("Borrar (Caso a Borrar)");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel_principal.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout panel_principalLayout = new javax.swing.GroupLayout(panel_principal);
        panel_principal.setLayout(panel_principalLayout);
        panel_principalLayout.setHorizontalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
        panel_principalLayout.setVerticalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panel_principal);

        javax.swing.GroupLayout panel_infoLayout = new javax.swing.GroupLayout(panel_info);
        panel_info.setLayout(panel_infoLayout);
        panel_infoLayout.setHorizontalGroup(
            panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_infoLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(lbl_tipo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        panel_infoLayout.setVerticalGroup(
            panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_infoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_tipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
        );

        getContentPane().add(panel_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 490, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFamActionPerformed
        Vector<Object[]> datos = metodos_familiar.getFamiliares(id);
        this.caso = "familiares";
        this.mostrarData(datos, "familiar", "cumpleaños");
    }//GEN-LAST:event_btnFamActionPerformed

    private void btnPasatiemposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasatiemposActionPerformed

    }//GEN-LAST:event_btnPasatiemposActionPerformed

    private void btnMedicinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicinasActionPerformed

    }//GEN-LAST:event_btnMedicinasActionPerformed

    private void btnAlarmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlarmasActionPerformed

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
            java.util.logging.Logger.getLogger(Caso_Borrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caso_Borrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caso_Borrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caso_Borrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caso_Borrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlarmas;
    private javax.swing.JButton btnFam;
    private javax.swing.JButton btnMedicinas;
    private javax.swing.JButton btnNumeros;
    private javax.swing.JButton btnPasatiempos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_tipo;
    private javax.swing.JPanel panel_actions;
    private javax.swing.JPanel panel_info;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JPanel panel_titulo;
    // End of variables declaration//GEN-END:variables
}
