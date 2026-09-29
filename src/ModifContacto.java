import java.util.ArrayList;
import java.util.List;

public class ModifContacto {

    public static ArrayList<Contacto> modificarTelefono(String nombre, String apellido, String nuevoTelefono, ArrayList<Contacto> contactos) {
        // Validación: quitamos espacios y exigimos exactamente 10 dígitos
        String telefonoLimpio = (nuevoTelefono == null) ? "" : nuevoTelefono.replaceAll("\\s+", "");
        if (telefonoLimpio.isEmpty()) {
            System.out.println("El nuevo teléfono no puede estar vacío.");
            return contactos;
        }
        if (!telefonoLimpio.matches("\\d{10}")) {
            System.out.println("El teléfono debe tener 10 dígitos.");
            return contactos;
        }

        String nombreBuscado = normalizar(nombre);
        String apellidoBuscado = normalizar(apellido);

        for (Contacto c : contactos) {
            if (c.getNombre().equals(nombreBuscado) && c.getApellido().equals(apellidoBuscado)) {
                c.setTelefono(telefonoLimpio);
                System.out.println("Teléfono actualizado correctamente.");
                return contactos; // ya lo encontramos, no seguimos recorriendo
            }
        }

        System.out.println("El contacto no existe en la agenda.");
        return contactos;
    }


    // Normalización
    private static String normalizar(String texto) {
        return texto.toLowerCase().trim()
                .replace("á", "a")
                .replace("é", "e")
                .replace("í", "i")
                .replace("ó", "o")
                .replace("ú", "u");
    }

    // 10 contactos de prueba que definió el equipo
//    private static void cargarDatosPrueba() {
//        contactos.add(new Contacto("Ana", "Martínez López", "5600450701"));
//        contactos.add(new Contacto("Carlos", "Hernández García", "5716031002"));
//        contactos.add(new Contacto("Sofía", "Ramírez Torres", "5500540673"));
//        contactos.add(new Contacto("Diego", "González Rivera", "5511005004"));
//        contactos.add(new Contacto("Mariana", "Flores Sánchez", "5570800905"));
//        contactos.add(new Contacto("Luis", "Mendoza Cruz", "5599000886"));
//        contactos.add(new Contacto("Valeria", "Castillo Morales", "5510200117"));
//        contactos.add(new Contacto("Alejandro", "Vargas Ruiz", "5567800338"));
//        contactos.add(new Contacto("Fernanda", "Navarro Díaz", "5524502009"));
//        contactos.add(new Contacto("Jorge", "Ortega Jiménez", "5596000610"));
//    }

    // Lista temporal solo para probar.
    //public static List<Contacto> contactos = new ArrayList<>();

    // Modifica el teléfono de un contacto existente (se busca por nombre y apellidos)
//    public static boolean modificarTelefono(String nombre, String apellido, String nuevoTelefono, ArrayList<Contacto> contactos) {
//        // Validación: quitamos espacios y exigimos exactamente 10 dígitos
//        String telefonoLimpio = (nuevoTelefono == null) ? "" : nuevoTelefono.replaceAll("\\s+", "");
//        if (telefonoLimpio.isEmpty()) {
//            System.out.println("El nuevo teléfono no puede estar vacío.");
//            return false;
//        }
//        if (!telefonoLimpio.matches("\\d{10}")) {
//            System.out.println("El teléfono debe tener 10 dígitos.");
//            return false;
//        }
//
//        String nombreBuscado = normalizar(nombre);
//        String apellidoBuscado = normalizar(apellido);
//
//        FuncionJairo.buscarContactos(nombre + " " + apellido , contactos);
//
//        for (Contacto c : contactos) {
//            if (c.getNombre().equals(nombreBuscado) && c.getApellido().equals(apellidoBuscado)) {
//                c.setTelefono(telefonoLimpio);
//                System.out.println("Teléfono actualizado correctamente.");
//
//                return true; // ya lo encontramos, no seguimos recorriendo
//            }
//        }
//
//        System.out.println("El contacto no existe en la agenda.");
//        return false;
//    }
    // Pruebas rápidas
//    public static void main(String[] args) {
//        cargarDatosPrueba();
        // 1. Caso normal
//        modificarTelefono("Ana", "Martínez López", "5512345678");
//        // 2. Sin acentos y en mayúsculas (prueba la normalización)
//        modificarTelefono("SOFIA", "ramirez torres", "55 8765 4321");
//        // 3. Contacto que no existe
//        modificarTelefono("Pedro", "Salas Luna", "5511112222");
//        // 4. Teléfono vacío
//        modificarTelefono("Luis", "Mendoza Cruz", "   ");
//        // 5. Teléfono con letras o incompleto
//        modificarTelefono("Jorge", "Ortega Jiménez", "abc123");
//        // 6. Apellido incompleto (no debe encontrarlo)
//        modificarTelefono("Diego", "González", "5599998888");

        // Ana debe tener 5512345678, Sofía 5587654321.
//        // Luis, Jorge y Diego deben conservar su teléfono original.
//        System.out.println("\n--- Estado final ---");
//        for (Contacto c : contactos) {
//            System.out.println(c);
//        }
//    }
}