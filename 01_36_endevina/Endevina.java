/*
 * Programa que pide numeros al usuario mientras le contesta si es más grande o más pequeño que el numero pensado por el programa.
 * El numero pensado siempre es 42
*/

import java.util.Scanner;

public class Endevina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        int num = sc.nextInt();

        while (num != 42) {
            if (num > 100) {
                System.out.println("Como máximo es 100");
            }
            else if (num < 0) {
                System.out.println("Como minimo el numero puede ser 0");
            }
            else if (num > 42 && num < 100) {
                System.out.println("Demasiado grande");
            } else if (num < 42 && num > 0) {
                System.out.println("Demasiado pequeño");
            }
            System.out.println("Introduce un número");
            num = sc.nextInt();
        }
        sc.close();
        System.out.println("Has acertado!");
    }
}
