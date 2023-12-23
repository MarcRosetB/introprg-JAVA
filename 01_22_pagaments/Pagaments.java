/*
 * programa que simula una caja registradora.
 * devuelve el cambio o indica cuanto dinero falta
 */

import java.util.Scanner;

public class Pagaments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Precio?");
        int precio = sc.nextInt();
        System.out.println("Pago?");
        int pago = sc.nextInt();

        if(precio > pago) {
            int resultado = precio - pago;
            System.out.println("faltan " + resultado + "€");
        }
        else if(precio < pago) {
            int resultado = pago - precio;
            System.out.println("Sobran " + resultado + "€");
        }
        else {
            System.out.println("Ni sobra ni falta dinero");
        }
        sc.close();
    }
}