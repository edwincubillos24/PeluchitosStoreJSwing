package peluchitosstoreui;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Peluchito;

public class Agregar extends javax.swing.JFrame {

    private Menu menu;

    public Agregar() {
        initComponents();
    }

    public Agregar(Menu menu) {
        this.menu = menu;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tamanoButtonGroup = new javax.swing.ButtonGroup();
        nombreLabel = new javax.swing.JLabel();
        referenciaLabel = new javax.swing.JLabel();
        cantidadLabel = new javax.swing.JLabel();
        precioLabel = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        referenciaTextField = new javax.swing.JTextField();
        cantidadTextField = new javax.swing.JTextField();
        precioTextField = new javax.swing.JTextField();
        tamanoLabel = new javax.swing.JLabel();
        pequenoRadioButton = new javax.swing.JRadioButton();
        medianoRadioButton = new javax.swing.JRadioButton();
        grandeRadioButton = new javax.swing.JRadioButton();
        guardarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar");

        nombreLabel.setText("Nombre");

        referenciaLabel.setText("Referencia");

        cantidadLabel.setText("Cantidad");

        precioLabel.setText("Precio");

        tamanoLabel.setText("Tamaño");

        tamanoButtonGroup.add(pequenoRadioButton);
        pequenoRadioButton.setSelected(true);
        pequenoRadioButton.setText("Pequeño");

        tamanoButtonGroup.add(medianoRadioButton);
        medianoRadioButton.setText("Mediano");

        tamanoButtonGroup.add(grandeRadioButton);
        grandeRadioButton.setText("Grande");

        guardarButton.setText("Guardar");
        guardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(referenciaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(cantidadLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(precioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreTextField)
                            .addComponent(referenciaTextField)
                            .addComponent(cantidadTextField)
                            .addComponent(precioTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(tamanoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(medianoRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pequenoRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grandeRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(guardarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tamanoLabel))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(referenciaLabel)
                    .addComponent(referenciaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pequenoRadioButton))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadLabel)
                    .addComponent(cantidadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medianoRadioButton))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioLabel)
                    .addComponent(precioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grandeRadioButton))
                .addGap(36, 36, 36)
                .addComponent(guardarButton)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButtonActionPerformed
        String nombre, referencia;
        int cantidad,tamano;
        double precio;
        
        if (nombreTextField.getText().isEmpty()
                || referenciaTextField.getText().isEmpty()
                || cantidadTextField.getText().isEmpty()
                || precioTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar todos los campos");
        } else {
            nombre = nombreTextField.getText();
            referencia = referenciaTextField.getText();
            cantidad = Integer.valueOf(cantidadTextField.getText());
            precio = Double.valueOf(precioTextField.getText());
        
            if (pequenoRadioButton.isSelected()) {
                tamano = 1;
            } else if (medianoRadioButton.isSelected()) {
                tamano = 2;
            } else {
                tamano = 3;
            }
            
            //Conexión con JDBC
            String dbURL = "jdbc:mysql://localhost:3306/peluchitosstore";
            String username = "root";
            String password = "123456";
            
            try{
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            
            if (conn != null){
                System.out.println("Conexión Exítosa");
            }
            
            String sql = "INSERT INTO peluchitos (id, referencia, nombre, precio, cantidad, tamano)"
                    + "VALUES(NULL, ?, ?, ?, ?, ?)";
            
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, referencia);
            statement.setString(2, nombre);
            statement.setDouble(3, precio);
            statement.setInt(4, cantidad);
            statement.setInt(5, tamano);
            
            statement.executeUpdate();
            
            }catch (SQLException ex){
                ex.printStackTrace();
            }
            
          //  Peluchito peluchito = new Peluchito(nombre, tamano, referencia, cantidad, precio);
          //  menu.agregarPeluche(peluchito);

            nombreTextField.setText("");
            referenciaTextField.setText("");
            cantidadTextField.setText("");
            precioTextField.setText("");
        }
    }//GEN-LAST:event_guardarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cantidadLabel;
    private javax.swing.JTextField cantidadTextField;
    private javax.swing.JRadioButton grandeRadioButton;
    private javax.swing.JButton guardarButton;
    private javax.swing.JRadioButton medianoRadioButton;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JRadioButton pequenoRadioButton;
    private javax.swing.JLabel precioLabel;
    private javax.swing.JTextField precioTextField;
    private javax.swing.JLabel referenciaLabel;
    private javax.swing.JTextField referenciaTextField;
    private javax.swing.ButtonGroup tamanoButtonGroup;
    private javax.swing.JLabel tamanoLabel;
    // End of variables declaration//GEN-END:variables
}
