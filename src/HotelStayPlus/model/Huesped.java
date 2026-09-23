package HotelStayPlus.model;

public class Huesped {
    //ATRIBUTOS
    private String nombre, correo, pais;
    private int id, telefono;

    //RELACIONES
    private List<Reserva> listReservasHuesped;

    /**
     * Método Constructor de la clase Huésped
     * @param nombre
     * @param pais
     * @param id
     * @param telefono
     */
    private Huesped(String nombre, String, correo, String pais, int id, int telefono){
        this.correo = correo;
        this.id = id;
        this.listReservasHuesped = new ArrayList();
        this.nombre = nombre;
        this.pais = pais;
        this.telefono = telefono;
    }


}
