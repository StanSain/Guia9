/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opers;

import Entidades.Ope;

/**
 *
 * @author John
 */
public class Opers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Ope n = new Ope();
n.Ing();
double na;
double nb;
na = n.getN1();
nb = n.getN2();
System.out.println("numeros ingresados "+na+" "+nb);
double sumaAB;
sumaAB = n.Sum(na, nb);
System.out.println(na + " + "+ nb + " = " + sumaAB);
double restaAB;
restaAB = n.Rest(na  , nb);
System.out.println(na +" - "+nb+" = "+restaAB);
double productoAB ;
productoAB = n.Mult(na, nb);
System.out.println(na+" x "+ nb +" = "+productoAB);
double divisionAB;
divisionAB = n.Div(na, nb);
System.out.println(na+ " / "+ nb + " = "+divisionAB);


    
    }
    
}
