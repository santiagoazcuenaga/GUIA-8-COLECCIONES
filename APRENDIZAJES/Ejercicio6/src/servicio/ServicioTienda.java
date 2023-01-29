/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioTienda {
    private HashMap <String, Double> pr ;
    private static Scanner leer = new Scanner (System.in).useDelimiter("\n");

    public ServicioTienda() {
        
        this.pr =  new HashMap();
    }
    
    public Producto newProduct(){
        Producto b2 = new Producto();
        do{
        System.out.println("Coloque el nombre del producto");
        b2.setName(leer.next());
        System.out.println("Coloque el precio del producto");
        b2.setPrice(leer.nextDouble());
        pr.put(b2.getName(),b2.getPrice());
            System.out.println("¿Quiere ingresar otro producto? Si/No");
            String resp = leer.next();

if(resp.equalsIgnoreCase("si")){
    continue;
    
    
}
if(resp.equalsIgnoreCase("no")){
    break;
}
if(!resp.equalsIgnoreCase("si") || !resp.equalsIgnoreCase("no")){
    System.out.println("respuesta invalida vuelva a intentarlo");
    resp = leer.next();
}
        }while(true);
        
        return b2;
    }
    public void mostrarProducto(){
        for (Map.Entry<String, Double> entry : pr.entrySet()) {
            System.out.println("Producto: "+entry.getKey() + ", Precio: "+entry.getValue());
        }
        
      
    }
    
    
   public void modificarPrecio (){
       System.out.println("¿A qué producto desea cambiarle el precio?");   
       String resp = leer.next();
       Double precionuevo;
       for (Map.Entry<String, Double> entry : pr.entrySet()) {
           if (resp.equalsIgnoreCase(entry.getKey())) {
               System.out.println("Ingrese el nuevo precio");
               precionuevo = leer.nextDouble();
               entry.setValue(precionuevo);
               
               
           }
       }
    mostrarProducto();   
   }
  
}
