public class Main {
    public static class ListNode {
       int val;
       ListNode next;
       ListNode(int val) {
           this.val = val;
       }
   }
    public static ListNode removeNodes(ListNode head) {
        if (head==null) return null;
        ListNode node=head;
        ListNode nextGreater=removeNodes(node.next);
        node.next=nextGreater;
        if (nextGreater==null || node.val>= nextGreater.val) return node;
        return nextGreater;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(5);
        ListNode a=new ListNode(2);
        ListNode b=new ListNode(13);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(8);
        head.next=a;
        a.next=b;
        b.next=c;
        c.next=d;
        ListNode ans=removeNodes(head);
        while (ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
}