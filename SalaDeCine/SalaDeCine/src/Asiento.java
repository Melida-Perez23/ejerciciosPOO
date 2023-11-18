public class Asiento {
    private char columna;
    private int fila;
    private boolean ocupado;
    private boolean Estado;

    public Asiento(char columna, int fila, boolean ocupado, boolean Estado) {
        this.columna = columna;
        this.fila = fila;
        this.ocupado = ocupado;
        this.Estado = Estado;
    }

    public char getColumna() {
        return this.columna;
    }

    public void setColumna(char columna) {
        this.columna = columna;
    }

    public int getFila() {
        return this.fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public boolean isOcupado() {
        return this.ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean getEstado() {
        return this.Estado;
    }

    public void setEstado(boolean Estado){
        this.Estado = Estado;
    }
}
