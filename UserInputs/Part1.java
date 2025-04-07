// Import the Scanner class to take user input
import java.util.Scanner;  

// Define the main class
class Part1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");

        // Read the full line of text entered by the user
        String name = scanner.nextLine();

        // Display the name entered by the user
        System.out.println("You entered: " + name);

        // Add a message to indicate the program has completed execution
        System.out.println("Execution completed. Press Enter to exit...");

        // Wait for the user to press Enter before closing the program
        scanner.nextLine();

        // Close the Scanner object to free resources
        scanner.close();
    }
}
