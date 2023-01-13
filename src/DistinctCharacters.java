import java.io.FilterOutputStream;
import java.util.HashMap;
import java.util.Map;

public class DistinctCharacters {

    public static void main(String[] args) {

        String str = "SdnKfhnkdhfkki";
        char[] ch = str.toCharArray();

        Map<Character,Integer> count = new HashMap<>();
        for (char each:ch){
            if (count.containsKey(each)){
                count.put(each,count.get(each)+1);

            }else
                count.put(each,1);
        }
        System.out.println(count);
    }
}
/*
You can create the character array from the string.
Then iterate over it and create a HashMap with the character as key and their count as value.
 */