
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    void push(int x) {
        // Push element onto q1
        q1.add(x);

        // Move all elements from q2 to q1
        while(!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Swap the names of q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        // If q1 is empty return -1
        if (q1.isEmpty()) throw new RuntimeException("Stack is emopty");
        else {
            return q1.remove(); // Remove the front element from q1
        }
    }

    public int top() {
        if(q1.isEmpty()) throw new RuntimeException("Stack is empty");
        else {
            return q1.peek(); // Return the front element of q1
        }
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top element: " + stack.top()); // Should print 3
        System.out.println("Popped element: " + stack.pop()); // Should print 3
        System.out.println("Top element after pop: " + stack.top()); // Should print 2
    }
}
