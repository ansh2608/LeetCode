public class Convert_BST_to_Greater_Tree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
     }
    static int sum=0;
    public static void print(TreeNode root){
        if (root==null) return;
        print(root.left);
        System.out.print(root.val+" ");
        print(root.right);
    }
    public static void inOrder(TreeNode root){
        if (root==null) return;
        inOrder(root.right);
        sum+= root.val;
        root.val=sum;
        inOrder(root.left);
    }
    public static TreeNode convertBST(TreeNode root) {
        inOrder(root);
        return root;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(6);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(0);
        TreeNode d=new TreeNode(2);
        a.left=c;
        a.right=d;
        TreeNode e=new TreeNode(5);
        TreeNode f=new TreeNode(7);
        b.left=e;
        b.right=f;
        TreeNode g=new TreeNode(3);
        d.right=g;
        TreeNode h=new TreeNode(8);
        f.right=h;
        TreeNode ans=convertBST(root);
        print(ans);
    }
}
