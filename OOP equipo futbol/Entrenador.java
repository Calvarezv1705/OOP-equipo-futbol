public class Entrenador extends Jugador {

    private int idFederacion;

    public Entrenador(int identificador, String nombre, String apellido, int edad, int idFederacion) {
        super(identificador, nombre, apellido, edad, edad, apellido, idFederacion);
        this.idFederacion = idFederacion;
    }

    public void dirigirEntrenamiento() {

    }

    public int viajar() {
        estado = 3;
        return estado;
    }

    public void dirigirPartidos() {

    }

    public int concentrado() {
        estado = 2;
        return estado;
    }

    public void imprimir() {
        System.out.println("Identificador: " + identificador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Id Federacion: " + idFederacion);
    }

}
