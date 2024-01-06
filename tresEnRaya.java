import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[][] tablero = { { " * ", " * ", " * " }, { " * ", " * ", " * " }, { " * ", " * ", " * " } };
        int turno = 0;
        boolean esJugadorX;
        boolean hasGanao=false;
        mostrarTablero(tablero);
        while (turno < 9||!hasGanao) {
            esJugadorX = comprobarturno(turno);
            introducirCaracter(tablero, esJugadorX);
            mostrarTablero(tablero);
            turno++;
        }

    }

    public static boolean comprobarturno(int turno) {
        boolean juegaLaX;
        if (turno % 2 == 0) {
            System.out.println("turno del jugador 1");
            juegaLaX = true;
        } else {
            System.out.println("turno del jugador 2");
            juegaLaX = false;
        }
        return juegaLaX;
    }

    public static void introducirCaracter(String[][] tablero, boolean esJugadorX) {
        int coordenadaI;
        int coordenadaJ;
        Scanner leer = new Scanner(System.in);
        String jugador;
        jugador = (esJugadorX) ? " X " : " O ";
        System.out.println("Introduce las coordenadas de tu jugada");
        do {
            System.out.println("Numero de la fila (entre el 1 y el 3)");
            coordenadaI = leer.nextInt();
        } while (coordenadaI > 3 || coordenadaI < 1);
        do {
            System.out.println("Numero de la columna (entre el 1 y el 3)");
            coordenadaJ = leer.nextInt();
        } while (coordenadaJ > 3 || coordenadaJ < 1);
        while (tablero[coordenadaI - 1][coordenadaJ - 1].equals(" X ") || tablero[coordenadaI - 1][coordenadaJ - 1].equals(" O ")) {
            System.out.println("Coordenadas no válidas mete otras");
            do {
                System.out.println("Numero de la fila (entre el 1 y el 3)");
                coordenadaI = leer.nextInt();
            } while (coordenadaI > 3 || coordenadaI < 1);
            do {
                System.out.println("Numero de la columna (entre el 1 y el 3)");
                coordenadaJ = leer.nextInt();
            } while (coordenadaJ > 3 || coordenadaJ < 1);
        }
        tablero[coordenadaI - 1][coordenadaJ - 1] = jugador;

    }

    public static void mostrarTablero(String[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println("");
        }
    }
}
