public class PrintNumbers {

    public static void main(String[] args) {
        int n = 5;
        print3(n);
    }

    public static void print1(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        print1(n-1);
    }

    public static void print2(int n){
        if(n==0){
            return;
        }
        print2(n-1);
        System.out.print(n+" ");
    }

    public static void print3(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        print3(n-1);
        System.out.print(n+" ");
    }


}
