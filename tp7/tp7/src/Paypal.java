public class Paypal implements PagoConDescuento{
    private String email;

    public Paypal(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void aplicarDescuento(double porcentaje) {

    }

    @Override
    public void procesarPago(double monto) {

    }
}
