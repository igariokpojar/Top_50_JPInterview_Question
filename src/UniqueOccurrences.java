import java.util.*;

public class UniqueOccurrences {

    public static void main(String[] args) {

       int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
       int[] array = {1,2};
        System.out.println(uniqueOccurrences(arr));
        System.out.println(uniqueOccurrences(array));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int each:arr){
            map.put(each, map.getOrDefault(each,0)+1);
        }
        Set<Integer>unique = new HashSet(map.values());
        return map.size()==unique.size();
    }
}
