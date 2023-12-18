public class Remove_LL {
    static class ListNode {
       int val;
       ListNode next;
       ListNode(int val) {
           this.val = val;
       }
    }
    static ListNode removeElements(ListNode head, int val){
        while (head!=null && head.val==val) head=head.next;
        ListNode temp=head;
        while (temp!=null && temp.next!=null){
            if (temp.next.val==val) temp.next=temp.next.next;
            else temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(7);
        ListNode b=new ListNode(7);
        ListNode c=new ListNode(7);
        ListNode d=new ListNode(1);
        a.next=b;
        b.next=c;
        c.next=d;
        ListNode ans=removeElements(a,7);
        while (ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
}
