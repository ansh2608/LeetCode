public class Trim_a_BST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
    }
    public static void print(TreeNode root){
        if (root==null) return;
        System.out.print(root.val+" ");
        print(root.left);
        print(root.right);
    }
    public static void helper(TreeNode root, int low, int high){
        if (root==null) return;
        while (root.left!=null){
            if (root.left.val>high) root.left=root.left.left;
            else if (root.left.val<low) root.left=root.left.right;
            else break;
        }
        while (root.right!=null){
            if (root.right.val>high) root.right=root.right.left;
            else if (root.right.val<low) root.right=root.right.right;
            else break;
        }
        helper(root.left,low,high);
        helper(root.right,low,high);
    }
    public static TreeNode trimBST(TreeNode root, int low, int high) {
        TreeNode parent=new TreeNode(Integer.MAX_VALUE);
        parent.left=root;
        helper(parent,low,high);
        return parent.left;
    }
    public static void main(String[] args) {
        TreeNode root1=new TreeNode(3);
        TreeNode a=new TreeNode(0);
        TreeNode b=new TreeNode(4);
        root1.left=a;
        root1.right=b;
        TreeNode p=new TreeNode(2);
        a.right=p;
        TreeNode q=new TreeNode(1);
        p.left=q;
        int low=1,hi=3;
        TreeNode ans=trimBST(root1,low,hi);
        print(ans);
    }
}
