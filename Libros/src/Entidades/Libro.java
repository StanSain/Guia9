/*
Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas
 */
package Entidades;

import java.util.Scanner;

public class Libro {

    public String isbn;
    public String titulo;
    public String autor;
    public int paginas;

    public Libro(String isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Libro() {
    }

    public void Ingreso() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ISBN");
        isbn = leer.next();
        System.out.println("titulo");
        titulo = leer.next();
        System.out.println("autor");
        autor = leer.next();
        System.out.println("paginas");
        paginas = leer.nextInt();
        
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
    }

}
