/*Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.*/
package Entidades;

import java.util.Scanner;

public class Rect {

    private double base;
    private double altura;

    public Rect() {
    }

    public Rect(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void Ing() {
        Scanner leer = new Scanner(System.in);
        base = leer.nextDouble();
        altura = leer.nextDouble();
    }

    public double Sup(double base, double altura) {
        double superficie;
        superficie = base * altura;
        return superficie;
    }

    public double Per(double base, double altura) {
        double perimetro;
        perimetro = (2 * base) + (2 * altura);
        return perimetro;
    }

    @Override
    public String toString() {
        return "Rect{" + "base=" + base + ", altura=" + altura + '}';
    }
  public void Dibuja(){
     int baseC = (int)base;
int altuC = (int)altura;
for (int i = 1; i<= altuC;i++){
    for (int j=1; j<= baseC;j++){
        System.out.print("*");
    }
    System.out.println();
} 
  }  

    
    
}
