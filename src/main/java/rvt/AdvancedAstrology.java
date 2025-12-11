package rvt;


public class AdvancedAstrology {

    public static void main(String[] args) {
        // Pārbaudes piemēri
        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }

    // 1️ Metode, kas drukā atstarpes (bez jaunas rindas)
    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    // 2️ Metode, kas drukā zvaigznītes un beidz ar jaunu rindu
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // 3️ Metode, kas drukā labo trijstūri
    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    // 4 Metode, kas drukā Ziemassvētku eglīti ar pamatni
    public static void christmasTree(int height) {
        // Augšējā daļa – eglīte
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(2 * i - 1);
        }

        // Apakšējā daļa – pamatne (2 rindas, 3 zvaigznītes)
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }
}