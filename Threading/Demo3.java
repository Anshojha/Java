class A  extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("hi");
                Thread.sleep(10);  // Now it will wait for another thread to complete its execution
            } catch (InterruptedException ex) {
            }
        }
    }
}
class B extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Helo");
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
    }
}

public class Demo3 {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
     obj2.setPriority(Thread.MAX_PRIORITY); // setting priority

        obj1.start();
        obj2.start();
    }
}
