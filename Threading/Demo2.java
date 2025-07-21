// class A  extends Thread{
//     public void run() {
//         for (int i = 0; i < 10; i++) {
//             try {
//                 System.out.println("hi");
//                 Thread.sleep(10);  // Now it will wait for another thread to complete its execution
//             } catch (InterruptedException ex) {
//             }
//         }
//     }
// }
// class B extends Thread{
//     public void run() {
//         for (int i = 0; i < 10; i++) {
//             try {
//                 System.out.println("Helo");
//                 Thread.sleep(10);
//             } catch (InterruptedException ex) {
//             }
//         }
//     }
// }

public class Demo2 {

    public static void main(String[] args) {
        Runnable obj1 = () -> {

            for (int i = 0; i < 10; i++) {
                try {
                    System.out.println("hi");
                    Thread.sleep(10);  // Now it will wait for another thread to complete its execution
                } catch (InterruptedException ex) {
                }

            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    System.out.println("Hello");
                    Thread.sleep(10);  // Now it will wait for another thread to complete its execution
                } catch (InterruptedException ex) {
                }

            }
        };

        Thread T1 = new Thread(obj1);
        Thread T2 = new Thread(obj2);

        T1.start();
        T2.start();
    }
}
