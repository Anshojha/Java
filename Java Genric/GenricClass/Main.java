public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello");
        System.out.println(stringBox);

        Box<Integer> integerBox = new Box<>(123);
        System.out.println(integerBox);

        Box<Double> doubleBox = new Box<>(45.67);
        System.out.println(doubleBox);
    }
}
