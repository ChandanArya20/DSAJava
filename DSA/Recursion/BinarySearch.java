public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 7, 9, 12, 90};
        int index = binarySearch(arr, 9);
        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int target) {
        return binarySearchHelper(arr, target, 0, arr.length-1);
    }

    private static int binarySearchHelper(int[] arr, int target, int start, int end) {
        int mid = (start + end) / 2;
        if (start > end) {
            return -1;
        }
        if (arr[mid] == target) {
            return mid;
        } else if (target < arr[mid]) {
            return binarySearchHelper(arr, target, start, mid - 1);
        } else {
            return binarySearchHelper(arr, target, mid + 1, end);
        }
    }
}
