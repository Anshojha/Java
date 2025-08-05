
import java.util.ArrayList;
import java.util.List;



public class RotateLit {

    public static <T> List<T> rotateList(List<T> list, int k) {
         int size = list.size();               
        if (size == 0 || k == 0) {
            return list;
        }       
        k = k % size;  
        List<T> rotatedList = new ArrayList<>();             
        rotatedList.addAll(list.subList(k, size));
        rotatedList.addAll(list.subList(0, k));       
        return rotatedList;

    }
    public static void main(String[] args) {
        
        List<Integer> list = List.of(10, 20, 30, 40, 50);
        System.out.println("Original List: " + list);
        List<Integer> rotatedList = rotateList(list, 3);
        System.out.println("Rotated List: " + rotatedList);
    }
}
