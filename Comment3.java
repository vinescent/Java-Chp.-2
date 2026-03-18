// Shaurya Jain
// Comment3
/* This program demonstrates different types of comments.
Single line comments start with a double slash.
Multi-line comments start with a foward slash asterisk and end with
an asterisk foward slash.
Documentation comments start with a foward slash and 2 asterisks
and end with a single asterisk foward slash. */

/**
This class creates a program that calculates company payroll. 
*/

public class Comment3 {
  
  /** 
  The main method is the program's starting point.
  */

  public static void main(String[] args) {
    
    double payRate; 	// Holds the hourly pay rate
	double hours; 		// Hours holds the hours worked
    int employeeNumber; // Holds the employee number
	
    payRate = 15.00; 	// Initializes hourly pay rate
    hours = 40.00; 		// Initializes hours worked
	
    double grossPay = payRate * hours; // declares and calculates gross pay
	
    System.out.println("Hourly pay:\t\t$" + payRate + "0");
	System.out.println("Hours worked is:\t" + hours);
    System.out.println("Gross pay is:\t\t$" + grossPay + "0");
  }
}
// Run your program, then Copy/Paste your console output to a multi-line comment.
/* Console Output:
Hourly pay:		    $15.00
Hours worked is:	40.0
Gross pay is:		  $600.00
*/