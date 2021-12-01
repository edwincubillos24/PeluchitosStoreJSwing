package peluchitosstoreui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Peluchito;

public class Menu extends javax.swing.JFrame {
    
    ArrayList<Peluchito> listaPeluches = new ArrayList<>();
    
    Peluchito[] listPeluches = new Peluchito[4];

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregarButton = new javax.swing.JButton();
        BuscarButton = new javax.swing.JButton();
        modificarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        verInventarioButton = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú");
        setMaximumSize(new java.awt.Dimension(1000, 1200));
        setPreferredSize(new java.awt.Dimension(560, 300));
        setResizable(false);

        agregarButton.setText("Agregar");
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });

        BuscarButton.setText("Buscar");
        BuscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarButtonActionPerformed(evt);
            }
        });

        modificarButton.setText("Modificar");

        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        verInventarioButton.setText("Ver Inventario");
        verInventarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verInventarioButtonActionPerformed(evt);
            }
        });

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(agregarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(BuscarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(logoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(verInventarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modificarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(verInventarioButton)
                        .addGap(77, 77, 77)
                        .addComponent(eliminarButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(agregarButton)
                                .addGap(71, 71, 71)
                                .addComponent(BuscarButton)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(modificarButton)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
        Agregar agregar = new Agregar(this);
        agregar.setVisible(true);
    }//GEN-LAST:event_agregarButtonActionPerformed

    private void BuscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarButtonActionPerformed
        Buscar buscar = new Buscar(listaPeluches);
        buscar.setVisible(true);
    }//GEN-LAST:event_BuscarButtonActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        Eliminar eliminar = new Eliminar(this);
        eliminar.setVisible(true);
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void verInventarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verInventarioButtonActionPerformed
        VerInventario verInventario = new VerInventario(listaPeluches);
        verInventario.setVisible(true);
    }//GEN-LAST:event_verInventarioButtonActionPerformed

    public void agregarPeluche(Peluchito peluchito){
        listaPeluches.add(peluchito);
        for (int i=0; i<listaPeluches.size(); i++){
            System.out.println(listaPeluches.get(i).getNombre());
        }
    }
    
    public void eliminarPeluche(String nombre){
        boolean pelucheExiste=false;
        for (int i=0; i<listaPeluches.size(); i++){
            if (nombre.equals(listaPeluches.get(i).getNombre())){
                listaPeluches.remove(i);
                JOptionPane.showMessageDialog(null, "Peluche Eliminado con Exito");
                pelucheExiste = true;
            }
        }
        if (!pelucheExiste)
             JOptionPane.showMessageDialog(null, "Peluche no existe");        
    }
    
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
    private javax.swing.JButton BuscarButton;
    private javax.swing.JButton agregarButton;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton modificarButton;
    private javax.swing.JButton verInventarioButton;
    // End of variables declaration//GEN-END:variables
}
