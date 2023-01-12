import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraySameElements {

    public static void main(String[] args) {

        Integer[] arr1 = {1,2,3,2,1};
        Integer[] arr2 = {1,2,3};
        Integer[] arr3 = {1,2,3,4,5,6};

        System.out.println(sameElement(arr1,arr2));
        System.out.println(sameElement(arr1,arr3));
    }

    public static boolean sameElement(Object[] a1, Object[] a2){
        Set<Object> uniqueElements1 = new HashSet<>(Arrays.asList(a1));
        Set<Object> uniqueElements2 = new HashSet<>(Arrays.asList(a2));

        // id size is different, means there will be a mismatch
        if (uniqueElements1.size() != uniqueElements2.size()) return false;

        for (Object each:uniqueElements1){
            // element not present in both?
            if (!uniqueElements2.contains(each)) return false;
        }
        return true;
    }
}
/*
To check if two arrays contain the same elements, you need to first create a set of elements from both the arrays,
 and then compare the elements in these sets to find if there is an element that is not present in both sets.
 */