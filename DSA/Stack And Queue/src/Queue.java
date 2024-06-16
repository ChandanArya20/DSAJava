public class Queue {
    protected int[] data;
    private final static int DEFAULT_SIZE = 10;
    private int end=0;

    public Queue() {
        this(DEFAULT_SIZE);
    }

    public Queue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int data){
        if(isFull()){
            return false;
        }
        this.data[end++]=data;
        return true;
    }

    public int remove(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty!!");
        }

        int removedItem = data[0];

        //shifting  to delete data at first index
        for (int i = 0; i < end-1; i++) {
            data[i] = data[i+1];
        }
        end--;
        return removedItem;
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }

        return data[0];
    }

    protected boolean isEmpty(){
        return end == 0;
    }

    protected boolean isFull() {
        return end == data.length;
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}
