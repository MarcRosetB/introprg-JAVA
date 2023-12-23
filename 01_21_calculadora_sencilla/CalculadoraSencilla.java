/*
 * Aquest programa demana dos operands i un operador binari (+, -, * o /)
 * i mostra el resultat del càlcul corresponent
 */

import java.util.Scanner;

public class CalculadoraSencilla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primer operando?");
        double primerOperando = Double.parseDouble(sc.nextLine());
        System.out.println("Operador?");
        char operador = sc.nextLine().charAt(0);
        System.out.println("Segundo operando?");
        double segundoOperando = Double.parseDouble(sc.nextLine());

        switch (operador) {
            case '+':
                double suma = primerOperando + segundoOperando;
                System.out.println(primerOperando + " + " + segundoOperando + " = " + suma);
                break;
        
            case '-':
                double resta = primerOperando - segundoOperando;
                System.out.println(primerOperando + " - " + segundoOperando + " = " + resta);
                break;
            case '*':
                double producto = primerOperando * segundoOperando;
                System.out.println(primerOperando + " * " + segundoOperando + " = " + producto);
                break;
            case '/':
                if(segundoOperando == 0) {
                    System.out.println("no se puede dividir entre 0");
                }
                else {
                    double division = primerOperando / segundoOperando;
                    System.out.println(primerOperando + " / " + segundoOperando + " = " + division);
                }
                break;
            default:
                System.out.println("no existe ese operador");
        }
        sc.close();
    }
}