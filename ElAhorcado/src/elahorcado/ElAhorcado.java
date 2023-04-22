/*Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual
deberá contener como atributos, un vector con la palabra a buscar, la
cantidad de letras encontradas y la cantidad jugadas máximas que
puede realizar el usuario. Definir los siguientes métodos en
AhorcadoService:*/
package elahorcado;

import entidades.Ahorcado;
import servicios.ServicioAhorcado;

public class ElAhorcado {

    public static void main(String[] args) {
        ServicioAhorcado sa = new ServicioAhorcado();
        Ahorcado a = new Ahorcado();
        a = sa.crearJuego();
        sa.longitudMuestra(a);
        sa.encontradas(a);
        sa.intentos(a);

    }
}
