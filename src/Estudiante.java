public class Estudiante {
    public String Nombre_estudiante;  
    public int ID_ESTUDIANTE;         
    public int Edad_Estudiante;       
   
    public Estudiante(String Nombre_estudiante, int ID_ESTUDIANTE, int Edad_Estudiante) {
        this.Nombre_estudiante = Nombre_estudiante;
        this.ID_ESTUDIANTE = ID_ESTUDIANTE;
        this.Edad_Estudiante = Edad_Estudiante;
       
    }

    public String datos_estudiante() {
        return "Estudiante: " + Nombre_estudiante + " (ID: " + ID_ESTUDIANTE + ") Edad: " + Edad_Estudiante;
    }
}
