import java.util.*;

public class SSB05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Input String: " + str);
        System.out.println("Output String: " + removeFirstAndLast(str));    
    }

    private static String removeFirstAndLast(String str) {
        if (str.length() <= 2) {
            // Return an empty string if the length is less than or equal to 2
            return "";
        } else {
            // Return the substring without the first and last characters
            return str.substring(1, str.length() - 1);
        }
    }
}