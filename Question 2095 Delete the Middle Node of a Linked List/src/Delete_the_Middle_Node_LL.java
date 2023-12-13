public class Delete_the_Middle_Node_LL {
    static class ListNode {
       int val;
       ListNode next;
       ListNode(int val) {
           this.val = val;
       }
    }
    static ListNode deleteMiddle(ListNode head) {
        ListNode slow=head, fast=head;
        if (fast.next==null) return null;
        while (fast.next.next!=null && fast.next.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(3);
        ListNode c=new ListNode(4);
        ListNode d=new ListNode(7);
        ListNode e=new ListNode(1);
        ListNode f=new ListNode(2);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        ListNode q=deleteMiddle(a);
        while (q!=null){
            System.out.print(q.val+" ");
            q=q.next;
        }
    }
}
