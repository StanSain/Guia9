/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author John
 */
public class Distancia {
  public double x1;
  public double y1;
  public double x2;
  public double y2;

    public Distancia() {
    }

    public Distancia(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
  public double DistPunt(double x1,double x2, double y1, double y2){
      double distancia;
      distancia = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
      return distancia;
      
  }
}
