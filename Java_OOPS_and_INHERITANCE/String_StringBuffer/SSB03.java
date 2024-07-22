import java.util.*;

public class SSB03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        // Call the method to create the new string and print the result
        String result = nCopiesOfFirst2Chars(str);
        System.out.println("Result: " + result);
    }

    // Method to create a new string with 'n' copies of the first 2 characters
    public static String nCopiesOfFirst2Chars(String str) {
        // Get the length of the original string
        int n = str.length();
        
        // Get the first 2 characters of the string
        String first2Chars = str.length() >= 2 ? str.substring(0, 2) : str;
        
        // Create a StringBuilder to efficiently build the result string
        StringBuilder result = new StringBuilder();
        
        // Append the first 2 characters 'n' times
        for (int i = 0; i < n; i++) {
            result.append(first2Chars);
        }
        
        // Convert the StringBuilder to a string and return
        return result.toString();
    }
}
