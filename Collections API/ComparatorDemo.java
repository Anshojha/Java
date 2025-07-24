
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {


        Comparator <Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if( i  > j ) {
                    return  1;
                }
                else {
                    return -1;
                }
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(41);
        nums.add(34);
        nums.add(33);
        nums.add(29);
        System.out.println(nums);
        Collections.sort(nums, com);

        System.out.println(nums);
    }

}
