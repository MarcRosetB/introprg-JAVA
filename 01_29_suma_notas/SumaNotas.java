/*
 *Programa que suma las notas validas que le introduzcas (entre 0 y 100) si recibe un valor fuera de rango se detiene y te muestra la suma
*/

import java.util.Scanner;

public class SumaNotas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una nota");
        int nota = sc.nextInt();
        int suma = 0;

        while(nota <= 100 && nota >= 0) {
            suma += nota;
            System.out.println("Introduce una nota");
            nota = sc.nextInt();
        }
        System.out.println("La suma de las notas es  " + suma);
        sc.close();
    }
}