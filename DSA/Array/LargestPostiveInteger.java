public class LargestPostiveInteger {

    public static void main(String[] args) {

        int[] arr = {-1,10,6,7,-7,1};

        System.out.println(findMaxK(arr));

    }

    public static int findMaxK(int[] nums) {

        int max=Integer.MIN_VALUE;

        for(int num:nums){
            if(num>0 && num>max && containsNegative(nums, num)){
                max=num;
            }
        }

        return max;
    }

    private static boolean containsNegative(int[] arr, int key) {

        for(int num: arr){
            if(num==-key){
                return true;
            }
        }
        return false;
    }


}
