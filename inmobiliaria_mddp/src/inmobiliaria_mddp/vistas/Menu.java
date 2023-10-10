
package inmobiliaria_mddp.vistas;


public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JD_Menu = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        JM_Inmuebles = new javax.swing.JMenu();
        jM_Calquileres = new javax.swing.JMenu();
        jMI_crearEditar = new javax.swing.JMenuItem();
        jM_Listas = new javax.swing.JMenu();
        jMI_todos = new javax.swing.JMenuItem();
        jMI_xInmueble = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout JD_MenuLayout = new javax.swing.GroupLayout(JD_Menu);
        JD_Menu.setLayout(JD_MenuLayout);
        JD_MenuLayout.setHorizontalGroup(
            JD_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
        );
        JD_MenuLayout.setVerticalGroup(
            JD_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        JM_Inmuebles.setText("Inmuebles");
        JM_Inmuebles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JM_InmueblesMouseClicked(evt);
            }
        });
        jMenuBar1.add(JM_Inmuebles);

        jM_Calquileres.setText("C. de Alquiler");

        jMI_crearEditar.setText("Crear - Editar");
        jMI_crearEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_crearEditarActionPerformed(evt);
            }
        });
        jM_Calquileres.add(jMI_crearEditar);

        jM_Listas.setText("Listar");

        jMI_todos.setText("Todos");
        jM_Listas.add(jMI_todos);

        jMI_xInmueble.setText("Por Inmueble");
        jM_Listas.add(jMI_xInmueble);

        jM_Calquileres.add(jM_Listas);

        jMenuBar1.add(jM_Calquileres);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JD_Menu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JD_Menu)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JM_InmueblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JM_InmueblesMouseClicked
        JD_Menu.removeAll();
        JD_Menu.repaint();
        GestionInmuebles ventanaInmuebles = new GestionInmuebles();
        ventanaInmuebles.setVisible(true);
        JD_Menu.add(ventanaInmuebles);
        JD_Menu.moveToFront(ventanaInmuebles);
    }//GEN-LAST:event_JM_InmueblesMouseClicked

    private void jMI_crearEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_crearEditarActionPerformed
        JD_Menu.removeAll();
        JD_Menu.repaint();
        GestionCalquileres ventanaCrearEditar = new GestionCalquileres();
        ventanaCrearEditar.setVisible(true);
        JD_Menu.add(ventanaCrearEditar);
        JD_Menu.moveToFront(ventanaCrearEditar);
    }//GEN-LAST:event_jMI_crearEditarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JD_Menu;
    private javax.swing.JMenu JM_Inmuebles;
    private javax.swing.JMenuItem jMI_crearEditar;
    private javax.swing.JMenuItem jMI_todos;
    private javax.swing.JMenuItem jMI_xInmueble;
    private javax.swing.JMenu jM_Calquileres;
    private javax.swing.JMenu jM_Listas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables



}
