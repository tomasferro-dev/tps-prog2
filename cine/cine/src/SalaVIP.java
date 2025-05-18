public class SalaVIP extends Sala{
    protected String beneficios;


    public SalaVIP(int numero, int capacidad, Cine cine, String beneficios) {
        super(numero, capacidad, cine, null);
        this.beneficios = beneficios;
    }


    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public String toString() {
        return "Sala VIP " + super.toString() + " Beneficios: " + beneficios;
    }
}
