public class Main {
    public static void main(String[] args) {

        Profesor profesor1 = new Profesor("Juan M. Hernandez", 30, "M", "Introduccion a la programacion");
        Profesor profesor2 = new Profesor("Maria J. Lopez", 28, "F", "Ingenieria de software");
        Profesor profesor3 = new Profesor("Martin A. Palacios", 31, "F", "Sistemas operativos de redes");


        Estudiante estudiante1 = new Estudiante("Carlos", 18, "M", "Introduccion a la programacion, Ingenieria de software y Sistemas operativos de redes", 8);
        Estudiante estudiante2 = new Estudiante("Mariana", 17, "F", "Introduccion a la programacion, Ingenieria de software y Sistemas operativos de redes" , 6);
        Estudiante estudiante3 = new Estudiante("Laura", 19, "F", "Introduccion a la programacion, Ingenieria de software y Sistemas operativos de redes" , 7);

        Aula aula1 = new Aula(1, 30, "Introduccion a la programacion");
        Aula aula2 = new Aula(2, 30, "Ingenieria de software");
        Aula aula3 = new Aula(3, 30, "Sistemas operativos de redes");

        aula1.asignarProfesor(profesor1);
        aula2.asignarProfesor(profesor2);
        aula3.asignarProfesor(profesor3);

        aula1.agregarEstudiante(estudiante1);
        aula1.agregarEstudiante(estudiante2);
        aula1.agregarEstudiante(estudiante3);

        aula2.agregarEstudiante(estudiante1);
        aula2.agregarEstudiante(estudiante2);
        aula2.agregarEstudiante(estudiante3);

        aula3.agregarEstudiante(estudiante1);
        aula3.agregarEstudiante(estudiante2);
        aula3.agregarEstudiante(estudiante3);

        if (aula1.sePuedeDarClase()) {
            System.out.println("La clase de Introduccion a la programacion en el aula 1 puede darse.");
            System.out.println("Numero de alumnos aprobados: " + aula1.getNumAlumnosAprobados());
            System.out.println("Numero de alumnas aprobadas: " + aula1.getNumAlumnasAprobadas());
        } else {
            System.out.println("La clase de Introduccion a la programacion en el aula 1 no puede darse.");
        }

        if (aula2.sePuedeDarClase()) {
            System.out.println("La clase de Ingenieria de software en el aula 2 puede darse.");
            System.out.println("Numero de alumnos aprobados: " + aula2.getNumAlumnosAprobados());
            System.out.println("Numero de alumnas aprobadas: " + aula2.getNumAlumnasAprobadas());
        } else {
            System.out.println("La clase de Ingenieria de software en el aula 2 no puede darse.");
        }

        if (aula3.sePuedeDarClase()) {
            System.out.println("La clase de Sistemas operativos de redes en el aula 3 puede darse.");
            System.out.println("Numero de alumnos aprobados: " + aula3.getNumAlumnosAprobados());
            System.out.println("Numero de alumnas aprobadas: " + aula3.getNumAlumnasAprobadas());
        } else {
            System.out.println("La clase de Sistemas operativos de redes en el aula 3 no puede darse.");
        }
    }
}