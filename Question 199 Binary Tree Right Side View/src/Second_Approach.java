import java.util.ArrayList;
import java.util.List;

public class Second_Approach {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }
    public static int height(TreeNode root){
        if (root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static void right(TreeNode root,List<Integer> arr,int level){
        if (root == null) return;
        if (level == arr.size()) arr.add(root.val);
        right(root.right, arr, level + 1);
        right(root.left, arr, level + 1);
    }
    public static void preOrder(TreeNode root,List<Integer> ans,int level){
        if (root==null) return;
        ans.set(level-1, root.val);
        preOrder(root.left,ans,level+1);
        preOrder(root.right,ans,level+1);
    }
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        int level=height(root)+1;
        for (int i=0;i<level;i++) ans.add(0);
        preOrder(root,ans,1);
        return ans;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode a=new TreeNode(2);
        root.left=a;
        List<Integer> ans=rightSideView(root);
        System.out.println(ans);
    }
}
