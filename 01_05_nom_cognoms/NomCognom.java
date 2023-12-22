/*
 * Aquest programa demana el nom i el primer cognom als usuaris
 * i els mostra un missatge amistós.
 *
 * El programa no controla valors no adequats d'entrada
*/

import java.util.Scanner;

public class NomCognom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nom?");
        String nom = sc.nextLine();

        System.out.println("Cognom?");
        String cognom = sc.nextLine();

        System.out.println("Ei " + nom + ", tinc un amic que també es diu " + cognom);
        sc.close();
    }
}