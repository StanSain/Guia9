/*Realizar una clase llamada ParDeNumeros que tenga como atributos dos
números reales con los cuales se realizarán diferentes operaciones
matemáticas. La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos
números. Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:*/
package entidades;

/**
 *
 * @author John
 */
public class Numero {
    private static double n1;
    private static double n2;

    public Numero() {
        this.n1 = Math.random()*10;
        this.n2 = Math.random()*10;
    }

    public Numero(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    @Override
    public String toString() {
        return "Numero{" + "n1=" + n1 + ", n2=" + n2 + '}';
    }
    
    
}
