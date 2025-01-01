public class Main {
    public static void main(String[] args) {

        EquipoFutbol ef = new EquipoFutbol(1010, "nacional");
        Jugador jg1 = new Jugador(001, "camilo", "alvarez", 18, 10, "delantero", 1);
        Jugador jg2 = new Jugador(002, "sebastian", "alzate", 20, 11, "central", 3);
        Jugador jg3 = new Jugador(003, "carlos", "restrepo", 19, 9, "medio centro", 4);
        Entrenador ent = new Entrenador(1234, "esteban", "herrera", 45, 1034989);
        ef.adicionarJugardor(jg1);
        ef.adicionarJugardor(jg2);
        ef.adicionarJugardor(jg3);
        ef.adicionarEntrenador(ent);
        ef.listarNombreJugadores();
        ef.listarNombreEntrenador();
        ef.entrenar();
        ef.viajar();
        ef.jugar();
    }
}
