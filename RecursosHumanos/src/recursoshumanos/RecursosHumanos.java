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
    }
    /*Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario*/
    public boolean menorQue(Persona p , int e){
        boolean menor = true;
        return menor;
    }
}
