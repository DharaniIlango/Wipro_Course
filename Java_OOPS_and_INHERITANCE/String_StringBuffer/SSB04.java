import java.util.*;

public class SSB04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        // Call the method and print the results
        System.out.println("Result for \"" + str + "\": " + getFirstHalf(str));
    }

    // Method to return the first half of the string if its length is even
    public static String getFirstHalf(String str) {
        // Check if the length of the string is even
        if (str.length() % 2 == 0) {
            // Return the first half of the string
            return str.substring(0, str.length() / 2);
        } else {
            // Return null for odd length strings
            return null;
        }
    }
}
