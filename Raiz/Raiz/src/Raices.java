public class Raices {
    private double a, b, c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void obtenerRaices() {
        double discriminante = this.mostrarDiscriminante();
        if (discriminante > 0) {
            double solucion1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double solucion2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("La primera solución es: " + solucion1);
            System.out.println("La segunda solución es: " + solucion2);
        } else {
            System.out.println("No se encuentran soluciones reales.");
        }
    }

    public void obtenerRaiz() {
        double discriminante = this.mostrarDiscriminante();
        if (discriminante == 0) {
            double solucion = -b / (2 * a);
            System.out.println("La única solución es: " + solucion);
        } else {
            System.out.println("No se encuentra una única solución real.");
        }
    }

    public double mostrarDiscriminante() {
        return b * b - 4 * a * c;
    }

    public boolean tieneRaices() {
        return mostrarDiscriminante() > 0;
    }

    public boolean tieneRaiz() {
        return mostrarDiscriminante() == 0;
    }

    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No se encuentran soluciones reales.");
        }
    }
}
