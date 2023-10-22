
package inmobiliaria_mddp.vistas;
import inmobiliaria_mddp.accesoDatos.*;
import inmobiliaria_mddp.entidades.*;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane; //internal del internal del etc
import javax.swing.JOptionPane;



public class GestionInmuebles extends javax.swing.JInternalFrame {
private DefaultComboBoxModel modelito = new DefaultComboBoxModel();///PARA USAR EL GETINDEXOF EN EL BUSCADOR
                       
    public GestionInmuebles() {
        initComponents();
        //Iniciales
        JC_ListaPropietarios.setModel(modelito);///RESET COMBO MODEL
        cargarListaPropietarios();///LLENO LISTA COMBO
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
        jLabel9 = new javax.swing.JLabel();
        JL_Estado = new javax.swing.JLabel();
        JB_VerDisponibles = new javax.swing.JButton();

        setClosable(true);
        setTitle("Gestion de inmuebles");
        setName(""); // NOI18N

        JT_Direccion.setEnabled(false);

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

        JC_ListaPropietarios.setEnabled(false);

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
        JB_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_EliminarActionPerformed(evt);
            }
        });

        JB_Buscar.setText("Buscar");
        JB_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_BuscarActionPerformed(evt);
            }
        });

        jLabel9.setText("Estado :");

        JL_Estado.setText("  ");

        JB_VerDisponibles.setText("Ver disponibles");
        JB_VerDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_VerDisponiblesActionPerformed(evt);
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
                    .addComponent(JB_Nuevo)
                    .addComponent(jLabel9))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JC_ListaPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JB_Guardar)
                            .addComponent(JL_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JB_Buscar)
                                .addGap(50, 50, 50)
                                .addComponent(JB_Eliminar))
                            .addComponent(JB_VerDisponibles))))
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
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JT_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JT_Altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JT_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JC_ListaPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT_Superficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(JL_Estado)
                    .addComponent(JB_VerDisponibles))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_Nuevo)
                    .addComponent(JB_Guardar)
                    .addComponent(JB_Eliminar)
                    .addComponent(JB_Buscar))
                .addGap(14, 14, 14))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {JT_Altura, JT_Codigo, JT_Direccion, JT_Precio, JT_Superficie, JT_Tipo});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_NuevoActionPerformed
        limpiarCampos();
        enableCampos();
        cargarListaPropietarios();
        JB_Guardar.setEnabled(true);
    }//GEN-LAST:event_JB_NuevoActionPerformed

    private void JB_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_GuardarActionPerformed
        
        InmuebleData id = new InmuebleData();
        Inmueble i = new Inmueble();
        aGuardar(i);
        if(JB_Guardar.getText().equalsIgnoreCase("modificar")){
            int idinm = id.buscarInmuebleConCodigo(Integer.parseInt(JT_Codigo.getText().trim())).getIdInmueble();
            i.setIdInmueble(idinm);///ID NO SE MODIFICA NUNCA
            i.setEstado(i.isEstado());///ESTADO SOLO SE MODIFICA DESDE GESTION ALQUILER
            id.modificarInmueble(i);///TODO LO DEMAS
        }else{
            i.setEstado(true);
            id.guardarInmueble(i);
        }
        limpiarCampos();
    }//GEN-LAST:event_JB_GuardarActionPerformed

    private void JB_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_BuscarActionPerformed
        
        InmuebleData id = new InmuebleData();
        List<Inmueble> listado = id.listarInmuebles();
        boolean encontrado = false;
        if(JT_Codigo.getText()==null || JT_Codigo.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "Ingrese numeros enteros");
            limpiarCampos();
        }else{
            int c = 0;
            try {
                c = Integer.parseInt(JT_Codigo.getText().trim());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese SOLO numeros enteros");
                limpiarCampos();
            }
            for(Inmueble i : listado){
                    if(c == i.getCodigo()){
                        enableCampos();
                        JT_Codigo.setText(i.getCodigo()+"");
                        JT_Tipo.setText(i.getTipo());
                        JT_Superficie.setText(i.getSuperficie()+"");
                        JT_Direccion.setText(i.getDireccion());
                        JT_Altura.setText(i.getAltura()+"");
                        JT_Precio.setText(i.getPrecio()+"");
                        if(i.isEstado()){
                            JL_Estado.setText("Desocupado");
                        }else{
                            JL_Estado.setText("Ocupado");
                        }
                        
                        ///USO METODOS PROPIETARIO
                        PropietarioData pd = new PropietarioData();
                        Propietario p = pd.buscarPropietarioPorID(i.getPropietario().getIdPropietario());
                        
                        
                        ///USO EL MODELO DE COMBOBOX COMPARANDO EL LISTADO
                        int x = modelito.getIndexOf(p.getApellido()+" "+p.getNombre()+" - "+p.getCuit());
                        ///SELECCIONO LA COINCIDENCIA
                        JC_ListaPropietarios.setSelectedIndex(x);
                        
                        JB_Eliminar.setEnabled(true);
                        JB_Guardar.setText("Modificar");
                        JB_Guardar.setEnabled(true);
                        encontrado = true;
                    }
            }
            if(!encontrado){
                JOptionPane.showMessageDialog(this, "El Inmueble con ese codigo no existe");
                JB_Eliminar.setEnabled(false);
                limpiarCampos();
            }
        }     
    }//GEN-LAST:event_JB_BuscarActionPerformed

    private void JB_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_EliminarActionPerformed
        InmuebleData id = new InmuebleData();
        Inmueble aEliminar = id.buscarInmuebleConCodigo(Integer.parseInt(JT_Codigo.getText().trim()));
        id.deleteInmueble(aEliminar.getIdInmueble());

        limpiarCampos();
    }//GEN-LAST:event_JB_EliminarActionPerformed

    private void JB_VerDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_VerDisponiblesActionPerformed
        JDesktopPane desk = this.getDesktopPane();
        desk.removeAll();
        desk.repaint();
        InmueblesDisponibles idps = new InmueblesDisponibles();
        idps.setVisible(true);
        desk.add(idps);
        desk.moveToFront(idps);
    }//GEN-LAST:event_JB_VerDisponiblesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Buscar;
    private javax.swing.JButton JB_Eliminar;
    private javax.swing.JButton JB_Guardar;
    private javax.swing.JButton JB_Nuevo;
    private javax.swing.JButton JB_VerDisponibles;
    private javax.swing.JComboBox<String> JC_ListaPropietarios;
    private javax.swing.JLabel JL_Estado;
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
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

private void limpiarCampos (){
    JT_Codigo.setText("");
    JT_Direccion.setText("");
    JT_Altura.setText("");
    JT_Precio.setText("");
    JT_Superficie.setText("");
    JT_Tipo.setText("");
    JB_Guardar.setText("Guardar");
    JB_Guardar.setEnabled(false);
    JB_Eliminar.setEnabled(false);
    JL_Estado.setText("  ");
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
    i.setAltura(Integer.parseInt(JT_Altura.getText().trim()));
    i.setPrecio(Integer.parseInt(JT_Precio.getText().trim()));
    i.setSuperficie(Integer.parseInt(JT_Superficie.getText().trim()));
    i.setTipo(JT_Tipo.getText());
    /// TODOS MENOS:
    /// ID SE GENERA SOLO
    /// AL CREAR ES SIEMPRE DESOCUPADO - ESTADO = 1
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


///DEPRECADO
//private void autoSelectCombo(Propietario p){
//    
//    //JC_ListaPropietarios.removeAllItems();
//    ///JC_ListaPropietarios.addItem(p.getApellido()+" "+p.getNombre()+" - "+p.getCuit());
//    ///JC_ListaPropietarios.setSelectedIndex(0);
//}

}
