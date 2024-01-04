import java.util.*;
public class BT_Level_Order_Traversal {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static int height(TreeNode root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static void leftToRight(TreeNode root,int n,List<Integer> arr){
        if(root==null) return;
        if(n==1) arr.add(root.val);
        leftToRight(root.left,n-1,arr);
        leftToRight(root.right,n-1,arr);
    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if (root==null) return ans;
        int level=height(root)+1;
        for(int i=1;i<=level;i++){
            List<Integer> arr=new ArrayList<>();
            leftToRight(root,i,arr);
            ans.add(arr);
        }
        return ans;
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
        List<List<Integer>> ans=zigzagLevelOrder(root);
        System.out.println(ans);
    }
}
