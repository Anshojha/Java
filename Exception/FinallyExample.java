public class FinallyExample {
    public static void main(String[] args) {
        try {
            int data = 50 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
