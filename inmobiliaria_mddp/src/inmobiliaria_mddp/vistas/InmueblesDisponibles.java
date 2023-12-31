/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package inmobiliaria_mddp.vistas;

import inmobiliaria_mddp.accesoDatos.*;
import inmobiliaria_mddp.entidades.*;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pablo
 */
public class InmueblesDisponibles extends javax.swing.JInternalFrame {
private DefaultTableModel modelito = new DefaultTableModel();
    /**
     * Creates new form InmueblesDisponibles
     */
    public InmueblesDisponibles() {
        initComponents();
        //iniciales
        armarTabla();
        cargarTabla();
        JT_TablaDisponibles.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JB_Volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_TablaDisponibles = new javax.swing.JTable();

        JB_Volver.setText("Volver");
        JB_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_VolverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("INMUEBLES DISPONIBLES");

        JT_TablaDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JT_TablaDisponibles);
        if (JT_TablaDisponibles.getColumnModel().getColumnCount() > 0) {
            JT_TablaDisponibles.getColumnModel().getColumn(0).setResizable(false);
            JT_TablaDisponibles.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JB_Volver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_Volver))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_VolverActionPerformed
        JDesktopPane desk = this.getDesktopPane();
        desk.removeAll();
        desk.repaint();
        GestionInmuebles gi = new GestionInmuebles();
        gi.setVisible(true);
        desk.add(gi);
        desk.moveToFront(gi);
    }//GEN-LAST:event_JB_VolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Volver;
    private javax.swing.JTable JT_TablaDisponibles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

private void armarTabla(){
        modelito.addColumn("Codigo");
        modelito.addColumn("Direccion del inmueble");
        modelito.addColumn("Apellido");
        modelito.addColumn("Nombre");
        JT_TablaDisponibles.setModel(modelito);
        
    }

private void cargarTabla(){
    
    InmuebleData id = new InmuebleData();
    List<Inmueble> li = id.listarInmueblesDescopudadosOrdenCodigo();
    for(Inmueble i : li){
        String DireCompleta = i.getDireccion()+" "+i.getAltura();
        modelito.addRow(new Object []{i.getCodigo(), DireCompleta, i.getPropietario().getApellido(), i.getPropietario().getNombre()});
    }
}



}
