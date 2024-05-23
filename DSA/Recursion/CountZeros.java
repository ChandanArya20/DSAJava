public class CountZeros {
    public static void main(String[] args) {
        int num = 340046030;
        System.out.println(countZeros(num));
    }

    private static int countZeros(int num) {
        return helper(num, 0);

    }

    private static int helper(int num, int count) {
        if(num==0){
            return count;
        }
        if (num%10 == 0) {
            return helper(num / 10, ++count);
        }
        return helper(num / 10, count);
    }


}
