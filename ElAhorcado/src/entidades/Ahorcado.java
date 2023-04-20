
package entidades;

public class Ahorcado {
public static String[] palBuscar;   

    public Ahorcado() {
    }

    public Ahorcado(String[] palBuscar) {
        this.palBuscar = palBuscar;
    }

    public String[] getPalBuscar() {
        return palBuscar;
    }

    public void setPalBuscar(String[] palBuscar) {
        this.palBuscar = palBuscar;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palBuscar=" + palBuscar + '}';
    }

}
