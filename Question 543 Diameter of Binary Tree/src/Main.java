public class Main {
     public static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int val) {
             this.val = val;
         }
     }
    public int height(TreeNode root){
        if(root==null || root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if (root==null || (root.left==null && root.right==null)) return 0;
        int left=diameterOfBinaryTree(root.left);
        int right=diameterOfBinaryTree(root.right);
        int mid=height(root.left)+height(root.right);
        if (root.left!=null) mid++;
        if (root.right!=null) mid++;
        return Math.max(mid,Math.max(left,right));
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}