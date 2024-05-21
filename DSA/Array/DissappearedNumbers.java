import java.util.ArrayList;
import java.util.List;

public class DissappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        List<Integer> duplicates = new ArrayList<>();

        while(i < nums.length){
            int currectIndex = nums[i]-1;

            if(nums[i] < nums.length && nums[i] != nums[currectIndex]){
                int temp  = nums[currectIndex];
                nums[currectIndex] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }

        for(i = 0; i < nums.length; i++){
            if(nums[i] != i+1){
                duplicates.add(i+1);
            }
        }

        return duplicates;
    }
}
