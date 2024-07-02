package assign.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckSubset {
    public static void main(String[] args) {
        int[] arr1 = {3, 5, 8, 9, 51};
        int[] arr2 = {12, 10, 3, 5, 8, 10, 8, 9, 5, 10};

        System.out.println(checkSubset(arr1, arr2));
    }

    //checks if arr1 is subset of arr2
    public static boolean checkSubset(int[] arr1, int[] arr2) {
        boolean flag = true;
        //checks availability of every element
        for (int key : arr1) {
            boolean isExist = false;

            for (int val : arr2) {
                if (key == val) {
                    isExist = true;
                    break;
                }
            }

            //if current element is not in second array
            if (!isExist) {
                return false;
            }
        }
        return true;
    }

    //checks if arr1 is subset of arr2 and arr2 is sorted
    public static boolean checkSubset2(int[] arr1, int[] arr2) {
        boolean flag = true;
        Arrays.sort(arr2);

        //checks availability of every element
        for (int key : arr1) {
            //if current element is not in second array
            if (Arrays.binarySearch(arr2, key) < 0 ) {
                return false;
            }
        }
        return true;
    }

    //checks if arr1 is subset of arr2 and arr2 is sorted
    public static boolean checkSubset3(int[] arr1, int[] arr2) {
        // Convert arr2 to a HashSet for fast lookup
        Set<Integer> set = new HashSet<>();
        for (int num : arr2) {
            set.add(num);
        }

        // Check each element of arr1 in the HashSet
        for (int num : arr1) {
            if (!set.contains(num)) {
                return false; // Element from arr1 not found in arr2
            }
        }

        return true; // All elements of arr1 found in arr2
    }
}
