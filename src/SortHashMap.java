import java.util.*;

public class SortHashMap {

    public static void main(String[] args) {

        Map<String,Integer> value = new HashMap<>();
        value.put("David", 95);
        value.put("Jane", 80);
        value.put("Mary", 97);
        value.put("Lisa", 78);
        value.put("Dino", 65);

        System.out.println(value);

        value = sortByValue(value);

        System.out.println(value);
    }

    private static Map<String,Integer> sortByValue(Map<String,Integer> value){

        Map<String,Integer>sortedByValue = new LinkedHashMap<>();

        // get the entry set
        Set<Map.Entry<String, Integer>> entrySet = value.entrySet();
        System.out.println(entrySet);

        // create a list since the set is unordered
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
        System.out.println(entryList);

        // sort the list by value
        entryList.sort((x, y) -> x.getValue().compareTo(y.getValue()));
        System.out.println(entryList);

        // populate the new hash map
        for (Map.Entry<String, Integer> e : entryList)
            sortedByValue.put(e.getKey(), e.getValue());

        return sortedByValue;
    }
}
