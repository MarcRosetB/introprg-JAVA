/*
 * Este programa es una nueva version del programa Endevina.
 * En este caso al introducir un enter o un espacio en blanco el juego se cancela
*/

import java.util.Scanner;

public class Endevina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entre 0 y 100 para adivinar o presiona Enter para cancelar.");
        String num = sc.nextLine().trim(); // Elimina espacios en blanco al inicio y final

        while (!num.equals("42")) {
            if (num.isBlank()) {
                System.out.println("Juego cancelado");
                sc.close();
                return; // Sale del programa si se cancela el juego
            } else if (!num.matches("\\d+")) {
                System.out.println("No es un número válido. Introduce un número entre 0 y 100 o presiona Enter para cancelar.");
            } else {
                try {
                    int numero = Integer.parseInt(num);
                    if (numero > 100) {
                        System.out.println("Como máximo 100");
                    } else if (numero < 0) {
                        System.out.println("Como mínimo 0");
                    } else if (numero > 42 && numero < 100) {
                        System.out.println("Demasiado grande");
                    } else {
                        System.out.println("Demasiado pequeño");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("No es un número válido. Introduce un número entre 0 y 100 o presiona Enter para cancelar.");
                }
            }
            System.out.println("Introduce un número o presiona Enter para cancelar.");
            num = sc.nextLine().trim();
        }
        System.out.println("Acertado!");
        sc.close();
    }
}
