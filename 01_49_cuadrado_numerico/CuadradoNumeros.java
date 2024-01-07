/*
 * Usaremos dos for anidados para formar un cuadrado de numeros
 */

import java.util.Scanner;

public class CuadradoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor final?");
        int fin = sc.nextInt();

        for(int fila = 1; fila <= fin; fila ++) {
            for(int col = 1; col <= fin; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
