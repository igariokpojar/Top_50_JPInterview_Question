public class FindSecondHighest {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,55,6};
        System.out.println(findSecondHighest(arr));

    }
    public static int findSecondHighest(int[] arr){

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int each:arr){
            if (each>highest){
                secondHighest=highest;
                highest=each;
            } else if (each>secondHighest) {
                secondHighest=each;
            }
        }
        return secondHighest;
    }
}
/*
There are many ways to solve this problem.
You can sort the array in natural ascending order and take the second last value.
 However, sorting is an expensive operation.
 You can also use two variables to find the second largest value in a single iteration
 */