/* Realizar una clase llamada ParDeNumeros que tenga como atributos dos
números reales con los cuales se realizarán diferentes operaciones
matemáticas. La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos
números. Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:*/
package dosnumeros;

import entidades.Numero;
import servicios.ParDeNumeros;

public class DosNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numero n = new Numero();
        ParDeNumeros p = new ParDeNumeros();
        p.muestrNumeros(n);
        p.cualMayor(n);
        p.potencia(n);
        p.raiz(n);
    }

}
