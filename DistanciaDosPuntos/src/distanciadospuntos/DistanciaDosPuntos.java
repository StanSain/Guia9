/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al
usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que
existe entre los dos puntos que existen en la clase Puntos. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente lin
 */
package distanciadospuntos;

import Entidades.Distancia;
import Entidades.Punto;

public class DistanciaDosPuntos {

    public static void main(String[] args) {
        Punto p1 = new Punto();
        Punto p2 = new Punto();
        p1.IngPunt();
        p2.IngPunt();

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        Distancia d = new Distancia();
        double x1 = p1.getX();
        double x2 = p2.getX();
        double y1 = p1.getY();
        double y2 = p2.getY();

       double distancia= d.DistPunt( x1 ,  x2,  y1,  y2);
        System.out.println(distancia);
    


    }

}
