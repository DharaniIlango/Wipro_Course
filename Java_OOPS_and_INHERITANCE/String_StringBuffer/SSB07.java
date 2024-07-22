import java.util.*;

public class SSB07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        // Call the method and print the results
        System.out.println("Result for \"" + str + "\": " + removeXChars(str));
    }

    // Method to remove 'x' from the first and last positions if present
    public static String removeXChars(String str) {
        // Check if the string is empty or has only one character
        if (str.length() <= 1) {
            return str.equals("x") ? "" : str;
        }

        // Check if the first character is 'x'
        if (str.charAt(0) == 'x') {
            str = str.substring(1);
        }

        // Check if the last character is 'x'
        if (str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }
}
