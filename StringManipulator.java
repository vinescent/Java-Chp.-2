// Shaurya Jain
// StringManipulator
// This program demonstrates various string manipulation techniques by outputting city names in different formats.

public class StringManipulator {
    public static void main(String[] args) {
        String city = "East Brunswick";
        System.out.println("Original: "        + city);
        System.out.println("Uppercase: "       + city.toUpperCase());
        System.out.println("Lowercase: "       + city.toLowerCase());
        System.out.println("# of characters: " + city.length());
        System.out.println("First character: " + city.charAt(0));
    }
}

/* Console Output:
Original: East Brunswick
Uppercase: EAST BRUNSWICK
Lowercase: east brunswick
# of characters: 15
First character: E
*/