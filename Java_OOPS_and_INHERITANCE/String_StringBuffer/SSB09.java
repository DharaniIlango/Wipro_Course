import java.util.*;

public class SSB09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        
        // Call the method to combine the strings and print the result
        System.out.println("Result: " + combineStrings(a, b));
    }

    // Method to combine two strings by alternating their characters
    public static String combineStrings(String a, String b) {
        StringBuilder result = new StringBuilder();
        
        // Get the lengths of both strings
        int lengthA = a.length();
        int lengthB = b.length();
        
        // Determine the minimum length to alternate characters
        int minLength = Math.min(lengthA, lengthB);
        
        // Alternately append characters from both strings
        for (int i = 0; i < minLength; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }
        
        // Append the remaining characters from the longer string
        if (lengthA > minLength) {
            result.append(a.substring(minLength));
        } else if (lengthB > minLength) {
            result.append(b.substring(minLength));
        }
        
        return result.toString();
    }
}
