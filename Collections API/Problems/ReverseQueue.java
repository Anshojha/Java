
import java.util.LinkedList;
import java.util.Queue;



public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println("Original Queue: " + queue);
          reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);

    }

    public static void reverseQueue(Queue<Integer> queue) {
        if(queue.isEmpty()) {
            return;
        }
        int front = queue.poll(); // Remove the front element
        reverseQueue(queue); // Recursively reverse the remaining queue
        queue.add(front); // Add the front element back to the end of the queue
    }
}
