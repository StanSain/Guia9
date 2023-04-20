/*Implemente la clase Persona en el paquete entidades. Una persona tiene
un nombre y una fecha de nacimiento */
package recursoshumanos;

import servicios.ServicioPersona;
import entidades.Persona;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RecursosHumanos {

    public static void main(String[] args) {
        Persona pq = new Persona();
        ServicioPersona sp = new ServicioPersona();
        SimpleDateFormat sd = new SimpleDateFormat("dd/M/yyyy");
        pq = sp.crear();
        System.out.println("nombre " + pq.getNombre());
        Date fecha = new Date();
        fecha = pq.getNacimiento();
        System.out.println("fecha de nacimiento " + sd.format(fecha));
        Persona pq1 = new Persona();
        pq1 = sp.crear();
        int edad = 18;
        boolean mayor = false;
        mayor = sp.menorQue(pq1, edad);
        System.out.println(pq1.getNombre() + " es mayor de " + edad + " " + mayor);
    }

}
