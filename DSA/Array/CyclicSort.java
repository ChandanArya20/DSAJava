import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 2, 8, 1, 5, 7,};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){

        int i = 0;

        while(i < arr.length) {
            int currectIndex = arr[i]-1;

            if(arr[currectIndex] != arr[i]){
                int temp = arr[currectIndex];
                arr[currectIndex] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }
        }
    }


}
