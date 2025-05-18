import java.util.ArrayList;
import java.util.Date;

public class Compra {
    private Date fecha;
    private ArrayList<Proveedor> proveedores = new ArrayList<>();
    private ArrayList<Insumo> insumos = new ArrayList<>();

    public Compra() {

    }

    public Compra(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void agregarProveedor(Proveedor p){
        this.proveedores.add(p);
    }

    public void agregarInsumo(Insumo i){
        this.insumos.add(i);
    }

    @Override
    public String toString() {
        return "Compra{" +
                "proveedores=" + proveedores +
                ", insumos=" + insumos +
                '}';
    }
}
