import java.util.Random;

class Revolver {
    int posicionActual;
    int posicionBala;

    public Revolver() {
        Random rand = new Random();
        this.posicionActual = rand.nextInt(6);
        this.posicionBala = rand.nextInt(6);
    }

    public boolean disparar() {
        return posicionActual == posicionBala;
    }

    public void siguienteBala() {
        posicionActual = (posicionActual + 1) % 6;
    }

    public void mostrar() {
        System.out.println("Posición actual: " + posicionActual + ", Posición de la bala: " + posicionBala);
    }
}
