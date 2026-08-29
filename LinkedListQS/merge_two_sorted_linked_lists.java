package LinkedListQS;

public class merge_two_sorted_linked_lists {
    public static void main(String []args){
        Node head= new Node(1);
        //Node insert_pointer=head;

        head.next=new Node(2);
        head.next.next=new Node (5);
        head.next.next.next=new Node(9);
        head.next.next.next.next=new Node(49);
        head.next.next.next.next.next=new Node(50);

        Node head1= new Node(3);
        //Node insert_pointer=head;
        //for(int i=1;i<=10;i++){}
        head1.next=new Node(4);
        head1.next.next=new Node (8);
        head1.next.next.next=new Node(33);
        head1.next.next.next.next=new Node(39);
        head1.next.next.next.next.next=new Node(47);
        reverse_linked_list ob = new reverse_linked_list();
        ob.printList(head);
        ob.printList(head1);
        Node newhead=sortedMerge_my(head,head1);
        ob.printList(newhead);
    }
    public static Node mergeSorted_bruteforce(Node head1,Node head2){
        Node ptr1=head1,nextptr1;
        Node ptr2=head2,nextptr2;
        Node newhead;
        if(head1.data< head2.data){
            newhead=head1;
            ptr1= ptr1.next;
        }
        else{
            newhead=head2;
            ptr2=ptr2.next;
        }
        Node newptr=newhead;
        System.out.println("ptr1 ptr2 newptr "+ptr1.data+" "+ptr2.data+" "+newptr.data);

          if(newptr==head1) {
               while (ptr1.next != null) {
                   if (ptr1.data < ptr2.data) {
                       if (ptr1.next != null) {
                           ptr1 = ptr1.next;
                       }
                       newptr = newptr.next;
                       System.out.println(newptr.data);
                   } else if (ptr2.data < ptr1.data) {
                       Node temp = new Node(2);
                       temp.data = ptr2.data;
                       temp.next = ptr1;
                       newptr.next = temp;
                       newptr = temp;
                       ptr2 = ptr2.next;
                       System.out.println(newptr.data);
                   }

               }

               if (ptr1.next == null && ptr2.next != null) {
                   ptr1.next = ptr2;
               }
           }

           /*else if(newptr==head2){
               while (ptr2.next != null) {
                   if (ptr2.data < ptr1.data) {
                       ptr2 = ptr1.next;
                       newptr = newptr.next;
                   } else if (ptr1.data < ptr2.data) {
                       Node temp = newptr.next;
                       temp.data = ptr1.data;
                       temp.next = ptr2;
                       newptr = temp;
                       ptr1 = ptr1.next;
                   }
               }
               if (ptr2.next == null && ptr1.next != null) {
                   ptr2.next = ptr1;
               }
           }*/


        return newhead;

    }
    static Node sortedMerge(Node head1, Node head2) {

        Node dummy = new Node(-1);
        Node curr = dummy;
        while (head1 != null && head2 != null) {
            // add the smaller node to the merged list
            if (head1.data <= head2.data) {
                curr.next = head1;
                head1 = head1.next;
            } else {
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }
        if (head1 != null) {
            curr.next = head1;
        } else {
            curr.next = head2;
        }
        return dummy.next;
    }
    static void printList(Node curr) {
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null)
                System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static Node sortedMerge_my(Node head1,Node head2){
        Node newhead=null,curr=null;
        if (head1.data>head2.data){
            newhead=head2;
            head2=head2.next;
        }
        else{newhead=head1;head1=head1.next;}
        curr=newhead;
        while(head1!=null && head1!=null){
            if(head1!=null && head2!=null) {
                if(head1.data<head2.data){
                curr.next=head1;
                head1=head1.next;
                curr=curr.next;
            }
            else if(head2.data<head1.data){
                curr.next=head2;
                head2=head2.next;
                curr=curr.next;
            }}




            if(head1==null && head2!=null){
                curr.next=head2;
                head2=head2.next;
                curr=curr.next;
            }
            if(head1!=null && head2==null){
                curr.next=head1;
                head1=head1.next;
                curr=curr.next;
            }
        }
        //printList(newhead);
        return newhead;
    }

}
