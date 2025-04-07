import java.util.*;

public class Level1Program {
    
    public static double calculateSI(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static int maxHandShake(int n) {
        return (n * (n - 1)) / 2;
    }

    public static int calculateRounds(int side1, int side2, int side3) {
        double perimeter = side1 + side2 + side3;
        return (int) Math.ceil(5000 / perimeter);
    }

    public static int checkNumber(int num) {
        if (num > 0) return 1;
        else if (num < 0) return -1;
        else return 0;
    }

    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) ||
               (month == 4) ||
               (month == 5) ||
               (month == 6 && day <= 20);
    }

    public static int sumOfNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int[] findSmallestAndLargest(int num1, int num2, int num3) {
        int smallest = Math.min(num1, Math.min(num2, num3));
        int largest = Math.max(num1, Math.max(num2, num3));
        return new int[]{smallest, largest};
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        return new double[]{Math.sin(radians), Math.cos(radians), Math.tan(radians)};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Interest: " + calculateSI(1000, 5, 2));
        System.out.println("Max Handshakes: " + maxHandShake(10));
        System.out.println("Rounds for 5km: " + calculateRounds(300, 400, 500));
        System.out.println("Check number (5): " + checkNumber(5));
        System.out.println("Is Spring (4,15): " + isSpringSeason(4, 15));
        System.out.println("Sum of 10 natural numbers: " + sumOfNumbers(10));

        int[] res1 = findSmallestAndLargest(5, 3, 9);
        System.out.println("Smallest: " + res1[0] + ", Largest: " + res1[1]);

        int[] res2 = findRemainderAndQuotient(10, 3);
        System.out.println("Quotient: " + res2[0] + ", Remainder: " + res2[1]);

        System.out.println("Wind Chill: " + calculateWindChill(10, 20));

        double[] trig = calculateTrigonometricFunctions(45);
        System.out.println("Sin: " + trig[0] + ", Cos: " + trig[1] + ", Tan: " + trig[2]);

        sc.close();
    }
}
