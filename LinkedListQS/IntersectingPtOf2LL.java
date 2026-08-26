package LinkedListQS;

import java.util.HashSet;

public class IntersectingPtOf2LL {
    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next.next = new Node(8);

        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next =head.next.next.next;
        printList(head);
        printList(head1);
        Node result=optimal(head,head1);
        System.out.println(result.data +" is the intersecting point present");

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
    public static Node  intersecting_point(Node head1,Node head2){
        Node curr1=head1;
        while(curr1!=null){
            Node curr2=head2;
            while (curr2!=null){
                if(curr1==curr2){
                    return curr1;
                }
                curr2=curr2.next;
            }
            curr1=curr1.next;
        }
        return null;
    }
    public static Node optimal(Node head1,Node head2){
        HashSet<Node> set =new HashSet<>();
        Node curr1=head1,curr2=head2;
        while(curr1!=null && curr2!=null){

            if( !set.contains(curr1) && !set.contains(curr2)){
                set.add(curr1);
                set.add(curr2);
            }
            else if(set.contains(curr1) || set.contains(curr2)){
                if(set.contains(curr1)){
                    return curr1;
                }
                else if(set.contains(curr2)){
                    return curr2;
                }
            }
            System.out.println();
            curr1=curr1.next;
            curr2=curr2.next;
        }
        return null;
    }
}
