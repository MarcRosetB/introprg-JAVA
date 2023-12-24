/*
 * Programa que simula un loro, repite palabras hasta que le introduces un espacio en blanco o un enter
 */

import java.util.Scanner;

public class Lloro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("El lloro espera paraula:");
        String paraula = sc.nextLine();

        while (!paraula.isBlank()) {
            System.out.println("El lloro repeteix: " + paraula);
            System.out.println("El lloro espera paraula:");
            paraula = sc.nextLine();
        }
        System.out.println("Adéu");
        sc.close();
    }
}