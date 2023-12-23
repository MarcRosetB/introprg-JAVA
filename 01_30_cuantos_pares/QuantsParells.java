/*
 * programa que cuenta cuantos numeros pares has introducido.
 * para detener el programa basta con un número negativo
*/

import java.util.Scanner;

public class QuantsParells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;

        System.out.println("Introduce un valor");
        int valor = sc.nextInt();

        while(valor >0) {
            if(valor %2 == 0) {
                cantidad ++;
            }
            System.out.println("Introduce un valor");
            valor = sc.nextInt();
        }
        System.out.println("Has introducido " + cantidad + " pares");
        sc.close();
    }
}