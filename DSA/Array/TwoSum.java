import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {3,5,10,2,4,9};

        System.out.println(Arrays.toString(twoSum2(arr, 5)));
    }

    public static int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];

            if(map.containsKey(complement)){
                return new int[]{i, map.get(complement)};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }

}
