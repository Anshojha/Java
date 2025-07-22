
import java.util.ArrayList;
import java.util.List;



public class ListCollection {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        
        System.out.println("Before --> " + l1);

        l1.add(2, 12);
        System.out.println("l1.add(2, 12) --> " + l1);
        l1.addFirst(90);
        System.out.println("l1.addFirst(90) --> " + l1);

    }
}
