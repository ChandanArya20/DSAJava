public class MinMaxInArray {

    public static void main(String[] args) {

        int[] arr = {12, 5, 89,3,89,56,34,11,34,90};

        System.out.println(getMinimum(arr));
        System.out.println(getMaximum(arr));
    }

    private static int getMinimum(int[] arr) {

        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }

        int min = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    private static int getMaximum(int[] arr) {

        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        int max = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
