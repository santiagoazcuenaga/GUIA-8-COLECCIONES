/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioAlumno {
    static Scanner leer = new Scanner(System.in);
    HashMap<String, Integer> b4 = new HashMap();
    ArrayList<Alumno> b2 = new ArrayList();

    public Alumno setNombre() {
        Alumno b1 = new Alumno();
        boolean go;
        go = false;
        do {

            System.out.println("Ingrese el nombre del alumno");
            b1.setAl(leer.next());
            System.out.println("Ingrese la primer nota");
            b1.setNota1(leer.nextInt());
            System.out.println("Ingrese la segunda nota");
            b1.setNota2(leer.nextInt());
            System.out.println("Ingrese la tercer nota");
            b1.setNota3(leer.nextInt());
            b1.setNotafinal((b1.getNota1() + b1.getNota2() + b1.getNota3()) / 3);
            b4.put(b1.getAl(), b1.getNotafinal());
            System.out.println("QUIERE INGRESAR OTRO ALUMNO?");
            String resp = leer.next();
            if (resp.equalsIgnoreCase("NO")) {
                go = true;

            }

        } while (!go);

        return b1;
    }

    public void notaFinal() {
        String aux;

        System.out.println("ingrese el alumno a buscar");
        aux = leer.next();

        for (Map.Entry<String, Integer> entry : b4.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
           
 if (aux.equals(key)) {
                System.out.println(key + " " + value);
            }else{
                System.out.println("no se encontró");
        }
        
            }
    }
}

