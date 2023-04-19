
package rectangulos;
import Entidades.Rect;
public class Rectangulos {

    public static void main(String[] args) {
Rect r1 = new Rect();
r1.Ing();

double base1 = r1.getBase();
double altura1 = r1.getAltura();

System.out.println(r1.toString());

System.out.println("superficie " + r1.Sup(base1, altura1));

System.out.println("perimetro "+ r1.Per(base1, altura1));

r1.Dibuja();

    }
    
}
