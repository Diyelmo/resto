/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restopetalosdesol.Vistas;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.ZoneId;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import restopetalosdesol.DataBase.PedidoDataBase;
import restopetalosdesol.Entidades.Pedido;

/**
 *
 * @author nahuel
 */
public class listarPedidosPF extends javax.swing.JInternalFrame {

    private Connection con;
private DefaultTableModel modelo= new DefaultTableModel(){
     public boolean isCellEditable(int fila, int columna){ 
           return false; 

        }
};
    public listarPedidosPF() {
        
        initComponents();
        cabecera();
        LlenarTabla();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jtTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel1.setText("Total Recaudado Por Fecha");

        jLabel2.setText("Fecha");

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

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Calcular Total");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jtTotal.setEditable(false);

        jLabel5.setText("Total Recaudado");

        jButton3.setText("Llenar Tabla");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       borrarlista();
       LocalDate localDate=null;
        try{
        Date date=jDateChooser2.getDate();
        
       localDate= date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();        
        PedidoDataBase data=new PedidoDataBase(); 
        int control=0;
        for (Pedido pd : data.listarPedido()) {
           
            if( localDate.equals(pd.getFecha())){
                modelo.addRow(new Object[]{pd.getIdpedido(),pd.getIdmesa().getNumero(),pd.getNombre(),pd.getFecha(),pd.getHora(),pd.getImporte(),pd.isCobrada()});
             
                control++;
            
            }
           
       
            }
        if(control==0) {JOptionPane.showMessageDialog(this, "Datos no encontrados para la fecha seleccionada.");
        }
    }catch(NullPointerException e){
            JOptionPane.showMessageDialog(this, "No ha ingresado una fecha.");
            LlenarTabla();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         LocalDate localDate=null;
        try{
        Date date=jDateChooser2.getDate();
        
       localDate= date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
     
           
        
        PedidoDataBase data=new PedidoDataBase(); 
        double total=0;
        for (Pedido pd : data.listarPedido()) {
           
            if( localDate.equals(pd.getFecha())){
               total=total+ pd.getImporte();
             
               
            
            }
           
       
            jtTotal.setText(String.valueOf(total));
       
        }
    }catch(NullPointerException e){
            JOptionPane.showMessageDialog(this, "No ha ingresado una fecha.");
        }
          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      borrarlista();
      LlenarTabla();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtTotal;
    // End of variables declaration//GEN-END:variables
public void cabecera(){
        ArrayList<Object> col=new ArrayList();
        col.add("IdPedido");
        col.add("Nr Mesa");
        col.add("Nombre");
        col.add("Fecha");
        col.add("Hora");
        col.add("Importe");
        col.add("Cobrada");
        for(Object o:col){
            modelo.addColumn(o);
        }
        jTable1.setModel(modelo);
    }
    
    public void LlenarTabla(){
          PedidoDataBase p=new PedidoDataBase();
          for (Pedido o: p.listarPedido()) {
              if(o.isCobrada()){
                modelo.addRow(new Object[]{o.getIdpedido(),o.getIdmesa().getNumero(),o.getNombre(),o.getFecha(),o.getHora(),o.getImporte(),"Pago realizado"});
      }else {modelo.addRow(new Object[]{o.getIdpedido(),o.getIdmesa().getNumero(),o.getNombre(),o.getFecha(),o.getHora(),o.getImporte(),"Pago pendiente"});}
          }    
    }
   

      public void borrarlista(){
    int a=modelo.getRowCount()-1;
    for(int i=a;i>=0;i--){
        modelo.removeRow(i);
    }
      }
}
