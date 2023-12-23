/*
 * Programa que segons el preu que tingui una caravana la classifica
 */


public class ClasificaCaravana {
    public static void main(String[] args) {
        int preu = Integer.parseInt(args[0]);

        if(preu < 50000) {
            System.out.println("Económica");
        }
        else if(preu >= 50000 && preu < 175000) {
            System.out.println("General");
        }
        else {
            System.out.println("Luxe");
        }
    }
}