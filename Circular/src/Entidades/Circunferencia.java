/*
Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia 
Area=〖π*radio〗^2
e) Método perimetro(): para calcular el perímetro
Perimetro=2*π*radio
 */
package Entidades;
import java.util.Scanner;
public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
    }


    public Circunferencia() {
       
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
public void IngRadio(){
 Scanner leer = new Scanner(System.in);
 radio= leer.nextDouble();
 System.out.println(" radio ingresado es "+radio);
}     
    
public double Super(double radio) {
    double area;
    double n1 = Math.PI*radio;
    double n2 = 2;
    area = Math.pow(n1, n2);
    return area;
}

public double Peri(double radio){
    double peri;
    double n1 = Math.PI*2;
    peri = n1*radio;
    return peri;
}


}
