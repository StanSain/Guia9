/*Crea una clase "C1" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad 
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.*/
package cajasbanco;

import entidades.caja;
import java.util.Scanner;
import servicios.ServicioCaja;

class CajasBanco {
    
    public static void main(String[] args) {
        caja c1 = new caja();
        ServicioCaja sc = new ServicioCaja();
        sc.retiro(c1);
    }
    
}
