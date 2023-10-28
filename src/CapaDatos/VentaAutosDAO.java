/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class VentaAutosDAO {
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public int RegistrarVenta (VentaAutos venta){
        String sql = "INSERT INTO ventas_de_autos (Numero_De_Venta, Fecha_De_Venta, Valor_Pagado, Estado_Venta, Id_Autos, Id_Empleados, Id_Cliente) VALUES(?,?,?,?,?,?,?)";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt (1, venta.getNumero_De_Venta());
            ps.setDate(2, new java.sql.Date(venta.getFecha().getTime()));
            ps.setDouble(3, venta.getValor_Pagado());
            ps.setBoolean(4, venta.isEstado_Venta());
            ps.setInt(5, venta.getIdAutos());
            ps.setInt(6, venta.getIdEmpleados());
            ps.setInt(7, venta.getIdCliente());
            
            ps.execute();
            
        } catch (SQLException e)   { 
            System.out.println(e.toString());
        }
        return 0;
    }
    
        public List listarVenta(){
        List<VentaAutos> ListaVenta = new ArrayList();
       String sql = "SELECT Id_Ventas_De_Autos, Numero_De_Venta, Fecha_De_Venta, Valor_Pagado, Estado_Venta, Modelo_De_Auto, Nombre_Empleado, Nombre_De_Cliente\n" +
"FROM ventas_de_autos\n" +
"INNER JOIN autos ON ventas_de_autos.Id_Autos = autos.Id_Autos \n" +
"INNER JOIN empleados ON ventas_de_autos.Id_Empleados = empleados.Id_Empleados\n" +
"INNER JOIN cliente ON ventas_de_autos.Id_Cliente = cliente.Id_Cliente;";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               VentaAutos VentaAut = new VentaAutos();
               VentaAut.setId_Ventas_De_Autos(rs.getInt("Id_Ventas_De_Autos"));
               VentaAut.setNumero_De_Venta(rs.getInt("Numero_De_Venta"));
               VentaAut.setFecha(rs.getDate("Fecha_De_Venta"));
               VentaAut.setValor_Pagado(rs.getDouble("Valor_Pagado"));
               VentaAut.setEstado_Venta(rs.getBoolean("Estado_Venta"));
               VentaAut.setModelo_De_Auto(rs.getString("Modelo_De_Auto"));
               VentaAut.setNombre_De_Empleado(rs.getString("Nombre_Empleado"));
               VentaAut.setNombre_De_Cliente(rs.getString("Nombre_De_Cliente"));
              
               ListaVenta.add(VentaAut);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return ListaVenta;
   }
    
        
        public boolean EliminarVenta(int id){
       String sql = "DELETE FROM venta_de_autos WHERE id = ?";
       try {
           ps = con.prepareStatement(sql);
           ps.setInt(1, id);
           ps.execute();
           return true;
       } catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }finally{
           try {
               con.close();
           } catch (SQLException ex) {
               System.out.println(ex.toString());
           }
       }
   }
        
        
        public boolean ModificarVentas(VentaAutos VentaAuto){
       String sql = "UPDATE ventas_de_autos SET ventas_de_autos.Numero_De_Venta = ?, ventas_de_autos.Fecha_De_Venta = ?, ventas_de_autos.Valor_Pagado = ?, ventas_de_autos.Estado_Venta = ?, ventas_de_autos.Id_Autos = ?, ventas_de_autos.Id_Empleados = ?, ventas_de_autos.Id_Cliente = ?  WHERE ventas_de_autos.Id_Ventas_De_Autos = ?;";
       
       try {  
           
           con = cn.getConnection();
           ps = con.prepareStatement(sql);   
           ps.setInt(1, VentaAuto.getId_Ventas_De_Autos());
           ps.setInt (2, VentaAuto.getNumero_De_Venta());
           ps.setDate(3, new java.sql.Date(VentaAuto.getFecha().getTime()));
           ps.setDouble(4, VentaAuto.getValor_Pagado());
           ps.setBoolean(5, VentaAuto.isEstado_Venta());
           ps.setInt(6, VentaAuto.getIdAutos());
           ps.setInt(7, VentaAuto.getIdEmpleados());
           ps.setInt(8, VentaAuto.getIdCliente());
           
           ps.executeUpdate();
           return true;
       } catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }finally{
           try {
               con.close();
           } catch (SQLException e) {
               System.out.println(e.toString());
           }
       }
   }
        
        
}
