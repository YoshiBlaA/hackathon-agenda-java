import java.util.ArrayList;

public class ListarContactos {

    /*-----------------------------FUNCIÓN PRINCIPAL----------------------------*/

    public static void listarContactos(ArrayList<Contacto> contactos) {
        if (contactos == null || contactos.isEmpty()) {
            System.out.println("La agenda no tiene contactos registrados.");
            return;
        }
        for (int i = 0; i < contactos.size(); i++) {
            for (int j = i + 1; j < contactos.size(); j++) {
                Contacto c1 = contactos.get(i);
                Contacto c2 = contactos.get(j);
                int resultadoNombre = comparar(c1.getNombre(), c2.getNombre());

                // CONDICIÓN 1: Si el nombre de c1 va después que c2 en el abecedario
                if (resultadoNombre == 1) {
                    contactos.set(i, c2);
                    contactos.set(j, c1);
                }
                // CONDICIÓN 2: Si los nombres son iguales, comparamos los apellidos
                else if (resultadoNombre == 0) {
                    int resultadoApellido = comparar(c1.getApellido(), c2.getApellido());
                    if (resultadoApellido == 1) {
                        contactos.set(i, c2);
                        contactos.set(j, c1);
                    }
                }
            }
        }
        for (Contacto c : contactos) {
            System.out.println(c.getNombre() + " " + c.getApellido() + " - " + c.getTelefono());
        }
    }

    /*-----------------------------FUNCIÓN COMPARAR----------------------------*/
    public static int comparar(String t1, String t2) {
        String texto1 = t1.toLowerCase();
        String texto2 = t2.toLowerCase();

        int longitudMinima = texto1.length();
        if (texto2.length() < longitudMinima) {
            longitudMinima = texto2.length();
        }
        for (int k = 0; k < longitudMinima; k++) {
            char letra1 = texto1.charAt(k);
            char letra2 = texto2.charAt(k);

            if (letra1 > letra2) {
                return 1;
            }
            if (letra1 < letra2) {
                return -1;
            }
        }

        if (texto1.length() > texto2.length()) {
            return 1;
        }
        if (texto1.length() < texto2.length()) {
            return -1;
        }
        return 0;
    }

    /*-----------------------------VALIDACIONES / PRUEBAS----------------------------*/
//    public static void main(String[] args) {
//        ArrayList<Contacto> resultado = new ArrayList<>();
//        listarContactos(resultado);
//
//        resultado.add(new Contacto("Ana", "Martínez", "56 0045 0701"));
//        resultado.add(new Contacto("Carlos", "Hernández", "57 1603 1002"));
//        resultado.add(new Contacto("Sofía", "Ramírez", "55 0054 0673"));
//        resultado.add(new Contacto("Diego", "González", "55 1100 5004"));
//        resultado.add(new Contacto("Mariana", "Flores", "55 7080 0905"));
//        resultado.add(new Contacto("Luis", "Mendoza", "55 9900 0886"));
//        resultado.add(new Contacto("Valeria", "Castillo", "55 1020 0117"));
//        resultado.add(new Contacto("Alejandro", "Vargas", "55 6780 0338"));
//        resultado.add(new Contacto("Fernanda", "Navarro", "55 2450 2009"));
//        resultado.add(new Contacto("Jorge", "Ortega", "55 9600 0610"));
//
//        listarContactos(resultado);
//    }
}