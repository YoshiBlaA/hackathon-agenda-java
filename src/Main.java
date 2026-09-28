package agendallena.hackathon;

public class Main {
    public static void main(String[] args) {
        // Crear una agenda pequeña de 2 espacios para probar
        Agenda miAgenda = new Agenda(1);

        // Probar si está llena (debe decir que aún hay espacio y devolver false)
        miAgenda.agendaLlena();
    }
}
