package rvt;

import java.util.Scanner;

public class veikals {

public static void main(String[] args) {

final int skruves_cena = 5;
final int uzgriezna_cena = 3;
final int paplaksna_cena = 1;

Scanner scanner = new Scanner(System.in);

System.out.print("Ievadiet skruvju skaitu: ");
int skruves = scanner.nextInt();

System.out.print("Ievadiet uzgrieznu skaitu: ");
int uzgriezni = scanner.nextInt();

System.out.print("Ievadiet paplaksnu skaitu: ");
int paplaksnes = scanner.nextInt();

boolean irKluda = false;

if (uzgriezni < skruves) {
System.out.println("Parbaudi pasutijumu: par maz uzgrieznu");
irKluda = true;
}

if (paplaksnes < 2 * skruves) {
System.out.println("Parbaudi pasutijumu: par maz paplaksnu");
irKluda = true;
}

if (!irKluda) {
System.out.println("Pasutijums ir kartiba.");
}

int kopejaCena = (skruves * skruves_cena) + (uzgriezni * uzgriezna_cena) + (paplaksnes * paplaksna_cena);
System.out.println("Kopeja cena: " + kopejaCena);

scanner.close();
}
}