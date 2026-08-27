package LinkedListQS;

public class link_list_group_reverse {
    public static void main(String[]args){
        Node head= new Node(1);
        head.next=new Node(5);
        head.next.next=new Node (8);
        head.next.next.next=new Node(18);
        head.next.next.next.next=new Node(6);
        head.next.next.next.next.next=new Node(4);
        System.out.println("Before rotating :  ");
        printList(head);
        head=reverseKGroup(head,5);
        System.out.println("After rotating");
        printList(head);
    }
    public static Node reverseKGroup(Node head, int k) {
        int count=1;
        Node ptr=head;
        Node  curr,prev,next;
        Node postptr=new Node(-1);
        //1 -> 5 -> 8 -> 18 -> 6 -> 4
        while (count<k){
            ptr=ptr.next;
            count++;
        }
        System.out.println(ptr.data);
        postptr=ptr.next;
        curr=head;
        prev=postptr;
        next=curr.next;
        //    18(postptr,) <-1 (,)  <- 5(,prev)  <- 8(ptr,next,curr)  18(postptr.prev) -> 6 -> 4
        ptr.next=null;
        while(curr!=ptr){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(curr.next!=null)
                next=curr.next;
        }
        curr.next=prev;
        return curr;
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
