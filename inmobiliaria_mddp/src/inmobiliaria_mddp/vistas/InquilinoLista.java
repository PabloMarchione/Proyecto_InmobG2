
package inmobiliaria_mddp.vistas;
import inmobiliaria_mddp.accesoDatos.InquilinoData;
import inmobiliaria_mddp.entidades.Inquilino;

import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JDesktopPane;


public class InquilinoLista extends javax.swing.JInternalFrame {

   private DefaultTableModel modelo3 = new DefaultTableModel();
   
   public boolean isCellEditable(int f, int c){
       
       return false;
       
   }
   
   
   
    public InquilinoLista() {
        initComponents();
        armarTabla();
        cargarTabla();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTListaInquilino = new javax.swing.JTable();
        jTbuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);

        jTListaInquilino.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTListaInquilino);

        jTbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTbuscarKeyReleased(evt);
            }
        });

        jLabel1.setText("Buscar:");

        jButton1.setText("jButton1");

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        jLabel2.setText("Listar inquilino");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(259, 259, 259))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44)
                        .addComponent(jTbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTbuscarKeyReleased
borrarfilas();
        InquilinoData a = new InquilinoData();
           
        
        for (Inquilino inqui:a.listarInquilinos()){
            if (Integer.toString(inqui.getCuitIn()).startsWith(jTbuscar.getText()) || inqui.getNomCom().startsWith(jTbuscar.getText())){
                
             modelo3.addRow(new Object []{
                 inqui.getCuitIn(), 
                 inqui.getNomCom(), 
                 inqui.getTelContacto()
             });
                
            }
        
        }
    }//GEN-LAST:event_jTbuscarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTListaInquilino;
    private javax.swing.JTextField jTbuscar;
    // End of variables declaration//GEN-END:variables

private void armarTabla(){
    
    modelo3.addColumn("CUIT");
    modelo3.addColumn("Inquilino");
    modelo3.addColumn("Telefono");
    
    jTListaInquilino.setModel(modelo3);
    
    
    
    
}

private void cargarTabla(){
InquilinoData id = new InquilinoData();
    List<Inquilino> li = id.listarInquilinos();
    for(Inquilino i : li){
      int cuit = i.getCuitIn();
        modelo3.addRow(new Object []{i.getCuitIn(), i.getNomCom(), i.getTelContacto()});
        
    }

}
private void borrarfilas(){
    int f=jTListaInquilino.getRowCount()-1;
    for(;f>=0;f--){
         modelo3.removeRow(f);
    }
    
    
}


}



