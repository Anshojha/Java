class Example {
    final int MAX_VALUE = 100; // Final variable
    final static int MIN_VALUE = 0; // Final static variable

    void displayValues() {
        System.out.println("Max Value: " + MAX_VALUE);
        System.out.println("Min Value: " + MIN_VALUE);
    }
}

public class FinalVariable {
    public static void main (String[] args) {
        Example example = new Example();
        example.displayValues(); // Output: Max Value: 100, Min Value: 0

        // Uncommenting the following lines will cause a compilation error
        // example.MAX_VALUE = 200; // Error: Cannot assign a value to final variable MAX_VALUE
        // Example.MIN_VALUE = -10; // Error: Cannot assign a value to final static variable MIN_VALUE
    }
}