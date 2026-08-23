package LinkedListQS;

class Node {
    int data;
    Node next;
    Node next1;

    Node(int x) {
        data = x;
        next = null;
        next1 = null;
    }

    // Constructor with both data
    // and next node as parameters
    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    // Constructor with only data as
    // a parameter, sets next to null

}
