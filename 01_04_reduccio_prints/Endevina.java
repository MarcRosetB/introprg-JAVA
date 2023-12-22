/*
 * Este es un programa de adivinacion del número pensado.
 * Para ejecutarlo usa java EndevinaNombre 42
 */

public class Endevina {
    public static void main(String[] args) {
        int numeroPensat = Integer.parseInt(args[0]);

        System.out.println("El número pensat és " + numeroPensat);

        int numero = numeroPensat * 3;
        System.out.println("Quan el multipliques per 3 obtens " + numero);

        numero = numero + 6;
        System.out.println("Quan li sumes 6 arriba a " + numero);

        numero = numero / 3;
        System.out.println("Un cop dividit per 3 queda " + numero);

        numero = numero - numeroPensat;
        System.out.println("Finalment en restar-li el número pensat queda " + numero);
        System.out.println("A que el resultat és 2?");
    }
}