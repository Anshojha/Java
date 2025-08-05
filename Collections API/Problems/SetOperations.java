
import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(3, 4, 5);
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        Set<Integer> union = new HashSet<>(set1);
        System.err.println(union);
        
        Set<Integer> union2 = new HashSet<>(set1);  
        union2.addAll(set2);  

        Set<Integer> intersection = new HashSet<>(set1);  
        intersection.retainAll(set2);  
     
        System.out.println("Union: " + union2);            
        System.out.println("Intersection: " + intersection);
    }
}
