
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class SetCollection {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // The set containe unique value in unsorted order
        set.add(12);
        set.add(16);
        set.add(92);
        set.add(12);
        set.add(167);
        set.add(102);
        set.add(112);

        for(int n : set) {
            System.out.println(n);
        }
        System.out.println("Sorted set vlues using TreeSet");
        Set<Integer> set2 = new TreeSet<>(); // This will cosntain unique values in sorted order
        set2.add(12);
        set2.add(16);
        set2.add(92);
        set2.add(12);
        set2.add(167);
        set2.add(102);
        set2.add(112);

        for(int n : set2) {
            System.out.println(n);
        }
         
        System.out.println("<------- Printing values of set using iterator -------->");
        // On the top collections is called iterble as we can iterate and get all the vlues of the set
        Iterator<Integer> values = set2.iterator();
        while(values.hasNext()) {
            System.out.println(values.next());
        }
    }
}
