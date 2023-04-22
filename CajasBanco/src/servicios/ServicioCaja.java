/*Crea una clase "C1" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad 
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.*/
package servicios;

import entidades.caja;

import java.util.Scanner;

public class ServicioCaja {

    public void retiro(caja x) {
        Scanner leer = new Scanner(System.in);
        x.setSaldo(10000);
        double montoRetiro;
        System.out.println("ingrese monto a retirar");
        montoRetiro = leer.nextDouble();
        //------------------------------------
        if (montoRetiro > x.getSaldo()) {
            int opc = 0;
            boolean seguir = true;
            //----------------------
            while (seguir == true) {
                System.out.println("retiro mayor que saldo");
                System.out.println("ingrese opcion 1: retirar todo el saldo; 2: salir");
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        montoRetiro = x.getSaldo();
                        x.setSaldo(0);
                        System.out.println("saldo "+x.getSaldo());
                        seguir = false;
                        break;
                    case 2:
                        seguir = false;
                        break;
                    default:
                        opc = 0;
                        System.out.println("ingrese opcion 1: retirar todo el saldo; 2: salir");
                        opc = leer.nextInt();
                        break;
                }
            }
            //-----------------------
            //------------------------------------
        } else {
            double saldo = 0;
            saldo = x.getSaldo() - montoRetiro;
            System.out.println("saldo " + saldo);
        }

    }
}
