/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package servicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioMascota {
static Scanner leer = new Scanner (System.in);

private List<String> raza;
 
    public ServicioMascota() {
    this.raza = new ArrayList();    
    }

   
    public List<String> getRaza() {
        return raza;
    }

    public void setRaza(List<String> raza) {
        this.raza = raza;
    }
    
    
    
    
    
public void guardarRaza(){
    System.out.println("Ingrese la raza");
    raza.add(leer.next());
    
      
}
public void mostrarRaza(){
    System.out.println("Las razas que ingresaste son: ");
    for (String aux : raza) {
        System.out.println(aux);
                
    }
    System.out.println("Cantidad de razas "+raza.size());
}

public void preguntar(){
    String resp;
    
    System.out.println("AGREGANDO MASCOTAS HDP");
    do {
       guardarRaza(); 
        System.out.println("Quiere agregar otra mascota?");
        resp = leer.next();  
    } while (resp.equalsIgnoreCase("Si"));
    mostrarRaza();
      
}
public void eliminated(String palabraRem){
    Iterator <String> it = raza.iterator();
    boolean as = false;
    while (it.hasNext()) {
        String next = it.next();
        if ( next.equals(palabraRem)) {
            it.remove();
     as = true;
        }
        
    }
  if(as){
      System.out.println("Palabra eliminada");  
      
  }else{
      System.out.println("La palabra no se encontró");
  }
    
    
}
}
