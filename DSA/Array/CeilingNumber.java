public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
//        int[] arr = {-1,0,3,5,9,12};
//        int[] arr = {5};

        System.out.println(ceilingNumber(arr, 34));
    }

    public static int ceilingNumber(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        if(target > nums[nums.length-1]){
            return -1;
        }

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

        return start;
    }
}
