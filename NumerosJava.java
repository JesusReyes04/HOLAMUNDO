package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        char c1; char c2; char c3;
        Scanner leer = new Scanner(System.in);
        System.out.println("introduce el primer caracter");
        c1 = leer.next().charAt(0);
        System.out.println("introduce el segundo caracter");
        c2 = leer.next().charAt(0);
        System.out.println("introduce el tercer caracter");
        c3 = leer.next().charAt(0);
        if (c1 >= c2 && c1 >= c3) {
            if (c2 > c3) {
                System.out.println(c1);
                System.out.println(c2);
                System.out.println(c3);
            } else {
                System.out.println(c1);
                System.out.println(c3);
                System.out.println(c2);
            }
        } else if (c2 >= c1 && c2 >= c3) {
            if (c1 > c3) {
                System.out.println(c2);
                System.out.println(c1);
                System.out.println(c3);
            } else {
                System.out.println(c2);
                System.out.println(c3);
                System.out.println(c1);
            }
        } else if (c3 >= c2 && c3 >= c1) {
            if (c2 > c1) {
                System.out.println(c3);
                System.out.println(c2);
                System.out.println(c1);
            } else {
                System.out.println(c3);
                System.out.println(c1);
                System.out.println(c1);
            }
        }
    }

}
