public class CountDigits {
    public static void main(String[] args) {
        int num = 46030;
        System.out.println(countDigits(num));
    }

    private static int countDigits(int num) {
        if(num==0){
            return 0;
        }

        return 1 + countDigits(num / 10);
    }

}
