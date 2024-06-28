import java.util.Arrays;

public class RemoveDuplicateSortedArray {

    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 3, 4, 6, 9, 9, 9};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for(int i=1; i< nums.length; i++){
            if(nums[i]!=nums[i-1]){
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
