package entidades;

public class Ahorcado {

    private  String[] palBuscar;
    private int jugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palBuscar, int jugadas) {
        this.palBuscar = palBuscar;
        this.jugadas = jugadas;
    }

    public String[] getPalBuscar() {
        return palBuscar;
    }

    public void setPalBuscar(String[] palBuscar) {
        this.palBuscar = palBuscar;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palBuscar=" + palBuscar + ", jugadas=" + jugadas + '}';
    }

 
}
