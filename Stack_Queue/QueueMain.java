public class QueueMain {
    public static void main(String[] args) throws Exception{
        CircularQueue q = new DynamicQueue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.display();
        System.out.println(q.remove());
        q.add(100);
        q.display();
       

       

        

    }

    
}
