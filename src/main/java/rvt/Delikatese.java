package rvt;

import java.util.Scanner;

public class Delikatese {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Ievadi preci: ");
String prece = scanner.nextLine();

System.out.print("Ievadi cenu: ");
double cena = scanner.nextDouble();

System.out.print("Ekspress piegāde (0=nē, 1=jā): ");
int express = scanner.nextInt();

double piegade = 0;

if (cena < 10) {
piegade = 2;
}

if (express == 1) {
piegade += 3;
}

double kopa = cena + piegade;

System.out.println("\nRēķins:");
System.out.println(prece + " " + cena);
System.out.println("piegāde " + piegade);
System.out.println("kopā " + kopa);
scanner.close();
}
}
