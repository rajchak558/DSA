package LinkedListQS;

import java.util.*;


// Solution class with detectLoop function
class Solution {
    // function to detect loop in linked list
    public boolean detectLoop(Node head) {
        // Initialize a pointer 'temp'
        // at the head of the linked list
        Node temp = head;

        // Create a map to keep track of
        // encountered nodes
        HashMap<Node, Integer> nodeMap = new HashMap<>();

        // Step 2: Traverse the linked list
        while (temp != null) {
            // If the node is already in the
            // map, there is a loop
            if (nodeMap.containsKey(temp)) {
                return true;
            }
            // Store the current node
            // in the map
            nodeMap.put(temp, 1);

            // Move to the next node
            temp = temp.next;
        }

        // Step 3: If the list is successfully traversed
        // without a loop, return false
        return false;
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
    public boolean detectloop_optimal(Node head){
        printList(head);
        Node fast=head,slow=head;
        HashSet<Node> set= new HashSet<>();
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            System.out.println(fast.data);
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}

// Driver class
public class loop_detection {
    public static void main(String[] args) {
        // Create a sample linked list
        // with a loop for testing
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(8);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = sixth;

        Solution sol = new Solution();

        // Check if there is a loop
        // in the linked list
        if (sol.detectloop_optimal(head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }
    }
}
