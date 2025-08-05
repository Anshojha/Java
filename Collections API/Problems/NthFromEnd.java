
import java.util.LinkedList;



public class NthFromEnd {

    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        if (n == 0 || n > list.size()) {
            return null; // Invalid n
        }

        var fast = list.listIterator();
        var slow = list.listIterator();
        for (int i = 0; i < n; i++) {
            if (!fast.hasNext()) {
                throw new IllegalArgumentException("N is larger than the list size");
            }
            fast.next();
        }

        // Move both until fast reaches end
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next();
        
    }
    
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int n = 2; // Find the 2nd element from the end
        Integer nthFromEnd = findNthFromEnd(list, n);
        if (nthFromEnd != null) {
            System.out.println(n + "th element from the end is: " + nthFromEnd);
        } else {
            System.out.println("The list is shorter than " + n + " elements.");
        }
    }
}
