/*Implemente la clase Persona en el paquete entidades. Una persona tiene
un nombre y una fecha de nacimiento */
package entidades;

import java.util.Date;

public class Persona {
  private String nombre;
private Date nacimiento;  

    public Persona() {
    }

    public Persona(String nombre, Date nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", nacimiento=" + nacimiento + '}';
    }

}
