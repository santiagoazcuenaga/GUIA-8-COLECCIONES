/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Paises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class ServicioPaises {
 private TreeSet<String> paises;
 private ArrayList<String> pais2;
 private static Scanner leer; 

    public ServicioPaises() {
        paises = new TreeSet();
        pais2 = new ArrayList(paises);
        leer = new Scanner(System.in).useDelimiter("\n");
        
    }
public void crearPais(){
    String resp;
    
    do {
        Paises b4 = new Paises();
        System.out.println("ingrese el nombre del pais");
       b4.setNombre(leer.next());
       paises.add(b4.getNombre());
        System.out.println("¿desea ingresar otro pais?");
        System.out.println("S/N");
        resp = leer.next();
        if (resp.equalsIgnoreCase("N")) {
            break;
        }
 
            
    } while (true);
   
    
}
 public void mostrarPaisyOrdenar(){
     for (String aux : paises) {
         System.out.println(aux);
     }
     
     
 }
  public void eliminarSi(){
      //Uso it
      Iterator<String> it = paises.iterator();
      
      System.out.println("Quiere eliminar algun pais de la lista?");
      String resp = leer.next();
      if (resp.equalsIgnoreCase("Si")) {
          System.out.println("ingrese el pais que quiere eliminar");
          String resp2= leer.next();
          while(it.hasNext()){
              if (it.next().equals(resp2)) {
                  it.remove();
                  break;
              }
             
              if (it.hasNext() == false) {
                  System.out.println("No se encontró pais, ¡lo siento!");
              }
              
          }

                  
      }
      
      
      
      
      
  }
  
  
}
