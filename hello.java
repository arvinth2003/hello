public class PositiveNegativeChecker {
    public static void main(String[] args) {
        int number = 10; // Declare and initialize an integer variable

        // Check if the number is greater than 0
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } 
        // If the condition in 'if' is false, execute the 'else' block
        else {
            System.out.println(number + " is not a positive number (it's zero or negative).");
        }
    }
}
