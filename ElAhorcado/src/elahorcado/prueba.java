/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elahorcado;

import servicios.ServicioAhorcado;
import entidades.Ahorcado;

/**
 *
 * @author John
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioAhorcado sa = new ServicioAhorcado();
        Ahorcado a = new Ahorcado();
        a = sa.crearJuego();
        System.out.println();
        for (int i = 0; i < 4; i++) {
        System.out.println(a.getPalBuscar()[i]);    
        }
        
    }

}
