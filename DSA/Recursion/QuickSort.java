import java.util.Arrays;


public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {2, 13, 4, 15, 7, 9, 12, 90};

        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void quickSort(int[] arr, int start, int end) {

        if (start > end) {
            return;
        }

        int pivotIndex = findPartition2(arr, start, end);

        // quicksort on left part
        quickSort(arr, start, pivotIndex-1);

        // quicksort on right part
        quickSort(arr, pivotIndex+1, end);

    }

    private static int findPartition1(int[] arr, int start, int end) {

        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {

            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, end);

        return i + 1;
    }

    private static int findPartition2(int[] arr, int start, int end) {

        int pivot = arr[start];
        int i = start;
        int j = end;

        while (i < j){

            while (arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }

            if(i < j){
                swap(arr, i, j);
            }

        }
        swap(arr, j, start);
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
