import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachMethod {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        /*
        You can use the forEach() method with a lambda expression to reduce the code size
         */

        List<String> list2 = new ArrayList<>();

        list2.forEach(System.out::print);
    }
}
