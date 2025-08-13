
public class Counter {

    private int count = 0;

    // public synchronized  void increement() {
    //     count++;
    // }
    public  void increement() {

        synchronized (this) {
            
            count++;
        }
    }

    public int getCount() {
        return count;
    }

}
