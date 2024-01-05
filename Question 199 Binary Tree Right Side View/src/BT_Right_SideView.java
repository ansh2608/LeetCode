import java.util.*;
public class BT_Right_SideView {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }
    public static void right(TreeNode root,List<Integer> arr,int level){
        if (root == null) return;
        if (level == arr.size()) arr.add(root.val);
        right(root.right, arr, level + 1);
        right(root.left, arr, level + 1);
    }
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        right(root,ans,0);
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
