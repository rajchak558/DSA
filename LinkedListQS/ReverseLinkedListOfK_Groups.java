package LinkedListQS;
/*Given the head of a singly linked list containing integers, reverse the nodes
of the list in groups of k and return the head of the modified list. If the
number of nodes is not a multiple of k, then the remaining nodes at the end
should be kept as is and not reversed.
Do not change the values of the nodes, only change the links between nodes.

Input : head -> 1 -> 2 -> 3 -> 4 -> 5, k = 2
Output :head -> 2 -> 1 -> 4 -> 3 -> 5
Explanation :The groups 1 -> 2 and 3 -> 4 were reversed as 2 -> 1 and 4 -> 3.

Input :head -> 1 -> 2 -> 3 -> 4 -> 5, k = 3
Output :head -> 3 -> 2 -> 1 -> 4 -> 5
Explanation :The groups 1 -> 2 -> 3 were reversed as 3 -> 2 -> 1.
Note that 4 -> 5 was not reversed.*/
public class ReverseLinkedListOfK_Groups {
    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(15);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = new Node(5);
        //printList(head);
        head=solution_bruteforce(head,2);
        printList(head);


    }
    public static Node solution_bruteforce(Node head,int group){
        //1 -> 2 -> 15 -> 4 -> 9 -> 5
        Node curr=head;
        Node newheads[]=new Node[100];
        int flag=2,index=0;
        while(curr!=null){
            if(flag-group==0){
                newheads[index]=curr;
                flag=0;
                index++;
            }
            curr=curr.next;
            flag++;
        }
        for(Node i:newheads){
            reverse_group(i,group);
        }

        return  null;
    }
    public static Node reverse_group(Node head,int group){
        //  null    <- 1(p) 2(c) ->15(n)   -> 9
        Node curr=head;
        Node prev=null;
        Node next=curr.next;
        while(group>1){
            curr.next=prev;
            prev=curr;
            curr=next;
            next=curr.next;
            group--;
        }
        printList(next);
        return null;
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
