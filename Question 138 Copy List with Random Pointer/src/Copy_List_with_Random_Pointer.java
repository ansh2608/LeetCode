public class Copy_List_with_Random_Pointer {
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    static void display(Node a){
        Node head=a;
        while (head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
        System.out.println();
    }
    static Node copyRandomList(Node head) {
        // Step 1 : Deep Copy
        Node head2=new Node(0);
        Node temp1=head, temp2=head2;
        while (temp1!=null){
            Node t=new Node(temp1.val);
            temp2.next=t;
            temp2=t;
            temp1=temp1.next;
        }
        head2=head2.next;
        temp2=head2;
        temp1=head;

        // Step 2 : Alternate Connections
        Node temp=new Node(-1);
        while (temp1!=null){
            temp.next=temp1;
            temp1=temp1.next;
            temp=temp.next;

            temp.next=temp2;
            temp2=temp2.next;
            temp=temp.next;
        }
        temp2=head2;
        temp1=head;

        // Step 3 : Assigning Random Pointer
        while (temp1!=null){
            if (temp1.random==null) temp2.random=null;
            else temp2.random=temp1.random.next;
            temp1=temp2.next;
            if(temp1!=null) temp2=temp1.next;
        }
        temp2=head2;
        temp1=head;

        // Step 4 : Separating the Lists
        while (temp1!=null){
            temp1.next=temp2.next;
            temp1=temp1.next;
            if (temp1==null) break;
            temp2.next=temp1.next;
            if (temp2.next==null) break;
            temp2=temp2.next;
        }
        return head2;
    }
    public static void main(String[] args) {
        Node a=new Node(7);
        Node b=new Node(13);
        Node c=new Node(11);
        Node d=new Node(10);
        Node e=new Node(1);
        a.next=b;
        a.random=e.next;
        b.next=c;
        b.random=a;
        c.next=d;
        c.random=e;
        d.next=e;
        d.random=c;
        e.random=a;
        display(copyRandomList(a));
    }
}
