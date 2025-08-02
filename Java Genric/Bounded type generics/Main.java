

public class Main {
    public static void main(String[] args) {
        // Box<String> stringBox = new Box<>("Hello"); -> Produce error because Box is not bounded
        // System.out.println(stringBox);
        

        Box<Integer> integerBox = new Box<>(123);
        System.out.println(integerBox);

        Box<Double> doubleBox = new Box<>(45.67);
        System.out.println(doubleBox);

        // Example of using a bounded type generic
        Box<Number> numberBox = new Box<>(10.5);
        System.out.println(numberBox);
    }
}
