import java.util.ArrayList;

public class Ciclo {
    public String NOMBRE_CICLO;
    public ArrayList<Estudiante> LISTA_ESTUDIANTES = new ArrayList<>();

    public Ciclo(String NOMBRE_CICLO) {
        this.NOMBRE_CICLO = new String(NOMBRE_CICLO);
    }

    public void Agregar_estudiante(Estudiante e) { 
        LISTA_ESTUDIANTES.add(e); 
    }

    public String datos_ciclo() {  
        String datos = "Ciclo: " + NOMBRE_CICLO + "\nEstudiantes:\n";
        for (Estudiante e : LISTA_ESTUDIANTES) {
            datos += e.datos_estudiante() + "\n";
        }
        return datos;
    }
}
