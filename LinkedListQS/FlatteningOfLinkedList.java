package LinkedListQS;
/*
* Problem Statement: Given a linked list containing ‘N’ head nodes where
* every node in the linked list contains two pointers:

‘Next’ points to the next node in the list
‘Child’ pointer to a linked list where the current node is the head

Each of these child linked lists is in sorted order and connected by a
* 'child' pointer. Your task is to flatten this linked list such that all
* nodes appear in a single layer or level in a 'sorted order'.*/
class ListNode {
    int val;
    ListNode next;
    ListNode child;

    ListNode() {
        val = 0;
        next = null;
        child = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        child = null;
    }

    ListNode(int data1, ListNode next1, ListNode child1) {
        val = data1;
        next = next1;
        child = child1;
    }
}
class NNode{
    int data;
    NNode next;
    NNode(int data,NNode next){
        this.data =data;
        this.next=next;
    }
}

public class FlatteningOfLinkedList {
    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.child;
        }
        System.out.println();
    }

    // Print the original linked list in a grid-like structure
    public static void printOriginalLinkedList(ListNode head, int depth) {
        while (head != null) {
            System.out.print(head.val);
            if (head.child != null) {
                System.out.print(" -> ");
                printOriginalLinkedList(head.child, depth + 1);
            }
            if (head.next != null) {
                System.out.println();
                for (int i = 0; i < depth; ++i) {
                    System.out.print("| ");
                }
            }
            head = head.next;
        }
    }

    public static void main(String[] args) {
        // Create linked list with child pointers
        ListNode head = new ListNode(5);
        head.child = new ListNode(14);

        head.next = new ListNode(10);
        head.next.child = new ListNode(4);

        head.next.next = new ListNode(12);
        head.next.next.child = new ListNode(20);
        head.next.next.child.child = new ListNode(13);

        head.next.next.next = new ListNode(7);
        head.next.next.next.child = new ListNode(17);

        // Print original list
        System.out.println("Original linked list:");
        printOriginalLinkedList(head, 0);

        // Flatten and print
        //Solution sol = new Solution();
        ListNode flattened = flattenLinkedList(head);
        System.out.print("\nFlattened linked list: ");
        printLinkedList(flattened);
    }
    public static ListNode flattenLinkedList(ListNode head){
        ListNode result_head=new ListNode();
        result_head.val=head.val;
        ListNode curr=head;
        while(curr!=null){

        }


        return null;
    }
}
