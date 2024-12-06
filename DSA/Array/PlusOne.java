import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
//        int[] digits = {1,2,3,4};
        int[] digits = {1,2,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
            }else{
                digits[i]++;
                return digits;
            }
        }

        digits = new int[digits.length+1];
        digits[0] = 1;

        return digits;
    }
}