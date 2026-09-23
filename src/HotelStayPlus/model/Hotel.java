package HotelStayPlus.model;

public class Hotel {
    //ATRIBUTOS
    public int telefono, nit;
    public String nombre, direccion, paginaWeb;

    //RELACIONES
    private List<Huesped> listHuespedesHotel;
    private List<Reserva> listReservasHotel;
    private List<Habitacion> listHabitacionesHotel;
    private List<Servicios> listServiciosHotel;


    /**
     * Método Constructor de la clase Hotel
     * @param telefono
     * @param nit
     * @param nombre
     * @param direccion
     * @param paginaWeb
     */
    public Hotel(int telefono, int nit, String nombre, String direccion, String paginaWeb) {
        this.paginaWeb = paginaWeb;
        this.direccion = direccion;
        this.nombre = nombre;
        this.listHuespedesHotel = new ArrayList();
        this.listReservasHotel = new ArrayList();
        this.listHabitacionesHotel = new ArrayList();
        this.listServiciosHotel = new ArrayList();
    }


}
