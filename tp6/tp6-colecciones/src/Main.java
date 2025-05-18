public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Producto jaggerMaister = new Producto("J1",
                "JaggerMaister 1.75L", 22000, 45,
                CategoriaProducto.ALIMENTOS);
        inventario.agregarProducto(jaggerMaister);


        // ahora agregar productos y probar si funciona
    }
}