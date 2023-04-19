/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado. */
package juegos;

import java.util.Scanner;
import Entidades.Juego;

public class Juegos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Juego j1 = new Juego();//le jugador uno elije un numero
        Juego j2 = new Juego();

        j1.Elijo();
        int nj1;
        nj1 = j1.getN();
        System.out.println(nj1);

        int nj2;
        System.out.println("jugador 2 ingresa numero ");
        nj2 = leer.nextInt();
       while (nj2 <= 0 || nj2 > 10) {
            System.out.println("jugador 2 ingresa numero ");
            nj2 = leer.nextInt();
        }
       
       
       

    }

}
