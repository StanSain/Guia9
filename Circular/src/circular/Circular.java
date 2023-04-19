/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circular;

import Entidades.Circunferencia;

/**
 *
 * @author John
 */
public class Circular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia r1 = new Circunferencia();

        r1.IngRadio();

        double r = r1.getRadio();
        System.out.println("el radio es " + r);

        double sup;
        sup = r1.Super(r);
        System.out.println("superficie " + sup);
        
        double perimet;
        perimet = r1.Peri(r);
        System.out.println("perimetro "+ perimet);

    }

}
