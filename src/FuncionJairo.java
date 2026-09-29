import java.util.ArrayList;
import java.util.Arrays;

public class FuncionJairo {
    /**
     * Busca un contacto en la lista utilizando su nombre y apellido.
     * <p>
     * El nombre completo debe proporcionarse en el formato "Nombre Apellido".
     * La búsqueda no distingue entre mayúsculas y minúsculas.
     * </p>
     *
     * <p>
     * Si se encuentra el contacto, se muestra su número de teléfono.
     * Si el formato proporcionado no es válido o el contacto no existe,
     * se muestra un mensaje indicando la situación.
     * </p>
     *
     * @param nombreCompleto nombre y apellido del contacto que se desea buscar,
     *                       separados por un espacio
     * @param listaContactos lista de contactos en la que se realizará la búsqueda
     */
    public static void buscarContactos(String nombreCompleto, ArrayList<Contacto> listaContactos){
        /**
         * buscaContacto(String nombre):
         * Permite buscar un contacto por nombre y apellido.
         *
         * Si el contacto existe, muestra el teléfono. Si no existe, muestra un mensaje indicando que no se ha encontrado.
         */
        nombreCompleto = nombreCompleto.trim().replaceAll("\s+", " ").toLowerCase()
                .replace("á", "a")
                .replace("é", "e")
                .replace("í", "i")
                .replace("ó", "o")
                .replace("ú", "u");

        String[] nombreYApellido = nombreCompleto.split(" ");

//        System.out.println("nombreYApellido = " + Arrays.toString(nombreYApellido));

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
                System.out.println("El numero es " +  c.getTelefono());
                return;
            }
        }

        System.out.println("El contacto no existe");
        return;

    }
}
