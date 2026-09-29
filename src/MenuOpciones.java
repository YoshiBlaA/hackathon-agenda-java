import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class MenuOpciones {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
//        ArrayList<Contacto> agenda = new ArrayList<>();
        //Contacto contacto = new Contacto("Ana", "Martínez López", "56 0045 0701");
        int opcion = -1;
        Agenda agenda;
        String datosUser;

        while (true) {
            try {
                System.out.println("¿De qué tamaño quieres la agenda?");
                System.out.print("Ingresa el tamannio de tu agenda o el digito 0 para tener un tamaño por defecto (10 contactos): ");
                int tamano = scr.nextInt();
                if (tamano < 0) throw new IllegalArgumentException("El tamannio de la lista no puede ser negativo");

                if(tamano == 0) agenda = new Agenda();
                else agenda = new Agenda(tamano);

                System.out.println(agenda.getTamanioMaximo());

                break;
            } catch (InputMismatchException e) {
                System.err.println("Debes ingresar un número");
                scr.nextLine();
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
                scr.nextLine();
            }
        }


        do {
            System.out.println("Hola bienvenid@ a tu agenda de contactos");

            System.out.println("1. Añadir contactos");
            System.out.println("2. Buscar contactos");
            System.out.println("3. Lista de contactos");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Modificar telefono");
            System.out.println("6. Espacio disponible"); // memoria y espacio libre
            System.out.println("0. Salir");

            System.out.print("Elige una opción: ");

            try {
                opcion = scr.nextInt();
            } catch (Exception e) {
                System.out.println("La opcion debe ser un numero");
                scr.nextLine();
                continue;
            }


            scr.nextLine();
            switch (opcion) {
                case 1: // añadir contactos
                    //ANNIADIR UN LANZAMIENTO DE EXCEPCION PARA CUANDO LOS DATOS ESTAN VACIOS

                    System.out.println("Igresaste a la opción de añadir contacto");
                    System.out.print("Escribe el nombre: ");
                    String nom = scr.nextLine();
                    System.out.print("Escribe el apellido: ");
                    String app = scr.nextLine();
                    System.out.print("Escribe el telefono: ");
                    String tel = scr.nextLine();
                    Contacto newContac = new Contacto(nom, app, tel);
                    agenda.anniadirContacto(newContac);
                    break;
                case 2:  // buscar contactos
                    System.out.print("Ingresa el nombre del contacto (nombre y apellida separados por coma): ");
                    String nombreCompleto = scr.nextLine();
                    FuncionJairo.buscarContactos(nombreCompleto, agenda.getContactos());
                    break;
                case 3: // lista de contactos
                    System.out.println("Contacto en orden alfabético, mostrando nombre apellido y telefono");
                    ListarContactos.listarContactos(agenda.getContactos());
                    break;
                case 4: // Eliminar Contacto
                    try {
                        for (Contacto cont : agenda.getContactos()) {
                            System.out.println(cont.toString());
                        }
                        System.out.println("Ingresa el índice del contacto que quieres eliminar: ");
                        int seleccion = scr.nextInt();
                        Contacto contacto = agenda.getContactos().get(seleccion - 1);
                        agenda.setContactos(FuncionDiego.eliminarContacto(contacto, agenda.getContactos()));
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("No se encontro el contacto.");
                    }
                    break;
                case 5: //modificar contacto

                    for (Contacto cont : agenda.getContactos()) {
                        System.out.println(cont.toString());
                    }

                    System.out.println("Para modificar un contacto, ingrese la siguiente informacion en el siguiente orden: nombre, apellido y telefono.");

                    System.out.println("Nombre");
                    String newNum = scr.nextLine();
                    System.out.println("Apellido");
                    String newApp = scr.nextLine();
                    System.out.println("Telefono");
                    String newTel = scr.nextLine();

                    agenda.setContactos(ModifContacto.modificarTelefono(newNum, newApp, newTel, agenda.getContactos()));

                    System.out.println("\n--- Estado final ---");
                    for (Contacto c : agenda.getContactos()) {
                        System.out.println(c);
                    }
                    break;
                case 6: // Espacio Disponible
                    Daniel.espacioLibres(agenda.getContactos(), agenda.getTamanioMaximo());
                    break;
                case 0:
                    System.out.println("Saliendo de la agenda");
                    break;
                default:
                    System.out.println("Opción no valida.");
            }


        } while (opcion != 0);
        scr.close();
    }
}