
import java.util.*;

public class SortStackRecursively {

    public static void sortStack(Stack<Integer> stack) {
        if (!stack.empty()) {
            int temp = stack.pop();
            sortStack(stack);
            isnsertIntoSortedOrder(stack, temp);
        }
    }

    public static void isnsertIntoSortedOrder(Stack<Integer> stack, int element) {
        if (stack.empty() || element >= stack.peek()) {
            stack.push(element);
        } else {
            int temp = stack.pop();
            isnsertIntoSortedOrder(stack, element);
            stack.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(4);
        stack.push(7);
        stack.push(7);
        System.out.println("Strack" + stack);
        sortStack(stack);
        System.out.println("Stack :" + stack);
    }
}
