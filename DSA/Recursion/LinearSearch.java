import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 30, 12, 4, 50, 7, 9, 12, 90};

//        System.out.println(linearSearch1(arr, 7));
//        System.out.println(linearSearch2(arr, 12));
//        System.out.println(linearSearch3(arr, 12));
        System.out.println(linearSearch4(arr, 12));
    }

    private static boolean linearSearch1(int[] arr, int target) {
        return linearSearchHelper1(arr, target, 0);
    }

    private static int linearSearch2(int[] arr, int target) {
        return linearSearchHelper2(arr, target, 0);
    }

    private static List<Integer> linearSearch3(int[] arr, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        linearSearchHelper3(arr, target, 0, list);
        return list;

    }

    private static List<Integer> linearSearch4(int[] arr, int target) {
        return linearSearchHelper4(arr, target, 0);
    }

    private static boolean linearSearchHelper1(int[] arr, int target, int index) {
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || linearSearchHelper1(arr, target, index+1);
    }

    private static int linearSearchHelper2(int[] arr, int target, int index) {
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return linearSearchHelper2(arr, target, index+1);
    }

    private static List<Integer> linearSearchHelper3(int[] arr, int target, int index, List<Integer> list) {
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return linearSearchHelper3(arr, target, index+1, list);
    }

    private static List<Integer> linearSearchHelper4(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        List<Integer> ansFromNextCalls = linearSearchHelper4(arr, target, index + 1);
        list.addAll(ansFromNextCalls);
        return list;
    }
}
