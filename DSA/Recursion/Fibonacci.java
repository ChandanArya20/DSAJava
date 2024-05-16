public class Fibonacci {
    public static void main(String[] args) {
//        printFibonacciSeries(50);
        System.out.println(fibo(46));
    }

    private static void printFibonacciSeries(int n) {
        int a=0, b=1, c=0;
        System.out.print(0+" ");

        for (int i = 0; i < n-1; i++) {
            c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }

    private static int fibo(int n) {
        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
