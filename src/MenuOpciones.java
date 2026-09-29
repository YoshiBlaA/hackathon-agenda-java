
import java.util.ArrayList;
import java.util.Scanner;

public class MenuOpciones {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        ArrayList<Contacto> agenda = new ArrayList<>();
        //Contacto contacto = new Contacto("Ana", "Martínez López", "56 0045 0701");


        int opcion;
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

            opcion = scr.nextInt();
            switch (opcion) {
                case 1: // añadir contactos
                    System.out.println("Igresaste a la opción de añadir contacto" );
                    contacto.
                    break;
                case 2:  // buscar contactos
                    System.out.println("Ingresa el nombre del contacto");
                    scr.nextLine(); // limpiar el salto de línea pendiente
                    String nombreCompleto = scr.nextLine();

                    FuncionJairo.buscarContactos(nombreCompleto, agenda);
                    break;
                case 3: // lista de contactos
                    listarContactos();
                    break;
                case 4: // Eliminar Contacto
                    contacto.eliminarPorNombre();
                    break;
                case 5:
                    contacto.modificarContacto();
                    break;
                case 6:
                    contacto.espacioContacto();
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
