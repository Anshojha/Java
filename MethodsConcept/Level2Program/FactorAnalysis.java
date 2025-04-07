
import java.util.Scanner;

public class FactorAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to analyze its factors: ");
        int num = scanner.nextInt();

        int [] factors = findFactor(num);
        System.out.println("Factors of " + num + " are: ");
        for (int i = 0; i < factors.length; i++) {
            if (factors[i] != 0) {
                System.out.print(factors[i] + " ");
            }
        }
        System.out.println(); // Print a new line for better readability
        int sum = sumFactor(factors);
        int product = findProduct(factors);
        int sumOfSquares = sumOfSquares(factors);
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);

    }

    public static int[] findFactor(int num) {
        int [] factors = new int[num];
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if(num % i == 0) {
                count++;
            }
        }


        int index = 0;
        for (int i = 1; i <= num; i++) {
            if(num % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    public static int sumFactor(int [] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            if (factors[i] != 0) {
                sum += factors[i];
            }
        }
        return sum;
    }


    public static int findProduct(int [] factors) {
        int product = 1;
        for (int i = 0; i < factors.length; i++) {
            if (factors[i] != 0) {
                product *= factors[i];
            }
        }
        return product;
    }

    public static int sumOfSquares(int [] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            int num = (factors[i]);
            sum += num * num;
        }   
        return sum;
    }
}
