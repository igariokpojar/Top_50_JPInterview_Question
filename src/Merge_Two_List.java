import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Two_List {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("I love"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Java"));

        List<String> mergeList = new ArrayList<>(list);
        mergeList.addAll(list2);
        System.out.println(mergeList);

    }
}
