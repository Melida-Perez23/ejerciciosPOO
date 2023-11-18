class Jugador {
    int id;
    String nombre;
    boolean vivo;

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.vivo = true;
    }

    public void disparar(Revolver r) {
        System.out.println(this.nombre + " se dispara...");
        if (r.disparar()) {
            System.out.println(this.nombre + " ha muerto.");
            this.vivo = false;
        } else {
            System.out.println(this.nombre + " ha sobrevivido.");
            r.siguienteBala();
        }
    }
}
