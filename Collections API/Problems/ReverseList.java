import java.util.ArrayList;

public class ReverseList {
    
    // Static method
    public static void reverseList(ArrayList<Integer> list) {
       
        // for (int i = list.size() - 1; i >= 0; i--) {
        //     reversedList.add(list.get(i));
        // }
        // return reversedList;
        int start = 0;
        int end = list.size() - 1;
        while( start  < end  ) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        System.out.println("Original List: " + list);
        
        // Now call directly without object
        // List<Integer> reversedList = reverseList(list);
        reverseList(list);
        
        System.out.println("Reversed List: " + list);
    }
}
