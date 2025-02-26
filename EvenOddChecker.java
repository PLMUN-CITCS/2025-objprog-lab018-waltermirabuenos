import java.util.Scanner;

public class EvenOddChecker {
    
    public static String checkEvenOdd(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        
        System.out.println(num + " is an " + checkEvenOdd(num) + " number.");
        
        scanner.close();
    }
}