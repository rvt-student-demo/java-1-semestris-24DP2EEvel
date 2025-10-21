package rvt;

import java.util.Random;
import java.util.Scanner;


public class Uzminet_Skaitli{
public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int skaitla_minejums = random.nextInt(10) + 1;
    int minejumu_skaits = 0;
    
    System.out.println("Es domaju par skaitli no 1 - 10.");
    System.out.println("Uzmini to tris meiginajumos!");
    System.out.println("Ievadi minejumu");
    while (minejumu_skaits<3) { 
        int minejums = Integer.valueOf(scanner.nextLine());
        if (minejums == skaitla_minejums){
            System.out.println("Uzminejat!");
            break;
        } else{
            System.out.println("Neuzminejat!");
        }
        minejumu_skaits++;
        if(minejumu_skaits == 3){
            System.out.println("Tu esi zaudejis speli!");
        }
    }
scanner.close();
    
}
}
