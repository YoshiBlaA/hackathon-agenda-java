import java.util.ArrayList;
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

        try {
            System.out.println("¿ De que tamaño quieres la agenda ?");
            int tamano = scr.nextInt();
            agenda = new Agenda(tamano);
        }catch (Exception e){
            System.out.println("Debes ingresar un numero");
            return;
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

            System.out.println("Elige una opción");

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
                    System.out.println("Igresaste a la opción de añadir contacto");
                    System.out.println("Nombre");
                    String nom = scr.nextLine();
                    System.out.println("Apellido");
                    String app = scr.nextLine();
                    System.out.println("Telefono");
                    String tel = scr.nextLine();
                    Contacto newContac = new Contacto(nom, app, tel);
                    agenda.anniadirContacto(newContac);
                    break;
                case 2:  // buscar contactos
                    System.out.println("Ingresa el nombre del contacto");
                    String nombreCompleto = scr.nextLine();
                    FuncionJairo.buscarContactos(nombreCompleto, agenda.getContactos());
                    break;
                case 3: // lista de contactos
                    System.out.println("Contacot en orden alfabetico, mostrando nombre apellido y telefono");
                    ListarContactos.listarContactos(agenda.getContactos());
                    break;
                case 4: // Eliminar Contacto
                    try {
                        for (Contacto cont : agenda.getContactos()) {
                            System.out.println(cont.toString());
                        }
                        System.out.println("Que contacto deseas eliminar?");
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


        } while (opcion !=0);
        scr.close();
    }
}