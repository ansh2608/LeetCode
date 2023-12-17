public class Maximum_Twin_Sum_LL {
    static class ListNode {
       int val;
       ListNode next;
       ListNode(int val) {
            this.val = val;
       }
    }
    static int pairSum(ListNode head) {
        ListNode slow=head,fast=head;
        int sum=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null,Next=null;
        while(slow!=null){
            Next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=Next;
        }
        while(prev!=null){
            sum=Math.max(sum,head.val+prev.val);
            prev=prev.next;
            head=head.next;
        }
        return sum;
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(4);
        ListNode b=new ListNode(1);
        ListNode c=new ListNode(10);
        ListNode d=new ListNode(1);
        a.next=b;
        b.next=c;
        c.next=d;
        System.out.println(pairSum(a));
    }
}
