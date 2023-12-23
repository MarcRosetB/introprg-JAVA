/*
 * En este caso haremos el mismo ejercicio anterior pero en vez de poner tantos ifs, usaremos switch
 */

public class DiaSetmana {
    public static void main(String[] args) {
        int dia = Integer.parseInt(args[0]);

        switch(dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}