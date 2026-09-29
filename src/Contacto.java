public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;

    // Constructor: bloquea nombres y apellidos vacíos (.trim() y .isEmpty())
    public Contacto(String nombre, String apellido, String telefono) {
        // Validación: Si el nombre o apellido vienen vacíos o son nulos, frena el programa y lanza un error
        if (nombre == null || nombre.trim().isEmpty() || apellido == null || apellido.trim().isEmpty()) {
            throw new IllegalArgumentException(" El nombre y el apellido no pueden estar vacíos."); //opcional
        }

        // LIMPIEZA DEL NOMBRE :
        // 1. Pasa todo a minúsculas (.toLowerCase)
        // 2. Borra espacios al inicio y al final (.trim)
        // 3. Quita los acentos (.replace) para que "María" y "Maria" se guarden igual
        // 4. Borra los espacios del medio (.replace(" ", "")) por si escriben "Juan Carlos" junto o separado
        this.nombre = nombre.toLowerCase().trim().replace("á", "a")
                .replace("é", "e")
                .replace("í", "i")
                .replace("ó", "o")
                .replace("ú", "u")
                .replace(" ", "");
        this.apellido = apellido.toLowerCase().trim().replace("á", "a")
                .replace("é", "e")
                .replace("í", "i")
                .replace("ó", "o")
                .replace("ú", "u")
                .replace(" ", "");
        this.telefono = telefono;
    }

    // Getters: para leer los datos desde la agenda
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getTelefono() { return telefono; }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Equals:  filtro para ignora si es mayúscula o minúscula
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Si es exactamente el mismo objeto en memoria, son iguales
        if (obj == null || getClass() != obj.getClass()) return false; // Si el otro es nulo o no es un Contacto, no son iguales
        Contacto otro = (Contacto) obj;
        return this.nombre.equalsIgnoreCase(otro.nombre) && // Compara nombre con nombre y apellido con apellido (ignora mayúsculas por si acaso)
                this.apellido.equalsIgnoreCase(otro.apellido);
    }

    // HASHCODE: Genera un código numérico único basado en el nombre y apellido
    // Java nos pide que si modificamos el 'equals', también modifiquemos este
    // Así, si dos contactos son iguales, tendrán el mismo número de identificación
    @Override
    public int hashCode() {
        return (nombre.toLowerCase() + " " + apellido.toLowerCase()).hashCode();
    }

    // TO STRING: Controla cómo se va a ver el contacto cuando lo imprimamos en la consola
    // Nos da el formato limpio: "nombre apellido - telefono"
    @Override
    public String toString() {
        return nombre + " " + apellido + " - " + telefono;
    }

    ///////////////////test//////////////////Añade un contacto
    public static void main(String[] args) {
        System.out.println("TEST");

        Contacto c1 = new Contacto("Javier", "Perez", "555-1234");
        Contacto c2 = new Contacto("javier", "PEREZ", "999-8888");

        Agenda agenda = new Agenda();

        agenda.anniadirContacto(c1);
        agenda.anniadirContacto(c2);

    }

}


