import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {12, 5, 89,3,89,56,34,11,34,90};

        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void reverseArray(int[] arr) {

        int start ;
        int end = arr.length-1;

        for(start = 0; start < end; start++, end--){

            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
    }
}
