import java.util.*;

public class SSB06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        
        // Call the method to create the new string and print the result
        System.out.println("Result: " + makeShortLongShort(a, b));
    }

    // Method to return the new string in the form short+long+short
    public static String makeShortLongShort(String a, String b) {
        // Determine which string is shorter and which is longer
        String shortStr = (a.length() < b.length()) ? a : b;
        String longStr = (a.length() < b.length()) ? b : a;
        
        // Return the new string in the form short+long+short
        return shortStr + longStr + shortStr;
    }
}
