/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria_mddp.vistas;

import inmobiliaria_mddp.accesoDatos.CalquilerData;
import inmobiliaria_mddp.accesoDatos.InmuebleData;
import inmobiliaria_mddp.entidades.Calquiler;
import inmobiliaria_mddp.entidades.Inmueble;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marti
 */
public class GestionCalquiListaInmu extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form GestionCalquiListaInmu
     */
    public GestionCalquiListaInmu() {
        initComponents();
        cargarComboInmu();
        armarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jL_listaXInmu = new javax.swing.JLabel();
        jL_inmu = new javax.swing.JLabel();
        jCB_inmu = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_tablaCalquiInmu = new javax.swing.JTable();
        jB_imprimir = new javax.swing.JButton();
        jB_salir = new javax.swing.JButton();

        jL_listaXInmu.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jL_listaXInmu.setText("LISTA DE CONTRATOS DE ALQUILER por INMUEBLE");

        jL_inmu.setText("Inmueble:");

        jCB_inmu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_inmuActionPerformed(evt);
            }
        });

        jT_tablaCalquiInmu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jT_tablaCalquiInmu.setEnabled(false);
        jScrollPane1.setViewportView(jT_tablaCalquiInmu);

        jB_imprimir.setText("Imprimir");
        jB_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_imprimirActionPerformed(evt);
            }
        });

        jB_salir.setText("Salir");
        jB_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_listaXInmu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jL_inmu)
                                .addGap(44, 44, 44)
                                .addComponent(jCB_inmu, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jB_imprimir)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jB_salir))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_listaXInmu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_inmu)
                    .addComponent(jCB_inmu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_imprimir)
                    .addComponent(jB_salir))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_imprimirActionPerformed
        JOptionPane.showMessageDialog(this, "Simula menu de impresión");
    }//GEN-LAST:event_jB_imprimirActionPerformed

    private void jB_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_salirActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "¿Salir de esta ventana?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) 
        {
            // con dispose salimos del internal frame. Para salir x completo: "System.exit(0);"
            this.dispose();
        }
    }//GEN-LAST:event_jB_salirActionPerformed

    private void jCB_inmuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_inmuActionPerformed
        //capturar item
        //cargar tabla
        modelo.setRowCount(0); //limpio tabla para no acumular entradas
        Inmueble inmuSelec = (Inmueble) jCB_inmu.getSelectedItem();
        //instancio para acceder a metodo lista
        CalquilerData calquiData = new CalquilerData();
        List<Calquiler> calquis = calquiData.historialPorInmueble(inmuSelec.getIdInmueble());
        
        for (Calquiler aux : calquis)
        {
            modelo.addRow(new Object []{aux.getIdContrato(), aux.getFechaIni(), aux.getFechaFin(), aux.getPrecioAlquiler(), aux.getEstado(), aux.getInquilino().getNomCom()});
        }
    }//GEN-LAST:event_jCB_inmuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_imprimir;
    private javax.swing.JButton jB_salir;
    private javax.swing.JComboBox<Inmueble> jCB_inmu;
    private javax.swing.JLabel jL_inmu;
    private javax.swing.JLabel jL_listaXInmu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jT_tablaCalquiInmu;
    // End of variables declaration//GEN-END:variables

    private void cargarComboInmu()
    {
        //instanciar un InmuebleData para acceder a sus métodos
        InmuebleData inmuData = new InmuebleData();
        List<Inmueble> inmuList = inmuData.listarInmuebles();
        //con un for each -enhanced for- voy agregando al comboBox
        for (Inmueble aux : inmuList)
        {
            jCB_inmu.addItem(aux);
        }
    }
    
    private void armarCabecera()
    {
        modelo.addColumn("ID");
        modelo.addColumn("Inicio");
        modelo.addColumn("Fin");
        modelo.addColumn("Precio");
        modelo.addColumn("Estado");
        modelo.addColumn("Inquilino");
        
        jT_tablaCalquiInmu.setModel(modelo);
    }
}
