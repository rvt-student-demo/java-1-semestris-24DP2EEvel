package rvt;

import java.util.Scanner;

public class Produkts {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {

      while (true) {
        System.out.println("Input a number, 0 to quit");
        int command = Integer.parseInt(scanner.nextLine());
        if (command == 0) {
          break;
        }

        System.out.println("You input " + command);
      }

      System.out.println("Done, thank you!");
    }
  }
}
