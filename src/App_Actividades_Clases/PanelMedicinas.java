
package App_Actividades_Clases;

import java.awt.BorderLayout;
import java.util.Vector;

/**
 * @author Mendoza Castañeda José Ricardo
 */
public class PanelMedicinas extends javax.swing.JPanel {
    private AccionesMedicina metodos = new AccionesMedicina();
    private int id;
    
    public PanelMedicinas( int id ) {
        initComponents();
        this.id = id;
        this.mostrarMedicinas();
        
    }
    public void mostrarMedicinas() {
        Vector<Object[]> medicinas = metodos.getMedicinas( id );
        int posY = 0;
        
        panelInfo.removeAll();
        
        for( int i = 0; i < medicinas.size(); i++ ) {
            Object[] medicina = medicinas.elementAt( i );
            Medicina panel = new Medicina( medicina[1].toString(), medicina[2].toString() );
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

        lbltitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelInfo = new javax.swing.JPanel();

        setBackground(new java.awt.Color(51, 153, 0));

        lbltitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbltitulo.setText("Información Medicinas");

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
                .addGap(192, 192, 192)
                .addComponent(lbltitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JPanel panelInfo;
    // End of variables declaration//GEN-END:variables
}
