
import java.util.Arrays;

class IntArray {
    public static void main(String[] args) {
        int number[] = {1, 3, 4, 5};

        int copyOfNumbers[] = number; // In java arrays are the refrence type so any changes made before assiging to the new arraya it refelects the same array
        // So we can call it alias of the first array
        Arrays.fill(number, 0);
        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(copyOfNumbers));

        // Bewlow is the method to copy the entire array properly without refrencing any changes done in the orginal array
        int arr1[] = {1,4,5,6};

        int copy1[] = Arrays.copyOf(arr1, 100);  // we can  also increase and decrease the length of new Array
        Arrays.fill(arr1, 0);
         

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(copy1));

    }
};