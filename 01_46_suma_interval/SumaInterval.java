/*
 * Programa que dados dos numeros, suma los que hay entre medio
 */

import java.util.Scanner;

public class SumaInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma = 0;

        System.out.println("Primero?");
        int primer = sc.nextInt();
        System.out.println("Segon?");
        int segon = sc.nextInt();
        int inicio;
        int fi;

        if (primer < segon) {
            inicio = primer;
            fi = segon;
        }
        else {
            inicio = segon;
            fi = primer;
        }
        
        for (int x = inicio; x <= fi; x++){
            suma += x;
            System.out.println(suma);
        }
        sc.close();
    }
}
