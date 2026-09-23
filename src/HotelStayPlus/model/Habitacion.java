package HotelStayPlus.model;

public class Habitacion {
    //ATRIBUTOS
    public int numero, piso, capMaxima;
    public double precioNoche;
    public String tipo, estado;

    //RELACIONES
    private List<Reserva> listaReservasHabitaciones;


    /**
     *Método Constructor de la clase Habitacion
     * @param numero
     * @param piso
     * @param capMaxima
     * @param precioNoche
     * @param tipo
     * @param estado
     */
    private Habitacion(int numero, int piso, int capMaxima, double precioNoche, String tipo, String estado){
     this.capMaxima = capMaxima;
     this.estado = estado;
     this.listaReservasHabitaciones = new ArrayList();
     this.numero = numero;
     this.piso = piso;
     this.precioNoche = precioNoche;
     this.tipo = tipo;
     }


}
