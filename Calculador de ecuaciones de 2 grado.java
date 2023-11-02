import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        double a, b, b2, c, x1, x2;
        Scanner leer = new Scanner(System.in);
        System.out.println("introuduce a");
        a = leer.nextDouble();
        while (a == 0) {
            System.out.println("introduce un valor distinto de 0");
            a = leer.nextDouble();
        }
        System.out.println("introduce b");
        b = leer.nextDouble();
        b2 = Math.pow(b, 2);
        System.out.println("introduce c");
        c = leer.nextDouble();
        x1 = (-b + (Math.sqrt(b2 - 4 * a * c))) / 2 * a;
        x2 = (-b - (Math.sqrt(b2 - 4 * a * c))) / 2 * a;
        if (x1 == x2) {
            System.out.println(x1 + "doble");
        } else if (x1 != x2) {
            System.out.println(x1);
            System.out.println(x2);
        } else {
            System.out.println("Sin solución");
        }
