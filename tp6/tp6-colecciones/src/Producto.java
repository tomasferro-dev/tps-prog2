public class Producto {
    private String idProducto;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoriaProducto;


    public Producto(String idProducto, String nombre, double precio,
                    int cantidad, CategoriaProducto categoriaProducto) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoriaProducto = categoriaProducto;
    }

    public String mostrarInfo() {
        return "Producto{" +
                "idProducto='" + idProducto + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", categoriaProducto=" + categoriaProducto +
                '}';
    }
}
