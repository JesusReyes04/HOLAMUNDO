/*
    Este programa solicita al usuario un número entero positivo y realiza:

    1.- verifica si es positivo

    2.- imprime los números pares desde cero hasta el número
    ingresado.

    3.- utiliza un bucle do-while para contar desde 1 hasta el número
    ingresado,

    4.- un bucle while para calcular la suma de los primeros números
    naturales hasta el número ingresado.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero = leerNumero();
        positivo(numero);
        pares(numero);
        contarHastaNumero(numero);
        sumaDeTodosHastaNumIngresado(numero);
    }

    public static int leerNumero() {

        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce un numero");
        return leer.nextInt();
    }

    public static void positivo(int numero) {
        while (numero <= 0) {
            numero = leerNumero();
        }
    }

    public static void pares(int numero) {
        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "   ");
            }
        }
        System.out.println("");
    }

    public static void contarHastaNumero(int numero) {
        int suma = 1;
        do {
            System.out.print(suma+", ");
            suma++;
        } while (suma <= numero);
        System.out.println("");
    }
    public static void sumaDeTodosHastaNumIngresado(int numero){
        int suma=0;
        
        while (suma<=numero) {
            suma+=++suma;
        }
        System.out.println(suma);
    }
}
