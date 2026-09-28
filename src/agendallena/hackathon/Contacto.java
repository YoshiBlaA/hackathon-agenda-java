package agendallena.hackathon;

public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;

    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " - Tel: " + telefono;
    }
}