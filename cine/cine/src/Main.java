import javax.swing.plaf.BorderUIResource;

public class Main {
    public static void main(String[] args) {
        // Crear un Cine
        Cine cinemark = new Cine("Cinemark");

        // Crear varias Salas
        Sala sala1 = new Sala(1, 100, cinemark, null);
        Sala sala2 = new Sala(2, 120, cinemark, null);
        Sala sala3 = new Sala(3, 150, cinemark, null);

        // Asociar las salas al cine
        cinemark.agregarSala(sala1);
        cinemark.agregarSala(sala2);
        cinemark.agregarSala(sala3);

        // crear sala VIP
        SalaVIP vip1 = new SalaVIP(1000, 55, cinemark, "Asientos reclinables y refill de gaseosas");

        // Asociar esta sala vip al cine
        cinemark.agregarSala(vip1);

        // mostrar info del cine
//        System.out.println(cinemark);

        // Crear funcion
        Funcion funcion1 = new Funcion("18:00", null, null);
        Funcion funcion2 = new Funcion("21:00", null, null);

        // Agregar salas a la funcion
        funcion1.agregarSala(sala1);
        funcion1.agregarSala(sala2);



        // Agregar la funcion a la sala
        sala1.agregarFuncion(funcion1);

        // Mostrar todas las salas y filtrar cuáles son VIP
//        cinemark.mostrarSalasPorTipo();

        Entrada entrada1 = new Entrada(4000, "A1" , null);
        Entrada entrada2 = new Entrada(4000, "B4" , null);
        Entrada entrada3 = new Entrada(4000, "F17" , null);
        Entrada entrada4 = new Entrada(4000, "E3" , null);

        funcion1.agregarEntrada(entrada1);
        funcion1.agregarEntrada(entrada2);

        entrada1.agregarFuncion(funcion1);
        entrada2.agregarFuncion(funcion1);


        // Crear la pelicula
        Pelicula pelicula1 = new Pelicula("Spiderman 3", cinemark);
        Pelicula pelicula2 = new Pelicula("The Matrix", cinemark);
        pelicula2.setGenero(Genero.CIENCIA_FICCION);

        funcion1.setPelicula(pelicula1);

        pelicula1.agregarFuncion(funcion1);
        pelicula1.agregarFuncion(funcion2);
        // Mostrar funcion
//        System.out.println(funcion1);
//        System.out.println(funcion2);

        Compra compra1 = new Compra();
        cinemark.agregarCompra(compra1);

        Proveedor proveedor1 = new Proveedor("Coca-Cola");
        proveedor1.setCompra(compra1);

        Proveedor proveedor2 = new Proveedor("Ray-Ban");
        proveedor2.setCompra(compra1);

        compra1.agregarProveedor(proveedor1);
        compra1.agregarProveedor(proveedor2);

        Insumo insumo1 = new Insumo("Suplemento 10L", compra1);
        Insumo insumo2 = new Insumo("Gafas 3D", compra1);
        Insumo insumo3 = new Insumo("Gafas Premium", compra1);

        // Mostrar Compra
//        System.out.println(compra1);

        Venta venta1 = new Venta("17.04");
        Cliente cliente1 = new Cliente("Tomas", "tomasferro@gmail.com");
        venta1.agregarCliente(cliente1);
        Venta venta2 = new Venta("18.04");
        ClienteVIP clienteVIP1 = new ClienteVIP("David", "davidlopez@gmail.com", 15);
        venta2.agregarCliente(clienteVIP1);

        funcion1.agregarVenta(venta1);
        funcion2.agregarVenta(venta1);
        funcion2.agregarVenta(venta2);

        cinemark.agregarVenta(venta1);
        cinemark.agregarVenta(venta2);



        System.out.println(cinemark.mostrarVentas());


    }
}