package HotelStayPlus.model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    //ATRIBUTOS
    public int telefono, nit;
    public String nombre, direccion, paginaWeb;

    //RELACIONES
    private static List<Huesped> listHuespedesHotel;
    private static List<Reserva> listReservasHotel;
    private static List<Habitacion> listHabitacionesHotel;
    private static List<Servicio> listServiciosHotel;


    /**
     * Método Constructor de la clase Hotel
     * @param telefono del hotel
     * @param nit ddel hotel
     * @param nombre del hotel
     * @param direccion del hotel
     * @param paginaWeb del hotel
     */
    public Hotel(int telefono, int nit, String nombre, String direccion, String paginaWeb) {
        this.telefono=telefono;
        this.nit=nit;
        this.paginaWeb = paginaWeb;
        this.direccion = direccion;
        this.nombre = nombre;

        this.listHuespedesHotel = new ArrayList<>();
        this.listReservasHotel = new ArrayList<>();
        this.listHabitacionesHotel = new ArrayList<>();
        this.listServiciosHotel = new ArrayList<>();

    }

    /**
     * Metodo para registrar un huesped
     * @param nombre del huesped
     * @param id del huesped
     * @param correo del huesped
     * @param telefono del huesped
     * @param direccion del huesped
     * @param pais del huesped
     * @return
     */

    public String  registrarHuesped (String nombre,int id,String correo, int telefono, String direccion, String pais ){

        String mensaje="";
      Huesped encontrado= buscarHuesped(id);

        if (encontrado==null){

          Huesped huesped= new Huesped(nombre,correo, pais, id, telefono);
          listHuespedesHotel.add(huesped);

          mensaje= " Huesped registrado exitosamente";
      }else{
          mensaje="Le huesped ya existe";
      }
     return mensaje;
    }


    /**
     * metdodo para buscar huesped
     * @param id del huesped
     * @return
     */
    public static Huesped buscarHuesped(int id){
        Huesped encontrado =null;
        for (int i=0; i<Hotel.listHuespedesHotel.size(); i++){
            Huesped huesped= listHuespedesHotel.get(i);
            if(huesped.getId()==id){
                encontrado= huesped;
                break;
            }
        }
        return encontrado;
    }

    /**
     * metodo para actualizar datos del Huesped
     * @param id
     * @param nuevoNombre del huesped
     * @param nuevoCorreo del huesped
     * @param nuevoTelefono del huesped
     * @param nuevoPpais del huesped
     */


    public static void  actualizarHuesped(int id, String nuevoNombre, String nuevoCorreo, int nuevoTelefono, String nuevoPpais){

        Huesped huesped = buscarHuesped(id);

        if (huesped != null){
            huesped.setId(id);
            huesped.setNombre(nuevoNombre);
            huesped.setCorreo(nuevoCorreo);
            huesped.setTelefono(nuevoTelefono);
            huesped.setPais(nuevoPpais);
        }
    }

    /**
     * metodo Para eliminar huesped
     * @param id
     * @return
     */

    public static String eliminarHuesped  (int id){

        String mensaje= "No se encontro el huesped";

        Huesped huesped= buscarHuesped(id );
        if(huesped!=null){
            listHuespedesHotel.remove(huesped);
            mensaje="Eliminado con exito";
        }

        return mensaje;
    }

    /**
     * Metodo para añadir servicios a la reserva
     * @return
     */
    public static  ArrayList<Servicio> añadirServicios(){

        ArrayList<Servicio> servicios= new ArrayList<>();

        int opcion;

        do{
            int codigo= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del Servicio"));
            Servicio servicio= buscarServicio(codigo);
            if (servicio!=null){
                servicios.add(servicio);
            }else{
                JOptionPane.showMessageDialog(null,"servicio no encontrado");
            }
            opcion= Integer.parseInt(JOptionPane.showInputDialog("¿Quiere agregar otro servicio mas? 1. si 2. no"));
        }while (opcion!=2);
        return servicios;
    }

    /**
     * metodo para buscar servicio
     * @param codigo del servicio
     * @return
     */

    public static Servicio buscarServicio (int codigo){

        Servicio encontrado= null;
        for(int i=0; i<listServiciosHotel.size();i++){
            Servicio servicio = listServiciosHotel.get(i);
            if(servicio.getCodigo()==codigo){
                encontrado=servicio;
            }
        }
        return encontrado;
    }

    /**
     * Metodo para verificar disponibilidad de la habitacion
     * @param habitacion de la reserva
     * @return
     */

    public static boolean verificarhabitacion(Habitacion habitacion ){

        boolean pass= false;
        if(habitacion.getEstado().equalsIgnoreCase("Disponible")){

            pass=true;
        }

        return pass;

    }

    /**
     * metodo para buscar habitacion
     * @param numHabitacion del hotel
     * @return
     */

    public static Habitacion buscarHabitacion (int numHabitacion){

        Habitacion encontrado=null;

        for(int i= 0; i<listHabitacionesHotel.size(); i++){

            Habitacion habitacion= listHabitacionesHotel.get(i);

            if(habitacion.getNumero()==numHabitacion&&verificarhabitacion(habitacion)){

                encontrado=habitacion;

                habitacion.setEstado("ocupada");

            }

        }
        return encontrado;
    }


    /**
     * Metdod para calcular el precio total de la reserva
     * @param habitacion de la reserva
     * @param listaServicio de la reserva
     * @param descuento de la reserva
     * @return
     */
    public static double calcularTotal( Habitacion habitacion, ArrayList<Servicio> listaServicio, double descuento){

        double precioNoche= habitacion.getPrecioNoche();
        double totalServicio=0;

        for( Servicio servicio: listaServicio){

            totalServicio+=servicio.getPrecio();
        }
        double total= precioNoche+totalServicio;
         total= total-((total/100)*descuento);

         return total;
    }

    /**
     * metodo para registrar reserva
     * @param codigo de la reserva
     * @param fechaRealizacion de la reserva
     * @param fechaEntrada de la reserva
     * @param fechaSalida de la reserva
     * @param estado de la reserva
     * @param metodoPago de la reserva
     * @param valorTotal de la reserva
     * @param huesped de la reserva
     * @param habitacion de la reserva
     * @param listaServicios de la reserva
     * @return
     */

    public static String registrarReserva(int codigo, String fechaRealizacion, String fechaEntrada, String fechaSalida, String estado, String metodoPago, double valorTotal, Huesped huesped, Habitacion habitacion, ArrayList<Servicio>listaServicios){
        String mensaje ="";
        if (Hotel.buscarReserva(codigo)==null&&habitacion!=null){

            Reserva reserva=new Reserva(codigo,fechaRealizacion,fechaEntrada,fechaSalida, estado, metodoPago,valorTotal,huesped,habitacion, listaServicios);
            listReservasHotel.add(reserva);
            mensaje="Registro exitoso";
        }else{
            mensaje="No se pudo realizar el regitro ya que las rerserva ya existe o la habitacion no esta disponible";
        }
        return mensaje;
    }

    /**
     * metodo para buscar reserva
     * @param codigo
     * @return
     */

    public static Reserva buscarReserva (int codigo){

        Reserva encontrado = null;

        for (int i=0; i<listReservasHotel.size(); i++){

            Reserva reserva= listReservasHotel.get(i);

            if (reserva.getCodigo()==codigo){

                encontrado=reserva;
            }
        }

        return encontrado;
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
