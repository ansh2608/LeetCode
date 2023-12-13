public class Intersection_of_Two_LL {
    static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
           val = x;
           next = null;
       }
    }
    static void display(ListNode head){
        ListNode temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null || headB==null) return null;
        ListNode tempA=headA;
        ListNode tempB=headB;
        int lengthA=0;
        while (tempA!=null){
            lengthA++;
            tempA=tempA.next;
        }
        int lengthB=0;
        while (tempB!=null){
            lengthB++;
            tempB=tempB.next;
        }
        tempA=headA;
        tempB=headB;
        if (lengthA>lengthB){
            int steps=lengthA-lengthB;
            for (int i=1;i<=steps;i++) tempA=tempA.next;
        }
        else {
            int steps=lengthB-lengthA;
            for (int i=1;i<=steps;i++) tempB=tempB.next;
        }
        while (tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(4);
        ListNode c=new ListNode(1);
        ListNode d=new ListNode(8);
        ListNode e=new ListNode(4);
        ListNode f=new ListNode(5);
        ListNode b=new ListNode(5);
        ListNode g=new ListNode(6);
        ListNode h=new ListNode(1);
        a.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        b.next=g;
        g.next=h;
        h.next=d;
        display(a);
        display(b);
        ListNode q=getIntersectionNode(a,b);
        System.out.println(q.val);
    }
}
