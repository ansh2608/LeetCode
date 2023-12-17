public class Using_Extra_Space {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    static ListNode reverse(ListNode head){
        ListNode prev=null,curr=head,after=null;
        while (curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }
    static boolean isP(ListNode head){
        ListNode rev=reverse(head);
        ListNode temp=head;
        while (temp!=null){
            if (temp.val== rev.val){
                return true;
            }
            temp=temp.next;
            rev=rev.next;
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(2);
        ListNode d=new ListNode(1);
        a.next=b;
        b.next=c;
        c.next=d;
        System.out.println(isP(a));
    }
}
