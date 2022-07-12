
package App_Actividades_Clases;

/**
 * @author Mendoza Castañeda José Ricardo
 */

public class Familiar extends javax.swing.JPanel {
    private String nombre, parentesco, cumple;

    public Familiar( String nombre, String parentesco, String cumple ) {
        initComponents();
        this.nombre = nombre;
        this.parentesco = parentesco;
        this.cumple = cumple;
        
        this.mostrarFamiliares();
    }
    public void mostrarFamiliares() {
        lblFamiliar.setText( this.nombre + " es tu " + this.parentesco );
        lblFecha.setText( this.cumple );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl1 = new javax.swing.JLabel();
        lblFamiliar = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lbl1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbl1.setForeground(new java.awt.Color(0, 0, 0));
        lbl1.setText("Familiar: ");

        lblFamiliar.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lblFamiliar.setForeground(new java.awt.Color(0, 0, 0));
        lblFamiliar.setText("(nombre) es tu (parentesco)");

        lbl2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbl2.setForeground(new java.awt.Color(0, 0, 0));
        lbl2.setText("Cumpleaños:");

        lblFecha.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(0, 0, 0));
        lblFecha.setText("(Fecha)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFamiliar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl2)
                        .addGap(18, 18, 18)
                        .addComponent(lblFecha)))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(lblFamiliar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(lblFecha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblFamiliar;
    private javax.swing.JLabel lblFecha;
    // End of variables declaration//GEN-END:variables
}
