/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App_Menu;

import App_Menu_Clases.Caso_cuatro;
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
public class Caso_Cuatro extends javax.swing.JFrame {

    /**
     * Creates new form Caso_Cuatro
     */
    public Caso_Cuatro() {
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

        jLabel_TituloNumeros = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_NumeroPersona1 = new javax.swing.JLabel();
        jTextField_NumberPersona1 = new javax.swing.JTextField();
        jLabel_NamePesona1 = new javax.swing.JLabel();
        jLabel_KinshipPesona1 = new javax.swing.JLabel();
        jLabel_BirthdayPesona1 = new javax.swing.JLabel();
        jTextField_NamePersona1 = new javax.swing.JTextField();
        jTextField_KinshipPersona1 = new javax.swing.JTextField();
        jButton_SaveNumber = new javax.swing.JButton();
        jButton_Borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_TituloNumeros.setText("Añade numeros de familiares o amigos en caso de emergencia");

        jLabel1.setText("Recuerda que en cualquier momento puedes agregar mas numeros de emergencia desde el menu!!!");

        jLabel_NumeroPersona1.setText("Persona 1");

        jLabel_NamePesona1.setText("Nombre");

        jLabel_KinshipPesona1.setText("Parentesco");

        jLabel_BirthdayPesona1.setText("Numero");

        jButton_SaveNumber.setText("Guardar");
        jButton_SaveNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SaveNumberActionPerformed(evt);
            }
        });

        jButton_Borrar.setText("Borrar");
        jButton_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(jLabel_NumeroPersona1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel_TituloNumeros))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel_KinshipPesona1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_NamePesona1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_BirthdayPesona1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_NumberPersona1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_KinshipPersona1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_NamePersona1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jButton_SaveNumber)
                        .addGap(214, 214, 214)
                        .addComponent(jButton_Borrar)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel_TituloNumeros)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addComponent(jLabel_NumeroPersona1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_NamePesona1)
                    .addComponent(jTextField_NamePersona1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_KinshipPesona1)
                    .addComponent(jTextField_KinshipPersona1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_BirthdayPesona1)
                    .addComponent(jTextField_NumberPersona1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_SaveNumber)
                    .addComponent(jButton_Borrar))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SaveNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SaveNumberActionPerformed
        // Boton Save
        Caso_cuatro objeto = new Caso_cuatro();
        Confirmacion_config objeto2 = new Confirmacion_config();
        BD();
        objeto2.confirmacion = JOptionPane.showInputDialog(null, "Te gustaria configurar otra opcion?");
        Vacia();
    }//GEN-LAST:event_jButton_SaveNumberActionPerformed

    private void jButton_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BorrarActionPerformed
        // Boton borrar
        BDB();
    }//GEN-LAST:event_jButton_BorrarActionPerformed
    Caso_cuatro con = new Caso_cuatro(); 
    Connection cn = (Connection) con.conexion();
    
    public void Vacia(){
    jTextField_NamePersona1.setText("");
    jTextField_KinshipPersona1.setText("");
    jTextField_NumberPersona1.setText("");}
    
    public void BD(){
        
        try{
          for(int i = 0; i < 1;i++){
             if(!jTextField_NamePersona1.getText().equals("")){
        PreparedStatement pps = cn.prepareStatement("INSERT INTO caso_cuatro(nombre,parentesco,numero,FK_usuario) VALUES(?,?,?,?)");
             pps.setString(1, jTextField_NamePersona1.getText());
             pps.setString(2, jTextField_KinshipPersona1.getText());
             pps.setString(3, jTextField_NumberPersona1.getText());
             pps.setString(4, Integer.toString(con.Usuarios));
             pps.executeUpdate();
             JOptionPane.showMessageDialog(null,"Contactos de emergencia guardados con exito!!!");
              }
              }
        }catch(Exception ex){
            Logger.getLogger(Caso_Cuatro.class.getName()).log(Level.SEVERE, null,ex);
        }
        
    }
    
    public void BDB(){
        try{
          for(int i = 0; i < 1;i++){
              if(!jTextField_NamePersona1.getText().equals("")){
             PreparedStatement pps = cn.prepareStatement("delete from caso_cuatro where nombre='"+jTextField_NamePersona1.getText()+"'");
             pps.executeUpdate();
             JOptionPane.showMessageDialog(null,"Contacto borrado con exito!!!");
              }
              
          }
        }catch(Exception ex){
            Logger.getLogger(Caso_Cuatro.class.getName()).log(Level.SEVERE, null,ex);
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
            java.util.logging.Logger.getLogger(Caso_Cuatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caso_Cuatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caso_Cuatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caso_Cuatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caso_Cuatro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Borrar;
    private javax.swing.JButton jButton_SaveNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_BirthdayPesona1;
    private javax.swing.JLabel jLabel_KinshipPesona1;
    private javax.swing.JLabel jLabel_NamePesona1;
    private javax.swing.JLabel jLabel_NumeroPersona1;
    private javax.swing.JLabel jLabel_TituloNumeros;
    private javax.swing.JTextField jTextField_KinshipPersona1;
    public javax.swing.JTextField jTextField_NamePersona1;
    private javax.swing.JTextField jTextField_NumberPersona1;
    // End of variables declaration//GEN-END:variables
}
