import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public void agregarProducto(Producto p){
        if (this.productos == null) {
            productos = new ArrayList<>();
        } else {
            this.productos.add(p);
        }
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos!");
            return;
        }
        for (Producto p : productos) {
            System.out.println(p.mostrarInfo());
        }
    }
}
