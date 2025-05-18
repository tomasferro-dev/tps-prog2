import java.util.ArrayList;

public class Entrada {

    private double precio;
    private String asiento;
    private ArrayList<Funcion> funciones;

    public Entrada(double precio, String asiento, ArrayList funciones) {
        this.precio = precio;
        this.asiento = asiento;
        this.funciones = new ArrayList<>();
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public void agregarFuncion(Funcion f){
        this.funciones.add(f);
    }

    @Override
    public String toString() {
        return "Entrada{" +
                "precio=" + precio +
                ", asiento='" + asiento + '\'' +
                '}';
    }
}
