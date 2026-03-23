public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    int ptr =-1;

    public boolean isFull(){
        return (ptr == data.length-1);
    }
    public boolean isEmpty(){
        return (ptr == -1);
    }

    public boolean push(int val) throws StackException{
        if(isFull()){
            throw new StackException("Stack is full");
        }
        ptr++;
        data[ptr] = val;
        return true;
    }

    public int peek() throws StackException{
        if(isEmpty()) throw new StackException("Stack is empty");

        return data[ptr];
    }

    public int pop() throws StackException{
        if(isEmpty()) throw new StackException("Stack is empty");
        int removed = data[ptr--];
        return removed;
    }







    
    
}
