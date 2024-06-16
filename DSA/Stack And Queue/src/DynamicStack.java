public class DynamicStack extends Stack{

    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int val) {
        if (isFull()){
            //make a double size of data array
            int[] temp = new int[data.length*2];

            //copy the data array
            System.arraycopy(data, 0, temp, 0, data.length);

            data = temp;
        }

        return super.push(val);
    }
}
