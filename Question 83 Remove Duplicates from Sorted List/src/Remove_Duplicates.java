public class Remove_Duplicates {
    static class ListNode {
       int val;
       ListNode next;
       ListNode(int val) {
           this.val = val;
       }
    }
    static ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        while (temp!=null){
            if (temp.next==null) break;
            if (temp.val==temp.next.val) temp.next=temp.next.next;
            else temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(1);
        ListNode c=new ListNode(2);
        a.next=b;
        b.next=c;
        ListNode ans=deleteDuplicates(a);
        while (ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
}
