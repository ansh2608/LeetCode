import java.util.*;
public class Binary_Tree_Zigzag {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static int level(TreeNode root){
        if (root==null || (root.left==null && root.right==null)) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    public static void nthLevel(TreeNode root,int n){
        if (root==null) return;
        if (n==1){
            System.out.print(root.val+" ");
            return;
        }
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        TreeNode a=new TreeNode(9);
        TreeNode b=new TreeNode(20);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(15);
        TreeNode d=new TreeNode(7);
        b.left=c;
        b.right=d;
        for (int i=1;i<=level(root)+1;i++) nthLevel(root,i);
        //List<List<Integer>> ans=zigzagLevelOrder(root);
        //System.out.println(ans);
    }
}