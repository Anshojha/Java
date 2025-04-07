
public class WrapperClass {

    public static void main(String[] args) {
        // Integer a = 10; // Primitive data type
        // Integer b = 45;
        // // Wrapper class for int
        // // Integer b = new Integer(a); // Boxing
        // System.out.println(a); // Unboxing
        // System.out.println(b.intValue()); // Unboxing
        // swap(a, b);
        // System.out.println(a); // Unboxing
        // System.out.println(b); // Unboxing

        A obj = new A("ASDFds"); // Creating an object of class A
        System.out.println("This is the object i am priniting "+obj);

        // for (int i = 0; i < 1000000; i++) {
        //     obj = new A(); // Creating a new object in each iteration
        // }

    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A {

    String name;

    A(String name) {
        this.name = name;
    }   

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");

    }
}
