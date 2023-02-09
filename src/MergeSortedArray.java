import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {

        int[]nums1 = {1,2,3,0,0,0};
        int[]nums2 = {2,5,6};

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1 , p2 = n-1 ,i = m+n-1;
        while(p2 >=0 ){
            if(p1 >=0 && nums1[p1] > nums2[p2]){
                nums1[i--] = nums1[p1--];
            }
            else{
                nums1[i--] = nums2[p2--];
            }
        }
    }
    public  static void mergeTwoArrays(int[] nums1, int m, int[] nums2, int n){

        m--;n--;
        int index = nums1.length-1;
        while (index>=0){
            if (m<0){
                nums1[index]=nums2[n--];
            }else if (n<0){
                nums1[index]=nums1[m--];
            }else {
                if (nums1[m]>nums2[n]){
                    nums1[index]=nums1[m--];
                }else {
                    nums1[index]=nums2[n--];
                }
            }
            index--;
        }
    }
    public int[] mergeArr(int[] nums1, int m, int[] nums2, int n){
        int k = 0;
        for (int i = m; i <m+n ; i++) {
            nums1[i]=nums2[k++];
        }
        Arrays.sort(nums1);

        return nums1;
    }



    public static void mergeArray(int[] nums1, int m, int[] nums2, int n){

        int pt1 = m+n-1;
        int pt2 = n-1;
        while (pt2>=0){
            nums1[pt1--]=nums2[pt2--];

        }
        Arrays.sort(nums1);
    }

}

