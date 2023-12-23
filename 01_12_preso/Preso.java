/*
 * Programa que recorda que els majors d'edat són responsables davant la
 * llei
*/

import java.util.Scanner;

public class Preso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Com us dieu?");
        String nom = sc.nextLine();
        System.out.println("Quants anys teniu?");
        int edad = sc.nextInt();

        if(edad < 18) {
            System.out.println("Aneu amb compte " + nom);
        }
        else {
            System.out.println("Vos ja podeu anar a la presó!");
            System.out.println("Aneu amb compte " + nom);
        }
        sc.close();
    }
}