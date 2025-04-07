import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();  // Consume the newline
        
        System.out.println("Enter the second number: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();  // Consume the newline

        System.out.println("What operation do you want to perform? (sum, sub, mul)");
        String operation = scanner.nextLine().trim();

        if (operation.equalsIgnoreCase("sum")) {
            System.out.printf("%.2f + %.2f = %.2f%n", number1, number2, number1 + number2);
        } else if (operation.equalsIgnoreCase("sub")) {
            System.out.printf("%.2f - %.2f = %.2f%n", number1, number2, number1 - number2);
        } else if (operation.equalsIgnoreCase("mul")) {
            System.out.printf("%.2f * %.2f = %.2f%n", number1, number2, number1 * number2);
        } else {
            System.out.println("Invalid operation. Please enter sum, sub, or mul.");
        }

        scanner.close();
    }
}
