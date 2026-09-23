package HotelStayPlus.model;

public class Reserva {
    //ATRIBUTOS
    private int codigo;
    private String fechaRealizacion, fechaEntrada, fechaSalida, estado, metodoPago;
    private double valorTotal;

    //RELACIONES
    private Huesped huesped;
    private Habitacion habitacion;
    private list<Servicio> ListServicio;

    /**
     * Método Constructor de la clase Reserva
     * @param codigo
     * @param fechaRealizacion
     * @param fechaEntrada
     * @param fechaSalida
     * @param estado
     * @param metodoPago
     * @param valorTotal
     * @param huesped
     * @param habitacion
     */
    private Reserva (int codigo, String fechaRealizacion, String fechaEntrada, String fechaSalida, String estado, String metodoPago, double valorTotal, Huesped huesped, Habitacion habitacion){
        this.codigo = codigo;
        this.estado = estado;
        this.fechaEntrada = fechaEntrada;
        this.fechaRealizacion = fechaRealizacion;
        this.fechaSalida = fechaSalida;
        this.habitacion = habitacion;
        this.huesped = huesped;
        this.ListServicio = ListaServicio;
        this.metodoPago = metodoPago;
        this.valorTotal = valorTotal;
        this.listServicio = new ArrayList();
    }
}
