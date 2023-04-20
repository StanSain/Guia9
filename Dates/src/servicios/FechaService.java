package servicios;

import java.util.Scanner;

import java.util.Date;
import java.text.SimpleDateFormat;

public class FechaService {

    /*Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);*/
    public Date Nace() {
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-M-dd");
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dia, mes y año de su nacimiento");
        int dia, mes, anio;
        dia = leer.nextInt();
        mes = leer.nextInt();
        anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        return fecha;

    }

    /*Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();*/
    public Date fechaActual() {
        Date hoy = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("yyy-M-dd");
//        System.out.println(sd.format(hoy));
        return hoy;
    }
/*Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario).*/
    
    public void diferencia(Date d1,Date d2){
        int y1 = d1.getYear();
        int y2 = d2.getYear();
        System.out.println(" tienes "+(y1-y2)+" años ");
    }
}
