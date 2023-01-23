/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;


import servicio.ServicioMascota;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        ServicioMascota b2 = new ServicioMascota();
        b2.preguntar();
       b2.eliminated("terrier");
       b2.mostrarRaza();
       
    }
    
}
