/** Panel Alarmas.
 * Mostrara la información de las alarmas
 */

package App_Actividades_Clases;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 * @author Mendoza Castañeda José Ricardo
 */

public class PanelAlarmas extends javax.swing.JPanel {
    private AccionesAlarmas acciones = new AccionesAlarmas();
    private int id = 1;
    private DefaultTableModel model;

    public PanelAlarmas( int id ) {
        initComponents();
        model = (DefaultTableModel) table.getModel();
        this.id = id;
        
        this.limpiarTabla();
        this.consultarAlarmas();
    }
    public void limpiarTabla() {
        model.getDataVector().removeAllElements();
    }
    public void consultarAlarmas() {
        Vector<Object[]> alarmas = acciones.getAlarmas( id );
        System.out.println( alarmas );
        for (int i = 0; i < alarmas.size(); i++)
        {
            Object[] alarm = alarmas.elementAt(i);
            model.addRow(alarm);
        }
        table.setModel(model);
        acciones.cerrarConexion();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 0, 0));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID: ", "Nombre:", "Hora:"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Información de las alarmas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

    }//GEN-LAST:event_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
