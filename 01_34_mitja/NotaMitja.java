/*
 * Este programa pide notas de entre 0 y 100 y luego te hace la media de las notas introducidas
 * al intoducir una nota que no esta en ese rango se acaba el programa
 */

import java.util.Scanner;

public class NotaMitja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un nota");
        int nota = sc.nextInt();

        int suma = 0;
        int cantidad = 0;

        if (nota < 0 || nota > 100) {
            System.out.println("Ninguna nota válida introducida");
        }
        else {
            while(nota >= 0 && nota <= 100) {
                suma += nota;
                cantidad ++;
                System.out.println("introduce una nota");
                nota = sc.nextInt();
            }
        }
        System.out.println("La nota media es :" + (suma / cantidad));
        sc.close();
    }
}