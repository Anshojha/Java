
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import javax.lang.model.util.Elements;

public class Arrayist {

    public static void main(String[] args) {
       // It is dynamically resizable array  
// Dynamic Resizing → It automatically increases in size when elements are added beyond its capacity.

// Allows Duplicates → Unlike Set, ArrayList allows duplicate elements.
// Maintains Insertion Order → Elements are stored in the order they are inserted.
// Supports Random Access → Uses index-based access (O(1 ArrayList<Integer> number = new ArrayList<Integer>(); ) complexity).
// Not Synchronized → Not thread-safe, but can be synchronized manually.
// Method	                  Description
// add(E e)	                  Adds an element to the list
// add(in index, E e)	    Inserts an element at a specific index
// get(int index)	       Retrieves an element at a specific index
// remove(int index)	  Removes an element at a given index
// size()	                 Returns the number of elements
// contains(E e)	           Checks if the list contains an element
// clear()	                    Removes all elements from the list
        number.add(1);
        number.add(5);
        number.add(5);
        number.add(2);
        number.add(4);

        // number.remove(3);
        // number.clear();// Clear the entire the entire array      
        number.sort(Comparator.naturalOrder());
        number.sort(Comparator.reverseOrder());
        ArrayList<Integer> num = new ArrayList<Integer>();
        System.out.println(number);
        System.out.println(number.isEmpty());
        System.out.println(num.isEmpty());
    }
}
