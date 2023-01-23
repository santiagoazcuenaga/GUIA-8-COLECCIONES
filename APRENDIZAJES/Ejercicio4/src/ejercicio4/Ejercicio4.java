/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import entidad.Pelicula;
import java.util.Collections;
import servicios.ServicioPelicula;

/**
 *
 * @author Usuario
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ServicioPelicula b2 = new ServicioPelicula();
       Pelicula b1 = new Pelicula();
       b2.crearPelis();
       b2.mostrarPeli();
  b2.mostrarPeliMasHoras();
       b2.compararDescendente();
       b2.compararAscendente();
       b2.compararTitulo();
       b2.compararDirector();
    }
    
}
