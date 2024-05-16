import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

//        int[] arr = {12, 7, 2, 9,10, 34, 90, 4, 5};
        int[] arr = {0, -1,3,4, 5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-1-i;
            int maxIndex = findMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);

        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int findMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = 0; i <= end; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

}
