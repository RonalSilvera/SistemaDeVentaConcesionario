/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaDatos;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author eros
 */
public class Main {
   
      public static void main(String[] args) throws ParseException {
         
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
          Date fecha = formato.parse("12/11/2015");
          
          VentaAutosDAO objeto = new VentaAutosDAO();
          VentaAutos objeto2 = new VentaAutos(8, 3, fecha, 4000, true, "MercedesMaybach GLS", "Alejandro", "Raul", 4, 4, 1 );
          
          objeto.ModificarVentas(objeto2);
          
       }
}