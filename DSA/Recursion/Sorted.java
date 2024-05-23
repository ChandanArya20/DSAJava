public class Sorted {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7, 80, 9, 45};
        System.out.println(sorted(arr));
    }

    static boolean sorted(int[] arr){
        return helper(arr, 0);
    }

    static boolean helper(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && helper(arr, index+1);
    }



}
