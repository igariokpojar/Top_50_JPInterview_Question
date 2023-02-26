package Interview;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArrays {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            int randomToSwap = rand.nextInt(arr.length);
            int temp = arr[randomToSwap];
            arr[randomToSwap]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
