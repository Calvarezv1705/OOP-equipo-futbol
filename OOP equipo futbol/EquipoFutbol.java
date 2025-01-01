public class EquipoFutbol {
    private int id;
    private String nombre;
    private Jugador[] jugadores;
    private Entrenador[] entrenadores;
    private int countJugador = 0;
    private int countEnt = 0;

    public EquipoFutbol(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.jugadores = new Jugador[11];
        this.entrenadores = new Entrenador[1];
    }

    public void adicionarJugardor(Jugador jg) {
        this.jugadores[countJugador++] = jg;
    }

    public void adicionarEntrenador(Entrenador ent) {
        this.entrenadores[countEnt++] = ent;
    }

    public void listarNombreJugadores() {
        System.out.println("Jugadores del equipo:");
        for (int i = 0; i < countJugador; i++) {
            System.out.println(jugadores[i].getNombre());
        }
    }

    public void listarNombreEntrenador() {
        System.out.println("Entrenador del equipo:");
        for (int i = 0; i < countEnt; i++) {
            System.out.println(entrenadores[i].getNombre());
        }
    }

    public void entrenar() {
        System.out.println("Entrenando...");
        for (int i = 0; i < countJugador; i++) {
            Jugador jugador = jugadores[i];
            if (jugador.getEstado() == 1) {
                System.out.println(jugador.getNombre() + " está entrenando.");
            }
        }
    }

    public void viajar() {
        System.out.println("Viajando...");
        for (int i = 0; i < countJugador; i++) {
            Jugador jugador = jugadores[i];
            if (jugador.getEstado() == 3) {
                System.out.println(jugador.getNombre() + " está viajando.");
            }
        }
    }

    public void jugar() {
        System.out.println("Jugando...");
        for (int i = 0; i < countJugador; i++) {
            Jugador jugador = jugadores[i];
            if (jugador.getEstado() == 4) {
                System.out.println(jugador.getNombre() + " está jugando.");
            }
        }
    }
}
