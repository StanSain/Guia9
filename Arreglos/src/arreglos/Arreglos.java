/*Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales. Crear la clase ArregloService, en el
paquete servicio, con los siguientes métodos:*/
package arreglos;

import servicios.ArregloServicios;

/**
 *
 * @author John
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] a1 = new double[50];
        double[] a2 = new double[20];
        ArregloServicios ar = new ArregloServicios();

        System.out.println(ar.inicia(a1));

        System.out.println(ar.inicia(a2));
        System.out.println("arreglo A ");
        ar.mostrar(a1);
        System.out.println("arreglo B");
        ar.mostrar(a2);
        System.out.println();
        ar.ordena(a2);
        System.out.println();
        ar.ordena(a1);
        

    }

}
