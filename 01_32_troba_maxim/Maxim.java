/*
 * Ejercicio que busca el maximo de los valores introducidos, para parar introducir numero negativo
*/

import java.util.Scanner;

public class Maxim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;

        System.out.println("Introduce un número");
        int valor = sc.nextInt();

        while (valor >= 0) {
            if (valor > max) {
                max = valor;
            }
            System.out.println("Introduce un número");
            valor = sc.nextInt();
        }
        System.out.println("El maximo es " + max);
        sc.close();
    }
}