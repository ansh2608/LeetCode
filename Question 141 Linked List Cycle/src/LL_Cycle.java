public class LL_Cycle {
    static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
           val = x;
           next = null;
       }
    }
    static boolean hasCycle(ListNode head) {
        if (head==null || head.next==null) return false;
        ListNode slow=head,fast=head;
        while (fast!=null){
            if (slow==null || fast.next==null) return false;
            slow=slow.next;
            fast=fast.next.next;
            if (fast==slow) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        System.out.print(hasCycle(a));
    }
}
