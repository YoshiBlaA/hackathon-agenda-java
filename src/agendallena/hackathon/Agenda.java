package agendallena.hackathon;

import java.util.ArrayList;
import java.util.List;
public class Agenda {
    private List<Contacto> contactos;
    private  int tamanoMaximo;

    public Agenda(){
        this(10);
    }
    public Agenda(int tamanoMaximo){
        this.tamanoMaximo = tamanoMaximo;
        this.contactos = new ArrayList<>();
    }
    public boolean agendaLlena(){
        if (this.contactos.size() >= this.tamanoMaximo){
            System.out.println("La agenda esta llena.No Hay especi disponible para agregar nuevos contactos");
        return true;
        }else {
            System.out.println("La agenda aun tiene espacio disponible");
            return false;
        }
    }

    public int getTamanoMaximo() {
        return tamanoMaximo;
    }
    public int getCantidadContactos(){
        return  contactos.size();
    }
}