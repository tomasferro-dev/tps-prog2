import java.util.ArrayList;

public class ClienteVIP extends Cliente {
    protected float descuento;
    private ArrayList<Venta> ventas = new ArrayList<>();


    public ClienteVIP(String nombre, String email, float descuento) {
        super(nombre, email);
        this.descuento = descuento;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

}
