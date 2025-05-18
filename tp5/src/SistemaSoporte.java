import java.util.ArrayList;

public class SistemaSoporte {
    private static int contadorTickets = 0;
    public ArrayList<TicketSoporte> tickets;

    public void crearTicket (int idTicket, String descripcion, Usuario usuario) {
        if(tickets == null) {
            tickets = new ArrayList<>();
        }
        TicketSoporte nuevoTicket = new TicketSoporte(idTicket, descripcion, usuario);
        tickets.add(nuevoTicket);
        contadorTickets++;
    }

    public void cargarTecnico(int idTicket, Tecnico tecnico){
        for(TicketSoporte ticket : tickets) {
            if(ticket.getIdTicket() == idTicket) {
                ticket.asignarTecnico(tecnico);
            }
        }
    }

    public void cargarFecha(int idTicket, String fecha){
        for(TicketSoporte ticket : tickets) {
            if(ticket.getIdTicket() == idTicket) {
                ticket.asignarFecha(fecha);
            }
        }
    }

    public void cerrarTicket(int idTicket){
        for(TicketSoporte ticket : tickets) {
            if(ticket.getIdTicket() == idTicket) {
                ticket.cerrarTicket();
            }
        }
    }

    public static int getCantidadTickets() {
        return contadorTickets;
    }

    public void mostrarTodosLosTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No hay tickets registrados.");
            return;
        }

        for (TicketSoporte ticket : tickets) {
            System.out.println(ticket.mostrarDetalle());
        }
    }


}
