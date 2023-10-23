/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restopetalosdesol;

import restopetalosdesol.DataBase.MesaDataBase;
import restopetalosdesol.DataBase.PedidoDataBase;

/**
 *
 * @author RODRI
 */
public class RestoPetalosDeSol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        PedidoDataBase pdb = new PedidoDataBase();
//        
//        System.out.println(pdb.buscarPedido(5));
        MesaDataBase mdb = new MesaDataBase();
        System.out.println(mdb.buscarMesa(4));
    }
    
}
