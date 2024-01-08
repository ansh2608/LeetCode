import java.util.ArrayList;
import java.util.List;

public class Range_Sum_BST {
    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int val) {
           this.val = val;
       }
   }
    public static int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) return 0;
        if (root.val < L) return rangeSumBST(root.right, L, R);
        if (root.val > R) return rangeSumBST(root.left, L, R);
        return root.val + rangeSumBST(root.right, L, R) + rangeSumBST(root.left, L, R);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        TreeNode a=new TreeNode(5);
        TreeNode b=new TreeNode(15);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(7);
        a.left=c;
        a.right=d;
        TreeNode e=new TreeNode(18);
        b.right=e;
        int low = 7, high = 15;
        System.out.println(rangeSumBST(root,low,high));
    }
}
