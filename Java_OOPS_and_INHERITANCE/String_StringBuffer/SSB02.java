import java.util.*;

public class SSB02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        // Call the method to concatenate strings and print the result
        String result = concatenateAndFormat(str1, str2);
        System.out.println("Concatenated result: " + result);
    }

    // Method to concatenate two strings and format the result
    public static String concatenateAndFormat(String str1, String str2) {
        // Convert strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        // Check if the last character of str1 is the same as the first character of str2
        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            // Omit one of the characters
            str2 = str2.substring(1);
        }
        
        // Concatenate the strings
        return str1 + str2;
    }
}
