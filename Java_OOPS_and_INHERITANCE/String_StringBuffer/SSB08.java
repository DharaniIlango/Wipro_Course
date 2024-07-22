public class SSB08 {
    public static void main(String[] args) {
        // Sample input strings
        String input1 = "ab*cd";
        String input2 = "a*b*c*d";
        
        // Call the method and print the results
        System.out.println("Result for \"" + input1 + "\": " + processString(input1));
        System.out.println("Result for \"" + input2 + "\": " + processString(input2));
    }

    // Method to remove '*' and the characters immediately to its left and right
    public static String processString(String str) {
        // Use a StringBuilder to efficiently build the result string
        StringBuilder result = new StringBuilder();
        
        // Iterate over the string and process characters
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                // Skip the '*' and the characters immediately to its left and right
                if (result.length() > 0) {
                    result.delete(result.length() - 1, result.length()); // Remove the last character (left of '*')
                }
                // Skip the '*' itself and the next character
                i++;
            } else {
                // Append the character to the result
                result.append(str.charAt(i));
            }
        }
        
        return result.toString();
    }
}
