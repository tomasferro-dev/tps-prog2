import java.util.ArrayList;

public class Funcion {

    private String horario;
    private ArrayList<Sala> salas;
    private ArrayList<Entrada> entradas;
    private Pelicula pelicula;
    private ArrayList<Venta> ventas = new ArrayList<>();

    public Funcion(String horario, ArrayList salas, ArrayList entradas) {
        this.horario = horario;
        this.salas = new ArrayList<>();
        this.entradas = new ArrayList<>();
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void agregarSala(Sala s){
        this.salas.add(s);
    }

    public void agregarEntrada(Entrada e){
        this.entradas.add(e);
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void agregarVenta(Venta v){
        this.ventas.add(v);
    }

    @Override
    public String toString() {
        return "Funcion{" +
                "horario='" + horario + '\'' +
                ", salas=" + salas +
                ", entradas=" + entradas +
                ", pelicula=" + pelicula +
                '}';
    }
}
