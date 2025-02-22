import java.util.Scanner;

public class FactorialCalculator {

    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Please enter a non-negative integer: ");
        
        while (true) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= 0) {
                    break;  
                } else {
                    System.out.println("Error: The number must be non-negative. Please try again.");
                }
            } else {
                System.out.println("Error: That's not a valid integer. Please try again.");
                scanner.next(); 
            }
            System.out.print("Please enter a non-negative integer: ");
        }
        
        return number;
    }

    public static long calculateFactorial(int n) {
    
        if (n == 0) {
            return 1;
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
       
        int number = getNonNegativeInteger();
        
        long result = calculateFactorial(number);
    
        System.out.println("The factorial of " + number + " is: " + result);
    }
}
