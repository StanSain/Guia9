/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;
import entidades.Cadena;
import servicios.ServicioCadena;
/**
 *
 * @author John
 */
public class s {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Cadena h = new Cadena();
    ServicioCadena sc = new ServicioCadena();
    sc.crearCadena(h);
    sc.mostrarCadena(h);
    sc.mostrarVocales(h);
    sc.revertirFrase(h);
    
    

    }
    
}
