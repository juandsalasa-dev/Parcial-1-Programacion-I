package HotelStayPlus.model;

public class Servicio {
    //ATRIBUTOS
    private int codigo;
    public double precio;
    public String nombre, descripcion;
    public boolean disponibilidad;

    //RELACIONES
    private List<Reserva> = listReservaServicios;

    /**
     * Método Constructor de la clase Servicio
     * @param codigo
     * @param precio
     * @param nombre
     * @param descripcion
     * @param disponibilidad
     */
    private Servicio (int codigo, double precio, String nombre, String descripcion, boolean disponibilidad){
        this.codigo = codigo;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.listReservaServicios = new ArrayList();
    }
}
