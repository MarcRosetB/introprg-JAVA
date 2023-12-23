/*
 * Este prqueño programa simula la interacción de un ascensor de dos pisos (más planta baja).
 */

import java.util.Scanner;

public class Ascensor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("En que piso estamos?");
        String origen = sc.nextLine();
        System.out.println("Botón?");
        String boton = sc.nextLine();
        sc.close();

        if(origen.equals("planta baja") && boton.equals("subir uno")) {
            System.out.println("Has llegado a la primera planta");
        }
        else if(origen.equals("planta baja") && boton.equals("subir dos")) {
            System.out.println("Has llegado a la segunda planta");
        }
        else if(origen.equals("primera planta") && boton.equals("subir uno")) {
            System.out.println("Has llegado a la segunda planta");
        }
        else if(origen.equals("primera planta") && boton.equals("bajar uno")) {
            System.out.println("Has llegado a la planta baja");
        }
        else if(origen.equals("segunda planta") && boton.equals("bajar uno")) {
            System.out.println("Has llegado a la primera planta");
        }
        else if(origen.equals("segunda planta") && boton.equals("bajar dos")) {
            System.out.println("Has llegado a la planta baja");
        }
        else {
            System.out.println("Esa combinación no es posible");
        }
    }
}