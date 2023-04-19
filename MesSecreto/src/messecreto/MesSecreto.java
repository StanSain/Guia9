/*Crea una clase en Java donde declares una variable de tipo array de
Strings que contenga los doce meses del año, en minúsculas. A
continuación, declara una variable mesSecreto de tipo String, y hazla
igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario
acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría
ser este:*/
package messecreto;

import entidades.Mes;
import servicios.ServicioMes;
import java.util.Scanner;
/**
 *
 * @author John
 */
public class MesSecreto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Mes m = new Mes();

        ServicioMes sm = new ServicioMes();
        sm.creaMeses(m);

        System.out.println("ingrese mes (las tres primeras letras en minucula");
        String mes1 =leer.next();
        sm.compara(mes1);
        
    }

}
