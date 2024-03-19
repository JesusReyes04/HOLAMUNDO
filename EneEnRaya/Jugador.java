package cosasDelLibro.POO.EneEnRaya;

import java.util.Scanner;

public class Jugador {
    private String nombre;
    private String ficha;

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    public String getFicha() {
        return ficha;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void establecerCaracter(Scanner leer) {
        String caracter;
        do {
            System.out.println("Introduzca su caracter");
            caracter = leer.nextLine();
        } while (caracter.length() == 0);
        ficha = " " + caracter.substring(0, 1) + " ";
    }

    public void introducirNombres(Scanner leer){
        String nombre;
        System.out.println("Introduzca su nombre");
        nombre = leer.nextLine();
        setNombre(nombre);
    }
}