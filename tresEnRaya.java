import java.util.Scanner;

public class tresEnRaya {
    public static void main(String[] args) {
        String[][] tablero = { { " * ", " * ", " * " }, { " * ", " * ", " * " }, { " * ", " * ", " * " } };
        String jugador=" X ";
        int turno=0;
        boolean hasGanao=false;
        mostrarTablero(tablero);
        while (turno < 8&&!hasGanao) {
            introducirCaracter(tablero, jugador);
            mostrarTablero(tablero);
            hasGanao = comprobarGanador(tablero,jugador);
            turno++;
            jugador=cambiarJugador(jugador);
        }
        
    }

    public static boolean comprobarGanador(String[][] tablero, String jugador) {
        boolean ganador=false;
        for(int i=0; i<3; i++){
            if (tablero[i][0].equals(jugador)&&tablero[i][1].equals(jugador)&&tablero[i][2].equals(jugador)) {
                ganador=true;
            }
            if (tablero[0][i].equals(jugador)&&tablero[1][i].equals(jugador)&&tablero[2][i].equals(jugador)) {
                ganador=true;
            }
        }
        if (tablero[0][0].equals(jugador)&&tablero[1][1].equals(jugador)&&tablero[2][2].equals(jugador)) {
            ganador=true;
        }
        if (tablero[2][0].equals(jugador)&&tablero[1][1].equals(jugador)&&tablero[0][2].equals(jugador)) {
            ganador=true;
        }
        return ganador;
    }

    public static String cambiarJugador(String jugador) {
        return(jugador.equals(" X "))?" O ":" X ";
    }

    public static void introducirCaracter(String[][] tablero, String jugador) {
        int coordenadaI;
        int coordenadaJ;
        Scanner leer = new Scanner(System.in);
        do {
            coordenadaI=obtenerCoordena("Numero de la fila");
            coordenadaJ=obtenerCoordena("Numero de la columna");
        } while (tablero[coordenadaI - 1][coordenadaJ - 1].equals(" X ") || tablero[coordenadaI - 1][coordenadaJ - 1].equals(" O "));  
        tablero[coordenadaI - 1][coordenadaJ - 1] = jugador;

    }
    
    public static int obtenerCoordena(String mesaje){
        Scanner leer = new Scanner(System.in);
        int coordenada;
        do {
            System.out.println(mesaje+" (entre el 1 y el 3)");
            coordenada=leer.nextInt();
        } while (coordenada<1||coordenada>3);
        return coordenada;
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