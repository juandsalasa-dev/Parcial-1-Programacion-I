package HotelStayPlus.model;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
    //ATRIBUTOS
    private int codigo;
    private String fechaRealizacion, fechaEntrada, fechaSalida, estado, metodoPago;
    private double valorTotal;

    //RELACIONES
    private Huesped huesped;
    private Habitacion habitacion;
    private static List<Servicio> ListServicio;

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
    public Reserva (int codigo, String fechaRealizacion, String fechaEntrada, String fechaSalida, String estado, String metodoPago, double valorTotal, Huesped huesped, Habitacion habitacion, ArrayList<Servicio>listaServicios){
        this.codigo = codigo;
        this.estado = estado;
        this.fechaEntrada = fechaEntrada;
        this.fechaRealizacion = fechaRealizacion;
        this.fechaSalida = fechaSalida;
        this.habitacion = habitacion;
        this.huesped = huesped;
        this.ListServicio = listaServicios;
        this.metodoPago = metodoPago;
        this.valorTotal = valorTotal;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Reserva{" +
                "codigo=" + codigo +
                ", fechaRealizacion='" + fechaRealizacion + '\'' +
                ", fechaEntrada='" + fechaEntrada + '\'' +
                ", fechaSalida='" + fechaSalida + '\'' +
                ", estado='" + estado + '\'' +
                ", metodoPago='" + metodoPago + '\'' +
                ", valorTotal=" + valorTotal +
                ", huesped=" + huesped +
                ", habitacion=" + habitacion +
                ", ListServicio=" + ListServicio +
                '}';
    }

    //TODOS LOS GETTERS Y SETTERS DE LA CLASE RESERVA
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(String fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public List<Servicio> getListServicio() {
        return ListServicio;
    }

    public void setListServicio(List<Servicio> listServicio) {
        ListServicio = listServicio;
    }
}