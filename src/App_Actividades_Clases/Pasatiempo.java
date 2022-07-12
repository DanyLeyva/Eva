
package App_Actividades_Clases;

/**
 * @author Mendoza Castañeda José Ricardo
 */

public class Pasatiempo extends javax.swing.JPanel {
    private String hobbie, hora;

    public Pasatiempo( String hobbie, String hora ) {
        initComponents();
        this.hobbie = hobbie;
        this.hora = hora;
        
        this.mostrarFamiliares();
    }
    public void mostrarFamiliares() {
        lblHobbie.setText( this.hobbie );
        lblHora.setText( this.hora );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl1 = new javax.swing.JLabel();
        lblHobbie = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lbl1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbl1.setForeground(new java.awt.Color(0, 0, 0));
        lbl1.setText("Hobbie: ");

        lblHobbie.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lblHobbie.setForeground(new java.awt.Color(0, 0, 0));
        lblHobbie.setText("(nombre)");

        lbl2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbl2.setForeground(new java.awt.Color(0, 0, 0));
        lbl2.setText("Hora:");

        lblHora.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lblHora.setForeground(new java.awt.Color(0, 0, 0));
        lblHora.setText("(Fecha)");

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
                        .addComponent(lblHobbie))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl2)
                        .addGap(18, 18, 18)
                        .addComponent(lblHora)))
                .addContainerGap(352, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(lblHobbie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(lblHora))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblHobbie;
    private javax.swing.JLabel lblHora;
    // End of variables declaration//GEN-END:variables
}
