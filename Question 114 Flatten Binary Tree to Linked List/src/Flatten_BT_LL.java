public class Flatten_BT_LL {
    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int val) {
           this.val = val;
       }
    }
    public static void flatten(TreeNode root) {
        if (root==null) return;
        TreeNode l=root.left;
        TreeNode r=root.right;
        root.left=null;
        flatten(l);
        flatten(r);
        root.right=l;
        TreeNode temp=l;
        while (temp!=null && temp.right!=null) temp=temp.right;
        if(temp!=null) temp.right=r;
        else root.right=r;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode a=new TreeNode(2);
        TreeNode b=new TreeNode(5);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(4);
        a.left=c;
        a.right=d;
        TreeNode e=new TreeNode(6);
        b.right=e;
        flatten(root);
    }
}
