import java.util.ArrayList;

public class FuncionDiego {
    public static void eliminarContacto(Contacto c, ArrayList<Contacto> listaContactos) {
        if (listaContactos.remove(c)) {
            System.out.println("El contacto fue eliminado correctamente.");
        } else {
            System.out.println("El contacto no existe en la agenda.");
        }
    }
}
