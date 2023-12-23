/*
 * Este programa muestra un mensaje en funcion del color del semaforo
 */

import java.util.Scanner;

public class Semafor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Color?");
        String color = sc.nextLine();
        sc.close();

        if(color.equals("rojo")) {
            System.out.println("Espera");
        }
        else if(color.equals("verde")) {
            System.out.println("Adelante");
        }
        else if(color.equals("amarillo")) {
            System.out.println("Corre!");
        }
        else {
            System.out.println("Ves al oculista");
        }
    }
}