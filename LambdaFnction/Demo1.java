
@FunctionalInterface
interface A {

    void show(int i);
    // void show2(); Show error when wewdefin a one more methods
}

// class B implements A {
//     public void show() {
//         System.out.println("In show");
//     }
// }
public class Demo1 {

    public static void main(String[] args) {
        // A obj = new A(){
        //     public void show() {
        //         System.out.println("In show");
        //     }
        // };

        // Lambda function ->
        A obj = (int i)
                -> {
            System.out.println("In show  " + i); // This is the syntax for lambda function 
        };

        A obj2 = i -> System.out.println("in show " + i);

        obj.show(5);
        obj2.show(4);

    }
}
