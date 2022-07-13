
package App_Actividades_Clases;

import java.awt.BorderLayout;
import java.util.Vector;

/**
 * @author Mendoza Castañeda José Ricardo
 */

public class PanelPasatiempos extends javax.swing.JPanel {
    private AccionesPasatiempos metodos = new AccionesPasatiempos();
    private int id;
    
    public PanelPasatiempos( int id ) {
        initComponents();
        this.id = id;
        this.mostrarHobbies();
    }
    public void mostrarHobbies() {
        Vector<Object[]> hobbies= metodos.getPasatiempos( id );
        int posY = 0;
        
        panelInfo.removeAll();
        
        for( int i = 0; i < hobbies.size(); i++ ) {
            Object[] hobbie = hobbies.elementAt( i );
            Pasatiempo panel = new Pasatiempo( hobbie[1].toString(), hobbie[2].toString() );
            panel.setSize(520, 70);
            panel.setLocation( 0, posY);
            
            posY += 72;
            panelInfo.add( panel, BorderLayout.CENTER );
        }
        panelInfo.revalidate();
        panelInfo.repaint();
        
        metodos.cerrarConexion();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelInfo = new javax.swing.JPanel();

        setBackground(new java.awt.Color(102, 0, 102));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Información Pasatiempos");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 409, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panelInfo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelInfo;
    // End of variables declaration//GEN-END:variables
}
