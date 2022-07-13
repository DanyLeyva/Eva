/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package App_Menu;

import App_Menu_Clases.Caso_dos;
import App_Menu_Clases.Caso_uno;
import App_Menu_Clases.ConexionBD;
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
public class Caso_Dos extends javax.swing.JFrame {

    /** Creates new form Caso_Dos */
    public Caso_Dos() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_TituloPasatiempo = new javax.swing.JLabel();
        jLabel_Pasatiempo1 = new javax.swing.JLabel();
        jTextField_Pasatiempo = new javax.swing.JTextField();
        jLabel_AvisoPasatiempos = new javax.swing.JLabel();
        jButton_SavePasatiempo = new javax.swing.JButton();
        jLabel_BirthdayPesona2 = new javax.swing.JLabel();
        jComboBox_Hour = new javax.swing.JComboBox<>();
        jComboBox_Min = new javax.swing.JComboBox<>();
        jComboBox_Seg = new javax.swing.JComboBox<>();
        jButton_BorrarPasatiempo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(866, 591));

        jLabel_TituloPasatiempo.setText("Escribe tus pasatiempo preferidos");

        jLabel_Pasatiempo1.setText("Pasatiempo");

        jLabel_AvisoPasatiempos.setText("Recuerda que en cualquier momento puedes agregar mas pasatiempos desde el menu!!!");

        jButton_SavePasatiempo.setText("Guardar");
        jButton_SavePasatiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SavePasatiempoActionPerformed(evt);
            }
        });

        jLabel_BirthdayPesona2.setText("Hora a recordar");

        jComboBox_Hour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hour", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));

        jComboBox_Min.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Min", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jComboBox_Seg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seg", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jButton_BorrarPasatiempo.setText("Borrar");
        jButton_BorrarPasatiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BorrarPasatiempoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel_TituloPasatiempo)
                        .addGap(316, 316, 316))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel_AvisoPasatiempos, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel_Pasatiempo1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_Pasatiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jButton_SavePasatiempo)
                .addGap(169, 169, 169)
                .addComponent(jButton_BorrarPasatiempo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(160, 160, 160)
                    .addComponent(jLabel_BirthdayPesona2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(44, 44, 44)
                    .addComponent(jComboBox_Hour, 0, 128, Short.MAX_VALUE)
                    .addGap(2, 2, 2)
                    .addComponent(jComboBox_Min, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jComboBox_Seg, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(160, 160, 160)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel_TituloPasatiempo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_AvisoPasatiempos)
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Pasatiempo1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Pasatiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 324, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_SavePasatiempo)
                    .addComponent(jButton_BorrarPasatiempo))
                .addGap(30, 30, 30))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(282, 282, 282)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_BirthdayPesona2)
                        .addComponent(jComboBox_Hour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox_Min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox_Seg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(283, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SavePasatiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SavePasatiempoActionPerformed
        // Boton Save
        Caso_dos objeto = new Caso_dos();
        Confirmacion_config objeto2 = new Confirmacion_config();
        BD();
        objeto2.confirmacion = JOptionPane.showInputDialog(null, "Te gustaria configurar otra opcion?");
        Vacia();
    }//GEN-LAST:event_jButton_SavePasatiempoActionPerformed

    private void jButton_BorrarPasatiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BorrarPasatiempoActionPerformed
        // Boton Borrar
        BDB();
    }//GEN-LAST:event_jButton_BorrarPasatiempoActionPerformed

    public void Vacia(){
    jTextField_Pasatiempo.setText("");
    jComboBox_Hour.setSelectedItem("Hour");
    jComboBox_Min.setSelectedItem("Min");
    jComboBox_Seg.setSelectedItem("Seg");}
    String Horas,Minutos,Segundos;
    public void ObtenTiempo(){
        Horas = (String) jComboBox_Hour.getSelectedItem();
        Minutos = (String) jComboBox_Min.getSelectedItem();
        Segundos = (String) jComboBox_Seg.getSelectedItem();}
    
    Caso_dos con = new Caso_dos();
    Connection cn = (Connection) con.conexion();
    
    public void BD(){
        ObtenTiempo();
         try{
          for(int i = 0; i < 1;i++){
              if(!jTextField_Pasatiempo.getText().equals("")){
             PreparedStatement pps = cn.prepareStatement("INSERT INTO caso_dos(hobbie,alarma_pasatienpo,FK_usuario) VALUES(?,?,?)");
             pps.setString(1, jTextField_Pasatiempo.getText());
             pps.setString(2, Horas+":"+Minutos+":"+Segundos);
             pps.setString(3, Integer.toString(con.Usuarios));
             pps.executeUpdate();
             
              }
              
          }
        }catch(Exception ex){
            Logger.getLogger(Caso_Dos.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
    
    public void BDB(){
         try{
          for(int i = 0; i < 1;i++){
              if(!jTextField_Pasatiempo.getText().equals("")){
             PreparedStatement pps = cn.prepareStatement("delete from caso_dos where hobbie='"+jTextField_Pasatiempo.getText()+"'");
             pps.executeUpdate();
              }
              
          }
        }catch(Exception ex){
            Logger.getLogger(Caso_Dos.class.getName()).log(Level.SEVERE, null,ex);
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
            java.util.logging.Logger.getLogger(Caso_Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caso_Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caso_Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caso_Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caso_Dos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_BorrarPasatiempo;
    private javax.swing.JButton jButton_SavePasatiempo;
    private javax.swing.JComboBox<String> jComboBox_Hour;
    private javax.swing.JComboBox<String> jComboBox_Min;
    private javax.swing.JComboBox<String> jComboBox_Seg;
    private javax.swing.JLabel jLabel_AvisoPasatiempos;
    private javax.swing.JLabel jLabel_BirthdayPesona2;
    private javax.swing.JLabel jLabel_Pasatiempo1;
    private javax.swing.JLabel jLabel_TituloPasatiempo;
    private javax.swing.JTextField jTextField_Pasatiempo;
    // End of variables declaration//GEN-END:variables

}
