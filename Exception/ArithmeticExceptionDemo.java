// This program demonstrates how to handle a Runtime (Unchecked) Exception in Java
// specifically ArithmeticException (division by zero)

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try {
            // Attempt to divide 5 by 0, which will cause an ArithmeticException at runtime
            int divideByZero = 5 / 0;
        } catch (ArithmeticException e) {
            // This block catches and handles the specific ArithmeticException
            System.out.println("ArithmeticException => " + e.getMessage());
        } catch (Exception e) {
            // This is a generic catch block for any other unexpected exceptions
            System.out.println("Generic Exception => " + e.getMessage());
        }
    }
}
