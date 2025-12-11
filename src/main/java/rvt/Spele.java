package rvt;

import java.util.Random;
import java.util.Scanner;

public class Spele {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = random.nextInt(10) + 1; // random number 1–10
        int attempts = 3;
        boolean hasWon = false;

        System.out.println("Es domāju par skaitli no 1 līdz 10.");
        System.out.println("Tev tas jāuzmin trīs mēģinājumos.");

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Ievadi minējumu: ");
            int guess = scanner.nextInt();

            if (guess == numberToGuess) {
                System.out.println("PAREIZI!!");
                hasWon = true;
                break;
            } else {
                System.out.println("nepareizi");
            }
        }

        if (hasWon) {
            System.out.println("Tu esi uzvarējis spēli.");
        } else {
            System.out.println("Pareizais skaitlis bija " + numberToGuess + ".");
            System.out.println("Tu esi zaudējis spēli.");
        }

        scanner.close();
    }
}