import java.util.Date;

public class FormatSpecifiersExample {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 25;
        double price = 19.99;
        char letter = 'A';
        boolean isAvailable = true;
        int hexValue = 255;
        int octalValue = 10;
        Date currentDate = new Date();

        System.out.printf("1. String: %s\n", name);
        System.out.printf("2. Integer: %d\n", age);
        System.out.printf("3. Floating-point (default): %f\n", price);
        System.out.printf("4. Floating-point (2 decimal places): %.2f\n", price);
        System.out.printf("5. Scientific Notation: %e\n", price);
        System.out.printf("6. Character: %c\n", letter);
        System.out.printf("7. Boolean: %b\n", isAvailable);
        System.out.printf("8. Hexadecimal (lowercase): %x\n", hexValue);
        System.out.printf("9. Hexadecimal (uppercase): %X\n", hexValue);
        System.out.printf("10. Octal: %o\n", octalValue);
        System.out.printf("11. Current Date: %tF\n", currentDate); // YYYY-MM-DD
        System.out.printf("12. Current Time: %tT\n", currentDate); // HH:MM:SS
        System.out.printf("13. Percentage Sign: %%\n"); // Prints %
    }
}
