import java.util.*;
public class Binary_Tree_Preorder_Traversal {
    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int val) {
           this.val = val;
       }
    }
    public static void helper(TreeNode root,List<Integer> ans){
        if(root==null) return;
        ans.add(root.val);
        helper(root.left,ans);
        helper(root.right,ans);
    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        helper(root,ans);
        return ans;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode a=new TreeNode(2);
        TreeNode b=new TreeNode(3);
        root.right=a;
        a.left=b;
        List<Integer> ans=preorderTraversal(root);
        System.out.println(ans);
    }
}
