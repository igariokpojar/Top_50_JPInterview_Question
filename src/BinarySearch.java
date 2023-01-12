public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};
        int key = 40;
        int high=arr.length-1;
        int result =  binarySearch(arr,0,high,key);
        if (result == -1)
            System.out.println("Element is not found!");
        else
            System.out.println("Element is found at index: "+result);
    }

    public static int binarySearch(int[] arr, int low, int high, int key) {
        int mid = (low + high) / 2;
        while (low <= high) {
            if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] == key) {
                return mid;

            } else {
                high = mid - 1;

            }
            mid = (low + high) / 2;
        }
        if (low > high) {
            return -1;
        }
        return -1;
    }
}
/*
The array elements must be sorted to implement binary search. The binary search algorithm is based on the following conditions:

If the key is less than the middle element, then you now need to search only in the first half of the array.
If the key is greater than the middle element, then you need to search only in the second half of the array.
If the key is equal to the middle element in the array, then the search ends.
Finally, if the key is not found in the whole array, then it should return -1.
 This indicates that the element is not present.
 */
