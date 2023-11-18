public class Estudiante {
    private int calificacion;
    private String asignaturas;
    private String sexo;
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad, String sexo, String asignaturas, int calificacion ) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.calificacion = calificacion;
        this.asignaturas = asignaturas;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getSexo(){
        return sexo;
    }
    private void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getAsignatura(){
        return asignaturas;
    }
    public void setAsignatura(String asignaturas){
        this.asignaturas = asignaturas;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    public boolean estaAprobado() {
        return calificacion >= 6;
 }
}