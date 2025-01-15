public class StringTrimAndCompare {

    // Method to trim leading and trailing spaces using charAt() method
    public static int[] trimSpaces(String text) {
        int start = 0, end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        // Return the start and end indices of the trimmed string
        return new int[]{start, end};
    }

    // Method to create a substring using charAt() method
    public static String createSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        
        // Loop to append characters from start index to end index
        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i));
        }

        return result.toString();
    }

    // Method to compare two strings
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        String input = "   Hello, World!   "; // Example string with leading and trailing spaces
        
        // Step 1: Trim the spaces using the charAt() method
        int[] trimIndices = trimSpaces(input);
        String trimmedText = createSubstring(input, trimIndices[0], trimIndices[1]);

        // Step 2: Trim the spaces using the built-in trim() method
        String builtInTrimmedText = input.trim();

        // Step 3: Compare the two trimmed strings
        boolean areEqual = compareStrings(trimmedText, builtInTrimmedText);

        // Step 4: Display the results
        System.out.println("Original Text: '" + input + "'");
        System.out.println("Trimmed Text (using charAt) : '" + trimmedText + "'");
        System.out.println("Trimmed Text (using built-in trim) : '" + builtInTrimmedText + "'");
        System.out.println("Are both trimmed texts equal ? " +  areEqual);
    }
}
