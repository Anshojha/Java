// import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,5,2,4,6);
        // int sum = 0;

        // for (int i = 0; i < nums.size(); i++) {
        //     System.out.println(nums.get(i));
        // }

        // for(int n : nums) {
        //     if(n % 2 == 0) {
        //         n = n * 2;
        //         sum += n;
        //     }
        // }

        // System.out.println(sum);

        // nums.forEach( n -> System.out.println(n)); 

        // Consumer<Integer> con = new Consumer<Integer>() {
        //     public void accept(Integer n) {
        //         System.out.println(n);
        //     }
        // };
        Consumer<Integer> con = n -> System.out.println(n); // Functional interface

        nums.forEach(con);
    }
}
