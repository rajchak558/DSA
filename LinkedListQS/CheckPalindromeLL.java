package LinkedListQS;

public class CheckPalindromeLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(9);
        head.next.next = new Node(5);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next.next.next = new Node(1);

        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(5);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(4);
        head1.next.next.next.next.next = new Node(5);
        head1.next.next.next.next.next.next = new Node(2);
        head1.next.next.next.next.next.next.next = new Node(1);
        boolean result=checkPalindrome(head);
        System.out.println("Palindrome: "+result);

    }
    public static boolean checkPalindrome(Node head){
        printList(head);
        Node slow=head,fast=head;
        int count=1,flag=0;
        while(fast!=null && fast.next!=null ){
            slow = slow.next;
            count += 1;
            flag++;
            fast=fast.next.next;
        }
        Node head2=reverseList(slow);
        //printList(head);
        printList(head2);
        while(head!=null && head2!=null){
            //System.out.println(head.data+" "+head2.data);
            if(head.data!=head2.data){
                return false;
            }
            head=head.next;
            head2=head2.next;
        }

        //System.out.println(slow.data+" "+count);
        return true;
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

    public static Node reverseList(Node head) {
        Node curr = head, prev = null, next;
        while (curr.next != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            if (next != null) {
                curr = next;
            }
        }
        curr.next=prev;
        return curr;
    }

}
