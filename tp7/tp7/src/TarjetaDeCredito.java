public class TarjetaDeCredito implements PagoConDescuento{
    private String numeroTarjeta;
    private double montoPendiente;

    public TarjetaDeCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago(double monto) {
        montoPendiente = monto;
        System.out.println("Monto a pagar: " + monto);
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        double descuento = montoPendiente * porcentaje / 100;
        montoPendiente -= descuento;
        System.out.println("Descuento aplicado: $" + descuento + ". Monto final: $" + montoPendiente);
    }
}
