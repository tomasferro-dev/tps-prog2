public class PedidoNotificable {
    private Cliente cliente;
    private String estado;

    public PedidoNotificable(Cliente cliente, String estado) {
        this.cliente = cliente;
        this.estado = "Pendiente";
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        String mensaje = "El estado de su pedido ha cambiado a: " + nuevoEstado;
        cliente.notificar(mensaje);
    }
}
