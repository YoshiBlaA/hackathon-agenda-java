
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> contactos;
    private int tamanioMaximo;


    public Agenda(int tamanioMaximo) {
        this.tamanioMaximo = tamanioMaximo;
        this.contactos = new ArrayList<>();
    }


    public Agenda() {
        this(10);
    }


    public boolean agendaLlena() {
        return contactos.size() >= tamanioMaximo;
    }

    // Añade un contacto y envía el error si no hay espacio
    public void aniadirContacto(Contacto contacto) {
        if (agendaLlena()) {
            System.out.println("Error: La agenda está llena. No hay espacio disponible para nuevos contactos.");
            return;
        }
        contactos.add(contacto);
        System.out.println("Contacto añadido correctamente: " + contacto);
    }
}
