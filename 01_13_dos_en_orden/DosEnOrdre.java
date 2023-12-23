/*
 * Programa que ordena dos nombres
*/

import java.util.Scanner;

public class DosEnOrdre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primer?");
        int primer = sc.nextInt();
        System.out.println("Segon?");
        int segon = sc.nextInt();

        if(primer < segon) {
            System.out.println(primer + " i " + segon);
        }
        else {
            System.out.println(segon + " i " + primer);
        }
        sc.close();
    }
}