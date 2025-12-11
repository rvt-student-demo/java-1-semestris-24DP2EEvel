package rvt;

public class ConnecticutChapter60 {

public static void main(String[] args) {
ex1();
ex2();
ex3();
ex4();
ex5();
}

// Exercise 1 — Array Sum
public static void ex1() {
int[] val = {0, 1, 2, 3};
int sum = val[0] + val[1] + val[2] + val[3];
System.out.println("Sum of all numbers = " + sum);
}

// Exercise 2 — Two Arrays
public static void ex2() {
int[] val = {13, -4, 82, 17};
int[] twice = new int[4]; // construct array

for (int i = 0; i < val.length; i++) {
twice[i] = val[i] * 2;
}
System.out.println("Original Array: "
+ val[0] + " " + val[1] + " " + val[2] + " " + val[3]);

System.out.println("New Array: "
+ twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3]);
}

// Exercise 3 — Three Arrays
public static void ex3() {
int[] valA = {13, -22, 82, 17};
int[] valB = {-12, 24, -79, -13};
int[] sum = {0, 0, 0, 0};

// Add corresponding values
for (int i = 0; i < valA.length; i++) {
sum[i] = valA[i] + valB[i];
}

System.out.println("sum: "
+ sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3]);
}

// Exercise 4 — Same Sum (each sum should be 25)
public static void ex4() {
int[] valA = {13, -22, 82, 17};
int[] valB = new int[4];

// 25 - valA[i] = valB[i]
for (int i = 0; i < valA.length; i++) {
valB[i] = 25 - valA[i];
}

System.out.println("valA: "
+ valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3]);

System.out.println("valB: "
+ valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3]);

System.out.println("sum: "
+ (valA[0] + valB[0]) + " " + (valA[1] + valB[1]) + " "
+ (valA[2] + valB[2]) + " " + (valA[3] + valB[3]));
}

// Exercise 5 — Reverse Order
public static void ex5() {
int[] val = {0, 1, 2, 3};
int temp;

System.out.println("Original Array: "
+ val[0] + " " + val[1] + " " + val[2] + " " + val[3]);

// Swap elements: 0 <-> 3, 1 <-> 2
temp = val[0];
val[0] = val[3];
val[3] = temp;

temp = val[1];
val[1] = val[2];
val[2] = temp;

System.out.println("Reversed Array: "
+ val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
}
}