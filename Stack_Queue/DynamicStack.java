public class DynamicStack extends CustomStack{
   
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int val) throws StackException {
        if(this.isFull()){
            int[] temp = new int[2*data.length];
            for (int i = 0; i < data.length; i++) { 
                temp[i]=data[i];
            }
            data = temp;
        }

        return super.push(val);
    }

    
    

    

    
}
