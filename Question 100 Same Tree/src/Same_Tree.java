public class Same_Tree {
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
        TreeNode p=new TreeNode(1);
        TreeNode a=new TreeNode(2);
        TreeNode b=new TreeNode(3);
        p.left=a;
        p.right=b;
        TreeNode q=new TreeNode(1);
        TreeNode c=new TreeNode(2);
        TreeNode d=new TreeNode(3);
        q.left=c;
        q.right=d;
        System.out.println(isSameTree(p,q));
    }
}
