import java.util.ArrayList;
import java.util.List;

public class Aula {
    private int id;
    private int maxEstudiantes;
    private String asignatura;
    private List<Estudiante> estudiantes;
    private Profesor profesor;

    public Aula(int id, int maxEstudiantes, String asignatura) {
        this.id = id;
        this.maxEstudiantes = maxEstudiantes;
        this.asignatura = asignatura;
        this.estudiantes = new ArrayList<>();
    }

    public void asignarProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiantes.size() < maxEstudiantes) {
            estudiantes.add(estudiante);
        }
    }

    public boolean sePuedeDarClase() {
        if (profesor == null || !profesor.estaDisponible()) {
            return false;
        }

        int numAprobados = 0;
        int numFaltantes = 0;

        for (Estudiante estudiante : estudiantes) {
        if (estudiante.getAsignatura().equals(asignatura)) {
           if (estudiante.estaAprobado()) {
             numAprobados++;
        } else {
        numFaltantes++;
                }
            }
        }

        return numAprobados > (maxEstudiantes * 0.5) && numFaltantes <= (maxEstudiantes * 0.5);
    }

    public int getNumAlumnosAprobados() {
        int numAprobados = 0;

        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getAsignatura().equals(asignatura) && estudiante.estaAprobado()) {
                numAprobados++;
            }
        }

        return numAprobados;
    }

    public int getNumAlumnasAprobadas() {
        int numAprobadas = 0;

        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getAsignatura().equals(asignatura) && estudiante.estaAprobado() && estudiante.getSexo().equals("F")) {
                numAprobadas++;
            }
        }

        return numAprobadas;
    }
}
  

