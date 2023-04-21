package servicios;

import java.util.Scanner;
import entidades.Ahorcado;
import static jdk.nashorn.internal.objects.NativeString.substring;

public class ServicioAhorcado {

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
//        System.out.println(maxJug);
        String letra;

        while (maxJug > 0) {
            System.out.println("ingrese letra");
            letra = leer.next();
            //--------------------------------------------------
            for (int i = 0; i < z.getPalBuscar().length; i++) {
                if (letra.equals(z.getPalBuscar()[i])) {
                    contEncont++;
                    encuentra = true;
                }
            }
            //---------------------------------------------------
            if (encuentra == true) {
                maxJug = 0;
            } else {
                maxJug--;
                System.out.println("quedan " + maxJug + " intentos");
            }
            System.out.println(letra + " esta en la palabra " + encuentra);
            System.out.println(letra + " esta en la palabra  " + contEncont + " veces");
        }

    }
}
