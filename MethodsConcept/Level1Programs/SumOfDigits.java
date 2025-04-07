public class SumOfDigits {
    public int getRandom4DigitNumber() {
        return (int) (Math.random() * 9000) + 1000; // Generates a random 4-digit number
    }

    public int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10; // Remove the last digit
            count++; // Increment the digit count
        }
        return count;
    }

    public int[] getTheDigits(int number, int count) {
        int[] digits = new int[count];
        int temp = number; // Store the original number
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10; // Get the last digit
            temp /= 10; // Remove the last digit
        }
        return digits; // Return the array of digits
    }

    public int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i]; // Sum the elements of the array
        }
        return sum; // Return the total sum
    }

    public static void main(String[] args) {
        SumOfDigits sumOfDigits = new SumOfDigits();
        int number = sumOfDigits.getRandom4DigitNumber(); // Generate a random 4-digit number
        System.out.println("Random 4-digit number: " + number); // Print the random number
        int count = sumOfDigits.countDigits(number); // Count the digits in the number
        System.out.println("Number of digits: " + count); // Print the digit count
        int[] digits = sumOfDigits.getTheDigits(number, count); // Get the digits of the number
        int sum = sumOfDigits.sumArray(digits); // Calculate the sum of the digits
        System.out.println("Sum of digits: " + sum); // Print the sum of the digits
        System.out.println("Digits: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " "); // Print each digit
        }
        System.out.println(); // Print a new line
        System.out.println("Sum of digits: " + sum); // Print the sum of the digits
        
    }
}
 