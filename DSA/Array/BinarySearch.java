import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
//        int[] arr = {-1,0,3,5,9,12};
//        int[] arr = {5};

//        System.out.println(search(arr, 6));

        Arrays.binarySearch(arr,4);
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(nums[mid]==target){
                return mid;
            }else if( target < nums[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }

        return -1;
    }
}
