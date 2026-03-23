package LinkedListDSA;


public class ReverseLLUsingRecursion {

    int data;
    ReverseLLUsingRecursion next;

    public ReverseLLUsingRecursion(int data){
        this.data =data;
        this.next=null;
    }

    static void print(ReverseLLUsingRecursion head){
        ReverseLLUsingRecursion temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }

    public static ReverseLLUsingRecursion ConvertArr2LL(int[] arr){
        ReverseLLUsingRecursion head = new ReverseLLUsingRecursion(arr[0]);
        ReverseLLUsingRecursion mover = head;
        for (int i = 1; i < arr.length; i++) {
            ReverseLLUsingRecursion temp = new ReverseLLUsingRecursion(arr[i]);
            mover.next = temp;
            mover=temp;            
        }
        return head;
    }
    //This can be done with using stack DS, but space complexity(stack) and  time complexity(ConvertArr2LL)
    // is there so optimal order to reduce space complexity to achieve B(O) = o(n);
    public static ReverseLLUsingRecursion ReverseLL(ReverseLLUsingRecursion head){
        if(head==null || head.next==null){
            return head;
        }

        ReverseLLUsingRecursion newhead= ReverseLL(head.next);
        ReverseLLUsingRecursion front = head.next;
        front.next=head;
        head.next=null;
        return newhead;

        
    }
    




    public static void main(String[] args) {

        int[] arr = {1,3,2,4,6};

        ReverseLLUsingRecursion head= ConvertArr2LL(arr);
        head = ReverseLL(head);
        print(head);
        
        

    }
}
