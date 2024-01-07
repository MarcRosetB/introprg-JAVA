/* 
 * Triangulo que se hace con números
*/

import java.util.Scanner;

public class TrianguloNumerico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor final?");
        int fin = sc.nextInt();

        for(int col = 1; col <= fin; col++) {
            for(int fila = col; fila >0; fila --) {
                System.out.print(" " + fila);
            }
            System.out.println();
        }
        sc.close();
    }
}
