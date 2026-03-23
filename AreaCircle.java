// Shaurya Jain
// AreaCircle
// This program calculates the area of a circle based on the radius provided.

public class AreaCircle {
  public static void main(String[] args) {
    //variables
    //double pi; 
    double r;
    double area;

    //assignments 
    //pi = 3.1416; 
    r = 2.5;

    //calculations
    area = Math.PI * Math.pow(r, 2);

    //output 
    System.out.println("r = " + r);
    System.out.println("Area = " + area);
  }
}

/* Console Output:
r = 2.5
Area = 19.635
*/

/* Why is the console output different when you use the Math class ?
The console output is different when using the Math class because the Math class provides a more precise value of pi (Math.PI) and allows for more accurate calculations.
*/