class MathUtility {
    static int square(int x) {
        return x * x; // Static method to calculate square
    }
}

public class StaticMethods {
    public static void main(String[] args) {
        int number = 5;
        int result = MathUtility.square(number); // Calling static method
        System.out.println("Square of " + number + " is: " + result); // Output: Square of 5 is: 25
    }
}
// In this example, the static method `square` is defined in the `MathUtility` class. It can be called directly using the class name without creating an instance of the class. The output will be "Square of 5 is: 25".