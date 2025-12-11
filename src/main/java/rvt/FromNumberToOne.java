package rvt;

import java.util.Scanner;

public class FromNumberToOne {

    public static void main(String[] args) {
        // Piemērs ar Scanner (arī pareizi aizvērts)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ievadi skaitli: ");
        int number = scanner.nextInt();
        scanner.close();

        // Izsauc metodi, kas drukā no parametra līdz 1
        printFromNumberToOne(number);
    }

    // Metode, kas drukā skaitļus no dotā līdz 1
    public static void printFromNumberToOne(int number) {
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
    }
}