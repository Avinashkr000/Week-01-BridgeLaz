public class NullPointerDemo {

    // Method to generate the NullPointerException
    public static void generateNullPointerException() {
        // Define a String variable and initialize it to null
        String text = null;
        
        // Call a method on the null string to generate NullPointerException
        System.out.println(text.length()); // This will throw NullPointerException
    }

    // Method to handle the NullPointerException
    public static void handleNullPointerException() {
        try {
            // Define a String variable and initialize it to null
            String text = null;

            // Call a method on the null string to generate NullPointerException
            System.out.println(text.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            // Catch the NullPointerException and handle it
            System.out.println("Caught NullPointerException: String is null, cannot call method on null.");
        }
    }

    public static void main(String[] args) {
        // Step 1: Demonstrate the NullPointerException
        System.out.println("Demonstrating NullPointerException:");
        generateNullPointerException(); // This will throw the exception and stop the program

        // Step 2: Refactor code to handle the exception
        System.out.println("\nDemonstrating handling of NullPointerException:");
        handleNullPointerException(); // This will catch and handle the exception
    }
}
