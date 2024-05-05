public class Main {
    public static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
           val = x;
       }
   }
    public static void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(4);
        ListNode a=new ListNode(5);
        ListNode b=new ListNode(1);
        ListNode c=new ListNode(9);
        head.next=a;
        a.next=b;
        b.next=c;
        ListNode node=new ListNode(5);
        deleteNode(node);
        while (head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
    }
}