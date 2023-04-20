package servicios;

import java.util.Scanner;
import entidades.Ahorcado;
import static jdk.nashorn.internal.objects.NativeString.substring;

public class ServicioAhorcado {

    /*Metodo crearJuego(): le pide la palabra al usuario y cantidad de
jugadas máxima. Con la palabra del usuario, pone la longitud de la
palabra, como la longitud del vector. Después ingresa la palabra en el
vector, letra por letra, quedando cada letra de la palabra en un índice
del vector. Y también, guarda la cantidad de jugadas máximas y el
valor que ingresó el usuario.*/
    public void crearJuego() {
        String palabra;
        int cantidad;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la palabra a buscar ");
        palabra = leer.next();
        int longitud = palabra.length();
        System.out.println("cantidad de intentos ");
        cantidad = leer.nextInt();
        Ahorcado ah = new Ahorcado();
        String[] v = new String[longitud];
        ah.setPalBuscar(v);
        for (int i = 0; i < longitud; i++) {
            v[i] = palabra.substring(i, i + 1);
        }
//    for (int i = 0; i < longitud; i++) {
//        System.out.print(v[i]+" ");
//    }

//    for (int i = 0; i < longitud; i++) {
//        System.out.print(ah.getPalBuscar()[i]+" ");
//    }
    }
    /*● Método longitud(): muestra la longitud de la palabra que se debe
encontrar. Nota: buscar como se usa el vector.length.*/
    public void longitudMuestra(){
        Ahorcado d = new Ahorcado();
        System.out.println(d.getPalBuscar().length);
    }
}
