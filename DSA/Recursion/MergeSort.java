import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2, 13, 4, 15, 7, 9, 12, 90};
//        int[] arr1 = {2, 3, 4, 5, 7, 9, 12, 90};
//        int[] arr2 = {6, 8, 10 ,12, 14, 18, 22};
//        System.out.println(Arrays.toString(merge(arr1, arr2)));

//        System.out.println(Arrays.toString(mergeSort(arr)));

        mergeSort2(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void mergeSort2(int[] arr, int start, int end) {

        if (start == end) {  //if partial array has only one element
            return;
        }

        int mid = (start + end) / 2;
        mergeSort2(arr, start, mid);
        mergeSort2(arr, mid + 1, end);

        merge2(arr, start, mid, end);
    }

    static void merge2(int[] arr, int start, int mid, int end) {

        //holds merged data temporary
        int[] mix = new int[end-start+1];
        int i = start, j = mid+1, k = 0;

        while (i <= mid && j <= end) {

            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;

            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            mix[k] = arr[i];
            i++; k++;
        }
        while (j <= end) {
            mix[k] = arr[j];
            j++; k++;
        }

        //changes the original array with sorted element with correct position
        for (int l = 0; l < mix.length; l++) {
            arr[start+l] = mix[l];
        }
    }

    private static int[] mergeSort(int[] arr) {

        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);

    }

    static int[] merge(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;

            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            result[k] = arr1[i];
            i++; k++;
        }
        while (j < arr2.length) {
            result[k] = arr2[j];
            j++; k++;
        }

        return result;
    }


}
