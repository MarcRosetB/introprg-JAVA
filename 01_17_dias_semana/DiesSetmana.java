/*
 * Programa que al ejecutarlo junto con un número te dice el dia de la semana,
 * si no se corresponde con ninguno, devuelve error 
*/

public class DiesSetmana {
    public static void main(String[] args) {
        int dia = Integer.parseInt(args[0]);

        if(dia == 1) {
            System.out.println("Lunes");
        }
        else if(dia == 2) {
            System.out.println("Martes");
        }
        else if(dia == 3) {
            System.out.println("Miercoles");
        }
        else if(dia == 4) {
            System.out.println("Jueves");
        }
        else if(dia == 5) {
            System.out.println("Viernes");
        }
        else if(dia == 6) {
            System.out.println("Sábado");
        }
        else if(dia == 7) {
            System.out.println("Domingo");
        }
        else {
            System.out.println("Error");
        }
    }
}