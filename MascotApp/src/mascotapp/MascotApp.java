/*
Video del problema (encontrar pareja para el perro) al codigo. 
 */
package mascotapp;

import Entidades.Mascota;
import Entidades.Usuario;
import java.util.Scanner;
public class MascotApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

Mascota m1 = new Mascota("Pepe", "perro", leer.nextInt());

System.out.println(m1.nombre+" "+m1.apodo+" "+m1.edad);


Usuario u1 = new Usuario();
        
        
        }


}
