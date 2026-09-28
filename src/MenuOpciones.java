import org.jairo.Contacto;

import java.util.Scanner;

public class MenuOpciones {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Contacto buscar = new ();
        int opcion;
        do {

            System.out.println("Hola bienvenid@ a tu agenda de contactos");

            System.out.println("1. Añadir contactos");
            System.out.println("2. Buscar contactos");
            System.out.println("3. Lista de contactos");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Modificar telefono");
            System.out.println("6. Espacio disponible");
            System.out.println("0. Salir");

            System.out.println("Elige una opción");

            opcion = scr.nextInt();
            switch (opcion) {
                case 1: // añadir contactos

                    break;
                case 2:  // buscar contactos

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
