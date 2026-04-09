// Shaurya Jain
// MagicDate.java
/*The purpose of this program is to use an if/else statement to have a message displayed
if the condition is true and a different message if the condition is false.*/

import java.util.Scanner;

public class MagicDate {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter the month (1-12): ");
        int month = kb.nextInt();
        
        System.out.print("Enter the day (1-31): ");
        int day = kb.nextInt();
        
        System.out.print("Enter the year (two digits): ");
        int year = kb.nextInt();
        
        if (month * day == year) {
            System.out.println("The date " + month + "/" + day + "/" + year + " is a magic date.");
        } else {
            System.out.println("The date " + month + "/" + day + "/" + year + " is not a magic date.");
        }
    }
}
/* Console Output (magic date):
Enter the month (1-12): 2
Enter the day (1-31): 14
Enter the year (two digits): 28
The date 2/14/28 is a magic date.
*/

/* Console Output (not a magic date):
Enter the month (1-12): 3
Enter the day (1-31): 15
Enter the year (two digits): 45
The date 3/15/45 is not a magic date.
*/