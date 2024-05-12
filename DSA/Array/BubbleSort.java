import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

//        int[] arr = {12, 7, 2, 9,10, 34, 90, 4, 5};
        int[] arr = {0, -1,4,5,-2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

}
