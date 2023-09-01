/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab7p2_junniorsauceda;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
import javax.crypto.AEADBadTagException;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Junnior Sauceda
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tp_AgregarCar = new javax.swing.JTabbedPane();
        pn_AgregarCar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tf_marca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_Modelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_Precio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bt_Color = new javax.swing.JButton();
        Sp_Año = new javax.swing.JSpinner();
        bt_AgregarCar = new javax.swing.JButton();
        pn_AgregarVen = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tf_NomVend = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Sp_Vsell = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        tf_MoneyGen = new javax.swing.JTextField();
        bt_addVendedor = new javax.swing.JButton();
        pn_AgregClient = new javax.swing.JPanel();
        pn_Vender = new javax.swing.JPanel();
        pn_Archivos = new javax.swing.JPanel();
        pn_Arboles = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tp_AgregarCar.setBackground(new java.awt.Color(153, 255, 102));
        tp_AgregarCar.setForeground(new java.awt.Color(0, 0, 0));

        pn_AgregarCar.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Marca:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Modelo:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Precio:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Año:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Color:");

        bt_Color.setBackground(new java.awt.Color(255, 255, 255));
        bt_Color.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_ColorMouseClicked(evt);
            }
        });

        Sp_Año.setModel(new javax.swing.SpinnerNumberModel(2023, 1945, null, 1));

        bt_AgregarCar.setForeground(new java.awt.Color(255, 255, 255));
        bt_AgregarCar.setText("Agregar Vehiculo");
        bt_AgregarCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_AgregarCarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_AgregarCarLayout = new javax.swing.GroupLayout(pn_AgregarCar);
        pn_AgregarCar.setLayout(pn_AgregarCarLayout);
        pn_AgregarCarLayout.setHorizontalGroup(
            pn_AgregarCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_AgregarCarLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pn_AgregarCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(tf_Precio, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(tf_Modelo, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(tf_marca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn_AgregarCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(bt_Color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sp_Año, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                .addGap(126, 126, 126))
            .addGroup(pn_AgregarCarLayout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(bt_AgregarCar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(334, Short.MAX_VALUE))
        );
        pn_AgregarCarLayout.setVerticalGroup(
            pn_AgregarCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_AgregarCarLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(pn_AgregarCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn_AgregarCarLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn_AgregarCarLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Sp_Año, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pn_AgregarCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_AgregarCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_Color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_Modelo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_AgregarCar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        tp_AgregarCar.addTab("Agregar Vehiculo", pn_AgregarCar);

        pn_AgregarVen.setBackground(new java.awt.Color(51, 51, 51));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Nombre:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Vehiculos Vendidos:");

        Sp_Vsell.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Ganancias Generadas:");

        bt_addVendedor.setText("Agregar");
        bt_addVendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_addVendedorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_AgregarVenLayout = new javax.swing.GroupLayout(pn_AgregarVen);
        pn_AgregarVen.setLayout(pn_AgregarVenLayout);
        pn_AgregarVenLayout.setHorizontalGroup(
            pn_AgregarVenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_AgregarVenLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(pn_AgregarVenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(Sp_Vsell, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_AgregarVenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7)
                        .addComponent(tf_MoneyGen)
                        .addComponent(jLabel9)
                        .addComponent(tf_NomVend, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_AgregarVenLayout.createSequentialGroup()
                .addContainerGap(361, Short.MAX_VALUE)
                .addComponent(bt_addVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(342, 342, 342))
        );
        pn_AgregarVenLayout.setVerticalGroup(
            pn_AgregarVenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_AgregarVenLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_NomVend, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sp_Vsell, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_MoneyGen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_addVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        tp_AgregarCar.addTab("Agregar Vendedor", pn_AgregarVen);

        pn_AgregClient.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout pn_AgregClientLayout = new javax.swing.GroupLayout(pn_AgregClient);
        pn_AgregClient.setLayout(pn_AgregClientLayout);
        pn_AgregClientLayout.setHorizontalGroup(
            pn_AgregClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        pn_AgregClientLayout.setVerticalGroup(
            pn_AgregClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );

        tp_AgregarCar.addTab("Agregar Cliente", pn_AgregClient);

        pn_Vender.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout pn_VenderLayout = new javax.swing.GroupLayout(pn_Vender);
        pn_Vender.setLayout(pn_VenderLayout);
        pn_VenderLayout.setHorizontalGroup(
            pn_VenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        pn_VenderLayout.setVerticalGroup(
            pn_VenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );

        tp_AgregarCar.addTab("Vender", pn_Vender);

        pn_Archivos.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout pn_ArchivosLayout = new javax.swing.GroupLayout(pn_Archivos);
        pn_Archivos.setLayout(pn_ArchivosLayout);
        pn_ArchivosLayout.setHorizontalGroup(
            pn_ArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        pn_ArchivosLayout.setVerticalGroup(
            pn_ArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );

        tp_AgregarCar.addTab("Archivos", pn_Archivos);

        pn_Arboles.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout pn_ArbolesLayout = new javax.swing.GroupLayout(pn_Arboles);
        pn_Arboles.setLayout(pn_ArbolesLayout);
        pn_ArbolesLayout.setHorizontalGroup(
            pn_ArbolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        pn_ArbolesLayout.setVerticalGroup(
            pn_ArbolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );

        tp_AgregarCar.addTab("Arboles", pn_Arboles);

        jPanel1.add(tp_AgregarCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 880, 530));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Venta Carros");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 550, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_ColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ColorMouseClicked
        // TODO add your handling code here:
        bt_Color.setBackground(JColorChooser.showDialog(this, "Seleccione el color del Vehiculo", Color.yellow));
    }//GEN-LAST:event_bt_ColorMouseClicked

    private void bt_AgregarCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_AgregarCarMouseClicked
        // TODO add your handling code here:
        FileWriter fw = null;
        BufferedWriter bw = null;
        File Archivocar = null;
        try {
            String marca = tf_marca.getText();
            String modelo = tf_Modelo.getText();
            int precio = Integer.parseInt(tf_Precio.getText());
            int año = Integer.parseInt(Sp_Año.getValue().toString());
            Color color = bt_Color.getBackground();
            Vehiculo x = new Vehiculo(marca, modelo, modelo, color, año, precio);
            v.add(x);
            Archivocar = new File("./Carros.txt");
            fw = new FileWriter(Archivocar, true);
            bw = new BufferedWriter(fw);
            bw.write("[\n\t" + marca + ",\n\t" + modelo + ",\n\t" + año + ",\n\t" + precio + ",\n];\n");
            bw.flush();
            tf_marca.setText("");
            tf_Modelo.setText("");
            tf_Precio.setText("");
            Sp_Año.setValue(0);
            bt_Color.setBackground(Color.WHITE);

            JOptionPane.showMessageDialog(this, "Agregado Exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
            e.printStackTrace();

        }
        try {
            bw.close();
            fw.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
            e.printStackTrace();
        }

    }//GEN-LAST:event_bt_AgregarCarMouseClicked

    private void bt_addVendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_addVendedorMouseClicked
        // TODO add your handling code here:
        BufferedWriter bw=null;
        FileWriter fw=null;
        File ArchivoSellers=null;
        try {
            String nom=tf_NomVend.getText();
            int ventas=Integer.parseInt(Sp_Vsell.getValue().toString());
            int ganancias=Integer.parseInt(tf_MoneyGen.getText());
            Vendedor x=new Vendedor(nom, ventas, ganancias);
            Estafadores.add(x);
            ArchivoSellers=new File("./Vendedores.txt");
            fw=new FileWriter(ArchivoSellers,true);
            bw=new BufferedWriter(fw);
            bw.write("[\n\t" + nom + ",\n\t" + ventas + ",\n\t" + ganancias +",\n];\n");
            bw.flush();
            tf_NomVend.setText("");
            Sp_Vsell.setValue(0);
            tf_MoneyGen.setText("");
                    
            JOptionPane.showMessageDialog(this, "Agregado Exitosamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
            e.printStackTrace();
        }
        try {
            bw.close();
            fw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
            e.printStackTrace();
        }
    }//GEN-LAST:event_bt_addVendedorMouseClicked

    public String id() {
        return "";
    }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    Random ran = new Random();
    ArrayList<Vehiculo> v = new ArrayList<>();
    ArrayList<Vendedor> Estafadores = new ArrayList<>();
    ArrayList<Cliente> Clientes = new ArrayList<>();
    ArrayList<Venta> ventas = new ArrayList<>();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Sp_Año;
    private javax.swing.JSpinner Sp_Vsell;
    private javax.swing.JButton bt_AgregarCar;
    private javax.swing.JButton bt_Color;
    private javax.swing.JButton bt_addVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pn_AgregClient;
    private javax.swing.JPanel pn_AgregarCar;
    private javax.swing.JPanel pn_AgregarVen;
    private javax.swing.JPanel pn_Arboles;
    private javax.swing.JPanel pn_Archivos;
    private javax.swing.JPanel pn_Vender;
    private javax.swing.JTextField tf_Modelo;
    private javax.swing.JTextField tf_MoneyGen;
    private javax.swing.JTextField tf_NomVend;
    private javax.swing.JTextField tf_Precio;
    private javax.swing.JTextField tf_marca;
    private javax.swing.JTabbedPane tp_AgregarCar;
    // End of variables declaration//GEN-END:variables
}
