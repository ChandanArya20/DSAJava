import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
//        int[] arr = {12, 7, 2, 9,10, 34, 90, 4, 5};
        int[] arr = {0, -1,3,4, 5};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j-1] > arr[j]  ; j--) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
