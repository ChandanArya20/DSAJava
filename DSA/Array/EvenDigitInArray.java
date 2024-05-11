public class EvenDigitInArray {

    public static void main(String[] args) {

        int[] arr = {12, 5, 89, 3, 89, 56, 34, 11, 34, 90};

        System.out.println(evenDigits(arr));

    }

    private static int evenDigits(int[] arr) {

        int count = 0;

        for (int i : arr) {
            if (hasEvenDigits2(i)) {
                count++;
            }
        }
        return count;
    }

    //checks if num haas even number of digits
    private static boolean hasEvenDigits(int num) {

        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count % 2 == 0;
    }

    private static boolean hasEvenDigits2(int num) {

        return String.valueOf(num).length() % 2 == 0;
    }

}
