/*
 * Aquest programa implementa una calculadora bàsica
 *
 * Demana dos nombres per entrada estàndard i mostra el
 * resultat de sumar-los, restar-li el segon al primer, multiplicar-los,
 * dividir el primer entre el segon.
 *
 * El programa no controla valors no adequats d'entrada
*/

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primer operand");
        int primerOperand = sc.nextInt();
        System.out.println("Segond operand");
        int segonOperand = sc.nextInt();

        int suma = primerOperand + segonOperand;
        int resta = primerOperand - segonOperand;
        int multiplicacio = primerOperand * segonOperand;
        int divisio = primerOperand / segonOperand;

        System.out.println(primerOperand + " + " + segonOperand + " = " + suma);
        System.out.println(primerOperand + " - " + segonOperand + " = " + resta);
        System.out.println(primerOperand + " * " + segonOperand + " = " + multiplicacio);
        System.out.println(primerOperand + " / " + segonOperand + " = " + divisio);

        sc.close();
    }
}