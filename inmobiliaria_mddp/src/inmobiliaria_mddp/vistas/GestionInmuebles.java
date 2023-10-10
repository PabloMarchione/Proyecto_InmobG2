
package inmobiliaria_mddp.vistas;
import inmobiliaria_mddp.accesoDatos.*;
import inmobiliaria_mddp.entidades.*;
import java.util.List;


public class GestionInmuebles extends javax.swing.JInternalFrame {

    
    public GestionInmuebles() {
        initComponents();
        //Iniciales
        cargarListaPropietarios();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JT_Codigo = new javax.swing.JTextField();
        JT_Direccion = new javax.swing.JTextField();
        JT_Altura = new javax.swing.JTextField();
        JT_Tipo = new javax.swing.JTextField();
        JT_Superficie = new javax.swing.JTextField();
        JT_Precio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JC_ListaPropietarios = new javax.swing.JComboBox<>();
        JB_Nuevo = new javax.swing.JButton();
        JB_Guardar = new javax.swing.JButton();
        JB_Eliminar = new javax.swing.JButton();
        JB_Buscar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Gestion de inmuebles");
        setName(""); // NOI18N

        JT_Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_CodigoActionPerformed(evt);
            }
        });

        JT_Direccion.setEnabled(false);
        JT_Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_DireccionActionPerformed(evt);
            }
        });

        JT_Altura.setEnabled(false);

        JT_Tipo.setEnabled(false);

        JT_Superficie.setEnabled(false);

        JT_Precio.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("CONTROL DE INMUEBLES");

        jLabel2.setText("Codigo :");

        jLabel3.setText("Direccion :");

        jLabel4.setText("Altura :");

        jLabel5.setText("Tipo :");

        jLabel6.setText("Superficie :");

        jLabel7.setText("Propietario :");

        jLabel8.setText("Precio :");

        JC_ListaPropietarios.setSelectedIndex(-1);
        JC_ListaPropietarios.setEnabled(false);
        JC_ListaPropietarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JC_ListaPropietariosActionPerformed(evt);
            }
        });

        JB_Nuevo.setText("Nuevo");
        JB_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_NuevoActionPerformed(evt);
            }
        });

        JB_Guardar.setText("Guardar");
        JB_Guardar.setEnabled(false);
        JB_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_GuardarActionPerformed(evt);
            }
        });

        JB_Eliminar.setText("Eliminar");
        JB_Eliminar.setEnabled(false);

        JB_Buscar.setText("Buscar");
        JB_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(JB_Nuevo))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JT_Codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(JT_Superficie)
                            .addComponent(JT_Tipo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JT_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(JT_Precio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                .addComponent(JT_Altura, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(JB_Guardar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JB_Buscar)
                            .addGap(35, 35, 35)
                            .addComponent(JB_Eliminar))
                        .addComponent(JC_ListaPropietarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JT_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JT_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JT_Altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JT_Superficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(JT_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JC_ListaPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_Nuevo)
                    .addComponent(JB_Guardar)
                    .addComponent(JB_Eliminar)
                    .addComponent(JB_Buscar))
                .addGap(38, 38, 38))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {JT_Altura, JT_Codigo, JT_Direccion, JT_Precio, JT_Superficie, JT_Tipo});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JT_DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_DireccionActionPerformed

    private void JB_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_NuevoActionPerformed
        limpiarCampos();
        enableCampos();
    }//GEN-LAST:event_JB_NuevoActionPerformed

    private void JT_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_CodigoActionPerformed

    private void JB_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_GuardarActionPerformed
        
        InmuebleData id = new InmuebleData();
        Inmueble i = new Inmueble();
        aGuardar(i);
        if(JB_Guardar.getText().equalsIgnoreCase("modificar")){
            int idi = id.buscarInmuebleConID(Integer.parseInt(JT_Codigo.getText().trim())).getIdInmueble();
            i.setIdInmueble(idi);
            id.modificarInmueble(i);
        }else{
            i.setEstado(false);
            id.guardarInmueble(i);
        }
        limpiarCampos();
    }//GEN-LAST:event_JB_GuardarActionPerformed

    private void JC_ListaPropietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JC_ListaPropietariosActionPerformed
        
    }//GEN-LAST:event_JC_ListaPropietariosActionPerformed

    private void JB_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_BuscarActionPerformed
        
    }//GEN-LAST:event_JB_BuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Buscar;
    private javax.swing.JButton JB_Eliminar;
    private javax.swing.JButton JB_Guardar;
    private javax.swing.JButton JB_Nuevo;
    private javax.swing.JComboBox<String> JC_ListaPropietarios;
    private javax.swing.JTextField JT_Altura;
    private javax.swing.JTextField JT_Codigo;
    private javax.swing.JTextField JT_Direccion;
    private javax.swing.JTextField JT_Precio;
    private javax.swing.JTextField JT_Superficie;
    private javax.swing.JTextField JT_Tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables

private void limpiarCampos (){
    JT_Codigo.setText("");
    JT_Direccion.setText("");
    JT_Altura.setText("");
    JT_Precio.setText("");
    JT_Superficie.setText("");
    JT_Tipo.setText("");
    JB_Eliminar.setEnabled(false); 
}

private void enableCampos(){
    
    JT_Direccion.setEnabled(true);
    JT_Altura.setEnabled(true);
    JT_Precio.setEnabled(true);
    JT_Superficie.setEnabled(true);
    JT_Tipo.setEnabled(true);
    JC_ListaPropietarios.setEnabled(true);
}



private List cargarListaPropietarios(){
    PropietarioData pd = new PropietarioData();
    List<Propietario> lp = pd.ListarPropietarios();
    for(Propietario p : lp){
        JC_ListaPropietarios.addItem(p.getApellido()+" "+p.getNombre()+" - "+p.getCuit());
    }
    return lp;
}



private Inmueble aGuardar(Inmueble i){
    
    i.setCodigo(Integer.parseInt(JT_Codigo.getText().trim()));
    i.setDireccion(JT_Direccion.getText());
    i.setAltura(Integer.parseInt(JT_Codigo.getText().trim()));
    i.setPrecio(Integer.parseInt(JT_Precio.getText().trim()));
    i.setSuperficie(Integer.parseInt(JT_Superficie.getText().trim()));
    i.setTipo(JT_Tipo.getText());
    /// TODOS MENOS:
    /// ID SE GENERA SOLO
    /// AL CREAR ES SIEMPRE DISPONIBLE - ESTADO = 0
    /// PROPIETARIO AL SER COMBOBOX LO LLAMO DE OTRA MANERA
    
    int indiceSeleccion = JC_ListaPropietarios.getSelectedIndex();///INDICE EN LA LISTA
    String x = JC_ListaPropietarios.getItemAt(indiceSeleccion);///SELECCION DEL ITEM, X MARKS THE SPOT CAPTAIN!
    int pos = x.indexOf("-");///DESDE ACA +1
    int cuicui = Integer.parseInt(x.substring(pos+1, x.length()).trim());///CORTO HASTA EL FIN Y TRAIGO EL CUIT

    PropietarioData pd = new PropietarioData();
    Propietario p = pd.buscarPropietarioPorCuit(cuicui);
    i.setPropietario(p);

    return i;
}




}
