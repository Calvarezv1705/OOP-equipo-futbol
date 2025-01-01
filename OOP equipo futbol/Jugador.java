public class Jugador {
    protected int identificador;
    protected String nombre;
    protected String apellido;
    protected int numJugador;
    protected int edad;
    protected String posicion;
    protected int estado;

    public Jugador(int identificador, String nombre, String apellido, int edad, int numJugador, String posicion,
            int estado) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numJugador = numJugador;
        this.posicion = posicion;
        this.estado = 0;

    }

    public void imprimirEstado() {
        if (estado == 0) {
            System.out.println("el jugador " + nombre + " esta indefinido");
        } else if (estado == 1) {
            System.out.println("el jugador " + nombre + " esta entrenadno");
        } else if (estado == 2) {
            System.out.println("el jugador " + nombre + " esta concentrado");
        } else if (estado == 3) {
            System.out.println("el jugador " + nombre + " esta viajando");
        } else if (estado == 4) {
            System.out.println("el jugador " + nombre + " esta jugando");
        } else if (estado == 5) {
            System.out.println("el jugador " + nombre + " esta descansando");
        }
    }

    public void imprimir() {
        System.out.println("Identificador: " + identificador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Número de Jugador: " + numJugador);
        System.out.println("Edad: " + edad);
        System.out.println("Posición: " + posicion);
        System.out.println("Estado: " + estado);

    }

    public int entrenar() {
        estado = 1;
        return estado;
    }

    public int concentrado() {
        estado = 2;
        return estado;
    }

    public int viajar() {
        estado = 3;
        return estado;
    }

    public int jugar() {
        estado = 4;
        return estado;
    }

    public int descansar() {
        estado = 5;
        return estado;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumJugador(int numJugador) {
        this.numJugador = numJugador;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNumJugador() {
        return numJugador;
    }

    public int getEdad() {
        return edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getEstado() {
        return estado;
    }
}
