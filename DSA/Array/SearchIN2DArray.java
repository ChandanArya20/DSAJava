import java.util.Arrays;

public class SearchIN2DArray {

    public static void main(String[] args) {

        int[][] arr = {
                {12, 45, 67, 4},
                {45, 90, 23, 54, 12, 43},
                {12, 34, 76, 50, 93}
        };

        System.out.println(Arrays.toString(search(arr, 93)));
    }

    private static int[] search(int[][] arr, int target) {

        int row;
        int col;

        for(row=0; row<arr.length; row++){

            for (col=0; col<arr[row].length; col++){

                if(arr[row][col]==target){
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
