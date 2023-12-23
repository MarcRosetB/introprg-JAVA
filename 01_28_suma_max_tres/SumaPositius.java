/*
 * Programa que suma numeros positivos hasta que le introduces uno negativo
 * no obstante solo suma los tres primeros positivos
*/

import java.util.Scanner;

public class SumaPositius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int vuelta = 0;

        System.out.println("Introduce un valor");
        int valor = sc.nextInt();

        while(valor >= 0) {
            if(vuelta < 3) {
                suma += valor;
            }
            vuelta ++;

            System.out.println("Introduce siguiente valor");
            valor = sc.nextInt();
        }
        System.out.println("La suma es " + suma);
        sc.close();
    }
}