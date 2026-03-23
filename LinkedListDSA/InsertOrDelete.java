package LinkedListDSA;


public class InsertOrDelete {

    int data;
    InsertOrDelete next;

    InsertOrDelete(int data){
        this.data=data;
        this.next=null;
    }

    public InsertOrDelete(int data, InsertOrDelete next) {
        this.data=data;
        this.next=next;
    }




    public static InsertOrDelete convertArr2LL(int[] arr){
        InsertOrDelete head = new InsertOrDelete(arr[0]);
        InsertOrDelete mover = head;
        for (int i = 1; i < arr.length; i++) {
            InsertOrDelete nextindex = new InsertOrDelete(arr[i]);
            mover.next=nextindex;
            mover = nextindex;
        }
        return head;
    }


    public static void printHead(InsertOrDelete head){
        while(head!=null){            
            System.out.print(head.data + " ");         
            head = head.next;   
        }
        System.out.println();
    }

    public static InsertOrDelete removeHead(InsertOrDelete head){
        if(head==null) return head; //this is additinal
        head = head.next;

        return head; 
    }

    public static InsertOrDelete removeTail(InsertOrDelete head){
        InsertOrDelete temp = head;
        if(head ==null || head.next== null ) return null;
        while(temp.next.next != null){
            temp= temp.next;
        }
        temp.next = null;
        return head;
    }

    public static InsertOrDelete removeK(InsertOrDelete head, int k){
        if(head==null) return head;
        if(k==1){
            head=head.next;
            return head;
        }
        int count = 0;
        InsertOrDelete prev = null;
        InsertOrDelete temp = head;
        while(head!=null){
            count++;
            if(count==k){
                prev.next=prev.next.next;
                break;
            }
            prev= temp;
            temp=temp.next;
        }
        return head;
    }

    public static InsertOrDelete removeElement(InsertOrDelete head, int el){
        if(head==null) return head;
        if(head.data==el){
            head=head.next;
            return head;
        }
        InsertOrDelete prev = null;
        InsertOrDelete temp = head;
        while(head!=null){
            if(temp.data==el){
                prev.next=prev.next.next;
                break;
            }
            prev = temp;
            temp=temp.next;
        }
        return head;
    }

    public static InsertOrDelete AddNewHead(InsertOrDelete head, int val){
        InsertOrDelete temp= new InsertOrDelete(val);
        temp.next = head;
        return temp;
    }

    public static InsertOrDelete AddNewTail(InsertOrDelete head, int val){
        InsertOrDelete temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        InsertOrDelete newNode =new InsertOrDelete(val);
        temp.next = newNode;
        return head;

    }

    public static InsertOrDelete insertKElement(InsertOrDelete head, int k, int val){
        if(head==null){
            if(k==1){
                return new InsertOrDelete(val);
            }
            else return head;
        }    
        if(k==1)  return new InsertOrDelete(val, head);
        InsertOrDelete temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            if(count==(k-1)){
                InsertOrDelete newnode = new InsertOrDelete(val);
                newnode.next=temp.next;
                temp.next=newnode;
                return head;   
            }
            temp = temp.next;
        }
        return head;
    }

    public static InsertOrDelete insertElement(InsertOrDelete head, int element, int val){
        if(head==null) return head;
        if(head.data == val) return new InsertOrDelete(element, head);

        InsertOrDelete temp=head;
        while(temp.next!=null){
            if(temp.next.data==val){
                InsertOrDelete newnode = new InsertOrDelete(element,temp.next);
                temp.next=newnode;
                break;
            }
            temp=temp.next;
        }
        return head;
        
    }

    



    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        InsertOrDelete head = convertArr2LL(arr);
        InsertOrDelete temp = head;
        while (temp!= null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        head = AddNewHead(head, 0);
        head = AddNewTail(head,10);
        head = insertKElement(head, 12, 66);
        head = insertElement(head, 11, 66);
        printHead(head);    
    }
}
