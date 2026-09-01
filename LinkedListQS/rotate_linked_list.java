


package LinkedListQS;

public class rotate_linked_list {
    public static void main(String[]args){
        Node head= new Node(1);
        Node insert_pointer=head;
        for(int i=1;i<=10;i++){}
        head.next=new Node(5);
        head.next.next=new Node (8);
        head.next.next.next=new Node(58);
        head.next.next.next.next=new Node(6);
        head.next.next.next.next.next=new Node(4);
        System.out.println("Before rotating :  ");
        printList(head);
        head=rotate(head,9);
        System.out.println("After rotating");
        printList(head);


    }
    public static Node rotate(Node head, int k) {
        int list_count=1;
        int count=0;
        Node ptr=head,postptr=null;
        while(ptr.next!=null){
            list_count+=1;
            ptr=ptr.next;
        }
        if(k>list_count){
            k=k-list_count;
        }
        ptr=head;
        while (count<k-1){
            ptr=ptr.next;
            // System.out.println(ptr.data);
            count++;
        }
        postptr=ptr.next;
       // System.out.println("kk "+ptr.data+" "+postptr.data);
        ptr.next=null;
        Node newhead=postptr;
        while (postptr.next!=null){
            // System.out.println(postptr.data);
            postptr=postptr.next;

        }
        postptr.next=head;
       // System.out.println("Count is "+count+" "+k);
        return newhead;
    }
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            if (node.next != null)
                System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }

}