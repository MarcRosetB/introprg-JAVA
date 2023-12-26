/*
 * Ejercicio que muestra cuantos numeros consecutivos has introducido hasta que introduces uno que no sea
 */

import java.util.Scanner;

public class SecuenciaCreciente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = 0;
        int valor1 = 0;
        int sequencia = -1;

        do {
            System.out.println("Introdueix un valor");
            valor = sc.nextInt();
            sequencia += 1;
            System.out.println("Introdueix un valor");
            valor1 = sc.nextInt();
            sequencia += 1;
        } 
        while (valor1 > valor);
        System.out.println("Longitud de la següència creixent: " + sequencia);
        sc.close();
    }
}