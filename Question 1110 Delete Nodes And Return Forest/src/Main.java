import java.util.ArrayList;
import java.util.List;

public class Main {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static boolean[] set=new boolean[1001];
    private static List<TreeNode> ans;
    public static TreeNode helper(TreeNode root,boolean flag){
        if(root==null) return root;
        root.left=helper(root.left,set[root.val]);
        root.right=helper(root.right,set[root.val]);
        if(!set[root.val] && flag) ans.add(root);
        return set[root.val] ? null : root;
    }
    public static List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        ans=new ArrayList<>();
        for(int n:to_delete) set[n]=true;
        helper(root,true);
        return ans;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode a=new TreeNode(2);
        TreeNode b=new TreeNode(3);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(4);
        TreeNode d=new TreeNode(5);
        a.left=c;
        a.right=d;
        TreeNode e=new TreeNode(6);
        TreeNode f=new TreeNode(7);
        b.left=e;
        b.right=f;
        int[] to_delete = {3,5};
        System.out.println(delNodes(root,to_delete));
    }
}