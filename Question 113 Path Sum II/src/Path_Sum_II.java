import java.util.ArrayList;
import java.util.List;

public class Path_Sum_II {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }
    public static void helper(TreeNode root, int targetSum,List<List<Integer>> ans,List<Integer> arr){
        if (root==null) return;
        if (root.left==null && root.right==null){
            arr.add(root.val);
            if (root.val==targetSum){
                List<Integer> a=new ArrayList<>();
                for (int i=0;i<arr.size();i++) a.add(arr.get(i));
                ans.add(a);
            }
            arr.remove(arr.size()-1);
        }
        arr.add(root.val);
        helper(root.left,targetSum- root.val,ans,arr);
        helper(root.right,targetSum- root.val,ans,arr);
        arr.remove(arr.size()-1);
    }
    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        helper(root,targetSum,ans,arr);
        return ans;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(5);
        TreeNode a=new TreeNode(4);
        TreeNode b=new TreeNode(8);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(11);
        a.left=c;
        TreeNode d=new TreeNode(13);
        TreeNode e=new TreeNode(4);
        b.left=d;
        b.right=e;
        TreeNode f=new TreeNode(7);
        TreeNode g=new TreeNode(2);
        c.left=f;
        c.right=g;
        TreeNode h=new TreeNode(5);
        TreeNode i=new TreeNode(1);
        e.left=h;
        e.right=i;
        int targetSum=22;
        System.out.println(pathSum(root,targetSum));
    }
}
