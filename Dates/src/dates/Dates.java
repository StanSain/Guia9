/*amos a usar la clase Date que ya existe en Java. Crearemos la clase
FechaService, en paquete Servicios, que tenga los siguientes métodos:*/
package dates;

import java.text.SimpleDateFormat;
import servicios.FechaService;
import java.util.Date;

public class Dates {

    public static void main(String[] args) {

        SimpleDateFormat sd = new SimpleDateFormat("yyyy-M-dd");
//        System.out.println(sd.format(fecha));
//        System.out.println(fecha.getYear() + 1900);
        FechaService fs = new FechaService();
        Date cumple = new Date();
        cumple = fs.Nace();
        System.out.println("fecha de nacimiento " + sd.format(cumple));
        System.out.println();
        System.out.print("hoy es ");
        System.out.println(sd.format(fs.fechaActual()));
        fs.diferencia(fs.fechaActual(), cumple);

    }

}
