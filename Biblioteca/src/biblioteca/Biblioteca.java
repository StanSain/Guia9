/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN,
Título, Autor,Número de páginas, y un constructor con todos los atributos
pasados por parámetro y un constructor vacío. Crear un método para cargar
un libro pidiendo los datos al usuario y luego informar mediante otro método
el número de ISBN, el título, el autor del libro y el
numero de página
 */
package biblioteca;

import entidades.Libro;
import servicios.ServicioLibro;
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Libro lib1 = new Libro();
    ServicioLibro sl = new ServicioLibro();
    sl.crearLibro(lib1);
    sl.mostrar(lib1);
//    System.out.println(lib1);
    
    
    }

}
