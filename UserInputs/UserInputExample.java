import java.util.Scanner; // Import Scanner class

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // String input (Single Word)
        System.out.print("Enter a single word: ");
        String singleWord = scanner.next(); // Reads one word (stops at space)
        scanner.nextLine(); // Consume the newline

        // String input (Full Sentence)
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine(); // Reads the full line

        // Integer input
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();

        // Float input
        System.out.print("Enter a float value: ");
        float floatValue = scanner.nextFloat();

        // Double input
        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();

        // Boolean input
        System.out.print("Enter true or false: ");
        boolean boolValue = scanner.nextBoolean();

        // Character input
        System.out.print("Enter a single character: ");
        char charValue = scanner.next().charAt(0); // Reads first character

        // Displaying all inputs
        System.out.println("\nYour Inputs:");
        System.out.println("Single Word: " + singleWord);
        System.out.println("Sentence: " + sentence);
        System.out.println("Integer: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Boolean: " + boolValue);
        System.out.println("Character: " + charValue);

        scanner.close(); // Close scanner to prevent resource leak
    }
}
