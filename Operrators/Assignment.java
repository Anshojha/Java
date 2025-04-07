class Assignment {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus
        System.out.println();

        // Relational Operators
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b)); // Greater than
        System.out.println("a < b: " + (a < b)); // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to
        System.out.println();

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("Logical Operators:");
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x)); // Logical NOT
        System.out.println();

        // Bitwise Operators
        System.out.println("Bitwise Operators:");
        System.out.println("a & b = " + (a & b)); // Bitwise AND
        System.out.println("a | b = " + (a | b)); // Bitwise OR
        System.out.println("a ^ b = " + (a ^ b)); // Bitwise XOR
        System.out.println("~a = " + (~a)); // Bitwise Complement
        System.out.println("a << 1 = " + (a << 1)); // Left shift
        System.out.println("a >> 1 = " + (a >> 1)); // Right shift
        System.out.println();

        // Assignment Operators
        System.out.println("Assignment Operators:");
        int c = a;
        System.out.println("c = " + c);
        c += b;
        System.out.println("c += b -> c = " + c);
        c -= b;
        System.out.println("c -= b -> c = " + c);
        c *= b;
        System.out.println("c *= b -> c = " + c);
        c /= b;
        System.out.println("c /= b -> c = " + c);
        c %= b;
        System.out.println("c %= b -> c = " + c);
        System.out.println();

        // Unary Operators
        System.out.println("Unary Operators:");
        int d = 5;
        System.out.println("d = " + d);
        System.out.println("++d = " + (++d)); // Pre-increment
        System.out.println("--d = " + (--d)); // Pre-decrement
        System.out.println("d++ = " + (d++)); // Post-increment
        System.out.println("d-- = " + (d--)); // Post-decrement
        System.out.println("Final d = " + d);
        System.out.println();

        // Ternary Operator
        System.out.println("Ternary Operator:");
        int min = (a < b) ? a : b;
        System.out.println("Minimum value is " + min);
    }
}
