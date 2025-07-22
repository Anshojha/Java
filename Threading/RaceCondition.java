
class Counter {

    int count;

    public synchronized  void increment() { // The word synchronized allow only one thread to access and operate  
        count++;
    }
}

public class RaceCondition {

    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable obj1 = () -> {

            for (int i = 1; i <= 1000; i++) {
                c.increment();

            }
        };
        Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        Thread T1 = new Thread(obj1);
        Thread T2 = new Thread(obj2);

        T1.start();
        T2.start();
        T1.join();
        T2.join();

        System.out.println(c.count);
    }
}
