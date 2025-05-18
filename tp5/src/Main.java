public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(789456123, "Franco", "franco@gmail.com");
        SistemaSoporte sistema = new SistemaSoporte();
        sistema.crearTicket(1, "reembolso", usuario);
        sistema.mostrarTodosLosTickets();

        Tecnico tecnico1 = new Tecnico(11, "Roberto", "Redes");
        sistema.cargarTecnico(1, tecnico1);

        String fecha1 = "11/04/2025";
        sistema.cargarFecha(1, fecha1);
        sistema.mostrarTodosLosTickets();

        sistema.crearTicket(2, "reembolso", usuario);
        sistema.crearTicket(3, "reembolso", usuario);
        sistema.crearTicket(4, "reembolso", usuario);

//        sistema.mostrarTodosLosTickets();

        sistema.cerrarTicket(1);
        sistema.mostrarTodosLosTickets();

        System.out.println("Cantidad Tickets: " + sistema.getCantidadTickets());


    }
}