import java.util.Scanner;

public class Grades_And_Points {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter point count [0 - 100]");
        int points = scanner.nextInt();

        if (points < 0) {
            System.out.println("Impossible!");
        } else if (points <= 49) {
            System.out.println("Failed!");
        } else if (points <= 59) {
            System.out.println("1");
        } else if (points <= 69) {
            System.out.println("2");
        } else if (points <= 79) {
            System.out.println("3");
        } else if (points <= 89) {
            System.out.println("4");
        } else if (points <= 100) {
            System.out.println("5");
        } else {
            System.out.println("Incredible!");
        }
        scanner.close();
    }
}