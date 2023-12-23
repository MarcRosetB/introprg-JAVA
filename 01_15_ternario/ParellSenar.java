/*
 * El mismo ejercicio anterior 
 */
public class ParellSenar {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);

        String resultat = (numero % 2 == 0) ? "parell" : "senar";
        System.out.println("El " + numero + " és " + resultat);
    }
}