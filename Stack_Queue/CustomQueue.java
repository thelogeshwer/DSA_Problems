public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    int end = 0;

    public boolean isFull(){
        return (end == data.length);
    }
    public boolean isEmpty(){
        return (end == 0);
    }

    public boolean add(int val) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }
        
        data[end++] = val;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        int removed = data[0];
        for(int i=1; i<end; i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }


    
}
