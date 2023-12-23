/*
 * Programa que suma tres numeros positivos 
*/

import java.util.Scanner;

public class SumaPositius {
    public static void main(String[] args) {
        int suma = 0;
        int valor;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce primer valor");
        valor = sc.nextInt();

        if(valor >=0) {
            suma +=valor;
        }
        System.out.println("Introduce segundo valor");
        valor = sc.nextInt();

        if (valor >= 0) {
            suma += valor;
        }
        System.out.println("Introduce tercer valor");
        valor = sc.nextInt();

        if (valor >= 0) {
            suma += valor;
        }
        sc.close();
        System.out.println("La suma es " + suma);
    }
}