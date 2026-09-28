package agendallena.hackathon;

import java.util.ArrayList;
import java.util.List;
public class Agenda {
    private List<Contacto> contactos; //Debe ser un ArrayList
    private  int tamanoMaximo; //Este dato me lo que dar y lo voy a ocupar en mi metodo

    public Agenda(){
        this(10);
    } //El me lo dan el predetermiando es 10
    public Agenda(int tamanoMaximo){
        this.tamanoMaximo = tamanoMaximo;
        this.contactos = new ArrayList<>();
    }

    //Javi inicio aqui

    Contacto contacto1= new Contacto("Javier","Morales",1);
    Contacto contacto2= new Contacto("Javier","Morales",1);
    Contacto contacto3= new Contacto("Javier","Morales",1);

    //Crear el array list
    ArrayList<Contacto> prueba = new ArrayList<>();

    //Vas a llenar el arraylist con  X objetos
    public void agendallena(ArrayList<Contacto> listadecontactos){
        // Verificar el tamaño del array
        //Vericar los elementos que tengo 1 de 10 10 de 10 consejo. definido o no definido
        //Retornar o avisar si la agenda tiene espacio o no
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