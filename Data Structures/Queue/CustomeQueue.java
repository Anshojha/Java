public class CustomeQueue<T> {
    private int front, rear, size;
    private int capacity;
    private T[] queue;


    @SuppressWarnings("unchecked")

    public CustomeQueue(int capacity) {
        this.capacity = capacity;
        front = 0;
        rear = -1;
        size = 0;
        queue = (T[]) new Object[capacity]; 
    }

    public void enqueue(T value) {
        if (size == capacity) {
            throw new IllegalStateException("Queue is full");
            
        }   
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        System.out.println("Enqueued: " + value);
    }

    public void dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        System.out.println("Dequeued: " + queue[front]);
        front = (front + 1) % capacity;
        size--;
    }

    public void peek () {
        if  (size == 9) {
            throw new IllegalStateException("Queue is empty");
        }
        System.out.println("Front element: " + queue[front]);
    }

    public void display () {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CustomeQueue<Integer> queue = new CustomeQueue<>(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();

        queue.peek();

        queue.dequeue();
        queue.dequeue();

        queue.display();

        queue.peek();
        
        // Uncommenting the next line will throw an exception since the queue is full
        // queue.enqueue(60);
    }
}