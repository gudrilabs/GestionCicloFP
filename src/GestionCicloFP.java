import java.util.ArrayList;
import java.util.List;

class GestionCicloFP {
    private List<Estudiante> estudiantes;
    private List<Ciclo> ciclos;

    public GestionCicloFP() {
        this.estudiantes = new ArrayList<>();
        this.ciclos = new ArrayList<>();
    }

    public void agregarEstudiante(String nombre, int id, int edad) {
        estudiantes.add(new Estudiante(nombre, id, edad));
    }

    public void agregarCiclo(String nombreCiclo) {
        ciclos.add(new Ciclo(nombreCiclo));
    }

    public void matricularEstudiante(int idEstudiante, String nombreCiclo) {
        Estudiante estudiante = estudiantes.stream()
                .filter(e -> e.getId() == idEstudiante)
                .findFirst()
                .orElse(null);

        Ciclo ciclo = ciclos.stream()
                .filter(c -> c.getNombre().equalsIgnoreCase(nombreCiclo))
                .findFirst()
                .orElse(null);

        if (estudiante != null && ciclo != null) {
            ciclo.agregarEstudiante(estudiante);
        }
    }

    public void mostrarCiclos() {
        ciclos.forEach(ciclo -> System.out.println(ciclo.obtenerDatos()));
    }

    public static void main(String[] args) {
        GestionCicloFP gestion = new GestionCicloFP();

        gestion.agregarEstudiante("Alicia", 1, 20);
        gestion.agregarEstudiante("Roberto", 2, 22);

        gestion.agregarCiclo("DAW");
        gestion.agregarCiclo("ASIR");

        gestion.matricularEstudiante(1, "DAW");
        gestion.matricularEstudiante(2, "ASIR");

        gestion.mostrarCiclos();
    }
}