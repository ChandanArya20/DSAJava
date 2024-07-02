package assign.array;

public class PrintSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 10, 12, 5, 8};
        printSubArray(arr);

    }

    public static void printSubArray(int[] arr){
        //select starting point
        for (int i = 0; i < arr.length; i++) {
            //select ending point
            for (int j = i; j < arr.length; j++) {
                //prints between starting and ending point
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
