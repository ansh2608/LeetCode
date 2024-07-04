public class Main {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    public static ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0), cur = dummy;
        head=head.next;
        int sum=0;
        while (head != null){
            if(head.val == 0){
                cur.next = head;
                head.val = sum;
                cur = cur.next;
                sum = 0;
            }
            else sum += head.val;
            head =head.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(0);
        ListNode a=new ListNode(3);
        ListNode b=new ListNode(1);
        ListNode c=new ListNode(0);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(5);
        ListNode f=new ListNode(2);
        ListNode g=new ListNode(0);
        head.next=a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        ListNode ans=mergeNodes(head);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
}