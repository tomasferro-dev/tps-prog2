import java.util.ArrayList;
import java.util.Date;

public class Venta {
    private String fecha;
    private Cine cine;
    private ArrayList<Funcion> funciones = new ArrayList<>();
    private Pago pago;
    private ArrayList<Cliente> clientes = new ArrayList<>();


    public Venta(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public void agregarCliente(Cliente c){
        this.clientes.add(c);
    }

    @Override
    public String toString() {
        return "Venta{" +
                "fecha=" + fecha +
                '}';
    }
}
