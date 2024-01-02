public class Balanced_Binary_Tree {
    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int val) {
           this.val = val;
       }
    }
    public static int height(TreeNode root){
        if (root==null || (root.left==null && root.right==null)) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static boolean isBalanced(TreeNode root) {
        if (root==null || (root.left==null && root.right==null)) return true;
        int lh=height(root.left);
        if (root.left!=null) lh++;
        int rh=height(root.right);
        if (root.right!=null) rh++;
        int d=Math.abs(lh-rh);
        if (d>1) return false;
        return (isBalanced(root.left) && isBalanced(root.right));
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        TreeNode a=new TreeNode(9);
        TreeNode b=new TreeNode(20);
        TreeNode c=new TreeNode(15);
        TreeNode d=new TreeNode(7);
        root.left=a;
        root.right=b;
        b.left=c;
        c.right=d;
        System.out.println(isBalanced(root));
    }
}
