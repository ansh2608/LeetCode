public class Remove_Nth_Node_From_End {
    static class ListNode {
       int val;
       ListNode next;
       ListNode(int val) {
           this.val = val;
       }
    }
    static void display(ListNode head){
        ListNode temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head, fast=head;
        for (int i=1;i<=n;i++) fast=fast.next;
        if (fast==null){
            head=head.next;
            return head;
        }
        while (fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        int n=5;
        display(a);
        b=removeNthFromEnd(a,n);
        display(b);
    }
}
