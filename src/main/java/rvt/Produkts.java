package rvt;

import java.util.Scanner;

public class Produkts {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String nosaukums = scanner.nextLine();
    int skaits = scanner.nextInt();
    double cena = scanner.nextDouble();

    double summa = skaits * cena;

    System.out.println(
        "Produkts " + nosaukums + " daudzums " + skaits + " Kopeja cena: " + summa);

    scanner.close();
  }
}