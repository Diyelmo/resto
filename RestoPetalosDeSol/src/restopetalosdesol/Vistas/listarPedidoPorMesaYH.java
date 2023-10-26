/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restopetalosdesol.Vistas;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import restopetalosdesol.DataBase.PedidoDataBase;
import restopetalosdesol.Entidades.Mesa;
import restopetalosdesol.Entidades.Pedido;

/**
 *
 * @author nahuel
 */
public class listarPedidoPorMesaYH extends javax.swing.JInternalFrame {

       private Connection con;
private DefaultTableModel modelo= new DefaultTableModel(){
     public boolean isCellEditable(int fila, int columna){ 
           return false; 

        }
};
    public listarPedidoPorMesaYH() {
        initComponents();
        cabecera();
        llenarTabla();
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
        jLabel2 = new javax.swing.JLabel();
        jtMesa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtLlegada = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtSalida = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jdcDia = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel1.setText("Listar Pedidos Por Mesa Entre Horas");

        jLabel2.setText("N° De Mesa");

        jLabel3.setText("Hora De Llegada");

        jtLlegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtLlegadaActionPerformed(evt);
            }
        });

        jLabel4.setText("Hora De Salida");

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

        jLabel5.setText("Fecha");

        jButton1.setText("Salida");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Llenar Tabla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Reiniciar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(42, 42, 42)
                        .addComponent(jButton1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtMesa)
                    .addComponent(jtLlegada))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4))
                    .addComponent(jLabel5))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtSalida)
                    .addComponent(jdcDia, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jtLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jdcDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtLlegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtLlegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtLlegadaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        borrarlista();
        
        try {
            SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
            String fech = f.format(jdcDia.getDate());
            
            LocalDate fecha = LocalDate.parse(fech, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
           
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
             LocalTime llegada = LocalTime.parse(jtLlegada.getText(), formatter);
            
            
         
             LocalTime salida = LocalTime.parse(jtSalida.getText(), formatter);
            
            
            
           int nMesa= Integer.parseInt(jtMesa.getText());
           
           Pedido pedido=new Pedido();
           
      
       
      PedidoDataBase p=new PedidoDataBase();
      
      for (Pedido o: p.listarPedido()) {
         
            if(o.getIdmesa().getNumero()==nMesa && o.getFecha().equals(fecha) && o.isCobrada()){
            if(o.getHora().equals(llegada)|| (o.getHora().isAfter(llegada) && o.getHora().isBefore(salida))  ) {
                modelo.addRow(new Object[]{o.getIdpedido(),o.getIdmesa().getNumero(),o.getNombre(),o.getFecha(),o.getHora(),o.getImporte(),"Pago realizado"});
            }
                    
            }    
             if(o.getIdmesa().getNumero()==nMesa && o.getFecha().equals(fecha) && !o.isCobrada()){
            if(o.getHora().equals(llegada)|| (o.getHora().isAfter(llegada) && o.getHora().isBefore(salida))  ) {
                modelo.addRow(new Object[]{o.getIdpedido(),o.getIdmesa().getNumero(),o.getNombre(),o.getFecha(),o.getHora(),o.getImporte(),"Pago pendiente"});
            }
                    
            }
        }
         }catch(DateTimeParseException e){
            JOptionPane.showMessageDialog(this, "Recuerde que las horas deben completarse con el siguiente formato hh:mm ");
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(this, "Llene los campos vacios.");
            llenarTabla();
        }
            
            
         
        
            
       
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         llenarTabla();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser jdcDia;
    private javax.swing.JTextField jtLlegada;
    private javax.swing.JTextField jtMesa;
    private javax.swing.JTextField jtSalida;
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

      public void borrarlista(){
    int a=modelo.getRowCount()-1;
    for(int i=a;i>=0;i--){
        modelo.removeRow(i);
    }
      }

      private void llenarTabla() {
        PedidoDataBase pd=new PedidoDataBase();
        jtLlegada.setText("");
        jtSalida.setText("");
        jtMesa.setText("");
        jdcDia.setDate(null);
        borrarlista();
        for (Pedido p : pd.listarPedido()) {
            if( p.isCobrada()){
            modelo.addRow(new Object[]{
                p.getIdpedido(),p.getIdmesa().getNumero(),p.getNombre(),p.getFecha(),p.getHora(),p.getImporte(),"Pago realizado"});
        }
            if( !p.isCobrada()){
            modelo.addRow(new Object[]{
                p.getIdpedido(),p.getIdmesa().getNumero(),p.getNombre(),p.getFecha(),p.getHora(),p.getImporte(),"Pago pendiente"});
        }
    }}

}
