public class LL_Cycle {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    static ListNode detectCycle(ListNode head) {
        ListNode slow=head,fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (fast==slow) break;
        }
        if(fast==null || fast.next==null) return null;
        ListNode temp=head;
        while (temp!=slow){
            temp=temp.next;
            slow=slow.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(3);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(0);
        ListNode d=new ListNode(-4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=b;
        ListNode q=detectCycle(a);
        System.out.println(q.val);
    }
}
