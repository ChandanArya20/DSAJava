public class DigitProduct {
    public static void main(String[] args) {
        int num = 0;
        System.out.println(digitSum(num));
    }

    private static int digitSum(int num) {

        if (num / 10 == 0) {
            return num;
        }
        return num % 10 + digitSum(num / 10);
    }
}
