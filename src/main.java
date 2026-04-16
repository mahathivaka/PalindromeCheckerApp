public class main {

    /**
     * Application entry point for UC2.
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        // Step 1: Store a predefined string
        String input = "madam";   // you can change this value

        // Step 2: Assume it is a palindrome initially
        boolean isPalindrome = true;

        // Step 3: Compare characters from both ends
        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        // Step 4: Display result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}