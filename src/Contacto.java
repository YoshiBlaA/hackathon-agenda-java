public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;

    // Constructor: bloquea nombres y apellidos vacíos (.trim() y .isEmpty())
    public Contacto(String nombre, String apellido, String telefono) {
        if (nombre == null || nombre.trim().isEmpty() || apellido == null || apellido.trim().isEmpty()) {
            throw new IllegalArgumentException(" El nombre y el apellido no pueden estar vacíos."); //opcional
        }
        this.nombre = nombre.toLowerCase().trim().replace("á", "a")
                .replace("é", "e")
                .replace("í", "i")
                .replace("ó", "o")
                .replace("ú", "u");
        this.apellido = apellido.toLowerCase().trim().replace("á", "a")
                .replace("é", "e")
                .replace("í", "i")
                .replace("ó", "o")
                .replace("ú", "u");;
        this.telefono = telefono;
    }

    // Getters: para leer los datos desde la agenda
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getTelefono() { return telefono; }

    // Equals:  filtro para ignora si es mayúscula o minúscula
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contacto otro = (Contacto) obj;
        return this.nombre.equalsIgnoreCase(otro.nombre) &&
                this.apellido.equalsIgnoreCase(otro.apellido);
    }

    // Hashcode: equals para  segur que "Javier" y "javier"
    @Override
    public int hashCode() {
        return (nombre.toLowerCase() + " " + apellido.toLowerCase()).hashCode();
    }

    // TO STRING: nos dara un formato de impresión nombre apellido y telefono
    @Override
    public String toString() {
        return nombre + " " + apellido + " - " + telefono;
    }

    ///////////////////test//////////////////Añade un contacto
    public static void main(String[] args) {
        System.out.println("TEST");

        Contacto c1 = new Contacto("Javier", "Perez", "555-1234");
        Contacto c2 = new Contacto("javier", "PEREZ", "999-8888");

        System.out.println("Formato de impresion: " + c1);
        System.out.println("¿Detecta que son iguales?: " + c1.equals(c2));
    }

}

