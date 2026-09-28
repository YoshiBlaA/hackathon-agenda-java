package org.jairo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * CONTACTOS	NOMBRE	APELLIDO	APELLIDO	NUMERO
         * 1	Ana	Martínez	López	56 0045 0701
         * 2	Carlos	Hernández	García	57 1603 1002
         * 3	Sofía	Ramírez	Torres	55 0054 0673
         * 4	Diego	González	Rivera	55 1100 5004
         * 5	Mariana	Flores	Sánchez	55 7080 0905
         * 6	Luis	Mendoza	Cruz	55 9900 0886
         * 7	Valeria	Castillo	Morales	55 1020 0117
         * 8	Alejandro	Vargas	Ruiz	55 6780 0338
         * 9	Fernanda	Navarro	Díaz	55 2450 2009
         * 10	Jorge	Ortega	Jiménez	55 9600 0610
         */
        Contacto[] listaContactos = new Contacto[10];
        String[][] infoContactos = {
                {"Ana", "Martínez", "56 0045 0701"},
                {"Carlos", "Hernández", "57 1603 1002"},
                {"Sofía", "Ramírez", "55 0054 0673"},
                {"Diego", "González", "55 1100 5004"},
                {"Mariana", "Flores", "55 7080 0905"},
                {"Luis", "Mendoza", "55 9900 0886"},
                {"Valeria", "Castillo", "55 1020 0117"},
                {"Alejandro", "Vargas", "55 6780 0338"},
                {"Fernanda", "Navarro", "55 2450 2009"},
                {"Jorge", "Ortega", "55 9600 0610"},
        };

        // LLENAR LA LISTA CON DATOS SINTETICOS
        for (int i = 0; i < infoContactos.length; i++) {
            String nombre = infoContactos[i][0];
            String apellido = infoContactos[i][1];
            String telefono = infoContactos[i][2];
            listaContactos[i] = new Contacto(nombre, apellido, telefono);
        }

        for (Contacto c : listaContactos) {
            System.out.println("c = " + c);
        }

        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Ingresa el nombre completo (nombre y apellido separados con un espacio) del contacto para obtener su numero telefónico: ");
            String respuesta = sc.nextLine().trim().replaceAll("\\s+", " ").replace("á", "a")
                    .replace("é", "e")
                    .replace("í", "i")
                    .replace("ó", "o")
                    .replace("ú", "u");;;
            System.out.println("==============BUSCANDO A " + respuesta.toUpperCase() + " ==============");
            buscarContactos(respuesta, listaContactos);
        }
        catch(Exception e){
            System.out.println("Ocurrió un error");
            System.out.println(e);
        }


//        buscarContactos("Maria Jimenez", listaContactos);

    }

    public static void buscarContactos(String nombreCompleto, Contacto[] listaContactos){
        /**
         * buscaContacto(String nombre):
         * Permite buscar un contacto por nombre y apellido.
         *
         * Si el contacto existe, muestra el teléfono. Si no existe, muestra un mensaje indicando que no se ha encontrado.
         */
        nombreCompleto = nombreCompleto.trim();
        String[] nombreYApellido = nombreCompleto.split(" ");

        if(nombreYApellido.length != 2){
            System.out.println("Pusiste algo más de un nombre y apellido o no seguiste el formato indicado");
            return;
        }

        String nombreBuscado = nombreYApellido[0].toLowerCase();
        String apellidoBuscado = nombreYApellido[1].toLowerCase();

        for(Contacto c : listaContactos){
            String nombreEnAgenda = c.getNombre().toLowerCase().trim();
            String apellidoEnAgenda = c.getApellido().toLowerCase().trim();
            if(nombreBuscado.equals(nombreEnAgenda) && apellidoBuscado.equals(apellidoEnAgenda)){
                System.out.println(c.getTelefono());
                return;
            }
        }

        System.out.println("El contacto no existe");
        return;

    }



}

