/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App_Menu;

import App_Menu_Clases.Caso_dos;
import App_Menu_Clases.Caso_tres;
import App_Menu_Clases.Confirmacion_config;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Caso_Tres extends javax.swing.JFrame {

    /**
     * Creates new form Caso_Tres
     */
    public Caso_Tres() {
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

        jLabel_PreguntaDespierta = new javax.swing.JLabel();
        jLabel_PreguntaDuerme = new javax.swing.JLabel();
        jTextField__PreguntaDespierta = new javax.swing.JTextField();
        jTextField__PreguntaDuerme = new javax.swing.JTextField();
        jLabel_FormatoTiempo = new javax.swing.JLabel();
        jLabel_TitutloAlarmas = new javax.swing.JLabel();
        jLabel_AvisoAlarmas = new javax.swing.JLabel();
        jButton_SaveAlarmas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_PreguntaDespierta.setText("¿A que hora te gusta despertarte(08:04 o 15:56) ?");

        jLabel_PreguntaDuerme.setText("¿A que hora te gusta dormirte(08:04 o 15:56) ?");

        jLabel_FormatoTiempo.setText("Formato de las alarmas: HH : MM ");

        jLabel_TitutloAlarmas.setText("Dime a que hora te gusta dormir y despertar");

        jLabel_AvisoAlarmas.setText("Recuerda que en cualquier momento puedes modificar las alarmas desde el menu!!!");

        jButton_SaveAlarmas.setText("Guardar");
        jButton_SaveAlarmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SaveAlarmasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_PreguntaDespierta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField__PreguntaDespierta)
                            .addComponent(jTextField__PreguntaDuerme)
                            .addComponent(jLabel_PreguntaDuerme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_FormatoTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel_TitutloAlarmas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel_AvisoAlarmas)))
                .addContainerGap(207, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton_SaveAlarmas)
                .addGap(373, 373, 373))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel_TitutloAlarmas)
                .addGap(18, 18, 18)
                .addComponent(jLabel_AvisoAlarmas)
                .addGap(82, 82, 82)
                .addComponent(jLabel_PreguntaDespierta)
                .addGap(18, 18, 18)
                .addComponent(jTextField__PreguntaDespierta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel_PreguntaDuerme)
                .addGap(18, 18, 18)
                .addComponent(jTextField__PreguntaDuerme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel_FormatoTiempo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jButton_SaveAlarmas)
                .addGap(93, 93, 93))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SaveAlarmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SaveAlarmasActionPerformed
        // Boton Guardar
        Caso_tres objeto = new Caso_tres();
        Confirmacion_config objeto2 = new Confirmacion_config();
        BD(); 
        objeto2.confirmacion = JOptionPane.showInputDialog(null, "Te gustaria configurar otra opcion?");
    }//GEN-LAST:event_jButton_SaveAlarmasActionPerformed

    Caso_tres con = new Caso_tres();
    Connection cn = (Connection) con.conexion();
    
    public void BD(){
        try{
          for(int i = 0; i < 1;i++){
              if(!jTextField__PreguntaDespierta.getText().equals("")){
             PreparedStatement pps = cn.prepareStatement("INSERT INTO caso_tres(alarma_desíerta,alarma_dormir,FK_usuario) VALUES(?,?,?)");
             pps.setString(1, jTextField__PreguntaDespierta.getText());
             pps.setString(2, jTextField__PreguntaDuerme.getText());
             pps.setString(3, Integer.toString(con.Usuarios));
             pps.executeUpdate();
             JOptionPane.showMessageDialog(null,"Alarmas guardados con exito!!!");
              }

              }
          con.Usuarios++;
        }catch(Exception ex){
            Logger.getLogger(Caso_Tres.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
    
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
            java.util.logging.Logger.getLogger(Caso_Tres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caso_Tres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caso_Tres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caso_Tres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caso_Tres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_SaveAlarmas;
    private javax.swing.JLabel jLabel_AvisoAlarmas;
    private javax.swing.JLabel jLabel_FormatoTiempo;
    private javax.swing.JLabel jLabel_PreguntaDespierta;
    private javax.swing.JLabel jLabel_PreguntaDuerme;
    private javax.swing.JLabel jLabel_TitutloAlarmas;
    private javax.swing.JTextField jTextField__PreguntaDespierta;
    private javax.swing.JTextField jTextField__PreguntaDuerme;
    // End of variables declaration//GEN-END:variables
}
