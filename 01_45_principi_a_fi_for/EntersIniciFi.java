/*
 * Programa que pide un inicio y un final con salto, de esta manera mediante un for hacemos un recorrido
 */

import java.util.Scanner;

public class EntersIniciFi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inicio?");
        int inicio = sc.nextInt();
        System.out.println("Fi");
        int fi = sc.nextInt();
        System.out.println("Salt?");
        int salt = sc.nextInt();

        for(int x = inicio; x <= fi; x += salt) {
            System.out.println(x);
        }
        sc.close();
    }
}
