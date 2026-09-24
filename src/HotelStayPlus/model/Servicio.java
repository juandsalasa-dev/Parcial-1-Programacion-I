package HotelStayPlus.model;

import java.util.ArrayList;
import java.util.List;

public class Servicio {

    //ATRIBUTOS
    private int codigo;
    public double precio;
    public String nombre, descripcion;
    public boolean disponibilidad;

    //RELACIONES
    private List<Reserva> listReservaServicios;

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

        this.listReservaServicios = new ArrayList<>();
    }


    //TO STRING
    @Override
    public String toString() {
        return "Servicio{" +
                "codigo=" + codigo +
                ", precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", disponibilidad=" + disponibilidad +
                ", listReservaServicios=" + listReservaServicios +
                '}';
    }

    //TODOS LOS GETTERS Y SETTERS DE LA CLASE SERVICIO
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public List<Reserva> getListReservaServicios() {
        return listReservaServicios;
    }

    public void setListReservaServicios(List<Reserva> listReservaServicios) {
        this.listReservaServicios = listReservaServicios;
    }
}
