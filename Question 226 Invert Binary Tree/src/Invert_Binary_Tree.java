public class Invert_Binary_Tree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static TreeNode invertTree(TreeNode root) {
        if (root==null) return root;
        TreeNode l=root.left;
        TreeNode r=root.right;
        l=invertTree(r);
        r=invertTree(l);
        return root;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        TreeNode p=new TreeNode(2);
        TreeNode q=new TreeNode(7);
        root.left=p;
        root.right=q;
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(3);
        p.left=a;
        p.right=b;
        TreeNode c=new TreeNode(6);
        TreeNode d=new TreeNode(9);
        q.left=c;
        q.right=d;
        TreeNode ans=invertTree(root);
        System.out.println(ans.val);
    }
}
