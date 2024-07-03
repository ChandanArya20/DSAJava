package assign.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "2552";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length()-1;

        while (left < right){
            if (str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++; right--;
        }

        return true;
    }

}
