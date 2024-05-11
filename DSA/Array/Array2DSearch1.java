import java.util.Arrays;

public class Array2DSearch1 {

    public static void main(String[] args) {

//        int[][] arr = {                   //Matrix
//                {10, 20, 30, 40, 50},
//                {15, 25, 35, 45, 60},
//                {33, 34, 40, 55, 65},
//                {36, 38, 43, 58, 66}
//        };

        int[][] arr = {                     // JavA 2D array
                {10, 20, 30, 40, 50},
                {15, 25, 35, 45, 60},
                {33, 34, 40, 55, 65, 80},
                {36, 38, 43, 58, 66, 90, 92, 97}
        };

        System.out.println(Arrays.toString(search2(arr, 97)));
    }

    public static int[] search1(int[][] arr, int target){
        int row = 0;
        int col = arr.length-1;

        while (row < arr.length && col >= 0){

            if(arr[row][col]==target){
                return new  int[]{row,col};
            } else if (target < arr[row][col]) {
                col--;
            }else {
                row++;
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] search2(int[][] arr, int target){
        int row = 0;
        int col = arr[0].length-1;

        while (row < arr.length && col >= 0){

            if(arr[row][col]==target){
                return new  int[]{row,col};
            } else if (target < arr[row][col]) {
                col--;
            }else {
                row++;
                if(row < arr.length){
                    col = arr[row].length-1;
                }
            }
        }
        return new int[]{-1, -1};
    }

}
