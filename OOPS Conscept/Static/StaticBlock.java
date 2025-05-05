class Example {
    static int value;

    static {
        value = 10; // Static block to initialize static variable
        System.out.println("Static block executed. Value initialized to: " + value);
    }
}

public class StaticBlock {
    public static void main (String[] args) {
        System.out.println("Main method executed. Value: : " + Example.value);
        Example obj = new Example(); // Creating an instance of Example class
        System.out.println("Value after creating object: " + obj.value); // Accessing static variable through object reference
        Example.value = 20; // Modifying static variable
        System.out.println("Value after modification: " + Example.value); // Accessing static variable through class name
        Example obj2 = new Example(); // Creating another instance of Example class
        System.out.println("Value after creating another object: " + obj2.value); // Accessing static variable through object reference
    }
}