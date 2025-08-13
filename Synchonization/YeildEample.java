



class MyThread extends Thread {
    @Override
    public void run () {
        while(true) {
            System.out.println("Hello world");
        }
    }
}

public class YeildEample {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
        myThread.start();
        System.out.println("Main done !!");
    }
}