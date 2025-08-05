


public class CircularBuffer {
    int [] buffer;
    int capacity;
    int head = 0;
    int tail = 0;
    int size = 0;

    public CircularBuffer( int capacity) {
        this.capacity = capacity;
        buffer = new int[capacity];
    }

    public void insert(int data) {
        buffer[tail] = data;
        tail = (tail + 1) % capacity;

        if(size < capacity) {
            size++;
        }
        else {
            head = (head + 1) % capacity; // Overwrite the oldest data
        }
    }

    public void display () {
        System.out.print("Circular Buffer : [");
        for(int i = 0; i < size; i++) {
            int index = (head+i)%capacity;
            System.out.print(buffer[index] + " ");
            if( i != size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        CircularBuffer circularBuffer = new CircularBuffer(5);
        circularBuffer.insert(1);
        circularBuffer.insert(2);
        circularBuffer.insert(3);
        circularBuffer.insert(4);
        circularBuffer.insert(5);
        circularBuffer.display(); // Should display all 5 elements

        circularBuffer.insert(6); // This will overwrite the oldest element (1)
        circularBuffer.display(); // Should display 2, 3, 4, 5, 6
    }
}
