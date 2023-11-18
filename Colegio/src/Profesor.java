import java.util.Random;

public class Profesor{
    private String nombre;
    private String asignatura;
    private int edad;
    private String sexo;

    public Profesor(String nombre, int edad, String sexo ,String asignatura){
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.edad = edad;
        this.sexo = sexo;
    }
    public String setNombre(){
        return nombre;
    }
    public void getNombre(String nombre){
        this.nombre = nombre;
    }
    public String getAsignatura(){
        return asignatura;
    }
    public void setAsignatura(String asignatura){
        this.asignatura = asignatura;
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
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

public boolean estaDisponible() {
        Random random = new Random();
        return random.nextInt(100) >= 20;
    }
}