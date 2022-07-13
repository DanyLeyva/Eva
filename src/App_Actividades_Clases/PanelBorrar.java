/** CASO BORRAR.
 * Mostrara la Información de lo que se le mande 
 */
package App_Actividades_Clases;

import javax.swing.JOptionPane;

/**
 * @author Mendoza Castañeda José Ricardo
 */

public class PanelBorrar extends javax.swing.JPanel {

    private AccionesAlarmas metodos_alarmas = new AccionesAlarmas();
    private AccionesAyuda metodos_ayuda = new AccionesAyuda();
    private AccionesFamiliares metodos_familiar = new AccionesFamiliares();
    private AccionesMedicina metodos_medicina = new AccionesMedicina();
    private AccionesPasatiempos metodos_pasatiempos = new AccionesPasatiempos();
    
    private String key, value, caso, key1, value1;
    public int id;
    
    public PanelBorrar( String key, String value, String key2, String value2, int id, String caso ) {
        initComponents();
        
        this.key = key;
        this.value = value;
        this.id = id;
        this.caso = caso.toLowerCase();
        this.key1 = key1; 
        this.value1 = value1;
        
        this.mostrarInfo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_key = new javax.swing.JLabel();
        lbl_value = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        lbl_key1 = new javax.swing.JLabel();
        lbl_value1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 0, 0));

        lbl_key.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbl_key.setForeground(new java.awt.Color(255, 255, 255));
        lbl_key.setText("(Texto Negritas)");

        lbl_value.setFont(new java.awt.Font("Liberation Sans", 2, 18)); // NOI18N
        lbl_value.setForeground(new java.awt.Color(255, 255, 255));
        lbl_value.setText("(Valor)");

        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lbl_key1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbl_key1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_key1.setText("(Texto Negritas)");

        lbl_value1.setFont(new java.awt.Font("Liberation Sans", 2, 18)); // NOI18N
        lbl_value1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_value1.setText("(Valor)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_key)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_value))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_key1)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_value1)))
                        .addGap(0, 263, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_key)
                    .addComponent(lbl_value))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_key1)
                    .addComponent(lbl_value1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        boolean eliminado = false;
        
        if( caso.equals("familiares") ) {
            eliminado = metodos_pasatiempos.eliminar( id );
        }
        if( caso.equals("pasatiempos") ) {
            eliminado = metodos_pasatiempos.eliminar( id );
        }
        if( caso.equals("medicinas") ) {
            eliminado = metodos_medicina.eliminar( id );
        }
        if( caso.equals("alarmas") ) {
            eliminado = metodos_alarmas.eliminar( id );
        }
        if( caso.equals("numeros") ) {
            eliminado = metodos_ayuda.eliminar( id );
        }
        
        if( !eliminado ) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar " + id);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void mostrarInfo() {
        lbl_key.setText( this.key + ": ");
        lbl_value.setText( this.value );
        
        lbl_key1.setText( this.key1 + ": ");
        lbl_value1.setText( this.value1 );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel lbl_key;
    private javax.swing.JLabel lbl_key1;
    private javax.swing.JLabel lbl_value;
    private javax.swing.JLabel lbl_value1;
    // End of variables declaration//GEN-END:variables
}
