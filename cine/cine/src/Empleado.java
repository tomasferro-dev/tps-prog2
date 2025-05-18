import java.util.ArrayList;

public class Empleado {
    private String nombre;
    private int dni;

    private ArrayList<Cine> cines;

    public Empleado() {
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public Empleado(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void agregarCine(Cine c){
        if (this.cines == null){
            this.cines = new ArrayList<>();
        }
        this.cines.add(c);
    }
}
