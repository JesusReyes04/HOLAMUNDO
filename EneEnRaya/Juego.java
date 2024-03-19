package cosasDelLibro.POO.EneEnRaya;

import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Tablero tablero;
        Jugador jugador = new Jugador();
        Jugador jugadora = new Jugador();

        tablero = new Tablero(crearTablero(leer));
        tablero.rellenarTablero();
        tablero.mostrarTablero();
        jugador.introducirNombres(leer);
        jugadora.introducirNombres(leer);
        tablero.setJugador1(jugador);
        tablero.setJugador2(jugadora);
        jugador.establecerCaracter(leer);
        jugadora.establecerCaracter(leer);
        tablero.PrimerJugador(leer);
    }

    public static int crearTablero(Scanner leer) {
        int tamaño;
        System.out.println("Introduce el tamaño del tablero");
        do{
            tamaño=leer.nextInt();
        }while(tamaño<3);
        leer.nextLine();
        return tamaño;
    }
}