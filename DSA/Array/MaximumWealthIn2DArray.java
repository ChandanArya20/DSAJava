import java.util.Arrays;

public class MaximumWealthIn2DArray {

    public static void main(String[] args) {

        int[][] arr = {
                {2, 5, 7, 4},
                {4, 9, 3, 4, 2, 3},
                {2, 3, 6, 5, 9, 100}
        };

        System.out.println(maximumWealth(arr, 93));
    }

    private static int maximumWealth(int[][] arr, int i) {

        int maxWealth=0;

        for (int[] personAccounts: arr){
            int totalPersonWealth=0;

            for(int accountWealth: personAccounts){
                totalPersonWealth+=accountWealth;
            }

            if(totalPersonWealth>maxWealth){
                maxWealth=totalPersonWealth;
            }
        }
        return maxWealth;
    }


}
