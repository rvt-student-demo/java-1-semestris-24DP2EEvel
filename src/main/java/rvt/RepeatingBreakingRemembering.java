package rvt;
import java.util.Scanner;
public class RepeatingBreakingRemembering {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Write numbers:");

int sum = 0;
int count = 0;
int evenCount = 0;
int oddCount = 0;

while (true) {
int number = Integer.parseInt(scanner.nextLine());

if (number == -1) {
System.out.println("Thx! Bye!");
break;
}

sum += number;
count++;

if (number % 2 == 0) {
evenCount++;
} else {
    oddCount++;
    }
    }
    
    System.out.println("Sum: " + sum);
    System.out.println("Numbers: " + count);
    
    if (count > 0) {
    double average = 1.0 * sum / count;
    System.out.println("Average: " + average);
    } else {
    System.out.println("Average: 0.0");
    }
    
    System.out.println("Even: " + evenCount);
    System.out.println("Odd: " + oddCount);
    
    scanner.close();
    }
    }