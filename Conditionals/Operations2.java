
import java.util.Scanner;



public class Operations2 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the second number ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("What operation do you want to perform ? (sum , mul , div)");
        String operation = scanner.nextLine().trim();
        if(operation.equalsIgnoreCase("sum")) {
            System.out.printf("%f + %f = %f", number1 , number2, number1+number2);
        }
        else {
            System.out.printf("Opeerator is inv ");
        }

    }
}
