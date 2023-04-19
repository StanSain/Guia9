/*Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales. Crear la clase ArregloService, en el
paquete servicio, con los siguientes métodos:*/
package servicios;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author John
 */
public class ArregloServicios {

    /*Método inicializarA recibe un arreglo por parámetro y lo inicializa con
números aleatorios.*/
    public double[] inicia(double[] y) {
        Random m = new Random();

        for (int i = 0; i < y.length; i++) {
//            double x = (m.nextDouble() * 10) + 1;
            y[i] = (m.nextDouble() * 10) + 1;
        }

        return y;
    }

    /*Método mostrar recibe un arreglo por parámetro y lo muestra por
pantalla.*/
    public void mostrar(double[] y) {
        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }

    }

    /*Método ordenar recibe un arreglo por parámetro y lo ordena de
mayor a menor.*/
    public void ordena(double[] y) {
        int x = y.length;
        Arrays.sort(y, 0, x);
        
        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);

        }
    }
}