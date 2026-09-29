import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
        ArrayList<Contacto> listaContactos = new ArrayList<>();
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

        ArrayList<Contacto> listContactos = new ArrayList<>();

        for (int i = 0; i < infoContactos.length; i++) {


            String nombre = infoContactos[i][0];
            String apellido = infoContactos[i][1];
            String telefono = infoContactos[i][2];

            listContactos.add(
                    new Contacto(nombre, apellido, telefono)
            );
        }

        // LLENAR LA LISTA CON DATOS SINTETICOS
        for (int i = 0; i < infoContactos.length; i++) {
            String nombre = infoContactos[i][0];
            String apellido = infoContactos[i][1];
            String telefono = infoContactos[i][2];
            listaContactos.add(new Contacto(nombre, apellido, telefono));
        }

        for (Contacto c : listaContactos) {
            System.out.println("c = " + c.toString());
        }



        Contacto contacto = listContactos.get(3);

        FuncionDiego.eliminarContacto(contacto, listContactos);

        for(Contacto c : listContactos)
        {
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
            FuncionJairo.buscarContactos(respuesta, listaContactos);
        }
        catch(Exception e){
            System.out.println("Ocurrió un error");
            System.out.println(e);
        }


// 1. Creamos la agenda usando el constructor por defecto (capacidad de 10)
        Agenda agenda = new Agenda();

        // 2. Agregamos 10 contactos para llenar la agenda por completo
        agenda.aniadirContacto(new Contacto("Juan", "Pérez", "568-1471"));
        agenda.aniadirContacto(new Contacto("Maria", "Gómez", "547-1247"));
        agenda.aniadirContacto(new Contacto("Carlos", "López", "536-3698"));
        agenda.aniadirContacto(new Contacto("Ana", "Martínez", "578-1475"));
        agenda.aniadirContacto(new Contacto("Luis", "Rodríguez", "525-2587"));
        agenda.aniadirContacto(new Contacto("Sofia", "Hernández", "517-3697"));
        agenda.aniadirContacto(new Contacto("Pedro", "Sánchez", "513-1478"));
        agenda.aniadirContacto(new Contacto("Laura", "García", "514-2586"));
        agenda.aniadirContacto(new Contacto("Diego", "Ramírez", "515-1472"));
        agenda.aniadirContacto(new Contacto("Elena", "Torres", "516-1478"));

        // 3. Intentamos agregar el contacto #11 (aquí salta el error de agenda llena)
        agenda.aniadirContacto(new Contacto("Javier", "Flores", "578-1479"));





//        buscarContactos("Maria Jimenez", listaContactos);

    }
}