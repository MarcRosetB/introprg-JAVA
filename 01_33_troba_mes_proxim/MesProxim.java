/*
 * Ejercicio que pide un numero al que llamaremos ancora, luego te pide que vayas introduciend numeros hasta que introduzcas uno negativo.
 * En ese caso se acaba el programa mostrandote cual es el más proximo que hayas introducido
 */

import java.util.Scanner;

public class MesProxim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diferencia = 100;

        System.out.println("Introduce un ancora");
        int ancora = sc.nextInt();
        int proximo = 0;
        int resta;

        if(ancora < 0) {
            System.out.println("Ancora no válida");
        }
        else {
            System.out.println("Introduce un valor");
            int valor = sc.nextInt();
            if (valor < 0) {
                System.out.println("no se ha introducido ningun valor positivo");
            }
            else {
                while (valor > 0) {
                    resta = Math.abs(ancora - valor);
                    if(resta < diferencia) {
                        proximo = valor;
                        diferencia = resta;
                    }
                    System.out.println("Introduce un valor");
                    valor = sc.nextInt();
                }
                System.out.println("El mas proximo a " + ancora + " es " + proximo);
            }
        }
        sc.close();
    }
}