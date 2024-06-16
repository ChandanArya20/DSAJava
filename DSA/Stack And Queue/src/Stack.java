public class Stack {
    protected int[] data;
    private final static int DEFAULT_SIZE = 10;
    private int topIndex=-1;

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        this.data = new int[size];
    }

    public boolean push(int data){
        if(isFull()){
            return false;
        }
        this.data[++topIndex]=data;
        return true;
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty!!");
        }
        return data[topIndex--];
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty!!");
        }
        return data[topIndex];
    }

    protected boolean isEmpty(){
        return topIndex == -1;
    }

    protected boolean isFull() {
        return topIndex == data.length-1;
    }
}
