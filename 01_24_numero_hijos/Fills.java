/*
 * programa que muestra un mensaje en funcion del numero de hijos que tengas
 */

import java.util.Scanner;

public class Fills {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos hijos tienes?");
        int hijos = sc.nextInt();
        sc.close();

        if(hijos == 0) {
            System.out.println("Tot el que t'has estalviat en bolquers!");
        }
        else if(hijos == 1) {
            System.out.println("Compte de no mimar-lo massa!");
        }
        else if(hijos > 1 && hijos < 5) {
            System.out.println("No t'avorreixes a casa, eh?");
        }
        else if(hijos >= 5) {
            System.out.println("Tú si que fas país!");
        }
        else {
            System.out.println("No pots tenir menys de 0 fills!");
        }
    }
}