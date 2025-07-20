
@FunctionalInterface
interface A1 {

    int add(int i, int j);
}

public class Demo2 {

    public static void main(String[] args) {
        // A1 obj = new A1() {
        //     public int add(int i, int j) {
        //         return i+j;
        //     }
        // };
        // A1 obj = (int i, int j) -> {
        //     return i + j;

        // };
        // Further resduced code
        A1 obj = (int i, int j) -> i + j;

        int rsult = obj.add(2, 6);
        System.out.println(rsult);
    }
}
