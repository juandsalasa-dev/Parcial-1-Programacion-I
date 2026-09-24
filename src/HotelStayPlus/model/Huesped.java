package HotelStayPlus.model;

import java.util.ArrayList;
import java.util.List;

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
    public Huesped(String nombre, String correo, String pais, int id, int telefono){
        this.correo = correo;
        this.id = id;
        this.listReservasHuesped = new ArrayList<>();
        this.nombre = nombre;
        this.pais = pais;
        this.telefono = telefono;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Huesped{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", pais='" + pais + '\'' +
                ", id=" + id +
                ", telefono=" + telefono +
                ", listReservasHuesped=" + listReservasHuesped +
                '}';
    }

    //TODOS LOS GETTERS Y SETTERS DE LA CLASE HUESPED
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<Reserva> getListReservasHuesped() {
        return listReservasHuesped;
    }

    public void setListReservasHuesped(List<Reserva> listReservasHuesped) {
        this.listReservasHuesped = listReservasHuesped;
    }
}
