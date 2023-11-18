public class Main {
    public static void main(String[] args) {
        SalaDeCine salaDeCine = new SalaDeCine("La hermosa vida Michelle", 10);
        salaDeCine.mostrar();

        for (int i = 0; i < 10; i++) {
            int fila = (int) (Math.random() * 10) + 1;
            int columna = (int) (Math.random() * 10) + 1;
            boolean edadSuficiente = (int) (Math.random() * 100) < 18;
            boolean dineroSuficiente = (int) (Math.random() * 100) < 50;

            Asiento asiento = salaDeCine.getAsientos()[fila - 1][columna - 1];
            if (asiento.isOcupado() || !edadSuficiente || !dineroSuficiente) {
                continue;
            }

            asiento.setOcupado(true);
            System.out.println("Espectador sentado en el asiento " + asiento.getColumna() + fila);
        }
    }
}
