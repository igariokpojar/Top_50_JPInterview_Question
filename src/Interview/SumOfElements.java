package Interview;

public class SumOfElements {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6};
        int sum = 0;
        for (int each:arr){
            sum+=each;
        }
        System.out.println(sum);
    }
}
