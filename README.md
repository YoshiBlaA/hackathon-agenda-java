# 📅 Sistema de Gestión de Agenda  en Java

> Una solución robusta y eficiente basada en consola desarrollada en **Java** para la gestión estructurada de contactos, aplicando reglas estrictas de validación, control de duplicados y ordenamiento alfabético. Proyecto desarrollado para el desafío de la Hackatón.
⚙️  📋 🛠️ 💻

---

## ⚙️ Requisitos del Sistema

### 👤 Definición de Contacto
*   **Atributos:** Nombre, Apellido y Teléfono

### 🗃️ Capacidad de la Agenda
La agenda soporta dos modos de inicialización:
1.  **Tamaño por Defecto:** Capacidad inicial estandarizada para **10 contactos**.

---

## 🛠️ Especificaciones Técnicas

El sistema implementa de forma estricta las siguientes funciones de lógica de negocio:

*   `añadirContacto(Contacto c)`: Inserta un contacto validando previamente que no existan duplicados, que los campos obligatorios no estén vacíos y que la agenda no supere su capacidad máxima.
*   `existeContacto(Contacto c)`: Evalúa la presencia de un contacto basándose en la coincidencia de nombre y apellido.
*   `listarContactos()`: Despliega la lista completa en formato `Nombre Apellido - Teléfono`. Implementa un **ordenamiento alfabético** previo por nombre y apellido.
*   `buscaContacto(String nombre)`: Realiza una búsqueda por coincidencia y retorna el teléfono del contacto o un mensaje de error si no es localizado.
*   `eliminarContacto(Contacto c)`: Remueve el objeto de la agenda notificando el éxito de la operación o informando si el elemento no existía.
*   `modificarTelefono(String nombre, String apellido, String nuevoTelefono)`: Actualiza el teléfono de un registro existente tras validar su presencia en el sistema.
*   `agendaLlena()`: Retorna un estado booleano e informa si se ha alcanzado el límite de almacenamiento.
*   `espacioLibres()`: Calcula y muestra cuantitativamente cuántos slots de almacenamiento quedan disponibles en base al tamaño máximo.

---

## 💻 Estructura del Menú por Consola

Al ejecutar el programa, se despliega una interfaz interactiva de comandos con el siguiente árbol de opciones:

```text
==========================================
       MENU AGENDA TELEFÓNICA
==========================================
1. Añadir Contacto
2. Verificar Existencia de Contacto
3. Listar Contactos (Orden Alfabético)
4. Buscar Contacto por Nombre
5. Modificar Teléfono de Contacto
6. Eliminar Contacto
7. Consultar si la Agenda está Llena
8. Consultar Espacios Libres Disponibles
9. Salir
==========================================
Seleccione una opción: 
```

---

## 🚀 Instalación y Ejecución

### Prerrequisitos
Asegúrate de contar con el **Java Development Kit (JDK 17 o superior)** instalado de forma local.

### Compilación y Arranque (Terminal)

1. Clona este repositorio en tu máquina local:
   ```bash
   git clone https://github.com
   ```
2. Accede a la carpeta raíz del proyecto:
   ```bash
   cd (nombre del repositorio)
   ```
3. Compila los archivos fuente de Java:
   ```bash
   javac -d bin src/*.java
   ```
4. Ejecuta la aplicación (Asegúrate de reemplazar `Main` por el nombre de tu clase principal si es distinto):
   ```bash
   java -cp bin Main
   ```

---

## 👥 Créditos
*   **Equipo** -
*   Jairo Cortés Morales
*   Victor Adrian Beltran Mendez
*   Javier Morales Arenas
*   Leonardo Rafael Uresti Iñiguez
*   Daniel Castro Pérez
*   Miguel Angel Campos Hipolito
*   Natalia González Coca
*   Zaira Lamas
*   Cristian Mejia
*   Diego González Celis 

🏆 *Proyecto desarrollado bajo formato contrarreloj para la evaluación técnica de la Hackatón 2026.*
