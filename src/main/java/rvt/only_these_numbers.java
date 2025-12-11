package rvt;

import java.util.ArrayList;
import java.util.Scanner;


public class only_these_numbers {


    public static void main(String[] args) {
        
        
    Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {

            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

            System.out.print("From where? ");
            int startIndex = scanner.nextInt();

            
            System.out.print("To where? ");
            int endIndex = scanner.nextInt();

            for (int i = startIndex; i <= endIndex; i++) {
                if (i >= 0 && i < numbers.size()) {
                    System.out.println(numbers.get(i));
                }

            }
                scanner.close();

    }
}