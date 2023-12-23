/*
 * Programa que ordena tres números en orden de menor a mayor
 */

import java.util.Scanner;

public class TresEnOrdre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primer?");
        int primer = sc.nextInt();
        System.out.println("Segon?");
        int segon = sc.nextInt();
        System.out.println("Tercer?");
        int tercer = sc.nextInt();

        if(primer < segon && segon < tercer) {
            System.out.println(primer + ", " + segon + " y " + tercer);
        }
        else if(primer < tercer && tercer < segon) {
            System.out.println(primer + ", " + tercer + " y " + segon);
        }
        else if(tercer < primer && primer < segon) {
            System.out.println(tercer + ", " + primer + " y " + segon);
        }
        else if (segon < primer && primer < tercer) {
            System.out.println(segon + ", " + primer + " y " + tercer);
        }
        else if(tercer < segon && segon < primer) {
            System.out.println(tercer + ", " + segon + " y " + primer);
        }
        else {
            System.out.println(segon + ", " + tercer + " y " + primer);
        }
        sc.close();
    }
}