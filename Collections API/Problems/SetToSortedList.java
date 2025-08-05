
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;



public class SetToSortedList {
    public static void main(String[] args) {
        Set<Integer> set = Set.of(11,6,2,8,3,5,7,4,9,10,1);
        System.out.println("Original Set: " + set);
        List<Integer> sorttedList = new ArrayList<>(set);
        Collections.sort(sorttedList);
        System.out.println("Sorted List: " + sorttedList);
    }
}
