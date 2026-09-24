package HotelStayPlus.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    //ATRIBUTOS
    public int telefono, nit;
    public String nombre, direccion, paginaWeb;

    //RELACIONES
    private List<Huesped> listHuespedesHotel;
    private List<Reserva> listReservasHotel;
    private List<Habitacion> listHabitacionesHotel;
    private List<Servicio> listServiciosHotel;


    /**
     * Método Constructor de la clase Hotel
     * @param telefono
     * @param nit
     * @param nombre
     * @param direccion
     * @param paginaWeb
     */
    public Hotel(int telefono, int nit, String nombre, String direccion, String paginaWeb) {
        this. telefono=telefono;
        this.nit=nit;
        this.paginaWeb = paginaWeb;
        this.direccion = direccion;
        this.nombre = nombre;

        this.listHuespedesHotel = new ArrayList<>();
        this.listReservasHotel = new ArrayList<>();
        this.listHabitacionesHotel = new ArrayList<>();
        this.listServiciosHotel = new ArrayList<>();
    }

    //TO STRING
    @Override
    public String toString() {
        return "Hotel{" +
                "telefono=" + telefono +
                ", nit=" + nit +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", paginaWeb='" + paginaWeb + '\'' +
                ", listHuespedesHotel=" + listHuespedesHotel +
                ", listReservasHotel=" + listReservasHotel +
                ", listHabitacionesHotel=" + listHabitacionesHotel +
                ", listServiciosHotel=" + listServiciosHotel +
                '}';
    }

    //TODOS LOS GETTERS Y SETTERS DE LA CLASE HOTEL
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public List<Huesped> getListHuespedesHotel() {
        return listHuespedesHotel;
    }

    public void setListHuespedesHotel(List<Huesped> listHuespedesHotel) {
        this.listHuespedesHotel = listHuespedesHotel;
    }

    public List<Reserva> getListReservasHotel() {
        return listReservasHotel;
    }

    public void setListReservasHotel(List<Reserva> listReservasHotel) {
        this.listReservasHotel = listReservasHotel;
    }

    public List<Habitacion> getListHabitacionesHotel() {
        return listHabitacionesHotel;
    }

    public void setListHabitacionesHotel(List<Habitacion> listHabitacionesHotel) {
        this.listHabitacionesHotel = listHabitacionesHotel;
    }

    public List<Servicio> getListServiciosHotel() {
        return listServiciosHotel;
    }

    public void setListServiciosHotel(List<Servicio> listServiciosHotel) {
        this.listServiciosHotel = listServiciosHotel;
    }
}
