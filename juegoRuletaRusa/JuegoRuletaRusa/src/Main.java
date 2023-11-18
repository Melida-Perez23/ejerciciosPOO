import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el número de jugadores (1-6): ");
            int numJugadores = scanner.nextInt();

            
            if (numJugadores < 1 || numJugadores > 6) {
                numJugadores = 6;
            }

            
            Juego juego = new Juego(numJugadores);

            
            while (!juego.finJuego()) {
                juego.ronda();
            }
        }
    }
}
