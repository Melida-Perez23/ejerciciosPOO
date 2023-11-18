public class SalaDeCine {
    private String película;
    private double precioEntrada;
    private Asiento[][] asientos;

    public SalaDeCine(String película, double precioEntrada) {
        this.película = película;
        this.precioEntrada = precioEntrada;                                                     
        this.asientos = new Asiento[10][10];
    }

    public String getPelícula() {
        return this.película;
    }

    public void setPelícula(String película) {
        this.película = película;
    }

    public double getPrecioEntrada() {
        return this.precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public Asiento[][] getAsientos() {
        return this.asientos;
    }

    public void mostrar() {
        System.out.println("Sala de cine: Michellopolis");
        System.out.println("Película: " + this.getPelícula());
        System.out.println("Precio de entrada: " + this.getPrecioEntrada());
        System.out.println("Asientos: " + getAsientos());
        for (int fila = 1; fila <= 10; fila++) {
            for (int columna = 1; columna <= 10; columna++) {
                System.out.print(asientos[fila - 1][columna - 1] .getEstado() + " ");
            }
            System.out.println();
        }
    }
}
