package assign.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 3, 4, 6, 9, 9, 9};
        int[] arr2 = {12, 10, 3, 5, 8, 10, 8, 9, 5, 10};
        System.out.println(Arrays.toString(removeDuplicates2(arr)));
        System.out.println(Arrays.toString(removeDuplicates3(arr2)));
        System.out.println(Arrays.toString(removeDuplicates4(arr2)));
    }

    //If array is sorted, Time : O(n), space : O(1)
    public static int removeDuplicates(int[] nums) {

        int j = 1;
        for(int i=1; i< nums.length; i++){
            if(nums[i]!=nums[i-1]){
                nums[j++] = nums[i];
            }
        }
        //new size of array
        return j;
    }

    //If array is sorted, Time : O(n), space : O(1)
    public static int[] removeDuplicates2(int[] nums) {
        if(nums.length < 2){
            return nums;
        }
        int j = 1;
        for(int i=1; i< nums.length; i++){
            if(nums[i]!=nums[i-1]){
                nums[j++] = nums[i];
            }
        }

        int[] result = new int[j];
        for (int k = 0; k < j; k++) {
            result[k] = nums[k];
        }

        return  result;
    }

    //If array is unsorted, Time : O(n), space : O(n)
    public static int[] removeDuplicates3(int[] nums) {
        Set<Integer> uniqueElem = new LinkedHashSet<>();

        //copy all element into hashset
        for (Integer val:nums){
            uniqueElem.add(val);
        }

        int[] result = new int[uniqueElem.size()];
        //copy data to result array
        int index=0;
        for(Integer val:uniqueElem){
            result[index++] = val;
        }

        return result;
    }

    //If array is unsorted, Time : O(nlogn), space : O(1)
    public static int[] removeDuplicates4(int[] nums) {
        Arrays.sort(nums);
        return removeDuplicates2(nums);
    }
}
