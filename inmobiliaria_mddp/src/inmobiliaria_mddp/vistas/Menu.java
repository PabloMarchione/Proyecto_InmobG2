
package inmobiliaria_mddp.vistas;


public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        JD_Menu = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jM_propietario = new javax.swing.JMenu();
        JM_Inmuebles = new javax.swing.JMenu();
        jMInquilino = new javax.swing.JMenu();
        jM_calquiler = new javax.swing.JMenu();
        jMI_AlquiCrearEditar = new javax.swing.JMenuItem();
        jM_Listar = new javax.swing.JMenu();
        jMI_listaTodos = new javax.swing.JMenuItem();
        jMI_listaXInmu = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout JD_MenuLayout = new javax.swing.GroupLayout(JD_Menu);
        JD_Menu.setLayout(JD_MenuLayout);
        JD_MenuLayout.setHorizontalGroup(
            JD_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
        );
        JD_MenuLayout.setVerticalGroup(
            JD_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        jM_propietario.setText("Propietarios");
        jMenuBar1.add(jM_propietario);

        JM_Inmuebles.setText("Inmuebles");
        JM_Inmuebles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JM_InmueblesMouseClicked(evt);
            }
        });
        jMenuBar1.add(JM_Inmuebles);

        jMInquilino.setText("Inquilino");
        jMenuBar1.add(jMInquilino);

        jM_calquiler.setText("C. de Alquiler");

        jMI_AlquiCrearEditar.setText("Crear - Editar");
        jMI_AlquiCrearEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_AlquiCrearEditarActionPerformed(evt);
            }
        });
        jM_calquiler.add(jMI_AlquiCrearEditar);

        jM_Listar.setText("Listar");

        jMI_listaTodos.setText("Todos");
        jMI_listaTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_listaTodosActionPerformed(evt);
            }
        });
        jM_Listar.add(jMI_listaTodos);

        jMI_listaXInmu.setText("Por Inmueble");
        jMI_listaXInmu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_listaXInmuActionPerformed(evt);
            }
        });
        jM_Listar.add(jMI_listaXInmu);

        jM_calquiler.add(jM_Listar);

        jMenuBar1.add(jM_calquiler);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JM_InmueblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JM_InmueblesMouseClicked
        JD_Menu.removeAll();
        JD_Menu.repaint();
        GestionInmuebles ventanaInmuebles = new GestionInmuebles();
        ventanaInmuebles.setVisible(true);
        JD_Menu.add(ventanaInmuebles);
        JD_Menu.moveToFront(ventanaInmuebles);
    }//GEN-LAST:event_JM_InmueblesMouseClicked

    private void jMI_AlquiCrearEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_AlquiCrearEditarActionPerformed
        JD_Menu.removeAll();
        JD_Menu.repaint();
        GestionCalquileres ventanaCalquilers = new GestionCalquileres();
        ventanaCalquilers.setVisible(true);
        JD_Menu.add(ventanaCalquilers);
        JD_Menu.moveToFront(ventanaCalquilers);
    }//GEN-LAST:event_jMI_AlquiCrearEditarActionPerformed

    private void jMI_listaTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_listaTodosActionPerformed
        JD_Menu.removeAll();
        JD_Menu.repaint();
        GestionCalquiListaTodo ventanaCalquiListaTodo = new GestionCalquiListaTodo();
        ventanaCalquiListaTodo.setVisible(true);
        JD_Menu.add(ventanaCalquiListaTodo);
        JD_Menu.moveToFront(ventanaCalquiListaTodo);
    }//GEN-LAST:event_jMI_listaTodosActionPerformed

    private void jMI_listaXInmuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_listaXInmuActionPerformed
        JD_Menu.removeAll();
        JD_Menu.repaint();
        GestionCalquiListaInmu ventanaCalquiListaInmu = new GestionCalquiListaInmu();
        ventanaCalquiListaInmu.setVisible(true);
        JD_Menu.add(ventanaCalquiListaInmu);
        JD_Menu.moveToFront(ventanaCalquiListaInmu);
    }//GEN-LAST:event_jMI_listaXInmuActionPerformed

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
    private javax.swing.JMenuItem jMI_AlquiCrearEditar;
    private javax.swing.JMenuItem jMI_listaTodos;
    private javax.swing.JMenuItem jMI_listaXInmu;
    private javax.swing.JMenu jMInquilino;
    private javax.swing.JMenu jM_Listar;
    private javax.swing.JMenu jM_calquiler;
    private javax.swing.JMenu jM_propietario;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables



}
