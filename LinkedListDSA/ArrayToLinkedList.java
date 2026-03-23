package LinkedListDSA;

public class ArrayToLinkedList {

        int data;
        ArrayToLinkedList next;

    ArrayToLinkedList(int data){
        this.data=data;
        this.next=null  ;
    }

    public static ArrayToLinkedList convertArr2LL(int[] arr){
        ArrayToLinkedList head = new ArrayToLinkedList(arr[0]);
        ArrayToLinkedList mover = head;
        for (int i = 1; i < arr.length; i++) {
            ArrayToLinkedList nextindex = new ArrayToLinkedList(arr[i]);
            mover.next=nextindex;
            mover = nextindex;
        }
        return head;
    }

    public static int LengthOfList(ArrayToLinkedList head){
        int count = 0;

         ArrayToLinkedList temp = head;
         while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;

    }

    public static int SearchByValue(ArrayToLinkedList head, int value){
        ArrayToLinkedList temp = head;
        while(temp!=null){
            if(temp.data == value) return 1;

            temp=temp.next;
        }
        return 0;

    }





    public static void main(String[] args) {

        int[] arr = {4,2,3,1,5};
        ArrayToLinkedList head = convertArr2LL(arr);

        ArrayToLinkedList temp = head;
        while(temp!=null){
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();


        System.out.println(LengthOfList(head));
        System.out.println(SearchByValue(head , 6));


        

        



    }


     
    
}
