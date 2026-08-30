package LinkedListQS;

public class middle_element_of_linkedlist {
    public static void main(String [] args){
        Node head= new Node(1);
        Node insert_pointer=head;
        for(int i=1;i<=10;i++){}
        head.next=new Node(5);
        head.next.next=new Node (8);
        head.next.next.next=new Node(58);
        head.next.next.next.next=new Node(6);
        head.next.next.next.next.next=new Node(4);
        System.out.println("Before traversing :  ");
        printList(head);
        int middle_node=middleElement_optimal(head);
        System.out.println("Middle element : "+middle_node);


    }
    public static int middleElement_bruteforce(Node head){
        Node ptr=head;
        int count=0;
        while(ptr.next!=null){
            ptr=ptr.next;
            count+=1;
        }
        ptr=head;
        int i=0;
        while (i<=count/2 ){
            ptr=ptr.next;
            i+=1;
        }
        return ptr.data;
    }
    public static int middleElement_optimal(Node head){
        Node singlejump=head,doublejump=head;
        while (doublejump.next!=null && doublejump.next.next!=null){
            singlejump=singlejump.next;
            doublejump=doublejump.next.next;
        }
        if (doublejump.next!=null ){
            return singlejump.next.data;
        }
        return singlejump.data;
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
