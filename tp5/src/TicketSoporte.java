public class TicketSoporte {
    private int idTicket;
    private String descripcion;
    private String fechaCreacion;
    private EstadoTicket estado;
    private Usuario usuario;
    private Tecnico tecnico;

    public TicketSoporte(int idTicket, String descripcion) {
        this.idTicket = idTicket;
        this.descripcion = descripcion;
        this.estado = EstadoTicket.ABIERTO;
    }

    public TicketSoporte(int idTicket, String descripcion, Usuario usuario) {
        this.idTicket = idTicket;
        this.descripcion = descripcion;
        this.estado = EstadoTicket.ABIERTO;
        this.usuario = usuario;
    }

    public void cerrarTicket () {
        this.estado = EstadoTicket.CERRADO;
    }

    public void asignarTecnico(Tecnico tecnico){
        this.tecnico = tecnico;
    }

    public void asignarFecha(String fecha) {
        this.fechaCreacion = fecha;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public String mostrarDetalle() {
        if (tecnico == null) {
            return "TicketSoporte{" +
                    "idTicket=" + idTicket +
                    ", descripcion='" + descripcion + '\'' +
                    ", fechaCreacion='" + fechaCreacion + '\'' +
                    ", estado=" + estado +
                    ", tecnico=" + "No asignado" +
                    '}';
        } else {
            return "TicketSoporte{" +
                    "idTicket=" + idTicket +
                    ", descripcion='" + descripcion + '\'' +
                    ", fechaCreacion='" + fechaCreacion + '\'' +
                    ", estado=" + estado +
                    ", tecnico=" + tecnico.mostrarTecnico() +
                    '}';
        }
    }
}
