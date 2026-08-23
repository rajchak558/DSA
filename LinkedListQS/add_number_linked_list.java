package LinkedListQS;

public class add_number_linked_list {
    public static void main(String[]args){
        Node head1= new Node(2);
        head1.next=new Node(9);
        head1.next.next=new Node (6);
        head1.next.next.next=new Node(1);
        head1.next.next.next.next=new Node(7);
        head1.next.next.next.next.next=new Node(7);

        Node head2= new Node(0);
        head2.next=new Node(9);
        head2.next.next=new Node (0);
        head2.next.next.next=new Node(8);
        head2.next.next.next.next=new Node(0);
        head2.next.next.next.next.next=new Node(4);
        printList(head1);
        printList(head2);
        Node newhead=addTwoLists(head1,head2);
        System.out.println("After rotating");
        printList(newhead);
    }
    public static Node addTwoLists(Node head1, Node head2) {
        int num1 = list_to_int(head1);
        int num2 = list_to_int(head2);
        System.out.println(num1 + " " + num2+" "+(num1+num2));
        int sum = num1 + num2;
        Node newhead=new Node(0);
        Node dummy=newhead;
        String s = Integer.toString(sum);
        System.out.println(sum+" "+s.length()+" "+(int)(sum/(Math.pow(10,s.length()-1)))+" "+((int)(sum%(Math.pow(10,s.length()-1)))));
        int count = 0;
        int range =s.length()-1;
        while (sum > 0) {
            int num = (int) (sum / (Math.pow(10, range)));
            System.out.println(num);
            newhead.next = new Node(num);
            newhead=newhead.next;
            sum = (int) (sum % (Math.pow(10, range)));
            System.out.println(sum);
            range--;
        }
        return dummy;
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
    public static int list_to_int(Node head){
        int number=0,flag=0;
        Node ptr=head;
        while(ptr!=null){
            int i= ptr.data;
            //System.out.println(ptr.data);
            if(i==0){
                flag++;
                if (flag==1 & ptr==head){
                    number=0;
                } else if (flag>1) {
                    number*=10;
                }
            }
            else if (i!=0) {
                number=(10*number)+i;

            }

            ptr=ptr.next;
        }
        return number;
    }
}
