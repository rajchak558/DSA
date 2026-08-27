package LinkedListQS;

public class LengthOfALoopInLL {
    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(15);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(13);
        head.next.next.next.next.next.next.next = new Node(16);
        head.next.next.next.next.next.next.next.next = new Node(19);
        head.next.next.next.next.next.next.next.next.next = new Node(65);
        //head.next.next.next.next.next.next.next.next.next.next = head.next.next.next;
        //head.next.next.next.next.next.next.next.next.next.next= head.next.next;
        System.out.println("The length of the loop in the list is: "+detectLength_loop(head));

    }
    public static int detectLength_loop(Node head){
        Node fast=head;
        Node slow=head;
        int loop_l=0;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            loop_l++;
            if(fast==slow){
                return loop_l;
            }
        }
        return 0;
    }
}
