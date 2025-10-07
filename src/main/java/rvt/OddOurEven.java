import java.util.Scanner;

public class OddOurEven {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int number = Integer.valueOf(scanner.nextLine()); 
    if(number % 2 == 0){
        System.out.println("Even");
    } else{
        System.out.println("ODD");
    }
}
}
