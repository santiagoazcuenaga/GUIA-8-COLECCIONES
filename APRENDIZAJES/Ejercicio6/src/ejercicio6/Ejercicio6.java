/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import entidad.Producto;
import servicio.ServicioTienda;

/**
 *
 * @author Usuario
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto b1 = new Producto();
        ServicioTienda b2 = new ServicioTienda();
         b2.newProduct();
    
  b2.mostrarProducto();
     
       b2.modificarPrecio();
       
    }
    
}
