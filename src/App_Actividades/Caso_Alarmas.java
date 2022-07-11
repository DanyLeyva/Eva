/** CASO ALARMAS.
 * Funciones:
 * - Mostrar las alarmas que tiene el usuario actual.
 * - Agregar una nueva alarma.
 * - Eliminar una alarma de un usuario.
 *
 * TODO: cambiar todos los numero 1 por el ID del usuario que estemos ocupando.
 * TODO: Corregir el error al obtener la hora
 */
package App_Actividades;

import App_Actividades_Clases.AccionesAlarmas;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Mendoza Castañeda José Ricardo
 */
public class Caso_Alarmas extends javax.swing.JFrame {

    private AccionesAlarmas acciones = new AccionesAlarmas();
    private DefaultTableModel model;
    private int id = 1; // Cambiarlo por el ID del usuario

    public Caso_Alarmas() {
        initComponents();
        model = (DefaultTableModel) table.getModel();
        this.limpiarTabla();
        this.consultarAlarmas();
    }

    public void limpiarTabla() {
        model.getDataVector().removeAllElements();
    }

    public void consultarAlarmas() {
        Vector<Object[]> alarmas = acciones.getAlarmas( id );
        for (int i = 0; i < alarmas.size(); i++)
        {
            Object[] alarm = alarmas.elementAt(i);
            model.addRow(alarm);
        }
        table.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_title = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        input_nombre = new javax.swing.JTextField();
        lbl_hora = new javax.swing.JLabel();
        input_hora = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btn_borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_title.setText("Agregar Alarma");

        lbl_nombre.setText("Nombre de la Alarma:");

        lbl_hora.setText("Hora a sonar: ");

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID: ", "Hora", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(table);

        btn_borrar.setText("Eliminar");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(lbl_title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nombre)
                    .addComponent(lbl_hora))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(input_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(input_hora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_agregar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_borrar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(input_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_hora)
                    .addComponent(input_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_borrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        String nombre = input_nombre.getText();
        String hora = input_hora.getText();

        boolean insertado = acciones.insertarAlarma(nombre, hora, id);
        if (insertado == true)
        {
            this.limpiarTabla();
            this.consultarAlarmas();
            JOptionPane.showMessageDialog(null, "Alarma Agregada :D");
        } else
        {
            JOptionPane.showMessageDialog(null, "ERROR - La alarma no se pudo insertar");
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        int row = table.getSelectedRow();
        int idEliminar = Integer.parseInt( table.getValueAt(row, 0).toString() );
       
        boolean eliminado = acciones.eliminarAlarma( idEliminar );
        if( eliminado == true ) {
            this.limpiarTabla();
            this.consultarAlarmas();
        }
        else {
            JOptionPane.showMessageDialog(null, "ERROR - La alarma no se pudo eliminar");
        }
    }//GEN-LAST:event_btn_borrarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Caso_Alarmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Caso_Alarmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Caso_Alarmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Caso_Alarmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caso_Alarmas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JTextField input_hora;
    private javax.swing.JTextField input_nombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_hora;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
