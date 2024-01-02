public class Diameter_of_BT {
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
    public static int diameterOfBinaryTree(TreeNode root) {
        if (root==null || (root.left==null && root.right==null)) return 0;
        int left=diameterOfBinaryTree(root.left);
        int right=diameterOfBinaryTree(root.right);
        int mid=height(root.left)+height(root.right);
        if (root.left!=null) mid++;
        if (root.right!=null) mid++;
        return Math.max(mid,Math.max(left,right));
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
        int ans=diameterOfBinaryTree(root);
        System.out.println(ans);
    }
}
