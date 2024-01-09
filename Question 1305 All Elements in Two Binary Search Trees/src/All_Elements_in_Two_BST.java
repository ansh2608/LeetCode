import java.util.*;
public class All_Elements_in_Two_BST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
    }
    public static void inOrder(TreeNode root,List<Integer> arr){
        if (root==null) return;
        inOrder(root.left,arr);
        arr.add(root.val);
        inOrder(root.right, arr);
    }
    public static List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans=new ArrayList<>();
        inOrder(root1,ans);
        inOrder(root2,ans);
        return ans;
    }
    public static void main(String[] args) {
        TreeNode root1=new TreeNode(2);
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(4);
        root1.left=a;
        root1.right=b;
        TreeNode root2=new TreeNode(2);
        TreeNode p=new TreeNode(1);
        TreeNode q=new TreeNode(4);
        root2.left=p;
        root2.right=q;
        List<Integer> ans=getAllElements(root1,root2);
        System.out.println(ans);
    }
}
