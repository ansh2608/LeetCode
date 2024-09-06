public class Main {
    public static class ListNode {
       int val;
       ListNode next;
       ListNode(int val) {
           this.val = val;
       }
   }
    public static ListNode modifiedList(int[] nums, ListNode head) {
        int max = -1;
        for(int num : nums ) max = num > max ? num : max;
        boolean[] freq = new boolean[max+1];
        for(int num : nums) freq[num] = true;
        ListNode temp = new ListNode(0);
        ListNode current = temp;
        while(head != null){
            if( head.val >= freq.length || freq[head.val] == false){
                current.next = head;
                current = current.next;
            }
            head = head.next;
        }
        current.next = null;
        return temp.next;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}