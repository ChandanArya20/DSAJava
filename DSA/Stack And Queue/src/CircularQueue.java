public class CircularQueue {
    protected int[] data;
    private final static int DEFAULT_CAPACITY = 10;
    private int front = 0;
    private int end = 0;
    private int size = 0;

    public CircularQueue() {
        this(DEFAULT_CAPACITY);
    }

    public CircularQueue(int capacity) {
        data = new int[capacity];
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end]=item;
        end = ++end % data.length;
        size++;
        return true;
    }

    public int remove(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty!!");
        }

        int itemToRemove = data[front];
        front = ++front % data.length;
        size--;
        return itemToRemove;
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }

        return data[front];
    }

    protected boolean isEmpty(){
        return size == 0;
    }

    protected boolean isFull() {
        return size == data.length;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Empty queue!!");
            return;
        }

        int i = front;
        do{
            System.out.print(data[i]+" ");
            i = ++i % data.length;
        }while (i!=end);

        System.out.println();
    }
}
