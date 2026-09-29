import java.util.ArrayList;
import java.util.Scanner;

public class FuncionDiego {
    public static void eliminarContacto(Contacto c, ArrayList<Contacto> listaContactos) {
        if (listaContactos.remove(c)) {
            System.out.println("El contacto fue eliminado correctamente.");
        } else {
            System.out.println("El contacto no existe en la agenda.");
        }
    }


    public static void main(String[] args) {
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

        // LLENAR LA LISTA CON DATOS SINTETICOS
        for (int i = 0; i < infoContactos.length; i++) {
            String nombre = infoContactos[i][0];
            String apellido = infoContactos[i][1];
            String telefono = infoContactos[i][2];
            listaContactos.add(new Contacto(nombre, apellido, telefono));
        }
        int indice=1;
        for (Contacto c : listaContactos) {
            System.out.println(indice+".- c = " + c.toString());
            indice++;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Que contacto deseas eliminar?");
        int seleccion = sc.nextInt();

        try{
            Contacto contacto = listaContactos.get(seleccion-1);
            eliminarContacto(contacto, listaContactos);
            indice=1;
            for (Contacto c : listaContactos) {
                System.out.println(indice+".- c = " + c.toString());
            }
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("No se encontro el contacto.");
        }




    }
}
