import java.util.ArrayList;
import java.util.List;

class Ciclo {
    private String nombre;
    private List<Estudiante> estudiantes;

    public Ciclo(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public String obtenerDatos() {
        StringBuilder datos = new StringBuilder("Ciclo: " + nombre + "\nEstudiantes:\n");
        for (Estudiante e : estudiantes) {
            datos.append(e.obtenerDatos()).append("\n");
        }
        return datos.toString();
    }
}