public class StackMain {
    public static void main(String[] args) {
//        Stack stack = new Stack(5);
//
//        stack.push(12);
//        stack.push(10);
//        stack.push(8);
//        stack.push(15);
//        stack.push(40);
//        System.out.println(stack.push(100));


//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        System.out.println(stack.peek());

        DynamicStack stack = new DynamicStack(5);

        stack.push(12);
        stack.push(10);
        stack.push(8);
        stack.push(15);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println(stack.pop());
        System.out.println(stack.peek());


    }

}