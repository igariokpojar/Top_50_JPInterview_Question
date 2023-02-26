package Interview;

import java.util.Arrays;

public class SortArrays {

    public static void main(String[] args) {

        /*
        The Arrays utility class has many overloaded sort() methods to sort primitive and to object arrays.
         If you are sorting a primitive array in the natural order
        , then you can use the Arrays.sort() method, as shown in the following example:
         */
        int[] arr = {1,2,3,-2,-4,-8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
    /*
    However, if you want to sort an array of objects, then the object must implement the Comparable interface.
     If you want to specify the sorting criteria, then you can pass the Comparator for the sorting logic
     */

