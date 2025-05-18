import java.util.ArrayList;

public class Pago {

    private double monto;
    private TipoPago tipo;
    private ArrayList<Venta> ventas = new ArrayList<>();


    public Pago() {
    }

    public Pago(double monto) {
        this.monto = monto;
    }

    public Pago(double monto, TipoPago tipo) {
        this.monto = monto;
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public TipoPago getTipo() {
        return tipo;
    }

    public void setTipo(TipoPago tipo) {
        this.tipo = tipo;
    }

    public void agregarVenta(Venta v){
        this.ventas.add(v);
    }
}
