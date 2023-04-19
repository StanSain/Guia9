/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Libro;

/**
 *
 * @author John
 */
public class ServicioLibro {

    public void crearLibro(Libro N) {

 N.setIsbn("234");
 N.setTitulo("La Bala que dobló la esquina");
 N.setAutor("Pepe");
 N.setPaginas(5);
 
}
    public void mostrar(Libro k){
        System.out.println(k.toString());
    }
}
