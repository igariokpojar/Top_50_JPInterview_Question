package Interview;

import java.util.Arrays;
import java.util.List;

public class OddNumbers {

    public static void main(String[] args) {
        System.out.println(isOdd(Arrays.asList(2)));

    }
    public static boolean isOdd(List<Integer> num){
        for (int each:num){
            if (each%2!=0)return true;
        }
        return false;
    }
}
