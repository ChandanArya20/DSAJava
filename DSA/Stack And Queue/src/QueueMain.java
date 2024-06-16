public class QueueMain {
    public static void main(String[] args) {

//        Queue queue = new Queue(5);
        CircularQueue queue = new CircularQueue(5);

        queue.insert(12);
        queue.insert(10);
        queue.insert(6);
        queue.insert(4);
        queue.insert(15);

        queue.display();

        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

//        System.out.println(queue.peek());

        queue.display();

    }

}