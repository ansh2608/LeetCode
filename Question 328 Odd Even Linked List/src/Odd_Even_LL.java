public class Odd_Even_LL {
    static class ListNode {
       int val;
       ListNode next;
       ListNode(int val) {
           this.val = val;
       }
    }
    static ListNode oddEvenList(ListNode head){
        if (head==null) return head;
        ListNode odd=head,even=head.next,evenHead=even;
        while (even!=null && even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(2);
        ListNode b=new ListNode(1);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(5);
        ListNode e=new ListNode(6);
        ListNode f=new ListNode(4);
        ListNode g=new ListNode(7);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        ListNode ans=oddEvenList(a);
        while (ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
}
