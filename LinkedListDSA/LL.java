
public class LL {// also double LL
    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.prev = null;
        node.next = head;
        if(head!=null){
            head.prev=node;
        }
        head = node;
    }

    public void insertLast(int val){
        Node node =  new Node(val);
        Node last =head;
        node.next = null;

        if(head==null){
            node.prev = null;
            head = node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }

        node.prev = last;
        last.next = node;
        last = node;        

    }

    public void display(){
        Node node = head;
        while(node!=null){
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println();
    }

    public Node find(int val){
        Node node = head;
        while (node != null) {
            if(node.val == val){return node;}
            node = node.next;
        }
        return null;
    }

    public void insert(int after, int val){
        Node node = new Node(val);
        Node p = find(after);
        if(p==null) System.out.println("does not exist");
        node.next = p.next;
        node.prev=p;
        p.next = node;
        if(node.next.prev != null){
            node.next.prev = node;
        }

    }


    
     public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(7);
        list.insertFirst(2); 
        list.insertFirst(4);
        list.insertFirst(9);
        list.insertLast(100);
        list.display();
        list.insert(2, 50);
        list.display();

    }

     class Node {
        int val;
        Node prev;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, LL.Node prev, LL.Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }    
        
    }
    
}
