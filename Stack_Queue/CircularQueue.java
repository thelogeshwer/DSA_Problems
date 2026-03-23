public class CircularQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    protected int end = 0;
    protected int front =0;
    private int size = 0;

    public boolean isFull(){
        return (size == data.length);
    }
    public boolean isEmpty(){
        return (size == 0);
    }

    public boolean add(int val) throws Exception{
        if(isFull()) throw new Exception("Queue is full");
        data[end++] = val;
        size++; 
        end = end % data.length;

        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()) throw new Exception("Queue is empty");

        int removed = data[front++];
        size--;
        front = front% data.length;
        return removed;

    }

    public void display() throws Exception{
        if(isEmpty()) throw new Exception("Queue is empty");

        int i = front;
        do{
            System.out.print(data[i] + " ");
            i++;
            i= i% data.length;
        }
        while(i!= end);
        System.out.println();

    }


    
}
