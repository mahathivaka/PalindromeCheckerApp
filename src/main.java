public class main {

    /**
     * Application entry point for UC3.
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        // Step 1: Store a predefined string
        String input = "madam";   // you can change this value

        // Step 2: Create an empty string to store reversed value
        String reversed = "";

        // Step 3: Reverse the string using loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Step 4: Compare original and reversed strings
        if (input.equals(reversed)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}