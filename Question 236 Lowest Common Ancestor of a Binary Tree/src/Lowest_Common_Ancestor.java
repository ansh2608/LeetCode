public class Lowest_Common_Ancestor {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static boolean contains(TreeNode root,TreeNode node){
        if (root==null) return false;
        if (root==node) return true;
        return contains(root.left,node) || contains(root.right,node);
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p==root || q==root) return root;
        if (p==q) return p;
        boolean left_p=contains(root.left,p);
        boolean right_q=contains(root.right,q);
        if ((left_p && right_q) || (!left_p && !right_q)) return root;
        if (left_p && !right_q) return lowestCommonAncestor(root.left,p,q);
        if (!left_p && right_q) return lowestCommonAncestor(root.right,p,q);
        return null;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        TreeNode p=new TreeNode(5);
        TreeNode q=new TreeNode(1);
        root.left=p;
        root.right=q;
        TreeNode a=new TreeNode(6);
        TreeNode b=new TreeNode(2);
        p.left=a;
        p.right=b;
        TreeNode c=new TreeNode(7);
        TreeNode d=new TreeNode(4);
        b.left=c;
        b.right=d;
        TreeNode e=new TreeNode(0);
        TreeNode f=new TreeNode(8);
        q.left=e;
        q.right=f;
        TreeNode ans=lowestCommonAncestor(root,p,q);
        System.out.println(ans.val);
    }
}
