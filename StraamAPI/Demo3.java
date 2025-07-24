import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo3 {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(8,2, 5, 2, 4, 6);

        // Predicate to filter even numbers
        Predicate<Integer> isEven = n -> n % 2 == 0;

        // Function<Integer, Integer > fun = new Function<Integer,Integer>() {
          
        //     public Integer apply(Integer t) {
        //         return  t * 2;
        //     }
            
        // };
        Function<Integer, Integer > fun =  t -> t * 2;
        
     

        // Stream pipeline: filter → map (double) → reduce (sum)
        // int result = nums.stream()
        //                  .filter(isEven)              // keep even numbers
        //                  .map(fun)             // double the value
        //                  .reduce(0, Integer::sum);    // sum them using reduce
        Stream<Integer> result = nums.stream()
                         .filter(isEven)              // keep even numbers
                         .sorted();    // sum them using reduce

        result.forEach(n -> System.err.println(n));
    }
}
