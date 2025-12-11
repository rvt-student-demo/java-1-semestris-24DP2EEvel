package rvt;

import java.util.Scanner;

public class chapter19 {
public static void main(String[] args) {
ex1();
ex2();
}

// Exercise 1 — Run of Integers
public static void ex1() {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter Start: ");
int start = scanner.nextInt();

System.out.print("Enter End: ");
int end = scanner.nextInt();


if (start > end) {
int temp = start;
start = end;
end = temp;
}

for (int i = start; i <= end; i++) {
System.out.println(i);
}

System.out.println(); // tukša rinda noformējumam
}

// Exercise 2 — Sum of Sequential Integers
public static void ex2() {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter N: ");
int n = scanner.nextInt();


int loopSum = 0;
for (int i = 1; i <= n; i++) {
loopSum += i;
}


int formulaSum = (n * (n + 1)) / 2;

System.out.println("Loop Sum = " + loopSum);
System.out.println("Formula Sum = " + formulaSum);
scanner.close();
}
}