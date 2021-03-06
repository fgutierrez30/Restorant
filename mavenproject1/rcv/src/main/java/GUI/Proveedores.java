/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.ProveedorDAO;
import DTO.ProveedorDTO;
import java.awt.Dimension;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felipe Gutierrez
 */
public class Proveedores extends javax.swing.JInternalFrame {

    /**
     * Creates new form Proveedores
     */
    public Proveedores() {
        
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

        NvoProveedor = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txbRutProveedor = new javax.swing.JTextField();
        txbNomProveedor = new javax.swing.JTextField();
        btnGrabarProveedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProveedores = new javax.swing.JTable();
        btnNvoProveedor = new javax.swing.JButton();
        btnAllProveedore = new javax.swing.JButton();

        NvoProveedor.setTitle("Nuevo Proveedor");

        jLabel1.setText("RUT");

        jLabel2.setText("NOMBRE");

        btnGrabarProveedor.setText("Grabar");
        btnGrabarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NvoProveedorLayout = new javax.swing.GroupLayout(NvoProveedor.getContentPane());
        NvoProveedor.getContentPane().setLayout(NvoProveedorLayout);
        NvoProveedorLayout.setHorizontalGroup(
            NvoProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NvoProveedorLayout.createSequentialGroup()
                .addGroup(NvoProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NvoProveedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(NvoProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(22, 22, 22)
                        .addGroup(NvoProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txbRutProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txbNomProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(NvoProveedorLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnGrabarProveedor)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        NvoProveedorLayout.setVerticalGroup(
            NvoProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NvoProveedorLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(NvoProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txbRutProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NvoProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txbNomProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnGrabarProveedor)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        setClosable(true);
        setTitle("Mantenedor Proveedores");
        setToolTipText("");

        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RUT", "NOMBRE"
            }
        ));
        jScrollPane1.setViewportView(tablaProveedores);

        btnNvoProveedor.setText("Nuevo");
        btnNvoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNvoProveedorActionPerformed(evt);
            }
        });

        btnAllProveedore.setText("Ver todos");
        btnAllProveedore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllProveedoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNvoProveedor)
                .addGap(18, 18, 18)
                .addComponent(btnAllProveedore))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNvoProveedor)
                    .addComponent(btnAllProveedore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNvoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNvoProveedorActionPerformed
        
        
        NvoProveedor.setPreferredSize(new Dimension(400,300));
        NvoProveedor.pack();
        NvoProveedor.setVisible(true);
        
        
    }//GEN-LAST:event_btnNvoProveedorActionPerformed

    private void btnGrabarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarProveedorActionPerformed
        
        ProveedorDTO proveedor=new ProveedorDTO();
        String rut=txbRutProveedor.getText();
        String nombre=txbNomProveedor.getText();
        proveedor.setRut_proveedor(rut);
        proveedor.setNom_proveedor(nombre);
        
        ProveedorDAO dao=new ProveedorDAO();
        dao.agregaProveedor(proveedor);
        
        
        DefaultTableModel modelo=(DefaultTableModel)tablaProveedores.getModel();
        ProveedorDAO dao1=new ProveedorDAO();
        List<ProveedorDTO> proveedores=dao1.listarTodos();
        
        modelo.setRowCount(0);
        
        for(ProveedorDTO p:proveedores)
        {
            modelo.addRow(new Object[]{String.valueOf(p.getId_proveedor()),p.getRut_proveedor(),p.getNom_proveedor()});
        }
        
        
        
        txbNomProveedor.setText("");
        txbRutProveedor.setText("");
        
        NvoProveedor.dispose();
        
    }//GEN-LAST:event_btnGrabarProveedorActionPerformed

    private void btnAllProveedoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllProveedoreActionPerformed
        
        DefaultTableModel modelo=(DefaultTableModel)tablaProveedores.getModel();
        ProveedorDAO dao=new ProveedorDAO();
        List<ProveedorDTO> proveedores=dao.listarTodos();
        
        modelo.setRowCount(0);
        
        for(ProveedorDTO p:proveedores)
        {
            modelo.addRow(new Object[]{String.valueOf(p.getId_proveedor()),p.getRut_proveedor(),p.getNom_proveedor()});
        }
        
        
        
    }//GEN-LAST:event_btnAllProveedoreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame NvoProveedor;
    private javax.swing.JButton btnAllProveedore;
    private javax.swing.JButton btnGrabarProveedor;
    private javax.swing.JButton btnNvoProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProveedores;
    private javax.swing.JTextField txbNomProveedor;
    private javax.swing.JTextField txbRutProveedor;
    // End of variables declaration//GEN-END:variables
}
