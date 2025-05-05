class Parent {}
class Child extends Parent {}

public class Main {
    public static void main (String[] args) {
        Parent obj = new Child(); // Upcasting

        if(obj instanceof Child) { // Checking if obj is an instance of Child
            System.out.println("obj is an instance of Child class.");
        } else {
            System.out.println("obj is NOT an instance of Child class.");
        }
        if(obj instanceof Parent) { // Checking if obj is an instance of Parent
            System.out.println("obj is an instance of Parent class.");
        } else {
            System.out.println("obj is NOT an instance of Parent class.");
        }
    }
}