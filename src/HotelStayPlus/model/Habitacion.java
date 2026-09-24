package HotelStayPlus.model;

import java.util.ArrayList;
import java.util.List;

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
     this.listaReservasHabitaciones = new ArrayList<>();
     this.numero = numero;
     this.piso = piso;
     this.precioNoche = precioNoche;
     this.tipo = tipo;
     }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numero=" + numero +
                ", piso=" + piso +
                ", capMaxima=" + capMaxima +
                ", precioNoche=" + precioNoche +
                ", tipo='" + tipo + '\'' +
                ", estado='" + estado + '\'' +
                ", listaReservasHabitaciones=" + listaReservasHabitaciones +
                '}';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Reserva> getListaReservasHabitaciones() {
        return listaReservasHabitaciones;
    }

    public void setListaReservasHabitaciones(List<Reserva> listaReservasHabitaciones) {
        this.listaReservasHabitaciones = listaReservasHabitaciones;
    }
}
