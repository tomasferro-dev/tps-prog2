import java.util.HashSet;
import java.util.Set;

public class Pedido implements Pagable{

    private Set<Producto> productos;

    public Pedido() {
    }

    public Set<Producto> getProductos() {
        return productos;
    }

    public void agregarProducto(Producto producto) {
        if (this.productos ==null){
            this.productos = new HashSet<>();
        }
        this.productos.add(producto);
    }

    @Override
    public double calcularTotal() {
        double total = 0.0;
        if (this.productos != null) {
            for (Producto producto : this.productos) {
                total += producto.calcularTotal();
            }
        }
        return total;
    }
}
