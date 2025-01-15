public class BreakAndContinueExamples {

    public static void main(String[] args) {
        // Example 1: Print numbers from 1 to 10, but stop when the number 5 is reached (using break)
        System.out.println("Example 1:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Stops the loop when i equals 5
            }
            System.out.println(i);
        }

        // Example 2: Print numbers from 1 to 10, but skip the number 5 (using continue)
        System.out.println("\nExample 2:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // Skips the current iteration when i equals 5
            }
            System.out.println(i);
        }

        // Example 3: Find the smallest number greater than 20 that is divisible by 3 (using break)
        System.out.println("\nExample 3:");
        for (int i = 21; ; i++) { // Start from 21 and use an infinite loop until the condition is met
            if (i % 3 == 0) {
                System.out.println("The smallest number greater than 20 that is divisible by 3 is: " + i);
                break; // Exit the loop once the number is found
            }
        }

        // Example 4: Print all even numbers from 1 to 20, and skip odd numbers (using continue)
        System.out.println("\nExample 4:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) { // Skip odd numbers
                continue;
            }
            System.out.println(i); // Print even numbers
        }
    }
}
