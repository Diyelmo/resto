
package restopetalosdesol.Vistas;

import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import restopetalosdesol.DataBase.PedidoDataBase;
import restopetalosdesol.Entidades.Pedido;


public class ListaXMesero extends javax.swing.JInternalFrame {

   
    private DefaultTableModel modelo= new DefaultTableModel(){
        public boolean isCellEditable(int f, int c){
            return false;
        }
    };
    
    public ListaXMesero() {
        initComponents();
        modificarTabla();
        borrarlista();
        LlenarTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Ingrese nombre de mesero:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Listas por meseros");

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        llenarTabla();
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void modificarTabla(){
        modelo.addColumn("IDPedido");
        modelo.addColumn("Nr Mesa");
        modelo.addColumn("nombre");
        modelo.addColumn("fecha");
        modelo.addColumn("hora");
        modelo.addColumn("importe");
        modelo.addColumn("cobrada");
        jTable1.setModel(modelo);   
    }
    public void borrarlista(){
        int a=modelo.getRowCount()-1;
            for(int i=a;i>=0;i--){
             modelo.removeRow(i);
            }
    }
  
    public void LlenarTabla(){
          PedidoDataBase p=new PedidoDataBase();
          String vacio=jTextField1.getText();
          if(vacio.isEmpty()){
          for (Pedido o: p.listarPedido()) {
              if(o.isCobrada()){
                modelo.addRow(new Object[]{o.getIdpedido(),o.getIdmesa().getNumero(),o.getNombre(),o.getFecha(),o.getHora(),o.getImporte(),"Pago realizado"});
            }else{modelo.addRow(new Object[]{o.getIdpedido(),o.getIdmesa().getNumero(),o.getNombre(),o.getFecha(),o.getHora(),o.getImporte(),"Pago pendiente"});}
      }
          }
    }
    private void llenarTabla() {
        PedidoDataBase pd=new PedidoDataBase();
        String x=jTextField1.getText();
        borrarlista();
        for (Pedido p : pd.listarPedido()) {
            if(p.getNombre().startsWith(jTextField1.getText()) && p.isCobrada()){
            modelo.addRow(new Object[]{
                p.getIdpedido(),p.getIdmesa().getNumero(),p.getNombre(),p.getFecha(),p.getHora(),p.getImporte(),"Pago realizado"});
        }
            if(p.getNombre().startsWith(jTextField1.getText()) && !p.isCobrada()){
            modelo.addRow(new Object[]{
                p.getIdpedido(),p.getIdmesa().getNumero(),p.getNombre(),p.getFecha(),p.getHora(),p.getImporte(),"Pago pendiente"});
        }
           
    }
     
    }
}
