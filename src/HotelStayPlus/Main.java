package HotelStayPlus;

import HotelStayPlus.model.*;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(301101010, 94952399, "stayhotelplus.com", "Avenida Centenario", "stayhotelplus.com");

        int opcion = 0;
        int opcion1 = 0;
        int opcion2 = 1;
        int opcion3 = 0;

        do {

            //MENÚ PRINCIPAL
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    MENU PRINCIPAL
                    
                    1. Huespedes
                    2. Reservas
                    3. Calcular numero perfecto
                    4. Sumar ingresos de todas las reservas
                    5. Saliendo
                    """));

            //SWITCH-CASE PARA HACER LAS OPCIONES DEL MENÚ PRINCIPAL
            switch (opcion2) {

                //MENÚ DE HUESPED (CRUD)
                case 1:
                    opcion3 = Integer.parseInt(JOptionPane.showInputDialog("""
                                    MENÚ HUESPED
                                    1. Registrar Huesped
                                    2. Mostrar datos del Huesped
                                    3. Actualizar Huesped
                                    4. Eliminar Huesped
                                    5. Volver al menú principal
                                    """));

                    //REGISTRAR HUESPED
                    if (opcion3 == 1) {
                        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del huesped:");
                        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la identificación del huesped:"));
                        String correo = JOptionPane.showInputDialog(null, "Ingrese el correo del huesped:");
                        int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el teléfono del huesped:"));
                        String direccion = JOptionPane.showInputDialog(null, "Ingrese la dirección del huesped:");
                        String pais = JOptionPane.showInputDialog(null, "Ingrese el pais de origen:");

                        hotel.registrarHuesped(nombre, id, correo, telefono, direccion, pais);

                        //MOSTRAR HUESPED
                    } else if (opcion3 == 2) {
                        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la identificación del huesped a buscar:"));

                        Huesped mostrarhuesped= Hotel.buscarHuesped(id);


                        JOptionPane.showMessageDialog(null, mostrarhuesped.toString());

                        //ACTUALIZAR HUESPED
                    } else if (opcion3 == 3) {
                        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la identificación del huesped a actualizar:"));
                        String nuevoNombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del huesped:");
                        String nuevoCorreo = JOptionPane.showInputDialog(null, "Ingrese el nuevo correo del huesped:");
                        int nuevoTelefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo teléfono del huesped:"));
                        String nuevoPais= JOptionPane.showInputDialog(null, "Ingrese la nueva dirección del huesped:");

                        hotel.actualizarHuesped(id, nuevoNombre, nuevoCorreo, nuevoTelefono, nuevoPais);

                        //ELIMINAR HUESPED
                    } else if (opcion3 == 4) {
                        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la identificación del Huesped a eliminar:"));

                        String mensaje =hotel.eliminarHuesped(id);

                        JOptionPane.showMessageDialog(null, mensaje);


                        //SALIR
                    } else if (opcion3 == 5) {
                        break;
                    }
                    break;

                //===============================================================
                //==                         RESERVAS                          ==
                //===============================================================
                //MENÚ RESERVAS (CRUD)
                case 2:
                    opcion3 = Integer.parseInt(JOptionPane.showInputDialog("""
                                    MENÚ RESERVAS
                                    1. Registrar reserva
                                    2. Leer reserva
                                    3. actualizar reserva
                                    4. Borrar reserva
                                    5. Verificar disponibilidad de la habitacion
                                    6. Salir
                                    """));

                    //REGISTRAR RESERVA
                    if (opcion3 == 1) {
                        //BUSCAR HUESPED DE LA RESERVA
                        int codigo= Integer.parseInt(JOptionPane.showInputDialog("ingrese el codigo de la reserva"));
                        int id= Integer.parseInt(JOptionPane.showInputDialog("ingrese la identificacion del huesped"));
                        Huesped huesped= Hotel.buscarHuesped(id);

                        //INGRESAR FECHAS DE LA RESERVA
                        String fechaRealizacion= JOptionPane.showInputDialog("Ingrese la fecha de realizacion (día/mes/año)");
                        String fechaEntrada= JOptionPane.showInputDialog("Ingrese la fecha de entrada (día/mes/año):");
                        String fechaSalida= JOptionPane.showInputDialog("Ingrese la fecha de salida (día/mes/año):"");
                        int numHabitacion= Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de habitacion a reservar"));
                        Habitacion habitacion=Hotel.buscarHabitacion(numHabitacion);

                        //REVISAR EL ESTADO DE LA RESERVA
                        String estado= JOptionPane.showInputDialog("Ingrese el estado inicial de la reserva");
                        ArrayList<Servicio> listaServicios= Hotel.añadirServicios();

                        //REALIZAR DESCUENTO Y MOSTRAR PRECIO
                        double descuento= Double.parseDouble(JOptionPane.showInputDialog("Ingresar descuentos"));
                        double precioTotal= Hotel.calcularTotal(habitacion,listaServicios,descuento);
                        JOptionPane.showMessageDialog(null, "El precio de la reserva es: "+precioTotal);
                        String metodoPago=JOptionPane.showInputDialog("Ingrese el metodo de pago");

                        //REGISTRO COMPLETO
                        String registro = Hotel.registrarReserva(codigo,fechaRealizacion, fechaEntrada, fechaSalida,estado,metodoPago,precioTotal,huesped,habitacion,listaServicios );
                        JOptionPane.showMessageDialog(null, registro);

                        //LEER RESERVA
                    } else if (opcion3 == 2){
                        int codigo= Integer.parseInt(JOptionPane.showInputDialog("Ingrse el codigo de la reserva que desea consultar"));

                        Reserva reserva = Hotel.buscarReserva(codigo);
                        JOptionPane.showMessageDialog(null, reserva.toString());

                        //ACTUALIZAR RESERVA
                    } else if(opcion3 == 3) {
                        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código de la reserva a actualizar:"));
                        String nuevoEstado = JOptionPane.showInputDialog(null, "Ingrese el nuevo estado de la reserva:");
                        String nuevoMetodoPago = JOptionPane.showInputDialog(null, "Ingrese el nuevo método de pago:");

                        hotel.actualizarReserva(codigo, nuevoEstado, nuevoMetodoPago);

                        //BORRAR RESERVA
                    } else if (opcion3 == 4){
                        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el código de la reserva a borrar:"));

                        hotel.borrarReserva(codigo);

                        //VER DISPONIBILIDAD HABITACION
                    } else if (opcion3 == 5){
                        int numHabitacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el código de la reserva a borrar:"));

                        hotel.verificarHabitacion(numHabitacion);

                    } else if (opcion3 == 6){
                        break;
                    }
                    break;


                // NUMERO PERFECTO
                case 3:
                    int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe el id del huesped: "));

                    hotel.verificarNumeroPerfecto(numero);


                // SUMAR TODOS LOS PRECIOS (INGRESOS) DE LAS RESERVAS HECHAS EN UN RANGO DE FECHA
                case 4:
                    String fechaInicio = JOptionpane.showInputDialog(null, "Ingresa la fecha de inicio (día/mes/año):")
                    String fechaFinal = JOptionpane.showInputDialog(null, "Ingresa la fecha final (día/mes/año):")

                    hotel.sumarIngresosPorRango(fechaInicio, fechaFinal);

                //SALIR
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
            }

        } while (opcion2 != 5);
    }
}