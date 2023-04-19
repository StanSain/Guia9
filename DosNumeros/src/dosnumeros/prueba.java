/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosnumeros;

/**
 *
 * @author John
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n1 = Math.random() * 100;
        double n2 = Math.random() * 100;

        System.out.println(n1);
        System.out.println(n2);

        if (n1 > n2) {
            System.out.println("n1 > n2");
        } else {
            System.out.println("n2 > n1");
        }
        System.out.println((Math.round(n1)));
        System.out.println((Math.round(n2)));
    }

}
