/*
 * Aquest programa duplica el valor que rep com a primer argument
 *
 * El programa no controla valors no adequats d'entrada
*/

public class Duplica {
    public static void main(String[] args) {
        int nombreADuplicar;
        int nombreDuplicat;

        nombreADuplicar = Integer.parseInt(args[0]);
        nombreDuplicat = nombreADuplicar * 2;

        System.out.print("El doble de ");
        System.out.print(nombreADuplicar);
        System.out.print(" es ");
        System.out.print(nombreDuplicat);
    }
}