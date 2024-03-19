package cosasDelLibro.POO.EneEnRaya;

import java.util.Scanner;

public class Tablero {
    private String[][] tablero;
    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador jugadorActual;

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public Tablero(int tamaño){
        tablero = new String[tamaño][tamaño];
    }

    public void setJugadorActual(Jugador jugadorActual) {
        this.jugadorActual = jugadorActual;
    }

    public void cambiarDeJugador(){
        jugadorActual = (jugadorActual.equals(jugador1))?jugador2:jugador1;
    }

    public void rellenarTablero(){
        for (int i = 0; i < tablero.length; i++) {
            for(int j = 0; j<tablero[i].length; j++){
                tablero[i][j]=" * ";
            }
        }
    }

    public void mostrarTablero(){
        for (int i = 0; i < tablero.length; i++) {
            for(int j = 0; j<tablero[i].length; j++){
                System.out.print(tablero[i][j]);
            }
            System.out.println("");
        }
    }

    public void introducirFicha(Scanner leer) {
        int coordenadaFila;
        int coordenadaColumna;
        do {
            coordenadaFila = introducirCoordenada(" fila", leer);
            coordenadaColumna = introducirCoordenada(" columna", leer);
        } while (tablero[coordenadaFila][coordenadaColumna] == jugador1.getFicha() || tablero[coordenadaFila][coordenadaColumna] == jugador2.getFicha());
        tablero[coordenadaFila][coordenadaColumna] = jugadorActual.getFicha();
    }

    private int introducirCoordenada(String mensaje, Scanner leer) {
        int coordenadaAux;
        do {
            System.out.println("Introduce la coordenada de la"+mensaje);
            coordenadaAux=leer.nextInt();
        } while (coordenadaAux<1||coordenadaAux>tablero.length);
        return coordenadaAux;
    }

    public void PrimerJugador(Scanner leer) {
        String nombre;
        do {
            System.out.println("Seleccione quién va a ser el primer jugador");
            nombre = leer.nextLine();
            if (!nombre.equals(jugador1.getNombre()) && !nombre.equals(jugador2.getNombre())) {
                System.out.println("Nombre incorrecto. Por favor, ingrese un nombre válido:");
            }
        } while (!nombre.equals(jugador1.getNombre()) && !nombre.equals(jugador2.getNombre()));
        
        if (nombre.equals(jugador1.getNombre())) {
            jugadorActual = jugador1;
        } else {
            jugadorActual = jugador2;
        }
    }
}