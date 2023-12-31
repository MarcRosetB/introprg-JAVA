/*
 * ejercicio que muestra el intervalo tanto decreciente como creciente, depende que número se introduzca primero
 */

import java.util.Scanner;

public class MostraInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inicio");
        int inicio = sc.nextInt();
        System.out.println("Final");
        int fin = sc.nextInt();

        if(inicio < fin) {
            for(int x = inicio; x <= fin; x++) {
                System.out.println(x);
            }
        }
        else {
            for (int x = inicio; x >= fin; x--) {
                System.out.println(x);
            }
        }
        sc.close();
    }
}