import java.util.ArrayList;
import java.util.SimpleTimeZone;

public class Cliente {

    private String nombre;
    private String email;
    private ArrayList<Venta> ventas = new ArrayList<>();

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void agregarVenta(Venta v){
        this.ventas.add(v);
    }
}
