/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiniela;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random m = new Random();
//        double x = (int) (m.nextDouble() * 10);
//        System.out.println(x);
        double capital = 2000;
        System.out.println("capital inicial " + capital);
        int cont = 1;
        while (cont <= 10) {
          System.out.println("numero_apostado: ");
          double  numero_apostado = leer.nextDouble();
  
            System.out.println("monto  ");
            double monto = leer.nextDouble();
            double numero_sorteado = (int) (m.nextDouble() * 10);
            System.out.println("numero_sorteado " + numero_sorteado);
            if (numero_apostado == numero_sorteado) {
                capital += monto * 6;
            } else {
                capital -= monto;
            }
            cont++;
            System.out.println("jugada " + cont);
            System.out.println("capital " + capital);
        }
    }

}
