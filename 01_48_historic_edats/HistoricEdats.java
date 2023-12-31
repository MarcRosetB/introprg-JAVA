/* Programa que demana el nom d’una persona, la seva edat i l’any actual, 
i escriu l’edat que tenia la persona cada any des del seu naixement.*/

import java.util.Scanner;

public class HistoricEdats{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("nom?");
        String nom = sc.nextLine();
        System.out.println("edat?");
        int edat = sc.nextInt();
        System.out.println("any actual?");
        int any = sc.nextInt();
        int anyNaix = any - edat;
        int anyMes1 = anyNaix + 1;
                
        if (nom.isEmpty() || (edat < 0) || (any < 1971)){
            System.out.println("Entrada errònia");
        } else if (edat == 0){
            System.out.println("Adéu " + nom);        
        }  else if (edat == 1){
            System.out.println("El " + anyNaix + " va néixer");     
            System.out.println("Adéu " + nom); 
        } else {           
            System.out.println("El " + anyNaix + " va néixer");
            System.out.println("El " + anyMes1  + " tenia 1 any");
            
            for (int i = 2; i < edat; i++){
                anyMes1++;
                System.out.println("El " + anyMes1 + " tenia " + i + " anys"); 
            }
            System.out.println("Adéu " + nom);
        }
    }
}
