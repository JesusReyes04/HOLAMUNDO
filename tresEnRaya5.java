package demo2;

import java.util.Scanner;

public class tresEnRaya3 {
    public static void main(String[] args) {
        // ---- VARIABLES
        /*
        
        VARIABLES:
        UN ARRAY BIDIMENSIONAL PARA REPRESENTAR LAS CASILLAS
        UN STRING JUGADOR PARA LLEVAR EL CONTROL DE QUIÉN JUEGA
        UN BOOLEANO QUE HAGA DE FLAG PARA DETENER EL WHILE EN CASO DE VICTORIA
        UN ENTERO PARA CONTROLAR EL TURNO Y SI LLEGA A 9 SE DETIENE, COMIENZA EN 0 Y LLEGA HASTA 8; SE EJECUTA 9 VECES

        ------------------------------------------------------------------

        MÉTODOS:
        IMPRIMIRTABLERO QUE SU FUNCION ES MOSTRAR EL ARRAY BIDIMENSIONAL
        INTRODUCIRCARACTER. CREA LAS VARIABLES LOCALES COORDENADAI(FILAS) Y COORDENADAJ(COLUMNAS) Y CREA TAMBIÉN EL SCANNER
            DENTRO DE UN DO WHILE SE LE DA VALOR A COORDENADAI Y COORDENADAJ DEL MÉTODO OBTENER COORDENADA, LOS VALORES RETORNADOS
            SE COMPROBARÁN EN LA CONDICIÓN DEL DO WHILE.
        OBTENERCOORDENADA ES UN MÉTODO AL QUE SE LLAMA PARA DAR UN VALOR POR TECLADO DENTRO DE UN DO WHILE A UNA COORDENADA

        */

        String[][] tablero = { { " * ", " * ", " * " }, { " * ", " * ", " * " }, { " * ", " * ", " * " } };
        String jugador = " X ";
        boolean haGanado = false;
        int turno = 0;

        // ------BIENVENIDA Y PRESENTACIÓN DEL JUEGO
        System.out.println("\n-·:.:·:.:·:.:·-Tres en raya-·:.:·:.:·:.:·-");
        imprimirTablero(tablero);

        // -----JUEGO
        while (turno < 9 && !haGanado) {
            introducirCaracter(tablero, jugador);       // tenemos 2 variables coordenadas una para la fila y ota para la columna, a esas variables le vamos a asiganar un valor, será verificado
            imprimirTablero(tablero);
            haGanado=verificarGanador(tablero,jugador);
            muestraResultado(haGanado,jugador,turno);
            turno++;
            jugador = cambiarJugador(jugador);
        }
        
    }
    
    public static String cambiarJugador(String jugador) {
        return (jugador==" X ")?" O ":" X ";
    }

    public static boolean verificarGanador(String[][] tablero, String jugador) {
        boolean haGanado=false;
        for(int i=0; i<tablero.length;i++){         // comprobamos victoria en las horizontales 
            if (tablero[i][0].equals(jugador)&&tablero[i][1].equals(jugador)&&tablero[i][2].equals(jugador)) {
                haGanado=true;
            }
        }
        if(!haGanado){
            for(int i=0; i<tablero.length;i++){     // comprobamos victoria en las horizontales 
                if (tablero[0][i].equals(jugador)&&tablero[1][i].equals(jugador)&&tablero[2][i].equals(jugador)) {
                    haGanado=true;
                }
            }                                       //comprobamos las diagonales
            if ((tablero[0][0].equals(jugador)&&tablero[1][1].equals(jugador)&&tablero[2][2].equals(jugador))||(tablero[2][0].equals(jugador)&&tablero[1][1].equals(jugador)&&tablero[0][2].equals(jugador))) {
                haGanado=true;
            }
        }
        return haGanado;
    }
    public static void muestraResultado(boolean haGanado, String jugador, int turno){
        if (haGanado) {
            System.out.println("\nEl jugador" + jugador + "ha ganado");
        }
        if (turno==8&&!haGanado) {
            System.out.println("\nSe ha producido un empate");
        }
    }

    public static void imprimirTablero(String[][] tablero) {
        System.out.println("\n");
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (j < tablero[i].length - 1) {
                    System.out.print(tablero[i][j] + "|");
                } else {
                    System.out.print(tablero[i][j]);
                }
            }
            if (i < tablero.length - 1) {
                System.out.println("");
                System.out.println("-----------");
            }
        }
        System.out.println("\n");
    }

    public static void introducirCaracter(String[][] tablero, String jugador) {
        int coordenadaI;
        int coordenadaJ;
        Scanner leer = new Scanner(System.in);
        System.out.println("\nJugador"+jugador+"es su turno");
        do {
            coordenadaI = obtenerCoordena("Introduce el numero de la fila",leer);
            coordenadaJ = obtenerCoordena("Introduce el numero de la columna",leer);
        } while (tablero[coordenadaI - 1][coordenadaJ - 1] == " X "|| tablero[coordenadaI - 1][coordenadaJ - 1] == " O ");
        tablero[coordenadaI - 1][coordenadaJ - 1] = jugador;
    }

    public static int obtenerCoordena(String mensajillo,Scanner leer) {
        int coordenada;
        do{
            System.out.println(mensajillo+" (entre 1 y 3)");
            coordenada=leer.nextInt();
        }while(coordenada<1||coordenada>3);
        return coordenada;
    }

}
