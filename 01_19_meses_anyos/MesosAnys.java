/*
 * Este programa pide un mes y un año al usuario, para después mostrar el mes y el año anterior y posterior
 */

import java.util.Scanner;

public class MesosAnys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mes?");
        int mes = sc.nextInt();
        System.out.println("Año?");
        int anyo = sc.nextInt();

        int mesAnterior;
        int mesPosterior;

        if(mes == 1) {
            mesAnterior = 12;
            mesPosterior = 2;
            System.out.println("Mes anterior " + mesAnterior+"/"+(anyo-1) + " mes posterior " + mesPosterior + "/" + anyo);
        }
        else if(mes == 12) {
            mesAnterior = 11;
            mesPosterior = 1;
            System.out.println("Mes anterior " + mesAnterior+"/"+ anyo + " mes posterior " + mesPosterior + "/" + (anyo + 1));
        }
        else {
            System.out.println("Mes anterior " + (mes - 1) +"/"+ anyo + " mes posterior " + (mes + 1) + "/" + anyo);
        }
        sc.close();
    }
}