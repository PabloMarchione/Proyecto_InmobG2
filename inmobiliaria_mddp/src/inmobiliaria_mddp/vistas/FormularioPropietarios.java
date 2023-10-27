/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria_mddp.vistas;

import inmobiliaria_mddp.accesoDatos.PropietarioData;
import inmobiliaria_mddp.entidades.Propietario;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author W10
 */
public class FormularioPropietarios extends javax.swing.JInternalFrame {
   private DefaultTableModel modelo = new DefaultTableModel();
   
   
    /**
     * Creates new form FormularioPropietarios
     */
    public FormularioPropietarios() {
        initComponents();
        armarCabecera();
        cargarDatos();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTitProp = new javax.swing.JLabel();
        jLCuit = new javax.swing.JLabel();
        jTFCuit = new javax.swing.JTextField();
        jLApellido = new javax.swing.JLabel();
        jTFApe = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jLNombre = new javax.swing.JLabel();
        jTFNom = new javax.swing.JTextField();
        jLDomicilio = new javax.swing.JLabel();
        jTFDomi = new javax.swing.JTextField();
        jLTelefono = new javax.swing.JLabel();
        jTFTele = new javax.swing.JTextField();
        jLMail = new javax.swing.JLabel();
        jTFMail = new javax.swing.JTextField();
        jBNuevo = new javax.swing.JButton();
        jBModi = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTLista = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setVisible(true);

        jLTitProp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLTitProp.setText("PROPIETARIOS");

        jLCuit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLCuit.setText("Cuit:");

        jTFCuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCuitActionPerformed(evt);
            }
        });

        jLApellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLApellido.setText("Apellido:");

        jBBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLNombre.setText("Nombre:");

        jLDomicilio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLDomicilio.setText("Domicilio:");

        jLTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLTelefono.setText("Telefono:");

        jLMail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLMail.setText("Mail:");

        jTFMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMailActionPerformed(evt);
            }
        });

        jBNuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBModi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBModi.setText("Modificar");
        jBModi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModiActionPerformed(evt);
            }
        });

        jBGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jTLista.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTLista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLTitProp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                .addComponent(jLDomicilio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLCuit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBModi)
                                .addGap(30, 30, 30)
                                .addComponent(jBGuardar)
                                .addGap(88, 88, 88)
                                .addComponent(jBSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFCuit)
                                    .addComponent(jTFApe)
                                    .addComponent(jTFNom)
                                    .addComponent(jTFDomi)
                                    .addComponent(jTFTele)
                                    .addComponent(jTFMail, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(372, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTitProp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFDomi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFTele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLMail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBNuevo)
                            .addComponent(jBModi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMailActionPerformed
        
    }//GEN-LAST:event_jTFMailActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
     try
     {
         int cuit=Integer.parseInt(jTFCuit.getText());
         PropietarioData proData=new PropietarioData();
         Propietario pro=new Propietario();
         pro=proData.buscarPropietarioPorCuit(cuit);
         if(pro==null){
             jTFCuit.setText("");
             
         }else{
             jTFApe.setText(pro.getApellido());
             jTFNom.setText(pro.getNombre());
             jTFDomi.setText(pro.getDomicilio());
             jTFTele.setText("" + pro.getTelefono());
             jTFMail.setText(pro.getMail());
        }
    }
     catch(NumberFormatException e){
         JOptionPane.showMessageDialog(this, "Ingrese un número válido");
         jTFCuit.setText("");
         
     }
     
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        limpiarCampos();
        
        jBGuardar.setEnabled(true);
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try{
            int cuit=Integer.parseInt(jTFCuit.getText());
            PropietarioData proData= new PropietarioData();
            Propietario proAux= proData.buscarPropietarioPorCuit(cuit);
            
            if(proAux == null){
                
                int proCuit= Integer.parseInt(jTFCuit.getText());
                String apellido=jTFApe.getText();
                String nombre=jTFNom.getText();
                String domicilio=jTFDomi.getText();
                int telefono=Integer.parseInt(jTFTele.getText());
                String mail=jTFMail.getText();
                
                Propietario proNew=new Propietario(proCuit, apellido, nombre, domicilio, telefono, mail);
                proData.agregarPropietario(proNew);
            }
               //if(proAux.getIdPropietario()== proNew.getIdPropietario()&& proAux.getApellido().equals(proNew.getApellido())&& proAux.getNombre().equals(proNew.getNombre())&& proAux.getDomicilio().equals(proNew.getDomicilio())&& proAux.getTelefono().equals(proNew.getTelefono())&& proAux.getMail().equals(proNew.getMail())
        //{
                // JOptionPane.showMessageDialog(this, "No se produjeron cambios");
                 
        }
          catch(NumberFormatException e)
         {
                 JOptionPane.showMessageDialog(this, "Ingrese un dato válido");
                 
                 
            
         
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
       int choice= JOptionPane.showConfirmDialog(this, "¿Quiere salir del formulario?", "Confirmar", JOptionPane.YES_NO_OPTION);
       if(choice==JOptionPane.YES_OPTION){
          this.dispose();
       }
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBModiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModiActionPerformed
      try{
            int cuit=Integer.parseInt(jTFCuit.getText());
            PropietarioData proData= new PropietarioData();
            Propietario pro= new Propietario();
            if(jTFApe.getText().isEmpty())
          {
                 JOptionPane.showMessageDialog(this, "Ingrese un apellido");
                 return;
                    }
            if(jTFApe.getText().chars().anyMatch(Character::isDigit))
          {
                 JOptionPane.showMessageDialog(this, "No puede ingresar números");
                 return;
          }
            String apellido=jTFApe.getText();
            String nombre=jTFNom.getText();
            String domicilio=jTFDomi.getText();
            int telefono=Integer.parseInt(jTFTele.getText());
            String mail=jTFMail.getText();
            Propietario proAux=proData.buscarPropietarioPorCuit(cuit);
            int id=proAux.getIdPropietario();
            pro=new Propietario(id,cuit, apellido, nombre, domicilio, telefono, mail);
            proData.modificarPropietario(pro);
    }
    
        catch (NumberFormatException e)     
        {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido");
        }
        limpiarCampos();
    
        
    

        
    }//GEN-LAST:event_jBModiActionPerformed

    private void jTFCuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCuitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCuitActionPerformed

    
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBModi;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLCuit;
    private javax.swing.JLabel jLDomicilio;
    private javax.swing.JLabel jLMail;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JLabel jLTitProp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFApe;
    private javax.swing.JTextField jTFCuit;
    private javax.swing.JTextField jTFDomi;
    private javax.swing.JTextField jTFMail;
    private javax.swing.JTextField jTFNom;
    private javax.swing.JTextField jTFTele;
    private javax.swing.JTable jTLista;
    // End of variables declaration//GEN-END:variables

    
    private void limpiarCampos(){
        jTFCuit.setText("");
        jTFApe.setText("");
        jTFNom.setText("");
        jTFDomi.setText("");
        jTFTele.setText("");
        jTFMail.setText("");
        
    }
  private void armarCabecera(){
      modelo.addColumn("cuit");
      modelo.addColumn("apellido");
      modelo.addColumn("nombre");
      jTLista.setModel(modelo);
  }
  
  private void cargarDatos(){
      PropietarioData proData= new PropietarioData();
      List<Propietario> proList = proData.ListarPropietarios();
      for(Propietario pro : proList){
          modelo.addRow(new Object []{pro.getCuit(), pro.getApellido(), pro.getNombre()});
      }
          
  }
}

