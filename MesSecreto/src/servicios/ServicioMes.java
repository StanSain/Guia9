/*Crea una clase en Java donde declares una variable de tipo array de
Strings que contenga los doce meses del año, en minúsculas. A
continuación, declara una variable mesSecreto de tipo String, y hazla
igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario
acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría
ser este:*/
package servicios;

import entidades.Mes;

/**
 *
 * @author John
 */
public class ServicioMes {

    public void creaMeses(Mes b) {
        Mes n = new Mes();

        String[] m = new String[12];
        m[0] = "ene";
        m[1] = "feb";
        m[2] = "mar";
        m[3] = "abr";
        m[4] = "may";
        m[5] = "jun";
        m[6] = "jul";
        m[7] = "ago";
        m[8] = "set";
        m[9] = "oct";
        m[10] = "nov";
        m[11] = "dic";

        for (int i = 0; i < 12; i++) {
            System.out.println(m[i]);

        }

    }

    public void compara(String m) {
if (m.equals("ago")){
    System.out.println("acerto");
}else{
    System.out.println("no acerto pruebe de nuevo");
}
        
    }

}
