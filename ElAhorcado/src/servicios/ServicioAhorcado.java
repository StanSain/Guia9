package servicios;

import java.util.Scanner;
import entidades.Ahorcado;
import static jdk.nashorn.internal.objects.NativeString.substring;

public class ServicioAhorcado {

    public ServicioAhorcado() {
    }


    /*Metodo crearJuego(): le pide la palabra al usuario y cantidad de
jugadas máxima. Con la palabra del usuario, pone la longitud de la
palabra, como la longitud del vector. Después ingresa la palabra en el
vector, letra por letra, quedando cada letra de la palabra en un índice
del vector. Y también, guarda la cantidad de jugadas máximas y el
valor que ingresó el usuario.*/
    public Ahorcado crearJuego() {
        Scanner leer = new Scanner(System.in);
        System.out.println("palabra ");
        String palabra = leer.next();
        int largoPal = palabra.length();
        String[] v = new String[largoPal];
        for (int i = 0; i < largoPal; i++) {
            v[i] = substring(palabra, i, (i + 1));
        }
        Ahorcado ah = new Ahorcado();
        ah.setPalBuscar(v);
//        for (int i = 0; i < largoPal; i++) {
//            System.out.print(ah.getPalBuscar()[i]+" ");
//        }
        int cantIntentos;
        System.out.println("intentos ");
        cantIntentos = leer.nextInt();
        ah.setJugadas(cantIntentos);
        return ah;
    }

    /*   Método longitud(): muestra la longitud de la palabra que se debe
encontrar. Nota: buscar como se usa el vector.length.*/
    public void longitudMuestra(Ahorcado z) {
        System.out.println("Longitud " + z.getPalBuscar().length);
    }

    /*Método encontradas(letra): que reciba una letra ingresada por el
usuario y muestre cuantas letras han sido encontradas y cuántas le
faltan. Este método además deberá devolver true si la letra estaba y
false si la letra no estaba, ya que, cada vez que se busque una letra
que no esté, se le restará uno a sus oportunidades.*/
    public void encontradas(Ahorcado z) {
        Scanner leer = new Scanner(System.in);
        boolean encuentra = false;
        int contEncont = 0;
        int maxJug = z.getJugadas();
        int faltaEncontrar = 0;
//        System.out.println(maxJug);
        String letraBuscada;
        String letraEncontrada = "";
        System.out.println("ingrese letraBuscada");
        letraBuscada = leer.next();
        if ((letraBuscada.equals(letraEncontrada)) && !(letraEncontrada == "")) {
            System.out.println("ingrese otra letra");
            letraBuscada = leer.next();
        }
        //--------------------------------------------------
        for (int i = 0; i < z.getPalBuscar().length; i++) {
            if (letraBuscada.equals(z.getPalBuscar()[i])) {
                contEncont++;
                encuentra = true;
                letraEncontrada = letraBuscada;
            }
        }
        //---------------------------------------------------
        if (encuentra == true) {
            maxJug--;
            z.setJugadas(maxJug);
            maxJug = 0;
        } else {
            maxJug--;
            z.setJugadas(maxJug);
        }
        System.out.println(letraBuscada + " esta en la palabra " + encuentra);
        System.out.println(letraBuscada + " esta en la palabra  " + contEncont + " veces");
        faltaEncontrar = z.getPalBuscar().length - contEncont;
        System.out.println("falta encontrar " + faltaEncontrar);
    }

    /*Método intentos(): para mostrar cuántas oportunidades le queda al
jugador*/
    public void intentos(Ahorcado z) {
        int intentosRestantes;
        intentosRestantes = z.getJugadas();
        System.out.println("quedan " + intentosRestantes);
    }

}
