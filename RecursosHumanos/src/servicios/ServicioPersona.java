/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

/**
 *
 * @author John
 */
public class ServicioPersona {

    /*Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.*/
    public Persona crear() {
        Scanner leer = new Scanner(System.in);
        Persona p1 = new Persona();
        System.out.println("nombre");
        p1.setNombre(leer.next());
        System.out.println("año, mes y dia de nacimiento");
        int anio = leer.nextInt();
        int mes = leer.nextInt();
        int dia = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        p1.setNacimiento(fecha);
        return p1;
    }

    /*Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario*/
    public boolean menorQue(Persona p, int e) {
        boolean menor = true;
        if ((p.getNacimiento().getYear()) < e) {
            menor = true;
        } else {
            menor = false;
        }
        return menor;
    }
}
