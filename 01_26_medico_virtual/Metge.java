/*
 * Para este ejercicio programaremos un medico virtual que depende de los sintomas del paciente receta una cosa o otra
 */

import java.util.Scanner;

public class Metge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a tu médico virtual!");
        System.out.println("Tienes estornudos, dolor de cabeza y problemas de estomago?");
        String respuesta = sc.nextLine();

        if(respuesta.equals("si")) {
            System.out.println("Te recomiendo paracetamol, y si no tienes puedes tomar Acido acetil salicilico");
        }
        else {
            System.out.println("Tienes tos?");
            respuesta = sc.nextLine();

            if(respuesta.equals("si")) {
                System.out.println("Que edad tienes?");
                int edad = sc.nextInt();

                if(edad < 12) {
                    System.out.println("Toamte un caramelo de miel y limon");
                }
                else {
                    System.out.println("Tomate un caramelo de Eucaliptus");
                }
            }
            else {
                System.out.println("Deberias pasarte por la consulta para que te examine mejor");
            }
            sc.close();
        }
    }
}