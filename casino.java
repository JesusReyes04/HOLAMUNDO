//import java.util.Random;
/*
double cartera = 50;
System.out.println("Bienvenido a Fortuna Royale");
System.out.println("tienes en la cartera "+ cartera+" euros");
while (cartera>=2) {
    cartera=realizarApuestas(cartera);
}
}

public static double realizarApuestas(double cartera) {
int numeroApostado;
boolean haEscogidoParImpar=false;
int elegirPar;
int bola;
Random random = new Random();
bola=random.nextInt(37);


Scanner leer = new Scanner(System.in);
do {
    System.out.println("Apuesta a un número");
    numeroApostado=leer.nextInt();

} while (numeroApostado<0||numeroApostado>36);
do {
    System.out.println("Selecciona par o impar");
    System.out.println("pulsa para 1 para el par");
    System.out.println("pulsa para 2 para el impar");
    elegirPar=leer.nextInt();
    switch (elegirPar) {
        case 1:
        haEscogidoParImpar=true;
        break;
        case 2:
            haEscogidoParImpar=true;
        break;
        default:
            System.out.println("Selecciona una opcion valida");
        break;
    }
} while (!haEscogidoParImpar);
cartera-=2;
System.out.println("La bola ha caido en el " + bola);

if(bola==numeroApostado){
    if (bola==0) {
        cartera+=3.6;
    }else{
        cartera+=2;
    }
    System.out.println("has acertado el numero");
}
if ((elegirPar==1&&bola%2==0)||(elegirPar==2&&bola%2!=0)) {
    cartera+=2;
    System.out.println("has acertado lo de par e impar");
}
System.out.println("Tienes en la cartera " + cartera + " euros");
return cartera;

   double cartera = 50;
System.out.println("Bienvenido a Fortuna Royale");
System.out.println("tienes en la cartera "+ cartera+" euros");
while (cartera>=2) {
    cartera=realizarApuestas(cartera);
}
}

public static double realizarApuestas(double cartera) {
int numeroApostado;
boolean haEscogidoParImpar=false;
int elegirPar;
int bola;
Random random = new Random();
bola=random.nextInt(37);


Scanner leer = new Scanner(System.in);
do {
    System.out.println("Apuesta a un número");
    numeroApostado=leer.nextInt();

} while (numeroApostado<0||numeroApostado>36);
do {
    System.out.println("Selecciona par o impar");
    System.out.println("pulsa para 1 para el par");
    System.out.println("pulsa para 2 para el impar");
    elegirPar=leer.nextInt();
    switch (elegirPar) {
        case 1:
            haEscogidoParImpar=true;
            break;
        case 2:
            haEscogidoParImpar=true;
        break;
        default:
            System.out.println("Selecciona una opcion valida");
        break;
    }
} while (!haEscogidoParImpar);
cartera-=2;
System.out.println("La bola ha caido en el " + bola);

if(bola==numeroApostado){
    if (bola==0) {
        cartera+=3.6;
    }else{
        cartera+=2;
    }
    System.out.println("has acertado el numero");
}
if ((elegirPar==1&&bola%2==0)||(elegirPar==2&&bola%2!=0)) {
    cartera+=2;
    System.out.println("has acertado lo de par e impar");
}
System.out.println("Tienes en la cartera " + cartera + " euros");
return cartera;

*/

import java.util.Scanner;

public class casino {
    public static void main(String[] args) {
        String user;
        String password;
        String intento;
        Scanner leer = new Scanner(System.in);
        System.out.println("Establece tu usuario");
        user = leer.nextLine();
        System.out.println("Establece tu contraseña");
        password = leer.nextLine();
        System.out.println("Ahora inicia sesión");
        do {
            System.out.println("usuario:");
            intento = leer.nextLine();
        } while (!user.equals(intento));
        do {
            System.out.println("contraseña");
            intento = leer.nextLine();
        } while (!password.equals(intento));

    }

}
