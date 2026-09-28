package agendallena.hackathon;

public class Main {
    public static void main(String[] args) {
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
    }
}