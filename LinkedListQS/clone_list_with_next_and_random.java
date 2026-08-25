package LinkedListQS;

public class clone_list_with_next_and_random {
    public static void main(String[] args) {

        // Creating a linked list with random pointer
        Node1 head = new Node1(1);
        head.next = new Node1(2);
        head.next.next = new Node1(3);
        head.next.next.next =  new Node1(4);
        head.next.next.next.next = new Node1(5);
        head.random = head.next.next;
        head.next.random = head;
        head.next.next.random = head.next.next.next.next;
        head.next.next.next.random = head.next.next;
        head.next.next.next.next.random = head.next;

        // Print the original list
        System.out.println("Original linked list:");
        printList(head);

        Node1 clonedList = cloneLinkedList(head);

        System.out.println("Cloned linked list:");
        printList(clonedList);
    }
    static void printList(Node1 head) {
        while (head != null) {
            System.out.print(head.data + "(");
            if (head.random != null) {
                System.out.print(head.random.data);
            } else {
                System.out.print("null");
            }
            System.out.print(")");

            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }
    static void printList1(Node node) {
        while (node != null) {
            System.out.print(node.data);
            if (node.next != null)
                System.out.print(" -> ");
            node = node.next;
        }

        System.out.println();
    }
    public static Node cloneLinkedList1(Node1 head) {
        // code here
        Node newhead=new Node(head.data);
        Node current=newhead;
        Node1 ptr=head;
        while(ptr!=null){
            Node1 temp=head;
            while(temp!=ptr.random){
                temp=temp.next;
            }
            Node next=new Node(temp.data);
            current.next=next;
            current=next;
            ptr=ptr.next;
        }
        return newhead;

    }
    public static Node1 cloneLinkedList(Node1 head) {
        if (head == null) {
            return null;
        }

        // Create new nodes and insert them
        // next to the original nodes
        Node1 curr = head;
        while (curr != null) {
            Node1 newNode = new Node1(curr.data);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }

        // Set the random pointers of the new nodes
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // Separate the new nodes from the original nodes
        curr = head;
        Node1 clonedHead = head.next;
        Node1 clone = clonedHead;
        while (clone.next != null) {

            // Update the next nodes of original node
            // and cloned node
            curr.next = curr.next.next;
            clone.next = clone.next.next;

            // Move pointers of original and cloned
            // linked list to their next nodes
            curr = curr.next;
            clone = clone.next;
        }
        curr.next = null;
        clone.next = null;

        return clonedHead;
    }


}
