import java.util.ArrayList;

public class Juego {
    
    ArrayList<Jugador> jugadores;
    Revolver revolver;

    public Juego(int numJugadores) {
        this.jugadores = new ArrayList<>();
        for (int i = 1; i <= numJugadores; i++) {
            jugadores.add(new Jugador(i));
        }
        this.revolver = new Revolver();
    }

    public boolean finJuego() {
        for (Jugador jugador : jugadores) {
            if (!jugador.vivo) {
                return true;
            }
        }
        return false;
    }

    public void ronda() {
        for (Jugador jugador : jugadores) {
            if (jugador.vivo) {
                jugador.disparar(revolver);
                if (finJuego()) {
                    break;
                }
            }
        }
    }
}



