/*Inicio
int num;
int numIntentos=1;
int intento;
Scanner leer = new Scanner(System.in);
sout("Introduce un numero para que lo adivine el jugador 2");
num=leer.nextInt();
sout("Ahora introduce un intento para adivinar el numero del jugador 1");
intento = leer.nexInt;
while(numero!=intento){
numIntentos++;
sout("introduce otro intento");
intento = leer.nexInt;
}
sout("has acertado el numero era " + numero + " has necesitado " + numIntentos);
FIN*/

public class App {
    public static void main(String[] args) {
        int num;
        int numIntentos = 1;
        int aleatorio;
        System.out.println("Introduce un valor");
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        System.out.println("Introduce un intento");
        aleatorio = leer.nextInt();
        while (num != aleatorio) {
            String resultado = (aleatorio > num) ? "introduce un numero más pequeño": (aleatorio < num) ? "introduce un numero más grande" : "";
            System.out.println(resultado);
            numIntentos++;
            aleatorio = leer.nextInt();
        }
        System.out.println("Has acertado el numero era " + aleatorio + " y has usado " + numIntentos + " intentos");
    }

}
