/*
 * Programa que pide tanto un inicio, final y salto.
 * muestra los numeros entre el inicio y el final
 */

import java.util.Scanner;

public class EntersIniciFi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inicio?");
        int inicio = sc.nextInt();
        System.out.println("Final?");
        int ultimo = sc.nextInt();
        System.out.println("Salto?");
        int salt = sc.nextInt();

        do {
            System.out.println(inicio);
            inicio += salt;
        } while(inicio <= ultimo);
        sc.close();
    }
}
