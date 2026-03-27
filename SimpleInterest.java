import java.util.Scanner;

// Shaurya Jain
// SimpleInterest
// This program calculates the simple interest based on user input.

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the principal amount:                    ");
        double principal = keyboard.nextDouble();
        
        System.out.print("Enter the annual interest rate (as a decimal): ");
        double rate = keyboard.nextDouble();
        
        System.out.print("Enter the time in years:                       ");
        double time = keyboard.nextDouble();

        System.out.print("Enter payment amount:                          ");
        double payment = keyboard.nextDouble();

        double simpleInterest = (principal * rate * time);
        double total = principal + simpleInterest;
        double amountDue = total - payment;

        System.out.println("\nThe simple interest is:  	$" + simpleInterest);
        System.out.println("The total amount is:        	$" + total);
        System.out.println("The amount due is:          	$" + amountDue);

        keyboard.close();
    }
}

/* Console Output:
Enter the principal amount:                    5000
Enter the annual interest rate (as a decimal): .05
Enter the time in years:                       5
Enter payment amount:                          200

The simple interest is:  	$1250.0
The total amount is:        	$6250.0
The amount due is:          	$6050.0
*/