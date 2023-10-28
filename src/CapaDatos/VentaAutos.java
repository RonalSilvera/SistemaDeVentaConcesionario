/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaDatos;

/**
 *
 * @author eros
 */
import java.util.Date;


public class VentaAutos {
    
    private int Id_Ventas_De_Autos;
    private int Numero_De_Venta;
    private Date fecha;
    private double Valor_Pagado;
    private boolean Estado_Venta;
    private String Modelo_De_Auto;
    private String Nombre_De_Empleado;
    private String Nombre_De_Cliente;
    private int IdAutos;
    private int IdEmpleados;
    private int IdCliente;

    public VentaAutos() {
    }

    public VentaAutos(int Id_Ventas_De_Autos, int Numero_De_Venta, Date fecha, double Valor_Pagado, boolean Estado_Venta, String Modelo_De_Auto, String Nombre_De_Empleado, String Nombre_De_Cliente, int IdAutos, int IdEmpleados, int IdCliente) {
        this.Id_Ventas_De_Autos = Id_Ventas_De_Autos;
        this.Numero_De_Venta = Numero_De_Venta;
        this.fecha = fecha;
        this.Valor_Pagado = Valor_Pagado;
        this.Estado_Venta = Estado_Venta;
        this.Modelo_De_Auto = Modelo_De_Auto;
        this.Nombre_De_Empleado = Nombre_De_Empleado;
        this.Nombre_De_Cliente = Nombre_De_Cliente;
        this.IdAutos = IdAutos;
        this.IdEmpleados = IdEmpleados;
        this.IdCliente = IdCliente;
    }

    public int getId_Ventas_De_Autos() {
        return Id_Ventas_De_Autos;
    }

    public void setId_Ventas_De_Autos(int Id_Ventas_De_Autos) {
        this.Id_Ventas_De_Autos = Id_Ventas_De_Autos;
    }

    public int getNumero_De_Venta() {
        return Numero_De_Venta;
    }

    public void setNumero_De_Venta(int Numero_De_Venta) {
        this.Numero_De_Venta = Numero_De_Venta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getValor_Pagado() {
        return Valor_Pagado;
    }

    public void setValor_Pagado(double ValorPagado) {
        this.Valor_Pagado = ValorPagado;
    }

    public boolean isEstado_Venta() {
        return Estado_Venta;
    }

    public void setEstado_Venta(boolean EstadoVenta) {
        this.Estado_Venta = EstadoVenta;
    }

    public String getModelo_De_Auto() {
        return Modelo_De_Auto;
    }

    public void setModelo_De_Auto(String ModeloDeAuto) {
        this.Modelo_De_Auto = ModeloDeAuto;
    }

    public String getNombre_De_Empleado() {
        return Nombre_De_Empleado;
    }

    public void setNombre_De_Empleado(String Nombre_De_Empleado) {
        this.Nombre_De_Empleado = Nombre_De_Empleado;
    }

    public String getNombre_De_Cliente() {
        return Nombre_De_Cliente;
    }

    public void setNombre_De_Cliente(String Nombre_De_Cliente) {
        this.Nombre_De_Cliente = Nombre_De_Cliente;
    }

    public int getIdAutos() {
        return IdAutos;
    }

    public void setIdAutos(int IdAutos) {
        this.IdAutos = IdAutos;
    }

    public int getIdEmpleados() {
        return IdEmpleados;
    }

    public void setIdEmpleados(int IdEmpleados) {
        this.IdEmpleados = IdEmpleados;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    
  
    
    
    

    
    
}


