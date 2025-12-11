package rvt;

import java.util.List;
import java.util.Scanner;

public class chapter44 {

public static void ex1(Scanner scanner) {
    
while (true) {System.out.println("Enter your full name (blank to exit): ");
String fullName = scanner.nextLine().trim();

if (fullName.isEmpty()) break;

int spaceIndex = fullName.indexOf(" ");

if (spaceIndex > 0) {
String firstName = fullName.substring(0, spaceIndex);
String lastName = fullName.substring(spaceIndex + 1);

System.out.println(firstName + " " + lastName.toUpperCase());
} else {
System.out.println(fullName);
}
}
}

public static void ex2(Scanner scanner) {
System.out.println("Enter a string: ");
String input = scanner.nextLine();
System.out.println();

for (int i = 0; i < input.length(); i++) {
System.out.println(input.charAt(i));
}
}

public static void ex3(Scanner scanner) {

List<String> femaleNames = List.of("Amy", "Buffy", "Cathy");
List<String> maleNames = List.of("Elroy", "Fred", "Graham");

while (true) {
System.out.print("Enter a name (blank to exit): ");
String name = scanner.nextLine().trim();
if (name.isEmpty()) break;

String firstname = name.contains(" ") ? name.substring(0, name.indexOf(" ")) : name;

String title = "";
if (femaleNames.contains(firstname)) {
title = "Ms. ";
} else if (maleNames.contains(firstname)) {
title = "Mr. ";
}
System.out.println(title + name);
}
}

public static void ex4(Scanner scanner) {
System.out.println("Enter cook time digits: ");
String digits = scanner.nextLine().trim();
String output;

if (digits.length() <= 2) {
output = "0:" + digits;
} else {
String minutes = digits.substring(0, digits.length() - 2);
String seconds = digits.substring(digits.length() - 2);
output = minutes + ":" + seconds;
}

System.out.println("Cook time is: " + output);
}

public static void ex5(Scanner scanner) {
boolean inBlockComment = false;

while (scanner.hasNextLine()) {
String line = scanner.nextLine();
if (line.isEmpty() && !inBlockComment) break;

String trimmed = line.trim();

if (inBlockComment) {
System.out.println(line);
if (trimmed.endsWith("*/")) {
inBlockComment = false;
}
} else if (trimmed.startsWith("/*")) {
inBlockComment = true;
System.out.println(line);
} else if (trimmed.startsWith("//")) {
System.out.println(line);
} else {
System.out.println(line);
}
}
}

public static void ex6(Scanner scanner) {
while (true) {
System.out.println("Enter your password: ");
String password = scanner.nextLine();

boolean longEnough = password.length() >= 7;
boolean upper = !password.equals(password.toLowerCase());
boolean lower = !password.equals(password.toUpperCase());
boolean digit = password.chars().anyMatch(Character::isDigit);

if (longEnough && upper && lower && digit) {
System.out.println("Acceptable password!");
break;
} else {
System.out.println("Password is not acceptable!");
}
}
}

public static void ex7(Scanner scanner) {
System.out.println("Enter a word: ");
String word = scanner.nextLine();
int space = 0;

while (word.length() > 0) {
System.out.print(" ".repeat(space));
System.out.println(word);

if (word.length() > 1) {
word = word.substring(1, word.length() - 1);
} else {
break;
}
space++;
}
}

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.println("Choose exercise (1-7): ");

if (scanner.hasNextInt()) {
int choice = scanner.nextInt();
scanner.nextLine();

switch (choice) {
case 1 -> ex1(scanner);
case 2 -> ex2(scanner);
case 3 -> ex3(scanner);
case 4 -> ex4(scanner);
case 5 -> ex5(scanner);
case 6 -> ex6(scanner);
case 7 -> ex7(scanner);
default -> System.out.println("Invalid choice.");
}
} else {
System.out.println("Please enter a valid integer choice.");
}

scanner.close();
}
}