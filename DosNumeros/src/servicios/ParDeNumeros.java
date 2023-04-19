/*Realizar una clase llamada ParDeNumeros que tenga como atributos dos
números reales con los cuales se realizarán diferentes operaciones
matemáticas. La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos
números. Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:*/
package servicios;

import entidades.Numero;

/**
 *
 * @author John
 */
public class ParDeNumeros {

    /*Método mostrarValores que muestra cuáles son los dos números
guardados.*/
    public void muestrNumeros(Numero y) {
        System.out.println("N1 " + y.getN1());
        System.out.println("N2 " + y.getN2());
    }

    /*Método devolverMayor para retornar cuál de los dos atributos tiene
el mayor valo*/
    public void cualMayor(Numero j) {
//        double m1= j.getN1();
//        System.out.println(m1);
//        double m2= j.getN2();
//        System.out.println(m2);
//        if(m1>m2){
//            System.out.println("m1 > m2");
//        }
//        else{
//            System.out.println("m2 > m1");
        if (j.getN1() > j.getN2()) {
            System.out.println("n1 >  n2 ");
        } else {
            System.out.println("n2 > n1 ");
        }
    }

    /*Método calcularPotencia para calcular la potencia del mayor valor de
la clase elevado al menor número. Previamente se deben redondear
ambos valores.*/
    public void potencia(Numero y) {
        double m1 = Math.round(y.getN1());
        double m2 = Math.round(y.getN2());
        System.out.println("N1 rounded " + m1);
        System.out.println("N2 rounded " + m2);
        if (m1 > m2) {
            System.out.println("N1 elevado a N2 " + Math.pow(m1, m2));
        } else {
            System.out.println("N2 elevado a N1 " + Math.pow(m2, m1));
        }

    }

    /*Método calculaRaiz, para calcular la raíz cuadrada del menor de los
dos valores. Antes de calcular la raíz cuadrada se debe obtener el
valor absoluto del número.*/
    public void raiz(Numero y) {
        double m1 = Math.abs(Math.round(y.getN1()));
        double m2 = Math.abs(Math.round(y.getN2()));
//        System.out.println(m1);
//        System.out.println(m2);
        if (m1 > m2) {
            System.out.println("Raiz cuadrada de N1 "+Math.sqrt(m1));
        } else {
            System.out.println("Raiz cuadrada de N2 "+Math.sqrt(m2));
        }
        
    }
}
