/*
 * Programa que indica si el número proporcionat com a primer argument
 * és parell o senar.
 * Si no s'especifica cap número, el resultat és indeterminat.
*/

import java.util.Scanner;

public class ParellSenar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = Integer.parseInt(args[0]);

        if(numero % 2 == 0) {
            System.out.println("El número " + numero + " és parell");
        }
        else {
            System.out.println("El número " + numero + " és senar");
        }
        sc.close();
    }
}