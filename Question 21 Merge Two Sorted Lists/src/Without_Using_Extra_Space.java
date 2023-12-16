public class Without_Using_Extra_Space {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1,temp2=list2;
        ListNode head=new ListNode(100);
        ListNode temp=head;
        while (temp1!=null && temp2!=null){
            if (temp1.val<temp2.val){
                temp.next=temp1;
                temp=temp1;
                temp1=temp1.next;
            }
            else {
                temp.next=temp2;
                temp=temp2;
                temp2=temp2.next;
            }
        }
        if (temp2==null) temp.next=temp1;
        else temp.next=temp2;
        return head.next;
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(4);
        ListNode d=new ListNode(1);
        ListNode e=new ListNode(3);
        ListNode f=new ListNode(6);
        a.next=b;
        b.next=c;
        d.next=e;
        e.next=f;
        ListNode ans=mergeTwoLists(a,d);
        while (ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
}
