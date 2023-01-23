/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;


import java.util.Scanner;
import utilidades.Comparadores;

/**
 *
 * @author Usuario
 */
public class ServicioPelicula {
    private Scanner leer = new Scanner (System.in);
    private ArrayList <Pelicula> peli;

    public ServicioPelicula() {
        this.peli = new ArrayList();
    }
    public void crearPelis(){
     
       
        do {            
           Pelicula b4 = new Pelicula();  
            System.out.println("ingrese el titulo de la pelicula");
            b4.setTitulo(leer.next());
            System.out.println("ingrese el director de la pelicula");
            b4.setDirector(leer.next());
            System.out.println("ingrese la duracion de la pelicula");
            b4.setDuracion(leer.nextFloat());
         peli.add(b4);
            System.out.println("Quiere ingresar otra pelicula?");
            System.out.println("S/N");
          String resp = leer.next();
            if (resp.equalsIgnoreCase("N")) {
                break;
            }
            
        } while (true);
   
        
      
    }
   public void mostrarPeli(){
     for(Pelicula aux : peli){
         System.out.println(aux);
     }
   }
  public void mostrarPeliMasHoras(){
      System.out.println("--------------------------------------------");
      System.out.println("las pelis con mayor duracion a una hora son:");
      
      for (Pelicula cs : peli) {
          if(cs.getDuracion() > 1){
              System.out.println(cs);
          }
      }
  }
  public void compararDescendente(){
      System.out.println("-------------------------------------------");
      System.out.println("Las pelis de mayor a menor son:");
     Collections.sort(peli, Comparadores.compararDuracionDesc);
      for (Pelicula aux : peli) {
          System.out.println(aux);
      }
      
      
  }
 public void compararAscendente(){
     System.out.println("--------------------------------------------"); 
     System.out.println("Las pelis de menor a mayor son:");
     Collections.sort(peli, Comparadores.compararDuracionAsc);
      for (Pelicula aux : peli) {
          System.out.println(aux);
      }
      
 } 
  public void compararTitulo(){
     System.out.println("--------------------------------------------"); 
     System.out.println("Titulos ordenados alfabeticamente:");
     Collections.sort(peli, Comparadores.compararTitulo);
      for (Pelicula aux : peli) {
          System.out.println(aux);
      }
      
 } 
   public void compararDirector(){
     System.out.println("--------------------------------------------"); 
     System.out.println("Director ordenados alfabeticamente:");
     Collections.sort(peli, Comparadores.compararDirector);
      for (Pelicula aux : peli) {
          System.out.println(aux);
      }
      
 } 
}
