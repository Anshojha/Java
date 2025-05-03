class Counter {
    static int count = 0; // Static variable
    Counter() {
        count++;
    }

    void displayCount() {
        System.out.println("Count: " + count);
    }
}
class StaticVariable {
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        obj1.displayCount(); // Output: Count: 2
        obj2.displayCount(); // Output: Count: 2
    }
}
