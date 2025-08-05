
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;



public class removeDublicate {

    public static <T> List<T> removeDuplicates(List<T> list) {
        HashSet<T> seen = new HashSet<>();
        List<T> uniqueList = new ArrayList<>();
        for (T item : list) {
            if (seen.add(item)) { // add returns false if item is already present
                uniqueList.add(item);
            }
        }
        return uniqueList;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(2, 2, 3, 1, 4, 5, 1, 6);
        System.out.println("Original List: " + list);
        List<Integer> uniqueList = removeDuplicates(list);  
        System.out.println("List after removing duplicates: " + uniqueList);
    }
}
