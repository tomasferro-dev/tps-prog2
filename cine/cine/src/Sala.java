import java.awt.image.FilteredImageSource;
import java.util.ArrayList;

public class Sala {
    private int numero;
    private int capacidad;
    private Cine cine;
    private ArrayList<Funcion> funciones;

    public Sala(int numero, int capacidad, Cine cine, ArrayList funciones) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.cine = cine;
        this.funciones = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Cine getCine() {
        return cine;
    }

    public void setCine(Cine cine) {
        this.cine = cine;
    }

    public void agregarFuncion(Funcion f){
        this.funciones.add(f);
    }

    @Override
    public String toString() {
        return "Sala{" +
                "numero=" + numero +
                ", capacidad=" + capacidad +
                '}';
    }
}
