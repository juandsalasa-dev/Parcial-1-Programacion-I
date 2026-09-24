package HotelStayPlus;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(301101010, 94952399, "stayhotelplus.com", "Avenida Centenario", "HotelStayPlus");

        int opcion = 1;

        while(opcion != 0){

            //MENÚ PRINCIPAL
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    MENU PRINCIPAL
                        
                    1. Huespedes
                    2. Reservas
                    3. Calcular numero perfecto
                    4. Sumar ingresos de todas las reservas
                    5. Saliendo
                    """));
            }

            if (opcion2 == 5) {
                JOptionPane.showMessageDialog(null, "Saliendo...");
                break;
            };

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
                        int identificacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la identificación del huesped:"));
                        String correo = JOptionPane.showInputDialog(null, "Ingrese el correo del huesped:");
                        int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el teléfono del huesped:"));
                        String direccion = JOptionPane.showInputDialog(null, "Ingrese la dirección del huesped:");
                        String pais = JOptionPane.showInputDialog(null, "Ingrese el pais de origen:");

                        hotel.crrearHuesped(nombe, id, correo, telefono, direccion, pais);

                        //MOSTRAR HUESPED
                    } else if (opcion3 == 2) {
                        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la identificación del huesped a buscar:"));

                        hotel.mostrarHuesped(id);

                        //ACTUALIZAR HUESPED
                    } else if (opcion3 == 3) {
                        int identificacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la identificación del huesped a actualizar:"));
                        String nuevoNombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del huesped:");
                        String nuevoCorreo = JOptionPane.showInputDialog(null, "Ingrese el nuevo correo del huesped:");
                        int nuevoTelefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo teléfono del huesped:"));
                        String nuevaDireccion = JOptionPane.showInputDialog(null, "Ingrese la nueva dirección del huesped:");

                        hotel.actualizarHuesped(id, nuevoNombre, nuevoCorreo, nuevoTelefono, nuevaDireccion);

                        //ELIMINAR HUESPED
                    } else if (opcion3 == 4) {
                        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la identificación del Huesped a eliminar:"));

                        hotel.eliminarHuesped(id);

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
                                2. Actualizar reserva
                                3. Leer reserva
                                4. Borrar reserva
                                5. Verificar disponibilidad de la habitacion
                                6. Salir
                                """));

                        //DOCUMENTACION
                    if (opcion3 == 1) {
                        //OPCION 1

                        //DOCUMENTACION
                    } else if (opcion3 == 2){
                        //OPCION 2
                    }


                    // NUMERO PERFECTO
                case 3:
                    int numPerfecto = Integer.parseInt(JOptionPane.showInputDialog(null, "Busca el ID del Huesped:"));
                    hotel.verificarNumeroPerfecto(numPerfecto);

                    // SUMAR TODOS LOS PRECIOS (INGRESOS) DE LAS RESERVAS HECHAS EN UN RANGO DE FECHA
                case 4:
                    // JOptionPane para definir rango de fecha
                    // llamar método para sumar precios
                    // mismo metodo muestra

                    //SALIR
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
            }
        }
    }
}