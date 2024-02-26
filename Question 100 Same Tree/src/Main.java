public class Main {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q==null) return true;
        if (p==null || q==null) return false;
        if (p.val!=q.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    public static void main(String[] args) {
        TreeNode root1=new TreeNode(1);
        TreeNode a1=new TreeNode(2);
        TreeNode b1=new TreeNode(3);
        root1.left=a1;
        root1.right=b1;
        TreeNode root2=new TreeNode(1);
        TreeNode a2=new TreeNode(2);
        TreeNode b2=new TreeNode(3);
        root2.left=a2;
        root2.right=b2;
        System.out.println(isSameTree(root1,root2));
    }
}