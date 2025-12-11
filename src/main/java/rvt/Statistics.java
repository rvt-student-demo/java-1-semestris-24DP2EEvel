package rvt;

import java.util.Scanner;

public class Statistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NumberStatistics allNumbers = new NumberStatistics();
        NumberStatistics evenNumbers = new NumberStatistics();
        NumberStatistics oddNumbers = new NumberStatistics();

        System.out.println("Enter numbers:");

        while (true) {
            String input = scanner.nextLine();

           
            try {
                int number = Integer.parseInt(input);

                if (number == -1) {
                    break;
                }

                allNumbers.addNumber(number);

                if (number % 2 == 0) {
                    evenNumbers.addNumber(number);
                } else {
                    oddNumbers.addNumber(number);
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }

        System.out.println("Sum: " + allNumbers.sum());
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());

        scanner.close();
    }
}

class NumberStatistics {

    private int count;
    private int sum;

    public NumberStatistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.count == 0) {
            return 0;
        }
        return 1.0 * this.sum / this.count;
    }
}