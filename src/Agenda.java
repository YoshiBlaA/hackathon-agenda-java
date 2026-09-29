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

    public void anniadirContacto(Contacto contactoIngresado){
        // miguel angel, jairo cortes,  cristian mejia, ........., .......,
        // liz torres
        for(Contacto contacto : contactos){
            if(contacto.equals(contactoIngresado)){
                System.out.println("Ese contacto ya existe en la agenda");
                return;
            }
        }
        contactos.add(contactoIngresado);
        System.out.println("Ese contacto se agrego en la agenda");
    }

    public int getTamanioMaximo() {
        return tamanioMaximo;
    }

    public void setTamanioMaximo(int tamanioMaximo) {
        this.tamanioMaximo = tamanioMaximo;
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }
}

