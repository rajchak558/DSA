package LinkedListQS;
import java.util.HashSet;
public class StartingPointOfALoop {
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
        head.next.next.next.next.next.next.next.next.next = head.next.next.next;



        // Creating a cycle (tail connects to node index 1)
       head.next.next.next.next.next = head.next;

    Solution1 obj = new Solution1();
    Node startNode = detectCycle(head);
    if (startNode != null)
    {
        System.out.println("Cycle starts at node with value: " + startNode.data);
    }
    else{
        System.out.println("No cycle found.");}
}
    public static Node detectCycle(Node head){
        HashSet<Node> set =new HashSet<>();
        Node curr=head; // A new Pointer current set to head
        Node result=null;// result pointer to store the start point
        while(curr.next!=null){
            if(!set.contains(curr)) { // If hashset doesnt have value then
                                      //  node added to HashSet
                set.add(curr);

            } else if (set.contains(curr)) { //If HashSet have the value then
                                             //curr stored in result and loop broken
                result= curr;
                break;
            }
            curr=curr.next; // Node traversd to next node
        }
        return result;
    }


}



class Solution1 {
    // Function to detect the starting point of loop using Floyd’s algorithm
    public ListNode detectCycle(ListNode head) {
        // Initialize slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;

        // Traverse while fast and fast.next are not null
        while (fast != null && fast.next != null) {
            // Move slow one step
            slow = slow.next;

            // Move fast two steps
            fast = fast.next.next;

            // If they meet, cycle is present
            if (slow == fast) {
                // Reset slow to head
                slow = head;

                // Move both one step to find start of loop
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                // Return the starting node of loop
                return slow;
            }
        }

        // If no cycle found
        return null;
    }
}

 class Main {
    public static void main(String[] args) {
        // Create nodes
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        // Create cycle: last node connects to node with value 2
        head.next.next.next.next = head.next;

        Solution1 obj = new Solution1();
        ListNode result = obj.detectCycle(head);

        if (result != null)
            System.out.println("Cycle starts at node with value: " + result.val);
        else
            System.out.println("No cycle found.");
    }
}
