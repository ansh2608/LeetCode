import java.util.ArrayList;
import java.util.List;

public class Convert_Sorted_List_to_BST {
     public static class ListNode {
           int val;
           ListNode next;
           ListNode(int val) {
               this.val = val;
           }
     }
     public static class TreeNode {
           int val;
           TreeNode left;
           TreeNode right;
           TreeNode(int val) {
               this.val = val;
           }
     }
     public static void array(ListNode head, List<Integer> arr){
         ListNode temp=head;
         while (temp!=null){
             arr.add(temp.val);
             temp=temp.next;
         }
     }
     public static TreeNode helper(List<Integer> arr,int low, int high){
        if (low>high) return null;
        int mid=low+(high-low)/2;
        TreeNode root=new TreeNode(arr.get(mid));
        root.left=helper(arr,low,mid-1);
        root.right=helper(arr,mid+1,high);
        return root;
     }
    public static TreeNode sortedListToBST(ListNode head) {
         List<Integer> arr=new ArrayList<>();
         array(head,arr);
         int n=arr.size();
         return helper(arr,0,n-1);
    }
    public static void main(String[] args) {
         ListNode a=new ListNode(-10);
         ListNode b=new ListNode(-3);
         ListNode c=new ListNode(0);
         ListNode d=new ListNode(5);
         ListNode e=new ListNode(9);
         a.next=b;
         b.next=c;
         c.next=d;
         d.next=e;
    }
}
