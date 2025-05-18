public class Insumo {
    private String nombre;
    private double precio;
    private Compra compra;

    public Insumo(String nombre, Compra compra) {
        this.nombre = nombre;
        compra.agregarInsumo(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    @Override
    public String toString() {
        return "Insumo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
