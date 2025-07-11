import java.util.LinkedList;
import java.util.Queue;

class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // Enqueue elements
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        // Display the queue
        System.out.println("Queue: " + queue );

        // remove elements
        queue.remove(); // remove 10

        System.out.println("Top element after removal: " + queue.peek());

        System.out.println("Queue size after removal: " + queue.size());

        System.out.println("Is the queue empty? " + queue.isEmpty());

        // Dequeue all elements 
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.poll());
        }

        System.out.println("Queue after dequeuing all elements: " + queue);
        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}
