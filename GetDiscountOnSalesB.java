//  Shaurya Jain
// GetDiscountOnSalesB.java
/*WalMart. is having a sale.
Customers will receive a 10% discount if they make a purchase over $1,500.
If their purchase does not exceed that amount, they get a 5% discount.*/

import java.util.Scanner;

public class GetDiscountOnSalesB {
    public static void main(String[] args) {
        double discount = 0.0;
      	double discountRate = 0.0;
        
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter the amount of the purchase: ");
        double purchaseAmnt = kb.nextDouble();
        
        if (purchaseAmnt > 1500) {
            discountRate = 0.1;
          	discount = purchaseAmnt * discountRate; // 10% discount
        } else {
            discountRate = 0.05;
          	discount = purchaseAmnt * discountRate; // 5% discount
        }
        
        double finalPrice = purchaseAmnt - discount;
        
      	System.out.println("\nYou qualified for a " + discountRate * 100 + "% discount!");
        System.out.println("The purchase amount is: $" + purchaseAmnt);
        System.out.println("The discount is:        $" + discount);
        System.out.println("The final price is:     $" + finalPrice);
    }
}

/* Output ($1400 purchase):
Enter the amount of the purchase: 1400
The purchase amount is: $1400.0
The discount is:       $70.0
The final price is:   $1330.0

Output ($1500 purchase):
Enter the amount of the purchase: 1500
The purchase amount is: $1500.0
The discount is:       $75.0
The final price is:   $1425.0

Output ($1600 purchase):
Enter the amount of the purchase: 1600
The purchase amount is: $1600.0
The discount is:       $160.0
The final price is:   $1440.0
*/