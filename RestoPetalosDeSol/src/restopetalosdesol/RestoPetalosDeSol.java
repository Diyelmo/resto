/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restopetalosdesol;
import java.sql.Time;
import java.time.LocalDate;
import java.time.Month;
import restopetalosdesol.DataBase.Conexion;
import restopetalosdesol.DataBase.ProductoDataBase;
import restopetalosdesol.DataBase.ReservaDataBase;
import restopetalosdesol.Entidades.Producto;
import restopetalosdesol.Entidades.Reserva;
import restopetalosdesol.Entidades.Mesa;
/**
 *
 * @author RODRI
 */
public class RestoPetalosDeSol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion.getConexion();
        Producto p=new Producto("Limonada", "Limones exprimido con azucar", 12, 700);
        ProductoDataBase prod=new ProductoDataBase();
//        prod.agregarProductoEntrada(p);
        Producto p2=new Producto("Fernet", "Branca", 5, 700);
//        prod.agregarBebidaConAlcohol(p2);
//        prod.agregarProductoBebidaSinAlcohol(p);
        Mesa m =new Mesa(4);
       Time hora=Time.valueOf("12:00:00");
        Reserva r2=new Reserva("Juan", "Gomez", 0,LocalDate.of(2023, Month.SEPTEMBER, 12) ,hora , 7);
        ReservaDataBase rData=new ReservaDataBase();
//        rData.reservar(r2);
//        System.out.println(rData.listarReservasActivas());
        System.out.println(rData.listarReservasActivas());
    }
    
}
