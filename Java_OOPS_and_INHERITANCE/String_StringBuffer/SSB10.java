import java.util.*;

public class SSB10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        
        // Call the method to get the result and print it
        System.out.println("Result: " + repeatLastNChars(str, n));
    }

    // Method to create a new string made of n repetitions of the last n characters of the string
    public static String repeatLastNChars(String str, int n) {
        // Edge case: if n is 0, return an empty string
        if (n == 0) {
            return "";
        }
        
        // Get the last n characters of the string
        String lastNChars = str.substring(str.length() - n);
        
        // Create a StringBuilder to build the result
        StringBuilder result = new StringBuilder();
        
        // Append the last n characters n times
        for (int i = 0; i < n; i++) {
            result.append(lastNChars);
        }
        
        return result.toString();
    }
}
