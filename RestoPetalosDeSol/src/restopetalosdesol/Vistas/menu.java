
package restopetalosdesol.Vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static restopetalosdesol.Vistas.Login.ingreso;
import static restopetalosdesol.Vistas.Login.jefe;


public class menu extends javax.swing.JFrame {

   

    public menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(870, 580);
       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        ImageIcon icono = new ImageIcon(getClass().getResource("/restopetalosdesol/Recursos/fondoMenu.jpg/"));
        Image imagen = icono.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setMaximumSize(new java.awt.Dimension(2706, 3800));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(870, 580));
        jDesktopPane1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1396, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 757, Short.MAX_VALUE)
        );

        jMenu1.setText("Menú");

        jMenuItem1.setText("Seleccionar Mesa");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Realizar Pedido");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setText("Obtener total");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Cobrar pedido");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Listas");

        jMenuItem6.setText("Lista por mesero");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Lista por fecha");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Lista por dia");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("Lista por hora");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        jMenu6.setText("Carta");

        jMenuItem14.setText("Platos favoritos");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem14);

        jMenuBar1.add(jMenu6);

        jMenu4.setText("Configuracion");

        jMenuItem3.setText("Agregar Producto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem12.setText("Modificar producto");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuItem10.setText("Crear mesa");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem11.setText("Meseros");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Login");

        jMenuItem13.setText("Mesero");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      if(ingreso ||jefe){
          
      
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        mesas ventanaInterna = new mesas();
        ventanaInterna.setVisible(true);
        jDesktopPane1.add(ventanaInterna);
        jDesktopPane1.moveToFront(ventanaInterna);}
       else{JOptionPane.showMessageDialog(this, "Acceso restringido");}
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if(ingreso||jefe){
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        menuproducto ventanaInterna = new menuproducto();
        ventanaInterna.setVisible(true);
        jDesktopPane1.add(ventanaInterna);
        jDesktopPane1.moveToFront(ventanaInterna);}
         else{JOptionPane.showMessageDialog(this, "Acceso restringido");}
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if (jefe){
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        CrearProductos ventanaInterna = new CrearProductos();
        ventanaInterna.setVisible(true);
        jDesktopPane1.add(ventanaInterna);
        jDesktopPane1.moveToFront(ventanaInterna);}
        else{JOptionPane.showMessageDialog(this, "Acceso restringido");}
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       if(ingreso||jefe){
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        obtenerTotal ventanaInterna = new obtenerTotal();
        ventanaInterna.setVisible(true);
        jDesktopPane1.add(ventanaInterna);
        jDesktopPane1.moveToFront(ventanaInterna);}
        else{JOptionPane.showMessageDialog(this, "Acceso restringido");}
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        if(ingreso||jefe){
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        cobrarPedido ventanaInterna = new cobrarPedido();
        ventanaInterna.setVisible(true);
        jDesktopPane1.add(ventanaInterna);
        jDesktopPane1.moveToFront(ventanaInterna);}
         else{JOptionPane.showMessageDialog(this, "Acceso restringido");}
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        if(jefe){
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        ListaXMesero ventanaInterna = new ListaXMesero();
        ventanaInterna.setVisible(true);
        jDesktopPane1.add(ventanaInterna);
        jDesktopPane1.moveToFront(ventanaInterna);}
         else{JOptionPane.showMessageDialog(this, "Acceso restringido");}
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        if(jefe){
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        listarPedidosPF ventanaInterna = new listarPedidosPF();
        ventanaInterna.setVisible(true);
        jDesktopPane1.add(ventanaInterna);
        jDesktopPane1.moveToFront(ventanaInterna);}
         else{JOptionPane.showMessageDialog(this, "Acceso restringido");}
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        if(jefe){
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        ListaPedidoXDia ventanaInterna = new ListaPedidoXDia();
        ventanaInterna.setVisible(true);
        jDesktopPane1.add(ventanaInterna);
        jDesktopPane1.moveToFront(ventanaInterna);}
         else{JOptionPane.showMessageDialog(this, "Acceso restringido");}
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        if(jefe){
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        listarPedidoPorMesaYH ventanaInterna = new listarPedidoPorMesaYH();
        ventanaInterna.setVisible(true);
        jDesktopPane1.add(ventanaInterna);
        jDesktopPane1.moveToFront(ventanaInterna);}
         else{JOptionPane.showMessageDialog(this, "Acceso restringido");}
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        if(jefe){
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        CrearMesa ventanaInterna = new CrearMesa();
        ventanaInterna.setVisible(true);
        jDesktopPane1.add(ventanaInterna);
        jDesktopPane1.moveToFront(ventanaInterna);}
         else{JOptionPane.showMessageDialog(this, "Acceso restringido");}
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        if(jefe){ 
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        Mesero2 ventanaInterna = new Mesero2();
        ventanaInterna.setVisible(true);
        jDesktopPane1.add(ventanaInterna);
        jDesktopPane1.moveToFront(ventanaInterna);}
         else{JOptionPane.showMessageDialog(this, "Acceso restringido");}
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        if(jefe){
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        ModificarProducto ventanaInterna = new ModificarProducto();
        ventanaInterna.setVisible(true);
        jDesktopPane1.add(ventanaInterna);
        jDesktopPane1.moveToFront(ventanaInterna);}
         else{JOptionPane.showMessageDialog(this, "Acceso restringido");}
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
           jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        Login ventanaInterna = new Login();
        ventanaInterna.setVisible(true);
        jDesktopPane1.add(ventanaInterna);
        jDesktopPane1.moveToFront(ventanaInterna);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
           jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        Cartas ventanaInterna = new Cartas();
        ventanaInterna.setVisible(true);
        jDesktopPane1.add(ventanaInterna);
        jDesktopPane1.moveToFront(ventanaInterna);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
/*
    class Fondo extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/restopetalosdesol/Recursos/fondoMenu.jpg/")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }*/
}
