package LinkedListQS;

public class reverse_linked_list {/*
*You are given the head of a singly linked list.
*You have to reverse the linked list and return the head
*of the reversed list.

Input: 2-> 7-> 10-> 9-> 8
Output: 8 -> 9 -> 10 -> 7 -> 2
Explanation: After reversing the linked list

Constraints:
1 ≤ number of nodes ≤ 105
1 ≤ node->data ≤ 105

Expected Complexities
*/
    public static void main(String [] args){
        Node head= new Node(1);
        head.next=new Node(5);
        head.next.next=new Node (8);
        head.next.next.next=new Node(58);
        head.next.next.next.next=new Node(6);
        head.next.next.next.next.next=new Node(4);
        System.out.println("Before traversing :  ");
        printList(head);
        head=reverseList(head);
        System.out.println("After traversing :  ");
        printList(head);

    }
    public static Node reverseList(Node head) {
        Node curr = head, prev = null, next=null;
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
