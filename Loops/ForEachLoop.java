
import java.util.ArrayList;

class ForEachLoop {
    public static void main(String [] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);

        number.forEach(num -> {
            System.out.println(num+1);
        });
    } 
}