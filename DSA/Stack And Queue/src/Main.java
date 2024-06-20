import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(12);
//        queue.add(13);
//        queue.add(14);
//
//        System.out.println(queue.peek());
//
//
//        Stack<Integer> stack = new Stack();
//
//        stack.peek();

        BigInteger n = new BigInteger("1234598765432198765432");
        BigInteger m = new BigInteger("9876345698723456712345698765432345678876543345678");

        n = n.add(BigInteger.valueOf(2));

        System.out.println(n);
        System.out.println(n.multiply(m));




    }

}