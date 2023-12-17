public class Palindrome_LL {
    static class ListNode {
       int val;
       ListNode next;
       ListNode(int val) {
           this.val = val;
       }
    }

    static ListNode reverse(ListNode head){
        ListNode prev=null,after=null,curr=head;
        while (curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }
    static boolean is_Palindrome(ListNode head) {
        ListNode slow=head,fast=head;
        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=reverse(slow.next);
        slow.next=temp;
        ListNode p1=head,p2=slow.next;
        while (p2!=null){
            if (p1.val!= p2.val) return false;
            p1=p1.next;
            p2=p2.next;
        }
        return true;
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(1);
        ListNode c=new ListNode(2);
        ListNode d=new ListNode(1);
        a.next=b;
        b.next=c;
        c.next=d;
        System.out.println(is_Palindrome(a));
    }
}