// Shaurya Jain 
// Wages 
// This program calculates hourly wages plus overtime.
public class Wages {
  public static void main(String[] args) {

    //Variables
	double regularWages; // The calculated regular wages. 
    double basePay; // The base pay rate.
	double regularHours; // The hours worked less overtime.
    double overtimeWages; // Overtime wages
	double overtimePay; // Overtime pay rate
    double overtimeHours; // Overtime hours worked
    double totalWages; // Total wages

    // Assignments
    basePay = 25;
    regularHours = 480;
    overtimePay = 37.5;
    overtimeHours = 10;

    // Calculations
	regularWages = basePay * regularHours;
    overtimeWages = overtimePay * overtimeHours;
    totalWages = regularWages + overtimeWages;

    // Output
    System.out.println("Wages for this week are $" + totalWages);
  }
}