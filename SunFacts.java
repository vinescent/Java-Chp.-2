// Shaurya Jain
// SunFacts
// Examples of print methods, concatenation, literals, and escape characters

public class SunFacts{
  public static void main(String[] args){
    
    double distance, mass;
	
    distance = 1.495979E11; 
    mass = 1.989E30;
    
    System.out.println("The sun is " + distance + " meters away.");
	
    System.out.println("The sun's mass is " + mass + "kilograms.");

    // Run your program & note the Console Output
	// Now add the following lines & run again:
    System.out.print("\nDistance to sun:\t " + distance );
    System.out.print("\nThe sun's mass:\t\t " + mass);
  }
}

// Answer these questions:

// 1. Which console output do you like better?
// Your Answer: I prefer print becasue it allows me to format the output in a more organized way, especially when using escape characters like \n and \t for new lines and tabs.

// 2. What is the difference between print & println?
// Your Answer: print does not add a newline character at the end, while println adds a newline character.
    
// 3. In a print statement, why does some text have "quotes™?
// Your Answer: Text with quotes is treated as a string literal, while text without quotes is treated as a variable or keyword.

// 4. In a print statement, what is displayed when text does NOT have quotes?
// Your Answer: The value of the variable is displayed.

// 5. What does the + (concatenation operator) do? //
// Your Answer: It combines two strings or a string and a variable into a single string.