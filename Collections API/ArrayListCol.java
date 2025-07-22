
import java.util.ArrayList;
import java.util.Collection;



public class ArrayListCol {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(3);
        nums.add(6);
        nums.add(9);
        for(Object n : nums) {
            System.out.println(n);
        }
        for(int n : nums) {  // if you mentioned the datatype while initalizing
            System.out.println(n);
        }

        System.out.println(nums);
    }

}
