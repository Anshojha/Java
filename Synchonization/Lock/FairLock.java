
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



public class FairLock {
    private final Lock unfairLock = new ReentrantLock(true); // 
    

    public void accessResource () {
        unfairLock.lock();  

        try {
            System.out.println(Thread.currentThread().getName() + " Accquire the lock");
            // Thread.sleep(1000);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName() + " Released the lock");
            unfairLock.unlock();
        }
    }


    public static void main(String[] args) {
        UnfairLock examLock = new UnfairLock();
        @SuppressWarnings("Convert2Lambda")
        Runnable task = new Runnable() {
            @Override
            public void run () {
                examLock.accessResource();
            }
        };

        Thread t1 = new Thread(task , "Thread 1");
        Thread t2 = new Thread(task , "Thread 2");
        Thread t3 = new Thread(task , "Thread 3");
        Thread t4 = new Thread(task , "Thread 4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}


// Thread 1 Accquire the lock
// Thread 1 Released the lock
// Thread 2 Accquire the lock
// Thread 2 Released the lock
// Thread 4 Accquire the lock
// Thread 4 Released the lock
// Thread 3 Accquire the lock
// Thread 3 Released the lock
// PS D:\MyWorld\Language\Java\Synchonization\Lock> cd "d:\MyWorld\Language\Java\Synchonization\Lock\" ; if ($?) { javac UnfairLock.java } ; if ($?) { java UnfairLock }
// Thread 2 Accquire the lock
// Thread 2 Released the lock
// Thread 4 Accquire the lock
// Thread 4 Released the lock
// Thread 1 Accquire the lock
// Thread 1 Released the lock
// Thread 3 Accquire the lock
// Thread 3 Released the lock