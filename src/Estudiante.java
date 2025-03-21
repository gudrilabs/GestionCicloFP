class Estudiante {
    private String nombre;
    private int id;
    private int edad;

    public Estudiante(String nombre, int id, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String obtenerDatos() {
        return "Estudiante: " + nombre + " (ID: " + id + ") Edad: " + edad;
    }
}