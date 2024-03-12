import java.util.*;
public class Main {
    public static class ListNode {
       int val;
       ListNode next;
       ListNode(int val) {
           this.val = val;
       }
   }
    public static ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int prefixSum = 0;
        Map<Integer, ListNode> prefixSumToNode = new HashMap<>();
        for (ListNode current = dummy; current != null; current = current.next) {
            prefixSum += current.val;
            if (prefixSumToNode.containsKey(prefixSum)) {
                ListNode prev = prefixSumToNode.get(prefixSum);
                ListNode toRemove = prev.next;
                int p = prefixSum + (toRemove != null ? toRemove.val : 0);
                while (p != prefixSum) {
                    prefixSumToNode.remove(p);
                    toRemove = toRemove.next;
                    p += (toRemove != null ? toRemove.val : 0);
                }
                prev.next = current.next;
            } else prefixSumToNode.put(prefixSum, current);
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode a=new ListNode(2);
        ListNode b=new ListNode(-3);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(1);
        a.next=b;
        b.next=c;
        c.next=d;
        ListNode ans=removeZeroSumSublists(head);
        while (ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
}