/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import entidad.Paises;
import servicio.ServicioPaises;

/**
 *
 * @author Usuario
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paises b1 = new Paises();
        ServicioPaises b2 = new ServicioPaises();
        b2.crearPais();
        b2.mostrarPaisyOrdenar();
       b2.eliminarSi();
       b2.mostrarPaisyOrdenar();
    }
    
}
