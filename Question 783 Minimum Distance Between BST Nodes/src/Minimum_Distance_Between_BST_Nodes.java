public class Minimum_Distance_Between_BST_Nodes {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
     }
    public static int minDif=Integer.MAX_VALUE;
    public static TreeNode prev=null;
    public static void Inorder(TreeNode root){
        if (root==null) return;
        Inorder(root.left);
        if (prev!=null) {
            int diff=Math.abs(root.val-prev.val);
            minDif=Math.min(diff,minDif);
        }
        prev=root;
        Inorder(root.right);
    }
    public static int minDiffInBST(TreeNode root) {
        minDif=Integer.MAX_VALUE;
        prev=null;
        Inorder(root);
        return minDif;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        TreeNode a=new TreeNode(2);
        TreeNode b=new TreeNode(6);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(1);
        TreeNode d=new TreeNode(3);
        a.left=c;
        a.right=d;
        System.out.println(minDiffInBST(root));
    }
}
