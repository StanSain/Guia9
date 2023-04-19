/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cadena;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.substring;


/**
 *
 * @author John
 */
public class ServicioCadena {

    public void crearCadena(Cadena j) {
        Scanner leer = new Scanner(System.in);
        j.setFrase("La mar estaba serena pero un tifon vino ");
//        j.setLongitud(j.getFrase().length());
        System.out.println(j.getLongitud());
    }

    public void mostrarCadena(Cadena h) {
        System.out.println(h);
    }

    /*Método mostrarVocales(), deberá contabilizar la cantidad de vocales
que tiene la frase ingresada*/
    public void mostrarVocales(Cadena n) {
        
        int contadorA = 0;
           for (int i = 0; i < n.getLongitud(); i++){
             char v =  n.getFrase().charAt(i);
             if((v == 'a')||(v == 'e')||(v == 'i')||(v == 'o')||(v == 'u')){
                contadorA++; 
             }
           }
        System.out.println("cantidad de v " + contadorA);
    }

    /*Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
asac".*/
    public void revertirFrase(Cadena j) {
        String original = j.getFrase();
        String invertida = "";
        for (int i = 0; i < original.length(); i++) {
            {
                invertida = original.charAt(i) + invertida;
            }

        }
        System.out.println(invertida);
    }
}
