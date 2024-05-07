public class Main {
    public static class ListNode {
       int val;
       ListNode next;
       ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode doubleIt(ListNode head) {
        Pair<Integer, ListNode> result = func(head);
        if (result.getKey() != 0) {
            ListNode newHead = new ListNode(result.getKey());
            newHead.next = result.getValue();
            return newHead;
        }
        return result.getValue();
    }

    private Pair<Integer, ListNode> func(ListNode head) {
        int a = head.val * 2;
        if (head.next != null) {
            Pair<Integer, ListNode> nextResult = func(head.next);
            a += nextResult.getKey();
        }
        head.val = a % 10;
        return new Pair<>(a / 10, head);
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode a=new ListNode(8);
        ListNode b=new ListNode(9);
        head.next=a;
        a.next=b;

    }
}