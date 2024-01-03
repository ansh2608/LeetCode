public class Symmetric_Tree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static boolean isSameTree(TreeNode p,TreeNode q){
        if (p==null && q==null) return true;
        if (p==null || q==null) return false;
        if (p.val!=q.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    public static TreeNode invertTree(TreeNode root){
        if (root==null) return root;
        TreeNode l=root.left;
        TreeNode r=root.right;
        root.left=invertTree(r);
        root.right=invertTree(l);
        return root;
    }
    public static boolean isSymmetric(TreeNode root) {
        if (root==null) return true;
        root.left=invertTree(root.left);
        return isSameTree(root.left,root.right);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode p=new TreeNode(2);
        TreeNode q=new TreeNode(2);
        root.left=p;
        root.right=q;
        TreeNode a=new TreeNode(3);
        TreeNode b=new TreeNode(4);
        p.left=a;
        p.right=b;
        TreeNode c=new TreeNode(4);
        TreeNode d=new TreeNode(3);
        q.left=c;
        q.right=d;
        System.out.println(isSymmetric(root));
    }
}
