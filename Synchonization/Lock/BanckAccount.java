
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BanckAccount {

    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try {
            if (lock.tryLock(1000, TimeUnit.MICROSECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawls");

                        Thread.sleep(10000);

                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " Completed withdrawals " + balance);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficient bank balance!!");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + "Could not accquire the lock ");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}
