public class Main {
    public static void main(String[] args) {

//        // KATA 1.1
        Producto producto1 = new Producto("Alfajor Milka Oreo", 1800);
        Producto producto2 = new Producto("Alfajor Shot Triple", 1800);
        Producto producto3 = new Producto("Alfajor Aguila Brownie", 1200);
        Producto producto4 = new Producto("Alfajor Aguila Clasico", 1200);
        Producto producto5 = new Producto("Alfajor Entre Dos Whiskey", 2400);


        Pedido pedido1 = new Pedido();
        pedido1.agregarProducto(producto1);
        pedido1.agregarProducto(producto3);
        pedido1.agregarProducto(producto5);

//        System.out.println(pedido1.calcularTotal());
//        // FIN KATA 1.1

        // KATA 1.2
        TarjetaDeCredito tarjetaDeCredito1 = new TarjetaDeCredito("123123123");

        tarjetaDeCredito1.procesarPago(pedido1.calcularTotal());
        tarjetaDeCredito1.aplicarDescuento(10);
        // FIN KATA 1.2

        // KATA 1.3

        Cliente cliente1 = new Cliente("Tomas", "tomas@gmail");
        PedidoNotificable pedidoNotificable1 = new PedidoNotificable(cliente1, "Aceptado");
        pedidoNotificable1.cambiarEstado("En proceso");



        // FIN KATA 1.3
    }
}