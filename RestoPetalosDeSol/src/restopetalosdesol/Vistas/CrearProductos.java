
package restopetalosdesol.Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import restopetalosdesol.DataBase.ProductoDataBase;
import restopetalosdesol.Entidades.Producto;

/**
 *
 * @author carri
 */
public class CrearProductos extends javax.swing.JInternalFrame {
    private ProductoDataBase pdb;
   
    public CrearProductos() {
        initComponents();
        //botonTransparente();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono = new ImageIcon(getClass().getResource("/restopetalosdesol/Recursos/fondoInterno2.jpg/"));
        Image imagen = icono.getImage();
        jPanel2 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
            }

        };
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jBEliminar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jBLimpiar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBBuscarId = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTFId = new javax.swing.JTextField();
        jTFPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFStock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jRBEstado = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jBAgregar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jSeparator1.setBackground(new java.awt.Color(255, 204, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 204, 0));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Producto");

        jBEliminar.setBackground(new java.awt.Color(0, 0, 0));
        jBEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(255, 204, 0));

        jBLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        jBLimpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBSalir.setBackground(new java.awt.Color(0, 0, 0));
        jBSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBBuscarId.setBackground(new java.awt.Color(255, 255, 255));
        jBBuscarId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restopetalosdesol/Recursos/buscar1.jpg"))); // NOI18N
        jBBuscarId.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBBuscarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarIdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID ");

        jTFId.setBackground(new java.awt.Color(204, 204, 204));
        jTFId.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, null, null, java.awt.Color.black));
        jTFId.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTFId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFIdActionPerformed(evt);
            }
        });

        jTFPrecio.setBackground(new java.awt.Color(204, 204, 204));
        jTFPrecio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, null, null, java.awt.Color.black));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio");

        jTFStock.setBackground(new java.awt.Color(204, 204, 204));
        jTFStock.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, null, null, java.awt.Color.black));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Stock");

        jRBEstado.setBackground(new java.awt.Color(0, 0, 0));
        jRBEstado.setForeground(new java.awt.Color(255, 204, 0));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estado");

        jLabel3.setBackground(new java.awt.Color(101, 98, 98));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        jTFNombre.setBackground(new java.awt.Color(204, 204, 204));
        jTFNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, null, null, new java.awt.Color(0, 0, 0)));
        jTFNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombreActionPerformed(evt);
            }
        });

        jBAgregar.setBackground(new java.awt.Color(0, 0, 0));
        jBAgregar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGap(27, 27, 27)
                                    .addComponent(jTFStock))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGap(62, 62, 62)
                                    .addComponent(jTFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(41, 41, 41)
                                .addComponent(jRBEstado))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addGap(47, 47, 47)
                        .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jBBuscarId))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel7))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jBAgregar)
                            .addGap(32, 32, 32)
                            .addComponent(jBEliminar)
                            .addGap(41, 41, 41)
                            .addComponent(jBLimpiar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBSalir))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(jBBuscarId))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jRBEstado))
                .addGap(38, 38, 38)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEliminar)
                    .addComponent(jBLimpiar)
                    .addComponent(jBSalir)
                    .addComponent(jBAgregar))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        jTFId.setText("");
        jTFNombre.setText("");
        jTFPrecio.setText("");
        jTFStock.setText("");
        jRBEstado.setSelected(false);
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        ProductoDataBase pd = new ProductoDataBase();
        pd.eliminarProducto(Integer.parseInt(jTFId.getText()));
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBBuscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarIdActionPerformed

       
        try{
            ProductoDataBase pdb= new ProductoDataBase();
            Producto p = pdb.buscarProducto(Integer.parseInt(jTFId.getText()));

            jTFNombre.setText(p.getNombreProducto());
            jTFPrecio.setText(p.getPrecio()+"");
            jTFStock.setText(p.getStock()+"");
            jRBEstado.setSelected(p.isEstado());
            
        }catch(NumberFormatException nf){
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero entero");
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(this, "Error "+e.getMessage());
        }
    }//GEN-LAST:event_jBBuscarIdActionPerformed

    private void jTFNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombreActionPerformed

    private void jTFIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFIdActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        int id= Integer.parseInt(jTFId.getText());
        String nombre = jTFNombre.getText();
        double precio= Double.parseDouble(jTFPrecio.getText());
        int stock=Integer.parseInt(jTFStock.getText());
        boolean estado= jRBEstado.isEnabled();
        Producto p = new Producto(nombre, precio, stock, estado);
        ProductoDataBase pdb = new ProductoDataBase();
        pdb.agregarProducto(p);
        
    }//GEN-LAST:event_jBAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBuscarId;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTFId;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFPrecio;
    private javax.swing.JTextField jTFStock;
    // End of variables declaration//GEN-END:variables
}
