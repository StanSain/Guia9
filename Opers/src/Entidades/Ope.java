/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class Ope {

    private double n1;
    private double n2;

    public Ope(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Ope() {
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
//Método para crearOperacion(): que le pide al usuario los dos
//números y los guarda en los atributos del objeto

    public void Ing() {
        Scanner leer = new Scanner(System.in);
        n1 = leer.nextDouble();
        n2 = leer.nextDouble();
    }

    /*Método sumar(): calcular la suma de los números y devolver el
resultado al main.*/
    public double Sum(double n1, double n2) {
        double suma;
        suma = n1 + n2;
        return suma;
    }

    /*Método restar(): calcular la resta de los números y devolver el
resultado al main*/
    public double Rest(double n1, double n2) {
        double resta;
        resta = n1 - n2;
        return resta;
    }

    /*Método multiplicar(): primero valida que no se haga una
multiplicación por cero, si fuera a multiplicar por cero, el método
devuelve 0 y se le informa al usuario el error. Si no, se hace la
multiplicación y se devuelve el resultado al main*/
  
    public double Mult(double n1, double n2) {
       double producto;
       if (n2 == 0){
           System.out.println("no se puede ");
           producto = 0;
       }else{
       producto = n1*n2;           
       }
        return producto;
    }

    
 /*Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le
informa al usuario el error se le informa al usuario. Si no, se hace la
división y se devuelve el resultado al main.*/
    
   public double Div(double n1,double n2){
       double cociente;
       if (n2 == 0){
           System.out.println("div por cero");
           cociente = 0;
       }else{
           cociente = n1/n2;
       }
       return cociente;
   } 
    
    
}
