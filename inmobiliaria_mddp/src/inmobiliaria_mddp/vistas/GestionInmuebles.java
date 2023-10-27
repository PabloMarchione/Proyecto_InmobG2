
package inmobiliaria_mddp.vistas;
import inmobiliaria_mddp.accesoDatos.*;
import inmobiliaria_mddp.entidades.*;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane; //internal del internal del etc
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; 




public class GestionInmuebles extends javax.swing.JInternalFrame {
private DefaultComboBoxModel modelito = new DefaultComboBoxModel();///PARA USAR EL GETINDEXOF EN EL BUSCADOR
private DefaultTableModel modelitoT = new DefaultTableModel();///PARA USAR EN LA TABLA DISPONIBLES
                       
    public GestionInmuebles() {
        initComponents();
        //Iniciales
        armarTabla();
        cargarTabla();
        
        JT_ListadoInmuebles.setEnabled(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_ListadoInmuebles = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
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
        JB_Buscar.setToolTipText("Busqueda por CODIGO");
        JB_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_BuscarActionPerformed(evt);
            }
        });

        jLabel9.setText("Estado :");

        JL_Estado.setText("  ");

        JT_ListadoInmuebles.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JT_ListadoInmuebles);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setText("LISTADO DE INMUEBLES");

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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(JB_Guardar)
                                            .addGap(37, 37, 37)
                                            .addComponent(JB_Buscar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(JB_Eliminar))
                                        .addComponent(JC_ListaPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(96, 96, 96)))
                            .addComponent(JL_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JT_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JT_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JT_Altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JT_Superficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(JC_ListaPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(JL_Estado))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JB_Nuevo)
                            .addComponent(JB_Guardar)
                            .addComponent(JB_Buscar)
                            .addComponent(JB_Eliminar))
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {JT_Altura, JT_Codigo, JT_Direccion, JT_Precio, JT_Superficie, JT_Tipo});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_NuevoActionPerformed
        limpiarCampos();
        enableCampos();
        JC_ListaPropietarios.removeAllItems();
        cargarListaPropietarios();
        JB_Guardar.setEnabled(true);
    }//GEN-LAST:event_JB_NuevoActionPerformed

    private void JB_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_GuardarActionPerformed
        
        InmuebleData id = new InmuebleData();
        Inmueble i = new Inmueble();
        try {
            if(!inspectorDeCampos()){
                JOptionPane.showMessageDialog(this, "Uno o mas campos estan vacios o son de tipo incorrecto");
            }else{
                aGuardar(i);
                if(JB_Guardar.getText().equalsIgnoreCase("modificar")){
                    int idinm = id.buscarInmuebleConCodigo(Integer.parseInt(JT_Codigo.getText().trim())).getIdInmueble();
                    i.setIdInmueble(idinm);///ID NO SE MODIFICA NUNCA
                    //i.setEstado(i.isEstado());///ESTADO SOLO SE MODIFICA DESDE GESTION ALQUILER
                    id.modificarInmueble(i);///TODO LO DEMAS
                    reloadTabla();
                }else{
                    i.setEstado(true);
                    id.guardarInmueble(i);
                    limpiarCampos();
                    reloadTabla();
                }
            } 
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Uno o mas campos estan vacios o son de tipo incorrecto");
        }
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
        reloadTabla();
    }//GEN-LAST:event_JB_EliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Buscar;
    private javax.swing.JButton JB_Eliminar;
    private javax.swing.JButton JB_Guardar;
    private javax.swing.JButton JB_Nuevo;
    private javax.swing.JComboBox<String> JC_ListaPropietarios;
    private javax.swing.JLabel JL_Estado;
    private javax.swing.JTextField JT_Altura;
    private javax.swing.JTextField JT_Codigo;
    private javax.swing.JTextField JT_Direccion;
    private javax.swing.JTable JT_ListadoInmuebles;
    private javax.swing.JTextField JT_Precio;
    private javax.swing.JTextField JT_Superficie;
    private javax.swing.JTextField JT_Tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
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

private boolean inspectorDeCampos(){
    ///CREO UNA LISTA CON TODOS LOS DATOS DE LOS CAMPOS
    ///LUEGO RECORRO LA LISTA EN BUSQUEDA DE NULLS O ESPACIOS EN BLANCO
    ///COMO LA LISTA SE LLENA CON GET-TEXT SI NO TRAE NADA, LUEGO EL CONVERSOR A INT TAMPOCO TRAE NADA
    ///ENTONCES CHEQUEA TAMBIEN QUE LOS CAMPOS SEAN DEL TIPO DE DATO ADECUADO
    ///2X1 NEGOCION
    ArrayList<String> filtros = new ArrayList<String>();
    filtros.add(JT_Codigo.getText());
    filtros.add(JT_Altura.getText());
    filtros.add(JT_Direccion.getText());
    filtros.add(JT_Precio.getText());
    filtros.add(JT_Superficie.getText());
    filtros.add(JT_Tipo.getText());
    int visor = 0;
    for(String f : filtros){
        if(estaEnBlanco(f) || f.isEmpty()){
            visor++;
        }
    }
    if(visor!=0){
       return false; 
    }else{
        return true;
    }
}

private boolean estaEnBlanco(String frase){
    if(frase == null || frase.trim().length() == 0){
        return true;
    }else{
        return false; 
    }
}

private void armarTabla(){
        modelitoT.addColumn("Codigo");
        modelitoT.addColumn("Direccion del inmueble");
        modelitoT.addColumn("Propietario");
        modelitoT.addColumn("Estado");
        JT_ListadoInmuebles.setModel(modelitoT);
        JT_ListadoInmuebles.setAutoCreateRowSorter(true);
    }

private void cargarTabla(){
    
    InmuebleData id = new InmuebleData();
    //List<Inmueble> li = id.listarInmueblesDescopudadosOrdenCodigo();
    List<Inmueble> li = id.listarInmuebles();
    for(Inmueble i : li){
        String DireCompleta = i.getDireccion()+" "+i.getAltura();
        String NombApell = i.getPropietario().getApellido()+" "+i.getPropietario().getNombre();
        String Estadito = "Desocupado";
        if(!i.isEstado()){
            Estadito = "Ocupado";
        }
        modelitoT.addRow(new Object []{i.getCodigo(), DireCompleta, NombApell, Estadito});
    }
}

private void reloadTabla(){
    modelitoT.setRowCount(0);///TRUCHANDO PARA BORRAR Y RELOAD
    cargarTabla();
}






///DEPRECADO
//private Inmueble aGuardarFiltrado(Inmueble i){
//    
//    try{
//        if(!inspectorDeCampos()){
//            JOptionPane.showMessageDialog(this, "Uno o mas campos estan vacios");
//        }else{
//            i.setCodigo(Integer.parseInt(JT_Codigo.getText().trim()));
//            i.setDireccion(JT_Direccion.getText());
//            i.setAltura(Integer.parseInt(JT_Altura.getText().trim()));
//            i.setPrecio(Integer.parseInt(JT_Precio.getText().trim()));
//            i.setSuperficie(Integer.parseInt(JT_Superficie.getText().trim()));
//            i.setTipo(JT_Tipo.getText());
//            /// TODOS MENOS:
//            /// ID SE GENERA SOLO
//            /// AL CREAR ES SIEMPRE DESOCUPADO - ESTADO = 1
//            /// PROPIETARIO AL SER COMBOBOX LO LLAMO DE OTRA MANERA
//
//            int indiceSeleccion = JC_ListaPropietarios.getSelectedIndex();///INDICE EN LA LISTA
//            String x = JC_ListaPropietarios.getItemAt(indiceSeleccion);///SELECCION DEL ITEM, X MARKS THE SPOT CAPTAIN!
//            int pos = x.indexOf("-");///DESDE ACA +1
//            int cuicui = Integer.parseInt(x.substring(pos+1, x.length()).trim());///CORTO HASTA EL FIN Y TRAIGO EL CUIT
//
//            PropietarioData pd = new PropietarioData();
//            Propietario p = pd.buscarPropietarioPorCuit(cuicui);
//            i.setPropietario(p);
//        }
//    } catch (NumberFormatException ex) {
//                JOptionPane.showMessageDialog(this, "Ingrese SOLO numeros enteros");
//            }
//    return i;
//}


///DEPRECADO
//private void autoSelectCombo(Propietario p){
//    
//    //JC_ListaPropietarios.removeAllItems();
//    ///JC_ListaPropietarios.addItem(p.getApellido()+" "+p.getNombre()+" - "+p.getCuit());
//    ///JC_ListaPropietarios.setSelectedIndex(0);
//}

}
