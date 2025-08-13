



public class Main {
    public static void main(String[] args) {
        BanckAccount backAccount = new BanckAccount();

        Runnable task = new Runnable () {
            @Override
            public void run() {
                backAccount.withdraw(50);
            }
        };

        Thread t1 = new Thread(task, "Thread t1");
        Thread t2  =new Thread(task, "Thread 2");
        t1.start();
        t2.start();
    }
}
